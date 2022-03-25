import static groovy.io.FileType.FILES

class TermsGenerator {
    final static String SOURCE_FILEPATH = "./manuscript/terms/"
    final static String TARGET_FILEPATH = "./generated/"
    final static String TERM_PREFIX = "term-"

    final static String TERMS_FILENAME = "gen-terms-"

    static String getTermRegex(String language) {
        def regex = /(?:\{lang=${language}\}\n)(### (.*)[\S\s]+?)(?=\{lang=|\Z)/
        return regex
    }

    private static List<String> getSortedTermsList(String language) {
        def dir = new File(SOURCE_FILEPATH)
        def textMatches = []
        def langRegex = getTermRegex(language)

        dir.traverse(type: FILES, maxDepth: 0) {
            if (it.name.startsWith(TERM_PREFIX)) {
                def matches = (it.text =~ langRegex).findAll()
                if (!matches.isEmpty()) {
                    def termName = it.name.split("\\.")[0]
                    def termHeader = "{#${termName}}\n"
                    textMatches.add(matches.getAt(0) + termHeader)
                } else {
                    println "File ${it.name} is missing translation for ${language}."
                }
            }
        }
        textMatches.sort({it.getAt(2).toLowerCase()})
        def termTexts = textMatches.collect{it.getAt(3) + it.getAt(1)}

        return termTexts
    }

    static String buildTermsFileText(String language) {
        def termsFileText = ""

        this.getSortedTermsList(language).each{termsFileText += it+"\n"}

        return termsFileText
    }

    public static void main(String... args) {
        def language = args.getAt(0)
        println("\n\niSAQB Glossary Terms-List Markdown Generator\n\n")

        int nrOfTerms = this.getSortedTermsList(language).size()

        File termsFile = new File(TARGET_FILEPATH + TERMS_FILENAME + language.toUpperCase() + ".md")
        termsFile.createNewFile()
        termsFile.text = buildTermsFileText(language)

        println "Created glossary file in \"${language}\" containing ${nrOfTerms} terms"
    }
}
