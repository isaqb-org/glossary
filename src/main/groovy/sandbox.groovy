def slurper = new groovy.json.JsonSlurper()
slurper.setType( groovy.json.JsonParserType.LAX)

def words = '''[ { de:"Baustein", en:"Building block"},
  { en: "Tradeoff", de: ["Kompromiss", "Abwägung"] },{ en: "Compromise", de:["Kompromiss"]}]'''

def result = slurper.parseText(words)

result.each { term ->

   println term.keySet().sort()

}