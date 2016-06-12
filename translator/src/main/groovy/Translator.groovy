class Translator {

    static String FILEPATH = "translations/"
    static String FILENAME = "isaqb-terms-translated.json"

    static final File translationFile = new File(FILEPATH + FILENAME)

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

        println("Total of ${terms.size()} terms found:\n")
        terms.each{ term ->
            println term
        }
        println "*" * 50

        return terms
    }


    static TranslationTable en_de = new TranslationTable("English", "German")
    static TranslationTable de_en = new TranslationTable("German", "English")


    static TranslationTable buildTranslationTable( def terms, String fromLang, String toLang) {
        println "Building translation table ($fromLang to $toLang)\n"
        println "*" * 50

        TranslationTable tt = new TranslationTable(fromLang, toLang)

        terms.each { term ->
           tt.addTermToTable( term, fromLang, toLang )
        }


    }


    static void main(String... args) {
        println("\n\niSAQB Glossary Translation Markdown Generator\n\n")

        listFile(translationFile)

        def terms = parseFile( translationFile )

        en_de = buildTranslationTable(terms, "en", "de")


    }


}