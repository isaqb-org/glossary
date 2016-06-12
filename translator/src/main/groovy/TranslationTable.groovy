class TranslationTable {

    String sourceLanguage // e.g. "English"

    String targetLanguage

    final String MARKDOWN_TABLE_SEPARATOR = "|----------------------|-------------------|\n"

    HashMap<String, List<String>> terms


    TranslationTable(String sourceLang, String targetLang) {
        this.sourceLanguage = sourceLang
        this.targetLanguage = targetLang

        terms = [:] // new HashMap<String,List>()
    }


    void addWord(String sourceWord, String targetWord) {
        List targets = new ArrayList();

        if (noTranslationExistsFor(sourceWord)) {
            targets = [:]
        }
        else {
            targets.add( terms?.get(sourceWord) )
        }

        targets.add(targetWord)
        terms.put(sourceWord, targets)
    }

    void addTermToTable( def term, String fromLang, String toLang) {

        def fromTerm = term.get(fromLang)
        def toTerm   = term.get(toLang)

        if (fromTerm instanceof String) {
           addWord( fromTerm, toTerm)
        }

        println terms
        // both can be String or List...

    }


    String translationTableToLeanpubMarkdown() {
        return ttHeader() + ttLines()
    }

    private String ttHeader() {
        return "|${sourceLanguage}     |${targetLanguage}  |\n" +
                MARKDOWN_TABLE_SEPARATOR

    }

    private String ttLines() {
        String lines = ""
        terms.each {  singleTerm ->
            lines = lines + termToMarkdown( singleTerm ) + "\n" +
                    MARKDOWN_TABLE_SEPARATOR
        }
    }

    String termToMarkdown () {

    }


    void addWord(String sourceWord, List<String> targetWords) {
        terms.put(sourceWord, targetWords)
    }

    //ArrayList<String>
    def translate( String sourceTerm) {
        if (translationExistsFor( sourceTerm))
            return terms.get(sourceTerm)
        else return []

    }

    boolean noTranslationExistsFor(String word) {
        return this.terms.get(word)?.size() == 0
    }

    boolean translationExistsFor(String word) {
        return this.terms.get(word)?.size() > 0
    }
}

