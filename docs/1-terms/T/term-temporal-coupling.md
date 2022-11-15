// tag::EN[]
### Temporal Coupling
Different interpretations exist from various sources. Temporal coupling:

* means that processes that are communicating will both have to be up and running. See [Tanenbaum+2016](#ref-tanenbaum-steen).
* when you often commit (_modify_) different components at the same time. See [Tornhill-2015](#ref-tornhill-crime-scene).
* when there's an implicit relationship between two, or more, members of a class requiring clients to invoke one member before the other. Mark Seemann, see <https://blog.ploeh.dk/2011/05/24/DesignSmellTemporalCoupling/>
* means that one system needs to wait for the response of another system before it can continue processing. See <https://www.beeworks.be/blog/2017/rest-antipattern.html>

// end::EN[]

// tag::DE[]
### Zeitliche Kopplung

Es gibt unterschiedliche Interpretationen aus verschiedenen Quellen. Zeitliche Kopplung:

* bedeutet, dass Prozesse, die miteinander kommunizieren, beide aktiv sein müssen. Siehe [Tanenbaum+2016](#ref-tanenbaum-steen).
* wenn du oft verschiedene Komponenten gleichzeitig festlegst (_modifizierst_). Siehe [Tornhill-2015](#ref-tornhill-crime-scene).
* wenn es eine implizite Beziehung zwischen zwei oder mehr Mitgliedern einer Klasse gibt, die es erforderlich macht, dass die Clients das eine Mitglied vor dem anderen aufrufen. Mark Seemann, siehe <https://blog.ploeh.dk/2011/05/24/DesignSmellTemporalCoupling/>
* bedeutet, dass ein System auf die Antwort eines anderen Systems warten muss, bevor es mit der Bearbeitung fortfahren kann. Siehe <https://www.beeworks.be/blog/2017/rest-antipattern.html> 

// end::DE[]

