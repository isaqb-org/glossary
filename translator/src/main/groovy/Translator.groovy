class Translator {

    final static String FILEPATH = "translations/"
    final static String FILENAME = "isaqb-terms-translated.json"

    final static File translationFile = new File(FILEPATH + FILENAME)

    static TranslationTable en_de = new TranslationTable("en", "de")
    static TranslationTable de_en = new TranslationTable("de", "en")



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

        TranslationTable tt = new TranslationTable("en", "de")

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

            tt.put(source, translations)

        }

        return tt
    }


    static TranslationTable build_DE_TranslationTable(List terms) {
        println "Building translation table EN to DE\n"
        println "*" * 50

        TranslationTable tt = new TranslationTable("de", "en")

        terms.each {
            def sources = it.de

            if (sources instanceof String) {
                def existingTrans = tt?.terms.get(sources)

                if (existingTrans == null) existingTrans = []
                existingTrans.add(it.en)
                tt.put(sources, existingTrans)
            } else if (sources instanceof List) {
                sources.each { deWord ->
                    def existingTrans = tt?.terms?.get(deWord)
                    if (existingTrans == null) existingTrans = []

                    existingTrans.add(it.en)
                    tt.put(deWord, existingTrans.sort())
                }
            } else {
                println "error in de_en: $sources"
                assert false
            }
        }

        return tt
    }



    static boolean isItCompliantToRules(Object termsFromJSON) {


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

        def terms = parseFile(translationFile)

        if (isItCompliantToRules(terms)) {

            en_de = build_EN_TranslationTable(terms)

            println en_de.translationTableToLeanpubMarkdown()

            de_en = build_DE_TranslationTable(terms)

            println de_en.translationTableToLeanpubMarkdown()

        } else println("Error in JSON file - cannot proceed")


    }
}