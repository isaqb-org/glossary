def slurper = new groovy.json.JsonSlurper()
slurper.setType( groovy.json.JsonParserType.LAX)

def words = '''[ { en:"Building block", de:"Baustein"},
  { en: "Tradeoff", de: ["Kompromiss", "Abwägung"] },{ en: "Compromise", de:["Kompromiss"]}]'''

def result = slurper.parseText(words)

//assert result instanceof List

//result.each {
//    println it
//}

Map<String,List> en_de = new TreeMap<String,List>();
//List translations = new ArrayList<String>();

Map<String,List> de_en = new TreeMap<String, List>()


// create en_de table
result.each {
    String source = it.en
    def translations = []
  
    def trans = it.de
    if (trans instanceof String) { 
       translations.add(trans)
       }
    else if (trans instanceof List) {
           translations = trans.sort()          
    }
    else {
       println "error: $trans"
       assert false
    }
    
    en_de.put(source, translations)
  
}

println "english translations: $en_de"

result.each { 
   def sources = it.de
   
   if (sources instanceof String) { 
       def existingTrans = de_en?.get(sources)

       if (existingTrans == null) existingTrans = []
       existingTrans.add( it.en )
       de_en.put(sources, existingTrans)
   }
   else if (sources instanceof List) {
       sources.each { deWord ->
       def existingTrans = de_en?.get( deWord )
       if (existingTrans == null) existingTrans = []

       existingTrans.add( it.en )
       de_en.put(deWord, existingTrans.sort())         
      }
   }
   else {
       println "error in de_en: $trans"
       assert false
      }
}      

println "german translation: $de_en"

