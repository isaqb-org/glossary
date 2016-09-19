class Translator {

    final static String SOURCE_FILEPATH = "translations/"
    final static String TARGET_FILEPATH = "generated/"

    final static String EN_DE_FILENAME = "gen-tt-EN-DE.md"
    final static String DE_EN_FILENAME = "gen-tt-DE-EN.md"

    final static String FILENAME = "isaqb-terms-translated.json"

    final static File translationJSONSourceFile = new File(SOURCE_FILEPATH + FILENAME)

    static File generated_EN_DE_File
    static File generated_DE_EN_File

    static TranslationTable en_de = new TranslationTable("en", "de")
    static TranslationTable de_en = new TranslationTable("de", "en")


    static File clearFileForWriting(String filename) {
        File tmpFile = new File(filename)

        return tmpFile
    }


    static def parseFile(File file) {
        def slurper = new groovy.json.JsonSlurper()
        slurper.setType(groovy.json.JsonParserType.LAX)

        def terms = slurper.parse(file)

        println "successfully parsed file ${file.name}\n"
        return terms
    }


    static TranslationTable build_EN_TranslationTable(List terms) {
        println "Building translation table EN to DE\n"
        println "*" * 50

        TranslationTable translationTable = new TranslationTable("en", "de")

        terms.each {
            String source = it.en
            def translations = []

            def trans = it.de
            if (trans instanceof String) {
                translations.add(trans)
            } else if (trans instanceof List) {
                translations = trans
            } else {
                println "error: $trans"
                assert false
            }

            translationTable.put(source, translations)

        }

        return translationTable
    }


    static TranslationTable build_DE_TranslationTable(List terms) {
        println "Building translation table DE to EN\n"
        println "*" * 50

        TranslationTable translationTable = new TranslationTable("de", "en")

        terms.each {
            def sources = it.de

            if (sources instanceof String) {
                def existingTrans = translationTable?.terms.get(sources)

                if (existingTrans == null) existingTrans = []
                existingTrans.add(it.en)
                translationTable.put(sources, existingTrans)
            } else if (sources instanceof List) {
                sources.each { deWord ->
                    def existingTrans = translationTable?.terms?.get(deWord)
                    if (existingTrans == null) existingTrans = []

                    existingTrans.add(it.en)
                    translationTable.put(deWord, existingTrans.sort())
                }
            } else {
                println "error in de_en: $sources"
                assert false
            }
        }

        return translationTable
    }

    static abort() {
        println "\n\nchecking aborted due to severe error in JSON"
        println "*" * 50

        System.exit(0)
    }


    static boolean checkIfTranslationMap(Object termsFromJSON) {
        if (termsFromJSON instanceof java.util.List)
            return true
        else {
            errorMsg(termsFromJSON, "has no JSON list format.")
        }
    }

    private static errorMsg(Object term, String message) {
        int minsize = Math.min(50, term.toString().size())
        println "'${term.toString()[0..minsize - 1]}...' $message"
        abort()
    }

    private static boolean isMap(Object term) {
        if (term instanceof Map)
            return true
        else {
            errorMsg(term, "syntax error: is no Map (but ${term.class})")
        }
    }

    private static boolean hasENEntry(Object term) {
        if (term.en instanceof String) {
            if ((term.en != null) && (term.en != "") && (term.en.size() > 1))
                return true
            else errorMsg(term, "has no proper English (en:) source-term.")
        } else {
            errorMsg(term, "is missing English (en:) source-term.")
        }
    }

    private static boolean hasDETranslation(Object term) {
        if (term.de != null)
            return true
        else errorMsg(term, "seems to have no German translation")
    }


    private static boolean translationIsStringOrList(Object term) {
        if ((term.de instanceof String) || (term.de instanceof List<String>))
            return true
        else errorMsg(term, ": German (de) translation is neither String nor List")
    }


    private static boolean isNonTrivialTranslation(term) {
        if (term.en != term.de)
            return true
        else errorMsg(term, ": English word shall be different from German word.")
    }


    private static boolean translationListHasMultipleEntries( Object term) {
        if (term.de instanceof List<String>)  {
            if (term.de.size() >= 2)
                return true
            else errorMsg( term, "'de:' translation list shall contain multiple translations (otherwise a list makes no sense).")
        }
        else return true
    }

    private static boolean hasOnlyGermanAndEnglishEntries(Object term) {
        if (term.keySet().sort() == ["de", "en"])
            return true
        else errorMsg( term.keySet(), ": contains illegal language keys (currently only 'de:' and 'en:' are supported)")
    }


    static boolean isItCompliantToRules(Object termsFromJSON) {


        Boolean isCompliant = false

        // is it a Map
        isCompliant = checkIfTranslationMap(termsFromJSON)

        print "Checking term "

        termsFromJSON.each { term ->
            isCompliant = isCompliant &&
                isMap(term) &&
                hasENEntry(term) &&
                hasDETranslation(term) &&
                translationIsStringOrList(term) &&
                isNonTrivialTranslation(term) &&
                hasOnlyGermanAndEnglishEntries( term )

            // if German translations are a list, it has more than one element
            if (term.de instanceof List<String>)
                isCompliant = isCompliant &&
                translationListHasMultipleEntries(term)


            print "${term.en}."

        }

        println("\n\n")

        return isCompliant
    }

    /*
    ** As a convention, we insert a Footnote in the EN-DE translation table.
     */
    static final String createDateAsMarkDownFootnote(int nrOfTerms) {
        final teaser = """
The following tables have been automatically generated[^TransTableGenerationDate]
from JSON by Groovy and Gradle.

[^TransTableGenerationDate]:$nrOfTerms english terms, generated on ${new Date().format("MMMM/dd/yyyy")}\n

"""

    }

    static void main(String... args) {
        println("\n\niSAQB Glossary Translation Markdown Generator\n\n")

        def terms = parseFile(translationJSONSourceFile)


        if (isItCompliantToRules(terms)) {

            en_de = build_EN_TranslationTable(terms)

            int nrOfTerms = en_de.terms.size()
            println "found ${nrOfTerms} terms..."

            generated_EN_DE_File = clearFileForWriting(TARGET_FILEPATH + EN_DE_FILENAME)
            generated_EN_DE_File.text = createDateAsMarkDownFootnote(nrOfTerms) + en_de.translationTableToLeanpubMarkdown()
            println("Successfully created $EN_DE_FILENAME")

            de_en = build_DE_TranslationTable(terms)
            generated_DE_EN_File = clearFileForWriting(TARGET_FILEPATH + DE_EN_FILENAME)
            generated_DE_EN_File.text = de_en.translationTableToLeanpubMarkdown()
            println("Successfully created $DE_EN_FILENAME")

        } else println("Error in JSON file - cannot proceed")


    }
}