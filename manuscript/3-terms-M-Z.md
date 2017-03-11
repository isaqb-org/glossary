{#term-MFA}
### MFA

For **M**ulti-**F**actor-**A**uthentication see [Authentication](#term-authentication).

Category: Security


{#term-microservice}
### Microservice

An architectural style, proposing to divide large systems into small units.
"Microservices have to be implemented as virtual machines, as more light-weight alternatives such as Docker containers or as individual processes. Thereby they can easily be brought into production individually." (quoted from the (free) [LeanPub booklet on Microservices](https://leanpub.com/microservices-primer) by [Eberhard Wolff](http://microservices-book.com).

{#term-model-driven-architecture}
### [Model Driven Architecture (MDA)](http://www.omg.org/mda/)

OMG-Standard for model based software development.
Definition: „An approach to IT system specification that separates the specification of functionality from the specification of the implementation of that functionality on a specific technology platform.“

{#term-model-driven-software-development}
### Model-driven software development (MDSD)

The underlying idea is to generate code from more abstract models of requirements or the domain.

{#term-model-kind}
### Model kind

Conventions for a type of modeling (as defined in ISO/IEC/IEEE 42010).

Note, examples of model kinds include data flow diagrams, class diagrams, Petri nets, balance sheets, organization charts and state transition models.

Category: ISO-IEC-IEEE-42010

{#term-modeling-tool}
### Modeling Tool

A tool that creates models (e.g. UML or BPMN models). Can be used to create consistent diagrams for documentation because it has the advantage that each model element exists only once but can be consistently displayed in many diagrams (as opposed to a mere [Drawing Tool](#term-drawing-tool)).

{#term-model-view-controller}
### Model-View-Controller

Architecture pattern, often used to implement user interfaces. It divides a
system into three interconnected parts (model, view and controller) to separate
the following responsibilities:

  * Model manages data and logic of the system. The "truth" that will be shown or
  displayed by one or many views. Model does not know (depend on) its views.
  * View can be any number of (arbitrary) output representation of (model) information.
  Multiple views of the same model are possible.
  * Controller accepts (user) input and converts those to commands for the model or view.


{#term-module}
### Module

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
### Modular programming

"Software design technique that separates the functionality of a program into independent,
interchangeable _modules_, so that each module contains everything necessary to execute
only one aspect of the desired functionality.

  Module have _interfaces_ expressing the elements provided and required by the module.
  The elements defined in the interface are detectable by other modules."
   (quoted from [Wikipedia](https://en.wikipedia.org/wiki/Modular_programming))


{#term-node-uml}
### Node (in UML)

A processing resource (execution environment, processor, machine, virtual machine,
  application server) where artifacts can be deployed and executed.


{#term-node-js}
### Node (Node.js)

In modern web development: Short form for the open source
JavaScript runtime [Node.js®](https://nodejs.org/en/), which is built on Chrome's V8 JavaScript engine. Node.js is famous for its an event-driven, non-blocking I/O model and its vast ecosystem of
supporting libraries.

{#term-non-functional-requirement}
### Non Functional Requirement (NFR)

Requirements that _constrain the solution_.
Nonfunctional requirements are also known as _quality attribute requirements_
or _quality requirements_. The term NFR is actually misleading, as many of
the _attributes_ involved directly relate to specific system _functions_
(so modern requirements engineering likes to call these things
  _required constraints_).


{#term-notation}
### Notation

A system of marks, signs, figures, or characters that is used to represent information. Examples: prose, table, bullet point list, numbered list, UML, BPMN.


{#term-observer}
### Observer

(Design pattern) "... in which an object maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. The Observer pattern is a key part in the model–view–controller (MVC) architectural pattern".
(quoted from [Wikipedia](https://en.wikipedia.org/wiki/Observer_pattern))


{#term-open-close-principle}
### Open-Close-Principle (OCP)

„Software entities (classes, modules, functions, etc.) should be open for
extension, but closed for modification“ (Bertrand Meyer, 1998). In plain words:
To _add_ functionality (extension) to a system, you should _not need to
modify_ existing code.
Part of Robin Martins "SOLID" principles for object-oriented systems. Can be
implemented in object oriented languages by interface inheritance,
in a more general way as _plugins_.


{#term-owasp}
### OWASP

The **O**pen **W**eb **A**pplication **S**ecurity **P**roject is a worldwide
non-profit online organization founded 2001 for improving the security of
software. It is a rich source for information and best practices in the field
of web security. See [https://www.owasp.org/](https://www.owasp.org/).

The OWASP-Top-10 is a frequently referenced list of attack categories based on
the projects data survey.

Category: Security


{#term-pattern}
### Pattern

 A reusable or repeatable solution to a common problem in software design or architecture.

See [architecture pattern](#term-architecture-pattern) or [design pattern](#term-design-pattern).

{#term-perfect-forward-secrecy}
### Perfect Forward Secrecy

Property of a cryptographic protocol were an attacker can't gain any
information about short-term session keys by compromising long-term keys.

Examples for protocols with perfect forward secrecy are TLS and OTR. If this
feature is enabled for [TLS](#term-tls) and an attacker gains access to a servers private
key, previously recorded communication sessions can still not be decrypted.

Category: Security


{#term-perspective}
### Perspective

A perspective is used to consider a set of related quality properties and concerns of a system.

Architects apply perspectives iteratively to the system's _architectural views_ in order to assess the effects of _architectural design decisions_ across multiple _viewpoints_ and _architectural views_.

[Rozanski+11] associates with the term _perspective_ also activities, tactics, and guidelines that must be considered if a system should provide a set of related quality properties and suggests the following perspectives:

 * Accessibility
 * Availability and Resilience
 * Development Resource
 * Evolution
 * Internationalization
 * Location
 * Performance and Scalability
 * Regulation
 * Security
 * Usability

{term-pikachu}
### Pikachu
A yellowish mouse-like character from the
(quite famous) [Pokémon world](https://simple.wikipedia.org/wiki/Pikachu).
Actually, you don't need to know that. But it does not hurt either - and you might impress your kids with this knowledge...


{#term-pipe}
### Pipe

Connector in the pipes-and-filters architectural style that transfers
streams or chunks of data from the output of one filter to the input
of another filter without modifying values or order of data.


{#term-pki}
### PKI

Short for **P**ublic-**K**ey-**I**nfrastructure. A concept of managing digital certificates
usually involving [asymmetric cryptography](#term-asymmetric-cryptography). The
term "public" refers most of the time to the used type of cryptographic key and
not necessarily to infrastructure open to a public audience. To prevent
semantic confusion the terms "open PKI" or "closed PKI" can be used, see
[Anderson, Chapter 21.4.5.7 PKI, page 672](#ref-anderson-2008).

PKI is usually based on a [CA](#term-ca) or a [Web-of-Trust](#term-web-of-trust).

Category: Security


{#term-port}
### Port

UML construct, used in component diagrams. An interface,
defining a point of interaction of a component
with its environment.


{#term-posa}
### POSA

Pattern-oriented Software Architecture. Series of books on software architecture
patterns.


{#term-principal}
### Principal

Principals in a security context are entities which have been authenticated and
can be assigned permissions to. A principal can be a user but for example also
other services or a process running on a system. The term is used in the [Java
environment](https://docs.oracle.com/javase/8/docs/api/java/security/Principal.html)
and throughout different authentication protocols (see [GSSAPI
RFC2744](https://tools.ietf.org/html/rfc2744) or [Kerberos
RFC4121](https://tools.ietf.org/html/rfc4121)).

Category: Security


{#term-proxy}
### Proxy

(Design pattern) "A wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked. For the client, usage of a proxy object is similar to using the real object, because both implement the same interface."
(quoted from [Wikipedia](https://en.wikipedia.org/wiki/Proxy_pattern))


{#term-pseudo-randomness}
#### Pseudo-Randomness

Often used in conjunction with pseudo-random-number-generators. Gathering
randomness with a high [entropy](#term-entropy) is resource intensive and
usually not required by many applications, cryptography left aside.
To address this issue pseudo-random-generators are initialized with a seed of
data and create random values based on this seed. The data will be generated
by random, but will always be the same if the generator is initialized with an
identical seed. This is called pseudo-randomness and is less performance
intensive.

Category: Security


{#term-qualitative-evaluation}
### Qualitative evaluation

Finding risks concerning the desired quality attributes of a system. Analyzing or
assessing if a system or its architecture can meet the desired or required quality goals.

  Instead of calculating or measuring certain characteristics of systems or architectures,
  qualitative evaluation is concerned with risks, tradeoffs and sensitivity points.

  See also [_assessment_](#term-assessment).


{#term-quality}
### Quality

see [_software quality_](#term-software-quality) and [quality attributes](#term-quality-attribute).


{#term-quality-attribute}
### Quality attribute

Software quality is the degree to which a system possesses the
desired combination of _attributes_ (see: [software quality](#term-software-quality)).

Important quality attributes are performance, robustness, security, safety,
flexibility, dependability, maintainability etc.. See also [ISO-25010](#term-iso-25010)

It's helpful to distinguish between:

* _runtime quality attributes_ (which can be observed at execution time of the system),
* non-runtime quality attributes_ (which cannot be observed as the system executes) and
* business quality attributes (cost, schedule, marketability, appropriateness for organization)

Examples of runtime quality attributes are functionality, performance, security, availability,
usability and interoperability.

Examples of non-runtime quality attributes are modifiability, portability, reusability, integratability,
testability.  

{#term-quality-characteristic}
### Quality characteristic

synonym: _quality attribute_.


{#term-quality-requirement}
### Quality requirement

Characteristic or attribute of a component of a system. Examples include
runtime performance, safety, security, reliability or maintainability.
See also _software quality_.


{#term-quality-tree}
### Quality tree

(syn: quality attribute utility tree). A hierarchical model to describe
product quality: The root "quality" is hierarchically refined in _areas_ or
topics, which itself are refined again. Quality scenarios form the leaves of
these tree.

  * Standards for product quality, like [ISO 25010](#term-iso-25010, propose _generic_
  quality trees.
  * The quality of a specific system can be described by a _specific_
  quality tree (see the example below).

  {width=60%}  
  ![Sample Quality Tree](images/QualityTree.png)


{#term-quantative-evaluation}
### Quantitative evaluation

(syn: quantative analysis): Measure or count values of software artifacts,
e.g. [coupling](#term-coupling), cyclomatic complexity, size, test coverage. Metrics like these
can help to identify critical parts or elements of systems.

{#term-randomness}
### Randomness

See [Entropy](#term-entropy) or [Pseudo-Randomness](#term-pseudo-randomness).

Category: Security


{#term-rationale}
### Rationale

Explanation of the reasoning or arguments that lie behind an architecture decision.


{#term-rbac}
### RBAC (Role Based Access Control)

A role is a fixed set of permissions usually assigned to a group of
[principals](#term-principal). This allows a
**R**ole-**B**ased-**A**ccess-**C**ontrol usually to be implemented more
efficient than an [ACL](#term-acl) based system and makes for example deputy
arrangements possible.

Category: Security


{#term-registry}
### Registry

"A well-known object that other objects can use to find common objects and services." (quoted from
  [PoEAA](http://martinfowler.com/eaaCatalog/registry.html)). Often implemented as a _Singleton_ (also a
    well-known design pattern.)


{#term-relationship}
### Relationship

Generic term denoting some kind of dependency between elements of
an architecture. Different types of relationship are used within
architectures, e.g. call, notification, ownership, containment,
creation or inheritance.


{#term-redesign}
### Redesign
The alteration of software units in such a way that they fulfill a similar purpose as before, but in a different manner and possibly by different means. Often mistakenly called refactoring.


{#term-refactoring}
### Refactoring
A term denoting the improvement of software units by changing their internal structure without changing the behavior. (see
“Refactoring is the process of changing a software system in such a way that it does not alter the external behavior of the code yet improves the internal structure.” Refactoring, Martin Fowler, 1999    
Not to be confused with re*design*


{#term-repository}
### Repository

In architecture documentation: A place where artifacts are stored before an automatic build process collects them into one consistent document.
In [Domain-Driven Design](#term-DDD): Repository is a building block of [Domain-Driven Design](#term-DDD). A repository hides technical details of the infrastructure layer to the domain layer. Repositories return [entities](#term-entity) that are persisted in the database.


{#term-rm-odp}
### [RM/ODP](https://en.wikipedia.org/wiki/RM-ODP)

_Reference Model for Open Distributed Processing_. (Abstract) metamodel
for documentation of information systems. Defined in ISO/IEC 10746.


{#term-round-trip-engineering}
### Round-trip engineering

"Concept of being able to make any kind of change to a model as well as to the code generated from that model. The changes always propagate bidirectional and both artifacts are always consistent." (quoted from
  [Wikipedia](https://en.wikipedia.org/wiki/Model-driven_software_development)).

D> ###### Comment (Gernot Starke)
D> In my personal opinion, it does not work in practical situations, only in hello-world-like scenarios, as the inverse abstraction (from low-level sourcecode to higher-level architectural elements) usually involves design-decisions and cannot realistically be automated.
D>
D> ###### Comment (Matthias Bohlen)
D>Recently I have seen code that originated from DDD where reverse engineering did indeed work.


{#term-ruby}
### Ruby

A wonderful programming language.

Category: Programming

{#term-runtime-view}
### Runtime View

Shows the cooperation or collaboration of building blocks
(respectively their instances) at runtime in concrete scenarios.
Should refer to elements of the [Building Block View](#term-building-block-view).
Could for example (but doesn't need to) be expressed in UML sequence or activity diagrams.


{#term-scenario}
### Scenario

Quality scenarios document required quality attributes.
They help to describe required or desired qualities of a system, in pragmatic and
informal manner, yet making the abstract notion of “quality” concrete and tangible.

  {width=50%}
  ![Generic form of (Quality) scenario](images/schematic-Q-scenario.png)

  * Event/stimulus: Any condition or event arriving at the system
  * System (or part of the system) is stimulated by the event.
  * Response: The activity undertaken after the arrival of the stimulus.
  * Metric (response measure): The response should be measurable in some fashion.


{#term-sdl}
### SDL

A **S**ecure-**D**evelopment-**L**ifecycle is a companies usual software
development process with added best practices of engineering secure software.
This involves for example code reviews, architectural risk analyses, black/whitebox and
penetration testing and many more additions.
The whole lifecycle of an application should be covered by the SDL, beginning
with the first requirements engineering tasks and ending with feedback from
operating the released software by fixing security issues.

See [McGraw "An Enterprise Software Security Program", page 239](#ref-mcgraw-2006).

Category: Security


{#term-security-goals}
### Security Goals

The goals are the key point of information security. They are a basic set of
information attributes which can be fulfilled or not depending on a systems
architecture and processes.

The most common agreed set of security goals is the so called "CIA triad":

* Confidentiality
* Integrity
* Availability

The "Reference Model of Information Assuarance and Security" (RIMAS) extends
this list by Accountability, Auditability, Authenticity/Trustworthiness,
Non-repudiation and Privacy.

These are typical examples for non-functional requirements related to security.

See ["What is Security Engineering - Definitions", page 11](#ref-anderson-2008) or [RMIAS](#ref-rmias-2013).

Category: Security


{#term-self-contained-system}
### SCS (Self Contained System)

An architectural style, similar to [Microservices](#term-microservice). To quote from the site
[scs-architecture.org](http://scs-architecture.org/):

  "The Self-contained System (SCS) approach is an architecture that focuses on a separation of the functionality into many independent systems, making the complete system a collaboration of many smaller software systems. This avoids the problem of large monoliths that grow constantly and eventually become unmaintainable"


{#term-sensitivity-point}
### Sensitivity point

(in qualitative evaluation like ATAM): Element of the architecture or system
influencing several quality attributes. For example, if one component is responsible
for both runtime performance _and_ robustness, that component is a sensitivity point.

  Casually said, if you mess up a sensitivity point, you will most often have  more than
  one problem.


{#term-separation-of-concern}
### Separation of concern (SoC)

Any element of an architecture should have exclusivity and singularity of responsibility and purpose: No element should share the responsibilities of another element or contain unrelated responsibilities.

  Another definition is "breaking down a system into elements that overlap
  as little as possible."

  Famous Edgar Dijkstra said in 1974: “Separation of concerns ... even if not perfectly possible, is the only available technique for effective ordering of one’s thoughts”.

  Similar to the [Single Responsibility Principle](#term-single-responsibility-principle).


{#term-sequence-diagram}
### Sequence diagram

Type of diagram to illustrate how elements of an architecture interact
to achieve a certain scenario. It shows the sequence (flow) of messages
between elements. As parallel vertical lines it shows
the lifespan of objects or components, horizontal lines
depict interactions between these components. See the following example.

![Example of Sequence Diagram](images/sequence-diagram-sample.png)

{#terms-service}
### Service
t.b.d.


{#term-service-ddd}
### Service (DDD)

Service is a building block of [Domain-Driven Design](#term-DDD). Services implement logic or processes of the business domain that are not executed by entities alone. A service is stateless and the parameters and return values of its operations are [entities](#term-entity), [aggregates](#term-aggregate) and [value objects](#term-value-object).


{#term-singleton}
### Singleton

"Design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system." (quoted from [Wikipedia](https://en.wikipedia.org/wiki/Singleton_pattern).


{#term-single-responsibility-principle}
### Single Responsibility Principle (SRP)

Each element within a system or architecture should have a single
responsibility, and that all its functions or services should be
aligned with that responsibility.

  Cohesion is sometimes considered to by synonymous for SRP.


{#term-software-architecture}
### Software Architecture

There exist several (!) valid and plausible definitions
of the term _Software Architecture_.

The following definition has been proposed by the [IEEE 1471](https://en.wikipedia.org/wiki/IEEE_1471) standard:

A>Software Architecture: the fundamental organization of a system
A>embodied in its components, their relationships to each
A>other and to the environment and the principles guiding
A>its design and evolution.

The new standard ISO/IEC/IEEE 42010:2011 has adopted and revised the definition as follows:

A>Architecture: (system) fundamental concepts or properties of a system
A>in its environment embodied in its elements, relationships, and in
A>the principles of its design and evolution.

The key terms in this definition require some explanation:

* Components: Subsystems, modules, classes, functions or the more general term
 _building blocks_: structural elements of software: Components are usually implemented in a programming language, but can also be other artifacts that
(together) _make up the system_.
* Relationships: Interfaces, dependencies, associations - different names for the same feature: Components need to interact with other components to enable
 _separation of concerns_.
* Environment: Every system has some relationships
to its environment: data, control flow or events are transferred to
and from maybe different kinds of neighbours.
* Principles: Rules or conventions that hold for a system or several parts of it.
Decision or definition, usually valid for several elements of the system. Often
called _concepts_ or even _solution patterns_. Principles (concepts) are the foundation for _conceptual integrity_.


The _Software Engineering Institure_
maintains a [collection of further definitions](http://www.sei.cmu.edu/architecture/start/glossary/classicdefs.cfm)

Category: ISO-IEC-IEEE-42010

{#term-software-quality}
### Software Quality

(from IEEE Standard 1061): Software quality is the degree to which software possesses a desired combination of attributes. This desired combination of attributes need to be clearly defined; otherwise, assessment of quality is left to intuition.


{#term-solid-principles}
### S.O.L.I.D. principles

SOLID (single responsibility, open-closed, Liskov substitution, interface segregation and dependency inversion) is an acronym for some principles
(named by [Robert C. Martin](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod))
to improve object-oriented programming and design. The principles make it more likely that a developer will write code
that is easy to maintain and extend over time.


{#term-stakeholder}
### Stakeholder

Person or organization that can be affected by
or have in interest (_stake_) in a system, its development
or execution.

  Examples include users, employees, owners, administrators, developers,
  designer, manager, product-owner, project manager,

Following ISO/IEC/IEEE 42010 a stakeholder is a (system) individual, team, organization, or classes thereof, having an interest in a system (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-structure}
### Structure

An arrangement, order or organization of interrelated elements in a system.
Structures consist of building blocks (structural elements)
and their relationships (dependencies).

  Structures in software architecture are often used in [architecture views](#term-architecture-view),
  e.g. the [building block view](#term-building-block-view).
  A documentation template (e.g. [arc42](#term-arc42)) is
  a kind of structure too.


{#term-structural-element}
### Structural element

see _Building block_ or _Component_


{#term-symmetric-cryptography}
### Symmetric Cryptography

Symmetric cryptography is based on an identical key for encryption and
decryption of data. Sender and receiver have to agree on a key for
communication. See [Schneier, Symmetric Algorithms, page 17](#ref-schneier-1996).

Category: Security


{#term-system}
### System

Collection of elements (building blocks, components etc)
organized for a common purpose.

In ISO/IEC/IEEE Standards a couple of system definitions are available:

* systems as described in [ISO/IEC 15288]: “systems that are man-made and may be configured with one or more of the following: hardware, software, data, humans, processes (e.g., processes for providing service to users), procedures (e.g. operator instructions), facilities, materials and naturally occurring entities”.

* software products and services as described in [ISO/IEC 12207].

* software-intensive systems as described in [IEEE Std 1471:2000]: “any system where software contributes essential inuences to the design, construction, deployment, and evolution of the system as a whole” to encompass “individual applications, systems in the traditional sense, subsystems, systems of systems, product lines, product families, whole enterprises, and other aggregations of interest”.

Category: ISO-IEC-IEEE-42010


{#term-system-of-interest}
### System-of-Interest

System-of-Interest (or simply, system) refers to the system whose architecture is under consideration in the preparation of an architecture description (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010




{#term-template}
### Template (for documentation)

Standardized order of artifacts used in software development.
It can help base other files, especially documents in a predefines
structure without prescribing the content of these single files.

  A well known example of such templates is [arc42](http://arc42.de)


{#term-tls}
### TLS

**T**ransport-**L**ayer-**S**ecurity is a set of protocols to cryptographically
secure the communication of two partys by the means of the
[CIA-triad](#term-cia-triad).
It is widely used for secure communication on the internet and the foundation for HTTPS.

TLS started as an update to its predecessor SSL (Secure Socket Layer) Version
3.0 and should be used now instead of SSL [see RFC7568 "Deprecating Secure
Sockets Layer Version 3.0"](https://tools.ietf.org/html/rfc7568).

Category: Security


{#term-togaf}
### [TOGAF](http://www.opengroup.org/subjectareas/enterprise/togaf)

_The Open Group Architecture Framework_. Conceptual framework for planning
and maintenance of enterprise IT architectures.

{#term-tools-and-material-approach}
### Tools-and-material-approach
t.b.d.

{#term-top-down}
### Top-Down

"Direction of work" or "order of communication": Starting from an abstract or general
construct working towards more concrete, special or detailed representation.


{#term-traceability}
### Traceability

(more precisely: _requirements_ traceability): Document that

  1. all requirements are addressed by elements of the system (forward traceability) and
  2. all elements of the system are justified by at least one requirement
  (backward traceability)

  My personal opinion: If you can, you should avoid traceabiltiy, as it creates
  a lot of documentation overhead.

{#term-tradeoff}
### Tradeoff

(syn: compromise). A balance achieved or negotiated between two desired or
required but usually incompatible or contradicting features. For example,
software development usually has to tradeoff memory consumption and runtime
speed.

  More colloquially, if one thing increases, some other thing must decrease.

  Even more colloquially: There is no free lunch. Every quality attribute
  has a price among other quality attributes.


{#term-ubiquitous-language}
### Ubiquitous language
A concept of [Domain-Driven Design](#term-DDD): The ubiquitous language is a language that is structured around the [domain model](#term-domain-model). It is used by all team members to connect all the activities of the team with the software. The ubiquitous language is a living thing that is evolving during a project and will be changed during the whole live cycle of the software.


{#term-uml}
### [Unified Modeling Language (UML)](http://uml.org)

Graphical language for visualizing, specifying and
documenting the artifacts and structures of a software system.

* For building block views or the context view, use component diagrams, with either components, packages or classes to denote building blocks.
* For runtime views, use sequence- or activity diagrams (with swimlanes). Object diagrams can theoretically be used, but are practically not adviced, as they become cluttered even for small scenarios.
* For Deployment views, use deployment diagrams with node symbols.


{#term-uses-relationship}
### Uses relationship

Dependency that exists between two building blocks.
If A uses B than execution of A depends on the
presence of a correct implementation of B.


{#term-value-object}
### Value Object

Value Object is a building block of [Domain-Driven Design](#term-DDD). ValueObjects do not have a conceptual identity of their own and should be treated as immutable. They are used to describe the state of [entities](#term-entity) and may be composed of other value objects but never of [entities](#term-entity).


{#term-view}
### View

see: architectural view.


{#term-waterfall-development}
### Waterfall development

Development approach "where you gather all the requirements up front, do all necessary design, down to a detailed level, then hand the specs to the coders, who write the code; then you do testing (possibly with a side trip to IntegrationHell) and deliver the whole thing in one big end-all release. Everything is big including the risk of failure." (quoted from [http://c2.com/cgi/wiki?IterativeDevelopment])

  Contrast to _iterative development_


{#term-web-of-trust}
### Web of Trust

Since a single [CA](#term-ca) could be an easy target for an attacker the web
of trust delegates the establishment of trust to the user. Each user decides
which other users proof of identity he trusts, usually by verifying a
fingerprint of a given key. This trust is expressed by signing the key of the
other user who can then publish it with the additional signature. A third user
can then verify this signature and decide to trust the identity or not.

The email encryption PGP is an example for a [PKI](#term-pki) based on a web of trust.

Category: Security


{#term-whitebox}
### Whitebox

Shows the internal structure of a system or building block, made up from
blackboxes and the internal/external relationships / interfaces.


{#term-workflow-management-system}
### Workflow Management System (WFMS)

Provides an infrastructure for the set-up, performance and monitoring of a defined sequence of tasks, arranged as a workflow. (quoted from Wikipedia)


{#term-wrapper}
### Wrapper

(syn: Decorator, Adapter, Gateway) Patterns to abstract away the concrete interface or implementation of a component. Attach additional responsibilities to an object dynamically.

D> ###### Comment (Gernot Starke)
D> The tiny differences found in literature regarding this term often don't matter in real-life. _Wrapping_ a component or building-block shall have a clear semantics within a single software system.  
