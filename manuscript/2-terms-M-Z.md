##### Microservice

An architectural style, proposing to divide large systems into small units.
"Microservices have to be implemented as virtual machines, as more light-weight alternatives such as Docker containers or as individual processes. Thereby they can easily be brought into production individually." (quoted from the (free) [LeanPub booklet on Microservices](https://leanpub.com/microservices-primer) by [Eberhard Wolff](http://microservices-book.com).

##### [Model Driven Architecture (MDA)](http://www.omg.org/mda/)

OMG-Standard for model based software development.
Definition: „An approach to IT system specification that separates the specification of functionality from the specification of the implementation of that functionality on a specific technology platform.“

##### Model-driven software development (MDSD)

The underlying idea is to generate code from more abstract models of requirements or the domain.

{#term-modeling-tool}
##### Modeling Tool

A tool that creates models (e.g. UML or BPMN models). Can be used to create consistent diagrams for documentation because it has the advantage that each model element exists only once but can be consistently displayed in many diagrams (as opposed to a mere [Drawing Tool](#term-drawing-tool)).

##### Model-View-Controller

Architecture pattern, often used to implement user interfaces. It divides a
system into three interconnected parts (model, view and controller) to separate
the following responsibilities:

  * Model manages data and logic of the system. The "truth" that will be shown or
  displayed by one or many views. Model does not know (depend on) its views.
  * View can be any number of (arbitrary) output representation of (model) information.
  Multiple views of the same model are possible.
  * Controller accepts (user) input and converts those to commands for the model or view.

##### Module

(see also [Modular programming](#term-modular-programming))

  1. structural element or building block, usually regarded as a _black box_ with
  a clearly defined responsibility. It encapsulates data and code and
  provides oublic interfaces, so clients can access its functionality.
  This meaning has first been
  described in a groundbreaking and fundamental paper from David L. Parnas:
  [On the Criteria to be Used in Decomposing Software into Modules](http://www.cs.umd.edu/class/spring2003/cmsc838p/Design/criteria.pdf)
  2. In several programming languages, _module_ is a construct for aggregating
  smaller programming units, e.g. in Python. In other languages (like Java),
  modules are called _packages_.


{#term-modular-programming}
##### Modular programming

"Software design technique that separates the functionality of a program into independent,
interchangeable _modules_, so that each module contains everything necessary to execute
only one aspect of the desired functionality.

  Module have _interfaces_ expressing the elements provided and required by the module.
  The elements defined in the interface are detectable by other modules."
   (quoted from [Wikipedia](https://en.wikipedia.org/wiki/Modular_programming))


##### Node (in UML)

A processing resource (execution environment, processor, machine, virtual machine,
  application server) where artifacts can be deployed and executed.


##### Node (Node.js)

In modern web development: Short form for the open source
JavaScript runtime [Node.js®](https://nodejs.org/en/), which is built on Chrome's V8 JavaScript engine. Node.js is famous for its an event-driven, non-blocking I/O model and its vast ecosystem of
supporting libraries.

##### Non Functional Requirement (NFR)

Requirements that _constrain the solution_.
Nonfunctional requirements are also known as _quality attribute requirements_
or _quality requirements_. The term NFR is actually misleading, as many of
the _attributes_ involved directly relate to specific system _functions_
(so modern requirements engineering likes to call these things
  _required constraints_).

##### Notation

A system of marks, signs, figures, or characters that is used to represent information. Examples: prose, table, bullet point list, numbered list, UML, BPMN.

##### Observer

(Design pattern) "... in which an object maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. The Observer pattern is a key part in the model–view–controller (MVC) architectural pattern".
(quoted from [Wikipedia](https://en.wikipedia.org/wiki/Observer_pattern))

##### Open-Close-Principle (OCP)

„Software entities (classes, modules, functions, etc.) should be open for
extension, but closed for modification“ (Bertrand Meyer, 1998). In plain words:
To _add_ functionality (extension) to a system, you should _not need to
modify_ existing code.
Part of Robin Martins "SOLID" principles for object-oriented systems. Can be
implemented in object oriented languages by interface inheritance,
in a more general way as _plugins_.

##### Pattern

see _architecture patter_ or _design pattern_.

##### Pipe

Connector in the pipe-and-filter architectural style that transfers
streams or chunks of data from the output of one filter to the input
of another filter without modifying values or order of data.

##### Port

UML construct, used in component diagrams. An interface,
defining a point of interaction of a component
with its environment.

##### POSA

Pattern-oriented Software Architecture. Series of books on software architecture
patterns.

##### Proxy

(Design pattern) "A wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked. For the client, usage of a proxy object is similar to using the real object, because both implement the same interface."
(quoted from [Wikipedia](https://en.wikipedia.org/wiki/Proxy_pattern))


##### Qualitative evaluation

Finding risks concerning the desired quality attributes of a system. Analyzing or
assessing if a system or its architecture can meet the desired or required quality goals.

  Instead of calculating or measuring certain characteristics of systems or architectures,
  qualitative evaluation is concerned with risks, tradeoffs and sensitivity points.

##### Quality

see [_software quality_](#ge-software-quality) and ->quality attributes.

##### Quality attribute

Software quality is the degree to which a system posesses the
desired combination of _attributes_ (see: software quality).

Important quality attributes are performance, robustness, security, safety,
flexibiltiy, dependability, maintainability etc.. See also [ISO-25010]()

It's helpful to distinguish between

* _runtime quality attributes_ (which can be observed at execution time of the system),
* non-runtime quality attributes_ (which cannot be observed as the system executes) and
* business quality attributes (cost, schedule, marketability, appropriateness for organization)

Examples of runtime quality attributes are functionality, performance, security, availability,
usability and interoperability.

Examples of non-runtime quality attributes are modifiability, portability, reusability, integratability,
testability.  

##### Quality characteristic

synonym: _quality attribute_.

##### Quality requirement

Characteristic or attribute of a component of a system. Examples include
runtime performance, safety, security, reliability or maintainability.
See also _software quality_.

##### Quality tree

(syn: quality attribute utility tree). A hierarchical model to describe
product quality: The root "quality" is hierarchically refined in _areas_ or
topics, which itself are refined again. Quality scenarios form the leaves of
these tree.

  * Standards for product quality, like ->ISO 25010, propose _generic_
  quality trees.
  * The quality of a specific system can be described by a _specific_
  quality tree (see the example below).

  {width=60%}  
  ![Sample Quality Tree](images/QualityTree.png)


##### Quantitative evaluation

(syn: quantative analysis): Measure or count values of software artifacts,
e.g. ->coupling, ->cyclomatic complexity, size, test coverage. Metrics like these
can help to identify critical parts or elements of systems.


##### Rationale

Explanation of the reasoning or arguments that lie behind an architecture decision.

##### Registry

"A well-known object that other objects can use to find common objects and services." (quoted from
  [PoEAA](http://martinfowler.com/eaaCatalog/registry.html)). Often implemented as a _Singleton_ (also a
    well-known design pattern.)

##### Relationship

Generic term denoting some kind of dependency between elements of
an architecture. Different types of relationship are used within
architectures, e.g. call, notification, ownership, containment,
creation or inheritance.

##### Redesign
The alteration of software units in such a way that they fulfill a similar purpose as before, but in a different manner and possibly by different means. Often mistakenly called refactoring. 

##### Refactoring
A term denoting the improvement of software units by changing their internal structure without changing the behavior. (see 
“Refactoring is the process of changing a software system in such a way that it does not alter the external behavior of the code yet improves the internal structure.” Refactoring, Martin Fowler, 1999    
Not to be confused with re*design*

##### Repository

In architecture documentation: A place where artifacts are stored before an automatic build process collects them into one consistent document.

##### [RM/ODP](https://en.wikipedia.org/wiki/RM-ODP)

_Reference Model for Open Distributed Processing_. (Abstract) metamodel
for documentation of information systems. Defined in ISO/IEC 10746.

##### Round-trip engineering

"Concept of being able to make any kind of change to a model as well as to the code generated from that model. The changes always propagate bidirectional and both artifacts are always consistent." (quoted from
  [Wikipedia](https://en.wikipedia.org/wiki/Model-driven_software_development)).

  In my personal opinion, it does not work in practical situations, only in hello-world-like scenarios.

##### Ruby

A wonderful programming language.

{#term__runtime_view}
##### Runtime View

Shows the cooperation or collaboration of building blocks
(resp. their instances) at runtime in concrete scenarios.
Should refer to elements of the ->Building Block View.
Could for example (but doesn't need to) be expressed in UML sequence or activity diagrams.

##### Scenario

Quality scenarios document required quality attributes.
They help to describe required or desired qualities of a system, in pragmatic and
informal manner, yet making the abstract notion of “quality” concrete and tangible.

  {width=50%}
  ![Generic form of (Quality) scenario](images/schematic-Q-scenario.png)

  * Event/stimulus: Any condition or event arriving at the system
  * System (or part of the system) is stimulated by the event.
  * Response: The activity undertaken after the arrival of the stimulus.
  * Metric (response measure): The response should be measurable in some fashion.


##### SCS (Self Contained System)

An architectural style, similar to ->Microservices. To quote from the site
[scs-architecture.org](http://scs-architecture.org/):

  "The Self-contained System (SCS) approach is an architecture that focuses on a separation of the functionality into many independent systems, making the complete system a collaboration of many smaller software systems. This avoids the problem of large monoliths that grow constantly and eventually become unmaintainable"


##### Sensitivity point

(in qualitative evaluation like ATAM): Element of the architecture or system
influencing several quality attributes. For example, if one component is responsible
for both runtime performance _and_ robustness, that component is a sensitivity point.

  Casually said, if you mess up a sensitivity point, you will most often have  more than
  one problem.

##### Separation of concern (SoC)

Any element of an architecture should have exclusivity and singularity of responsibility and purpose: No element should share the responsibilities of another element or contain unrelated responsibilities.

  Another definition is "breaking down a system into elements that overlap
  as little as possible."

  Famous Edgar Dijkstra said in 1974: “Separation of concerns ... even if not perfectly possible, is the only available technique for effective ordering of one’s thoughts”.

  Similar to the ->"Single Responsibility Principle".

##### Sequence diagram

Type of diagram to illustrate how elements of an architecture interact
to achieve a certain scenario. It shows the sequence (flow) of messages
between elements. As parallel vertical lines it shows
the lifespan of objects or components, horizontal lines
depict interactions between these components. See the following example.

![Example of Sequence Diagram](images/sequence-diagram-sample.png)

##### Singleton

"Design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system." (quoted from [Wikipedia](https://en.wikipedia.org/wiki/Singleton_pattern).

##### Single Responsibility Principle (SRP)

Each element within a system or architecture should have a single
responsibility, and that all its functions or services should be
aligned with that responsibility.

  Cohesion is sometimes considered to by synonymous for SRP.

{#term_-software-quality}
##### Software Quality

(from IEEE Standard 1061): Software quality is the degree to which software possesses a desired combination of attributes. This desired combination of attributes need to be clearly defined; otherwise, assessment of quality is left to intuition.

##### S.O.L.I.D. principles

SOLID (single responsibility, open-closed, Liskov substitution, interface segregation and dependency inversion) is an acronym for some principles
(named by [Robert C. Martin](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod))
to improve object-oriented programming and design. The principles make it more likely that a developer will write code
that is easy to maintain and extend over time.

##### Stakeholder

Person or organization that can be affected by
or have in interest (_stake_) in a system, its development
or execution.

  Examples include users, employees, owners, administrators, developers,
  designer, manager, product-owner, project manager,

##### Structure

An arrangement, order or organization of interrelated elements in a system.
Structures consist of building blocks (structural elements)
and their relationships (dependencies).

  Structures in software architecture are often used in ->architectural views, e.g. the ->building block view. A documentation template (e.g. arc42) is
  a kind of structure too.

##### Structural element

see _Building block_ or _Component_

##### System

Collection of elements (building blocks, components etc)
organized for a common purpose.

##### Template (for documentation)

Standardized order of artifacts used in software development.
It can help base other files, especially documents in a predefines
structure without prescribing the content of these single files.


##### [TOGAF](http://www.opengroup.org/subjectareas/enterprise/togaf)

_The Open Group Architecture Framework_. Conceptual framework for planning
and maintenance of enterprise IT architectures.

##### Top-Down

"Direction of work" or "order of communication": Starting from an abstract or general
construct working towards more concrete, special or detailed representation.

##### Traceability

(more precisely: _requirements_ traceability): Document that

  1. all requirements are addressed by elements of the system (forward traceability) and
  2. all elements of the system are justified by at least one requirement
  (backward traceability)

  My personal opinion: If you can, you should avoid traceabiltiy, as it creates
  a lot of documentation overhead.

##### Tradeoff

(syn: compromise). A balance achieved or negotiated between two desired or
required but usually incompatible or contradicting features. For example,
software development usually has to tradeoff memory consumption and runtime
speed.

  More colloquially, if one thing increases, some other thing must decrease.

  Even more colloquially: There is no free lunch. Every quality attribute
  has a price among other quality attributes.

##### [Unified Modeling Language (UML)](http://uml.org)

Graphical language for visualizing, specifying and
documenting the artifacts and structures of a software system.

  * For building block views or the context view, use component diagrams, with either components, packages or classes to denote building blocks.
  * For runtime views, use sequence- or activity diagrams (with swimlanes). Object diagrams can theoretically be used, but are practically not adviced,
   as they become cluttered even for small scenarios.
   * For Deployment views, use deployment diagrams with node symbols.

##### Uses relationship

Dependency that exists between two building blocks.
If A uses B than execution of A depends on the
presence of a correct implementation of B.

##### View

see: architectural view.

##### Waterfall development

Development appropach "where you gather all the requirements up front, do all necessary design, down to a detailed level, then hand the specs to the coders, who write the code; then you do testing (possibly with a side trip to IntegrationHell) and deliver the whole thing in one big end-all release. Everything is big including the risk of failure." (quoted from [http://c2.com/cgi/wiki?IterativeDevelopment])

  Contrast to _iterative development_

##### Whitebox

Shows the internal structure of a system or building block, made up from
blackboxes and the internal/external relationships / interfaces.

##### Workflow Management System (WFMS)

Provides an infrastructure for the set-up, performance and monitoring of a defined sequence of tasks, arranged as a workflow. (quoted from Wikipedia)

##### Wrapper

(syn: Decorator, Adapter) Patterns to abstract away the concrete interface
or implementation of a component. Attach additional responsibilities to an object dynamically.
  Depending on the sources, semantics of _wrapper_ differ significantly.
