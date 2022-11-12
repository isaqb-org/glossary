class TranslationTable {

    final String sourceLanguageCode // e.g. "en"
    final String targetLanguageCode

    final String sourceLanguage // e.g. "English"

    final Map<String, String> LANGUAGES = [en: "English", de: "German"]


    Map<String, List<String>> terms


    TranslationTable(String sourceLang, String targetLang) {
        this.sourceLanguageCode = sourceLang
        this.targetLanguageCode = targetLang

        this.sourceLanguage = LANGUAGES.get(sourceLang)

        terms = new HashMap<String, ArrayList<String>>()
    }

    // ********* adding words/terms

    void put(String source, List translations) {
        terms.put(source, translations)
    }


    void addWords(String sourceWord, String targetWord) {
        List targets = new ArrayList();

        if (noTranslationExistsFor(sourceWord)) {
            targets = new TreeMap<String, ArrayList<String>>()
        }

        targets.add(targetWord)

        terms.put(sourceWord, targets)
    }

    void addWords(String sourceWord, List<String> targetWords) {
        terms.put(sourceWord, targetWords)
    }

    void addWords(List sourceWords, String targetWord) {
        sourceWords.each { sourceWord ->
            terms.put(sourceWord, targetWord)
        }
    }

    // ********** convert to AsciiDoc

    private String ttHeader() {
        String columnDefinition = "[cols=\"1,1\"]\n"
        String titleRow =  "| *${LANGUAGES.get(sourceLanguageCode)}* | *${LANGUAGES.get(targetLanguageCode)}*\n"

        return "${columnDefinition}|===\n$titleRow"
    }

    private String ttLines() {
        String lines = ""
        terms.sort(String.CASE_INSENSITIVE_ORDER).each { key, value ->
            lines = lines + termToAsciiDoc(key)
        }
        return lines
    }


    String termToAsciiDoc(String key) {
        String tmp = terms.get(key)

        String temp = "|${key} |${terms?.get(key)?.join(", ")} \n"

        return temp
    }

    String ttFooter() {
        return "\n|=== \n"
    }


    String translationTableToAsciiDoc() {
        return ttHeader() + ttLines() + ttFooter()
    }

    // ********* translate words


    def translate(String sourceTerm) {
        if (translationExistsFor(sourceTerm))
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

