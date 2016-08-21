class TranslationTable {

    final String sourceLanguageCode // e.g. "en"
    final String targetLanguageCode

    final String sourceLanguage // e.g. "English"

    final String MARKDOWN_TABLE_SEPARATOR = "|----------------------|-------------------|\n"

    final Map<String,String> LANGUAGES = [en:"English", de:"German"]


    Map<String, List<String>> terms


    TranslationTable(String sourceLang, String targetLang) {
        this.sourceLanguageCode = sourceLang
        this.targetLanguageCode = targetLang

        this.sourceLanguage = LANGUAGES.get(sourceLang)

        terms = new TreeMap<String,ArrayList<String>>()
    }

    // ********* adding words/terms

    void put( String source, List translations) {
        terms.put(source, translations)
    }


    void addWords(String sourceWord, String targetWord) {
        List targets = new ArrayList();

        if (noTranslationExistsFor(sourceWord)) {
            targets = new TreeMap<String,ArrayList<String>>()
        }

        targets.add(targetWord)

        terms.put(sourceWord, targets)
    }

    void addWords(String sourceWord, List<String> targetWords) {
        terms.put(sourceWord, targetWords)
    }

    void addWords( List sourceWords, String targetWord) {
        sourceWords.each { sourceWord ->
            terms.put(sourceWord, targetWord)
        }
    }



    // ********** convert to Markdown

    private String ttHeader() {

        return "\n{width=95%}\n" +
               "|${LANGUAGES.get(sourceLanguageCode)}     |${LANGUAGES.get(targetLanguageCode)}  |\n" +
                MARKDOWN_TABLE_SEPARATOR

    }

    private String ttLines() {
        String lines = ""
        terms.keySet().each {  key ->
            lines = lines + termToMarkdown( key )  +
                    MARKDOWN_TABLE_SEPARATOR
        }
        return lines
    }


    String termToMarkdown (String key) {
        String tmp = terms.get(key)

       String temp = "|${key} |${terms?.get(key)?.join(", ")} |\n"

        return temp
    }

    /*
    // "functional" version that does not handle de-en translation correctly
    def translations = {final List list, result=null ->
        if (!list) return result
        final nextRes = result ? result+", " +list.head() : list.head()
        call (list.tail(), nextRes)
    }
    */




    String translationTableToLeanpubMarkdown() {
        return ttHeader() + ttLines()
    }



    // ********* translate words


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

