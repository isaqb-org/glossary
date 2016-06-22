{pagebreak}

{#glossary}
# Glossary of Terms

{#term-abstractness}
### Abstractness

Metric for the source code of object oriented systems: The number of abstract types
(interfaces and abstract classes) divided by the total number of types.

{#term-adapter}
### Adapter

The adapter is a design pattern that allows the interface of an existing component to be used from another interface. It is often used to make existing components cooperate with others without modifying their source code.

{#term-aggregate}
### Aggregate

Aggregate is a building block of [Domain-Driven Design](#term-DDD). Aggregates are complex object structures that are made of [entities](#term-entity) and [value objects](#term-valueobject). Each aggregate has a root entity and is regarded as a unity when it comes to changes. An aggregate ensure consistency and integrity of its contained entities with invariantes.

{#term-aggregation}
### Aggregation

A form of object composition in object-oriented programming.
It differs from ->composition, as aggregation does not imply ownership. When the element is destroyed, the contained elements
remain intact.

{#term-algorithm}
### Algorithm

* (noun) Term used by software developers when they
do not want to explain what they did.
* A self-contained step-by-step set of operations to be performed, e.g. to perform calculations, data processing, and/or similar tasks.

{#term-appropriateness}
### Appropriateness

(syn: adequacy, suitability) Suitability for a particular purpose.

{#term-arc42}
### arc42

Free [template](http://arc42.org) for communication and documentation of software architectures.

{#term-architectural-decision}
### Architectural Decision
Decision, which has an sustainable or essential effect on structures, concepts, implementations or similar. Example: Decision about database technology or technical basics of the user interface.

{#term-architecture-evaluation}
### Architecture evaluation

Determine if an architecture can achieve its target qualities or
quality attributes?
  Quantitative or qualitative assessment of a (software or system) architecture. In my opinion the term _architecture analysis_ is more
  appropriate, as _evaluation_ contains _value_, implying numerical
  assessment (which is usually only part of what you should do in architecture analysis).

{#term-architecture-goal}
### Architecture goal

(syn: quality goal, quality requirement): A quality attribute that the system need
to achieve. These goals often have _long term character_ in contrast to (short term)
project goals.

{#term-architecture-objective}
### Architecture objective

See [architecture goal](#term-architecture-goal).

{#term-architecture-pattern}
### Architectural (architecture) pattern

“An architectural pattern expresses a fundamental structural organization schema for software systems. It provides a set of predefined sub- systems, specifies their responsibilities, and includes rules and guidelines for organizing the relationships between them” (Buschmann+1996, page 12). Similar to _Architecture style_

{#term-architecture-style}
### Architecture style

Description of element and relation types,
together with constraints on how they can be used. Often called _architecture patterns_.
Examples: Pipes-and-Filter, Model-View-Controller, Layers.

{#architecture-view}
### Architecture view

A representation of a system from a specific perspective. Important and well-known views are:

* [Context view](#term-context-view), 
* Building block view 
* Runtime view 
* Deployment view

[Bass+2012] and [Rozanski+11] extensively discuss this concept.

{#term-artifact}
### Artifact

Tangible by-product created or generated during development
of software. Examples of artifacts are use cases, all kinds
of diagrams, UML models, requirements and design documents,
source code, test cases, class-files, archives.

{#term-association}
### Association
Defines a relationship between objects (in general: between modules).
Each association can be described in detail by cardinalities and (role-)names.
 
See [coupling](#term-coupling), [dependency](#term-dependency) and
[relationship](#term-relationship) 

{#term-atam}
### ATAM

_Architecture Tradeoff Analysis Method_. Qualitative architecture evaluation method,
based upon a (hierarchical) quality tree and concrete quality scenarios.
Basic idea: Compare fine-grained quality scenarios ("quality-requirements")
with the corresponding architectural approaches to identify risks and tradeoffs.

{#term-blackbox}
### Blackbox

View on a building block (or component) that hides the internal structure.
Blackboxes respect the ->_information hiding principle_.
They shall have clearly defined input- and output interfaces plus a precisely formulated
_responsibility_ or _objective_. Optionally a blackbox defines some quality attributes,
for example timing behavior, throughput or security aspects.

{#term-bottom-up}
### Bottom-up Approach

Direction of work f(or strategy of procesing) or modeling and design.
Starting with something detailed or concrete,
working towards something more general or abstract.

  "In a bottom-up approach the individual base elements of the
  system are first specified in great detail.
  These elements are then linked together to form larger subsystems." (quote from Wikipedia)

{#term-bounded-context}
### Bounded Context

Bounded Context is principle of the strategy design of [Domain-Driven Design](#term-DDD). A bounded context explicitly defines the context within which a [domain model](#term-domain-model) for a softwaresystem applies. Ideally, it would be preferable to have a single, unified model for all softwaresystems in the same domain. While this is a noble goal, in reality it typically fragments into multiple models. It is useful to recognize this fact of life and work with it. (quote from Wikipedia)

"Multiple domain models are in play on any large project. Yet when code based on distinct models is combined, software becomes buggy, unreliable, and difficult to understand. Communication among team members becomes confusing. It is often unclear in what context a model should not be applied. Therefore: Explicitly set boundaries in terms of team organization, usage within specific parts of the application, and physical manifestations such as code bases and database schemas. Keep the model strictly consistent within these bounds, but don’t be distracted or confused by issues outside." (quote from Wikipedia)

{#term-bridge}
### Bridge

Design pattern in which an abstraction is decoupled from its implementation,
so that the two can vary independently. In case you find that incomprehensible
(as most people) - have a look
[here](http://www.cs.sjsu.edu/~pearce/modules/patterns/platform/bridge/index.htm)

{#term-broker}
### Broker

(architecture pattern), used to structure distributed software systems with decoupled
components that interact by (usually remote) service invocations.

  A broker is responsible for coordinating communication, such as forwarding requests,
  as well as for transmitting results and exceptions.

{#term-building-block}
### Building Block

General or abstract term for all kinds of artifacts from which software is constructed.
Part of the statical structure ([Building Block View](#term-building-block-view))
of software architecture.

  Building blocks can be hierarchically structured - they may contain other (smaller)
  building blocks. \
  Examples: Component, module, package, namespace, class,
  file, program, subsystem, configuration, data-definition etc.


{#term-building-block-view}
### Building Block View

Shows the statical structure of the system,
how its source code is organized.
Usually a hierarchical manner, starting from the [context view](#term-context-view).
Complemented by one or several [runtime scenarios](#term-runtime-view).

{#term-business-architecture}
### Business Architecture
A blueprint of the enterprise that provides a common understanding 
of the organization and is used to align strategic 
objectives and tactical demands.

{#term-cardinality}
### Cardinality
Describes the quality rating of an assocation, this means, it specifies the number of objects or modules of the association.


{#term-cohesion}
### [Cohesion](https://en.wikipedia.org/wiki/Cohesion_%28computer_science%29)

The degree to which elements of a building block, component or module belong together.
It measures the strength of relationship between pieces of functionality within a given component. In cohesive systems, functionality is strongly related.
  It is usually characterized as _high cohesion_ or _low cohesion_.
  Strive for high cohesion, because high cohesion often implies reusability,
  low coupling and understandability.

{#term-command}
### Command

Design pattern in which an object is used to encapsulate
an action. This action might be invoked or executed at a later time.

{#term-complexity}
### Complexity

"Complexity is generally used to characterize something with many parts where those parts interact with each other in multiple ways."
(quoted from Wikipedia.)

  * _Essential_ complexity is the core of the problem we have to solve, and it consists of the parts of the software that are legitimately difficult problems. Most software problems contain some complexity.

  * _Accidental_ complexity is all the stuff that doesn’t necessarily relate directly to the solution, but that we have to deal with anyway.

  (quoted from [Mark Needham](http://codebetter.com/markneedham/2010/03/18/essential-and-accidental-complexity/))

  Architects shall strive to reduce accidental complexity.

{#term-component}
### Component

See [Building block](#term-building-block). Structural element of an architecture.

{#term-composition}
### Composition

Combine simpler elements (e.g. functions, data types,
  building blocks) to build more complicated, powerful or
more responsible ones.

  In UML: When the owning element is destroyed, so are the contained elements.

{#term-concept}
### Concept

Plan or principle how to solve a specific problem.

{#term-context}
### Context (of a system)

"Defines the relationships, dependencies, and interactions between the system and its environment: People, systems, and external entities with which it interacts." (quoted from [Rozanski-Woods](http://www.viewpoints-and-perspectives.info/home/viewpoints/context/))


{#term-context-view}
### Context View

Shows the complete system as one blackbox within its environment, either from
a business perspective (_business context_) or from a technical or deployment
perspective (_technical context_). The context view (or context diagram) shows
the boundary between a system  and its environment, showing the entities in
its environment (its neighbours) with which it interacts.

  See [Context](#term-context).

{#term-coupling}
### [Coupling](https://en.wikipedia.org/wiki/Coupling_%28computer_programming%29)

Coupling is the kind and degree of _interdependence_ between building blocks of
software; a measure of how closely connected two components are.\
You should always aim for _low_ coupling.
Coupling is usually contrasted with _cohesion_. Low coupling often correlates with high cohesion,
and vice versa. Low coupling is often a sign of a well-structured system.
When combined with high cohesion, it supports understandability and maintainability.

{#term-cpsa}
### CPSA
Certified Professional for Software Architecture® – the common name for different levels of certification issued by the [iSAQB](#term-iSAQB). The most common known certifications are the foundation level (CPSA-F) and the advanced level (CPSA-A).

{#term-cqrs}
### CQRS

(command query responsibility segregation): Separate the elements manipulating
(_command_) data from those just reading (_query_). This separation enables
different optimization strategies for reading and writing data (for example,
  it's much easier to cache data that's read-only than to cache data that's
  also altered.)

There's an interesting [eBook by Mark Nijhof](https://leanpub.com/cqrs)
on this subject.


{#term-crosscutting-concept}
### Crosscutting concept

See [concept](#term-concept).

Synonym: principle, rule.


{#term-crosscutting-concern}
### Crosscutting concern

Functionality of the architecture or system that affects several elements. Examples
of such concerns are logging, transactions, security, exception handling, caching etc.

See also [concept](#term-concept).


{#term-cyclomatic-complexity}
### Cyclomatic complexity

Quantitative measure, number of independent paths through a program's source code.
It roughly correlates to the number of conditional statements (`if`, `while`) in the code +1.
A linear sequence of statements without `if` or `while` has the cyclomatic complexity of 1.
Many software engineers believe that higher complexity correlates to the number of defects.

Category: Metric.

{#term-decomposition}
### Decomposition

(syn: factoring) Breaking or dividing a complex system or problem into several smaller parts
that are easier to understand, implement or maintain.

{#term-dependency}
### Dependency

See [coupling](#term-coupling).

{#term-dependency-injection}
### Dependency Injection (DI)

Instead of having your objects or a factory creating a dependency,
you pass the needed dependencies to the constructor or via property setters.
You therefore make the creation of specific dependencies _somebody else's problem_.

{#term-dependency-inversion}
### Dependency Inversion Principle

High level elements should not depend upon low level elements. One of the SOLID
principles, nicely explained by [Brett Schuchert](http://martinfowler.com/articles/dipInTheWild.html).

{#term-deployment}
### Deployment

Bring software onto its execution environment (hardware, processor etc). Put software into operation.

{#term-deployment-view}
### Deployment view

Architectural view showing the technical infrastructure where a system or artifacts will be
deployed and executed.

  "This view defines the physical environment in which the system is intended to run, including the hardware environment your system needs (e.g., processing nodes, network interconnections, and disk storage facilities), the technical environment requirements for each node (or node type) in the system, and the mapping of your software elements to the runtime environment that will execute them."
  (as defined by [Rozanski+2011](http://www.viewpoints-and-perspectives.info/home/viewpoints/deployment/))

{#term-design-pattern}
### Design pattern

General or generic reusable solution to a commonly occurring problem within a given context in design.
Initially conceived by the famous architect [Christopher Alexander](https://en.wikipedia.org/wiki/Christopher_Alexander) the concept of _design patterns_
was taken up by software engineers. In my opinion, every serious software developer should
know the pioneering [Gang-of-Four](https://en.wikipedia.org/wiki/Design_Patterns)
book by Erich Gamma and his three allies.

{#term-design-principle}
### Design principle

Set of guidelines that helps software developers to design and implement better solutions,
where "better" means the avoidance of the following three _bad characteristics_:

  * Rigidity: A system or element is difficult to change because every change potentially
   affects many other elements.
  * Fragility: When elements are changed, unexpected results, defects or otherwise negative consequences
   occur at other elements.
  * Immobility: An element is difficult to reuse because it cannot be disentagled from the rest of the system.

  These characteristics have been formulated by Robert Martin, quoted from [OODesign.com](http://www.oodesign.com/design-principles.html)

{#term-document}
### Document

A (usually written) artifact conveying information.


{#term-documentation}
### Documentation

A systematically ordered collection of documents and other material of any kind that makes usage or evaluation easier. Examples for "other material": presentation, video, audio, web page, image, etc.

{#term-documentation-build}
### Documentation Build

Automatic build process that collects artifacts into a consistent documentation.

{#term-DDD}
### Domain-Driven Design (DDD)

"Domain-driven design (DDD) is an approach to developing software for complex needs by deeply connecting the implementation to an evolving model of the core business concepts." (quoted from [DDDCommunity](http://dddcommunity.org/learning-ddd/what_is_ddd/)). See [Evans-2004](#ref-evans-2004).

See also:
    * [Entity](#term-entity)
    * [Value Object](#term-valueobject)
    * [Aggregate](#term-aggregate)
    * [Service](#term-ddd-service)
    * [Factory](#term-factory)
    * [Repository](#term-repository)
    * [Ubiquitous Language](#term-ubiquitouslang)
    * (more to come...)


{#term-domain-model}
### Domain model
The domain model is a concept of [Domain-Driven Design](#term-DDD). The domain model is a system of abstractions that describes selected aspects of a domain and can be used to solve problems related to that domain.


{#term-drawing-tool}
### Drawing Tool

A tool to create drawings that can be used in architecture documentation. Example: Visio, OmniGraffle, PowerPoint, etc. Drawing tools treat each drawing as a separate thing, this causes maintenance overhead when updating an element of the architecture that is shown in several diagrams (as opposed to a [Modeling Tool](#term-modeling-tool)).

{#term-embedded-systems}
### Embedded system

System _embedded_ within a larger mechanical or electrical system. Embedded systems often
have real-time computing constraints. Typical properties of embedded systems are low power consumption,
limited memory and processing resources, small size.

{#term-encapsulation}
### Encapsulation

Encapsulation has two slightly distinct notions, and sometimes to the combination thereof:

  * restricting access to some of the object's components
  * bundling of data with the methods or functions operating on that data

  Encapsulation is a mechanism for ->information hiding.

{#term-enterprise-it-architecture}
### Enterprise IT Architecture 
Enterprise Architecture. Structures and concepts for the it support of an entire company. Atomic subject matters of the enterprise architecture are single software systems also referred to as „applications“.

{#term-entity}
### Entity

Entity is a building block of [Domain-Driven Design](#term-DDD). An entity is a core object of a business domain with unchangeable identity and a clearly defined lifecycle. Entities map their state to [value objects](#term-valueobject) and are almost always persistent.

{#term-facade}
### Facade

Structural design pattern. A Facade offers a simplified interface to a complex
or complicated building block (the _provider_) without any modifications to the provider.

{#term-factory}
### Factory

(Design pattern) In class-based or object-oriented programming, the factory method pattern is a creational design pattern that uses factory methods or factory components for creating objects, without having to specify the exact class of the object that will be created.
In [Domain-Driven Design](#term-DDD): A factory encapsulates the creation of [aggregates](#term-aggregate), [entities](#term-entity), and [value objects](#term-valueobject). Factories work exclusively in the domain and have no access to technical building blocks (e.g. a database).


{#term-filter}
### Filter

Part of the pipe-and-filter architectural style that creates or transforms data
Filters typically execute independent from other filters.


{#term-fmc}
### [Fundamental Modeling Concepts (FMC)](http://fmc-modeling.org/)

Graphical notation for modeling and documenting software systems. From their website:
"FMC provide a framework for the comprehensive description of software-intensive systems. It is based on a precise terminology and supported by a graphical notation which can be easily understood".

{#term-gateway}
### Gateway

A (design or architecture) pattern: An element of that encapsulates
access to a (usually external) system or resource. See also ->wrapper, ->adapter.

{#term-global-analysis}
### Global analysis

Systematic approach to achieve desired quality attributes.
Developed and documented by Christine Hofmeister (Siemens Corporate Research).

{#term-heterogeneous-architectural-style}
### Heterogeneous architectural style

see _hybrid architecture style_.

{#term-heuristic}
### Heuristic

Informal rule, rule-of-thumb. Any way of problem solving not guaranteed to be optimal,
but somehow sufficient. Examples from [Object-Oriented Design](http://www.vincehuston.org/ood/oo_design_heuristics.html) or [User Interface Design](https://www.nngroup.com/articles/ten-usability-heuristics/).

{#term-hybrid-architecture-style}
### Hybrid architecture style

Combination of two or more existing architecture styles or
patterns. For example, an MVC construct embedded in a layer
structure.

{#term-ieee-1471}
### IEEE-1471

Standard _Recommended Practice for Architectural Description of Software-Intensive Systems_,
defined as ISO/IEC 42010:2007. Defines a (abstract) framework for the description of software architectures.

{#term-incremental-development}
### Incremental development

see _iterative and incremental development_.


{#term__information_hiding}
### Information Hiding

A fundamental principle in software design: Keep those design or implementation decisions
_hidden_ that are likely to change, thus protecting other parts of the system from  modification if these decisions or implementations are changed. Is one important
attributes of ->blackboxes. Separates interface from implementation.

  The term ->encapsulation is often used interchangeably with information hiding.

{#term-interface}
### Interface

Boundary across which two building blocks interact or communicate with each other.

### Interface Segregation Principle (ISP)

Building blocks (classes, components) should be forced to depend on methods they
don't use. ISP splits larger interfaces into smaller and more (client) specific
ones so that clients will only need to know about methods that they actually use.

{#term-isaqb}
### iSAQB
*i*nternational *S*oftware *A*rchitecture *Q*ualification *B*oard – an internationally active organization fostering the development of software architecture education. See also "Appendix A"

### ISO 9126 and ISO 25010

Standards to describe (and evaluate) _software product quality_.
"The quality model determines which quality characteristics will be taken into account when evaluating the properties of a software product." (quote from the [ISO website](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010))

### Iterative development

"Development approach that _cycles_ through development phases,
from gathering requirements to delivering functionality in a working release."
(quoted from [c2-wiki](http://c2.com/cgi/wiki?IterativeDevelopment)).

  Such cycles are repeated to improve either functionality, quality or both.

  Contrast to the _Waterfall development_.


### Iterative and incremental development

Combination of iterative and incremental approaches for software development.
These are essential parts of the various _agile_ development approaches,
e.g. Scrum and XP.

### Layer

Grouping of building blocks or components that (together) offer a
cohesive set of services to other layers.
Layers are related to each other by the ordered relation _allowed to use_.

### Liskov Substitution Principle

Refers to object oriented programming: If you use inheritance, do it right:
Instances of derived types (subclasses)
must be completely substitutable for their base types. If code uses a base class,
these references can be replaced with any instance of a derived class
without affecting the functionality of that code.
