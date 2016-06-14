
class Translator {

    final static String FILEPATH = "translations/"
    final static String FILENAME = "isaqb-terms-translated.json"

    final static File translationFile = new File(FILEPATH + FILENAME)

    static TranslationTable en_de = new TranslationTable("en", "de")
    static TranslationTable de_en = new TranslationTable("de", "en")

    static void listFile(File file) {
        println("This is the original translation file:")
        println file.absoluteFile
        println "*" * 50
        println(file.text)
        println("<eof>")
        println("\n\n")
    }


    static def parseFile(File file) {
        def slurper = new groovy.json.JsonSlurper()
        slurper.setType( groovy.json.JsonParserType.LAX)

        def terms = slurper.parse( file )

        println "successfully parsed file ${file.name}\n"
        return terms
    }


    static TranslationTable buildTranslationTable( List terms, String fromLangCode, String toLangCode) {
        println "Building translation table ($fromLangCode to $toLangCode)\n"
        println "*" * 50

        TranslationTable tt = new TranslationTable(fromLangCode, toLangCode)

        terms.each { term ->
            assert term instanceof Map<String, List>

            if (term.en)
               addTermToTable( term, tt, fromLangCode, toLangCode )
        }

        return tt
    }

    static void addTermToTable(Map<String, List> term, TranslationTable translationTable, String sourceLangCode, String targetLangCode) {
        def sourceWords = term.get(sourceLangCode)

        def targetWords = term.get(targetLangCode)

        translationTable.addWords( sourceWords, targetWords)

    }

    static boolean isItCompliantToRules(Object termsFromJSON ) {


        assert termsFromJSON instanceof java.util.List

        termsFromJSON.each { term ->
            // every term has one (!) en-entry
            assert term.en instanceof String

            // term itself is a Map [en:xxx, de:yyy]
            assert term instanceof Map
            assert term.de != null
            assert (term.de instanceof String) || (term.de instanceof List<String>)

            println "${term.en} successfully checked"

        }


    }

    static void main(String... args) {
        println("\n\niSAQB Glossary Translation Markdown Generator\n\n")

        listFile(translationFile)

        def terms = parseFile( translationFile )

        if (isItCompliantToRules(terms)) {

            en_de = buildTranslationTable(terms, "en", "de")

            println en_de.translationTableToLeanpubMarkdown()

        }
        else println( "Error in JSON file - cannot proceed")


    }
}