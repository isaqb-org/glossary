class Term {

    // ENglish is the reference language for the glossary
    final String en

    // one EN term might have several translations/meanings,
    // so we need a collection

    final ArrayList de


    String convert2LeanPubMarkDownTableRow() {

    }


    @Override
    public String toString() {
        return "Term{" +
                "en='" + en + '\'' +
                ", de=" + de +
                '}';
    }
}
