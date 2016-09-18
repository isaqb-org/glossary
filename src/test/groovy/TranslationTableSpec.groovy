import spock.lang.Specification

class TranslationTableSpec extends Specification {

    TranslationTable translationTable
    TranslationTable bigTable


    def setup() {
        translationTable = new TranslationTable("English", "German")

        bigTable = new TranslationTable("English", "German")
        bigTable.addWords("Adapter", "Adapter")
        bigTable.addWords("Coupling", "Kopplung")
        bigTable.addWords("Coupling", "Abhängigkeit")
        bigTable.addWords("Cohesion", "Kohäsion")
        bigTable.addWords("binary", "Binär")
    }


    def "setup Translation Table"() {

        expect:
        translationTable.targetLanguageCode == "German"

    }

    def "can add single term"() {
        when:
        translationTable.addWords("Building block", "Baustein")

        then:
        translationTable.translationExistsFor("Building block") == true

        translationTable.terms.get("Building block").contains("Baustein")
    }

    def "can add multiple translations for single word"() {
        when:
        translationTable.addWords("Tradeoff", ["Kompromiss", "Abwägung"])

        then:
        translationTable.terms.get("Tradeoff").size() == 2
        translationTable.terms.get("Tradeoff")[0] == "Kompromiss"

    }


    def "non existent word returns empty list"() {
        when:
        translationTable.addWords("Requirement", "Anforderung")

        then:
        translationTable.translate("King") == []

    }

    def "translation table is well-sorted"() {
        given:
        TranslationTable tt = new TranslationTable("English", "German")
        tt.addWords("ab", "1")
        tt.addWords("bb", "2")
        tt.addWords("Aa", "3")

        when:
          List<String> keys = tt.terms.keySet().sort()

        then:
            keys == ["Aa", "ab", "bb"]
    }
}
