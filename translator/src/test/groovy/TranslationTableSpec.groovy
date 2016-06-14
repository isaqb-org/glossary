import spock.lang.Specification

class TranslationTableSpec extends Specification {

    TranslationTable translationTable
    TranslationTable bigTable


    def setup() {
        translationTable = new TranslationTable("English", "German")

        bigTable = new TranslationTable("English", "German")
        bigTable.addWord("Adapter", "Adapter")
        bigTable.addWord("Coupling", "Kopplung")
        bigTable.addWord("Coupling", "Abhängigkeit")
        bigTable.addWord("Cohesion", "Kohäsion")
    }


    def "setup Translation Table"() {

        expect:
        translationTable.targetLanguageCode == "German"

    }

    def "can add single term"() {
        when:
        translationTable.addWord("Building block", "Baustein")

        then:
        translationTable.translationExistsFor("Building block") == true

        translationTable.terms.get("Building block").contains("Baustein")
    }

    def "can add multiple translations for single word"() {
        when:
        translationTable.addWord("Tradeoff", ["Kompromiss", "Abwägung"])

        then:
        translationTable.terms.get("Tradeoff").size() == 2
        translationTable.terms.get("Tradeoff")[0] == "Kompromiss"

    }

    def "can add terms consecutively"() {
        when:
        translationTable.addWord("Tradeoff", "Kompromiss")
        translationTable.addWord("Tradeoff", "Abwägung")

        then:
        translationTable.terms.get("Tradeoff").size() == 2

        translationTable.terms.get("Tradeoff").contains("Abwägung")
    }


    def "non existent word returns empty list"() {
        when:
        translationTable.addWord("Requirement", "Anforderung")

        then:
        translationTable.translate("King") == []

    }

    def "can fill translation table from json"() {

        when:
        def translations = '''[
{ "en":"Building block", "de":"Baustein" },
{ "en": "Tradeoff","de": ["Kompromiss", "Abwägung"]}
]'''

        def slurper = new groovy.json.JsonSlurper()
        ArrayList<List, List> result = slurper.parseText(translations)

        then:
        result.size() == 2

        when:
        result.each { term ->
            def en = term.get("en")
            def de = term.get("de")

            if (en != null)
                translationTable.addWord(en, de)

        }

        then:
        translationTable.translate("Building block").contains( "Baustein" )


    }

}
