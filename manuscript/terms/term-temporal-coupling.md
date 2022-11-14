// tag::EN[]
### Temporal Coupling
Different interpretations exist from various sources. Temporal coupling:

* means that processes that are communicating will both have to be up and running. See [Tanenbaum+2016](#ref-tanenbaum-steen).
* when you often commit (_modify_) different components at the same time. See [Tornhill-2015](#ref-tornhill-crime-scene).
* when there's an implicit relationship between two, or more, members of a class requiring clients to invoke one member before the other. Mark Seemann, see <https://blog.ploeh.dk/2011/05/24/DesignSmellTemporalCoupling/>
* means that one system needs to wait for the response of another system before it can continue processing. See <https://www.beeworks.be/blog/2017/rest-antipattern.html>



// end::DE[]

