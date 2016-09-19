
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
Initially conceived by the famous architect [Christopher Alexander](https://en.wikipedia.org/wiki/Christopher_Alexander),
the concept of _design patterns_
was taken up by software engineers.

In our opinion, every serious software developer should
know at least some patterns from the pioneering [Gang-of-Four](https://en.wikipedia.org/wiki/Design_Patterns)
book by Erich Gamma ([Gamma+1994](#ref-gamma-1994)) and his three allies.


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
  * [Value Object](#term-value-object)
  * [Aggregate](#term-aggregate)
  * [Service](#term-service-ddd)
  * [Factory](#term-factory)
  * [Repository](#term-repository)
  * [Ubiquitous Language](#term-ubiquitous-language)



{#term-domain-model}
### Domain model
The domain model is a concept of [Domain-Driven Design](#term-DDD). The domain model is a system of abstractions that describes selected aspects of a domain and can be used to solve problems related to that domain.


{#term-drawing-tool}
### Drawing Tool

A tool to create drawings that can be used in architecture documentation. Example: Visio, OmniGraffle, PowerPoint, etc. Drawing tools treat each drawing as a separate thing, this causes maintenance overhead when updating an element of the architecture that is shown in several diagrams (as opposed to a [Modeling Tool](#term-modeling-tool)).

{#term-economicalness}
### Economicalness

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

  Encapsulation is a mechanism for [information hiding](#term-information-hiding).


{#term-enterprise-it-architecture}
### Enterprise IT Architecture

Synonym: Enterprise Architecture.

Structures and concepts for the it support of an entire company. Atomic subject matters of the enterprise architecture are single software systems also referred to as „applications“.

{#term-entity}
### Entity
Category: 
Entity is a building block of [Domain-Driven Design](#term-DDD). An entity is a core object of a business domain with unchangeable identity and a clearly defined lifecycle. Entities map their state to [value objects](#term-value-object) and are almost always persistent.


{#term-entropy}
### Entropy

In information theory defined as "amount of information" a message has or
"unpredictability of information content". The entropy of a cryptosystem is
measured by the size of the keyspace. Larger keyspaces have an increased
entropy and if not flawed by the algorithm itself, harder to break than smaller
ones.
For secure cryptographic operations it is mandatory to not only use random
values as input, they should have also a high entropy. The creation of high
entropy on a computer system is non-trivial and can affect the performance of a
system.

See [11.1 Information Theory of Schneier-1996](#ref-schneier-1996) and Whitewood Inc. on ["Understanding and Managing Entropy"](https://www.blackhat.com/docs/us-15/materials/us-15-Potter-Understanding-And-Managing-Entropy-Usage-wp.pdf) or [SANS "Randomness and Entropy - An Introduction"](https://www.sans.org/reading-room/whitepapers/vpns/randomness-entropy-introduction-874).

Category: Security


{#term-environment}
### Environment

(System) Context determining the setting and circumstances of all influences upon a system (as defined in ISO/IEC/IEEE 42010).

Note, the environment of a system includes developmental, technological, business, operational, organizational, political, economic, legal, regulatory, ecological and social influences. 

Category: ISO-IEC-IEEE-42010

{#term-facade}
### Facade

Structural design pattern. A Facade offers a simplified interface to a complex
or complicated building block (the _provider_) without any modifications to the provider.

{#term-factory}
### Factory

(Design pattern) In class-based or object-oriented programming, the factory method pattern is a creational design pattern that uses factory methods or factory components for creating objects, without having to specify the exact class of the object that will be created.

In [Domain-Driven Design](#term-DDD): A factory encapsulates the creation of [aggregates](#term-aggregate), [entities](#term-entity), and [value objects](#term-value-object). Factories work exclusively in the domain and have no access to technical building blocks (e.g. a database).


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
access to a (usually external) system or resource.
See also [wrapper](#term-wrapper), [adapter](#term-adapter).

{#term-global-analysis}
### Global analysis

Systematic approach to achieve desired quality attributes.
Developed and documented by Christine Hofmeister (Siemens Corporate Research).
Global analysis is described in [Hofmeister+2000].

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


{#term-information-hiding}
### Information Hiding

A fundamental principle in software design: Keep those design or implementation decisions
_hidden_ that are likely to change, thus protecting other parts of the system from  modification if these decisions or implementations are changed. Is one important
attributes of [blackboxes](#term-blackbox). Separates interface from implementation.

  The term [encapsulation](#term-encapsulation) is often used interchangeably with information hiding.

{#term-integrity}
### Integrity

One of the basic [Security Goals](#term-security-goals) which means
maintaining and assuring accuracy and completeness of data. Usually this is
achived by the usage of cryptographic algorithms to create a digital signature.

Category: Security


{#term-interface}
### Interface

Boundary across which two building blocks interact or communicate with each other.

### Interface Segregation Principle (ISP)

Building blocks (classes, components) should be forced to depend on methods they
don't use. ISP splits larger interfaces into smaller and more (client) specific
ones so that clients will only need to know about methods that they actually use.

{#term-isaqb}
### iSAQB
international Software Architecture Qualification Board – an internationally active organization fostering the development of software architecture education. See also the discussion in the [appendix](#section-about-isaqb).

{#term-iso-9126}
### ISO 9126

(Deprecated) standard to describe (and evaluate) _software product quality_.
Has been superseded by [ISO 25010](#term-iso-25010), see below.


{#term-iso-25010}
### ISO 25010

Standards to describe (and evaluate) _software product quality_.
"The quality model determines which quality characteristics will be taken into account when evaluating the properties of a software product." (quote from the [ISO website](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010))

{#term-iterative-development}
### Iterative development

"Development approach that _cycles_ through development phases,
from gathering requirements to delivering functionality in a working release."
(quoted from [c2-wiki](http://c2.com/cgi/wiki?IterativeDevelopment)).

  Such cycles are repeated to improve either functionality, quality or both.

  Contrast to the _Waterfall development_.


{#term-iterative-and-incremental-development}
### Iterative and incremental development

Combination of iterative and incremental approaches for software development.
These are essential parts of the various _agile_ development approaches,
e.g. Scrum and XP.

{#term-kerckhoffs-principle}
### Kerckhoffs' Principle

One of the six cryptographic axioms described 1883 in an article "La
cryptographie militaire" by the dutch cryptographer and linguist Auguste
Kerckhoffs. This axiom is still relevant today and therefore refered to as
"Kerckhoffs' Principle".

It describes that a cryptographic method must not need to be kept secret in
order to achive the security of the encrypted messages.

"The enemy knows the system" is another expression coined by the mathematician
Claude Shannon as Shannon's Maxim.

See [Bruce Schneiers Crypto-Gram, May 15, 2002](https://www.schneier.com/crypto-gram/archives/2002/0515.html)

Category: Security


{#term-layer}
### Layer

Grouping of building blocks or components that (together) offer a
cohesive set of services to other layers.
Layers are related to each other by the ordered relation _allowed to use_.

{#term-liskov-substitution-principle}
### Liskov Substitution Principle

Refers to object oriented programming: If you use inheritance, do it right:
Instances of derived types (subclasses)
must be completely substitutable for their base types. If code uses a base class,
these references can be replaced with any instance of a derived class
without affecting the functionality of that code.
