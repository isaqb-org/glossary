﻿
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

High level (abstract) elements should not depend upon low level (specific) elements. "Details should depend upon abstractions" ([Martin-2003](#ref-martin-2003)). One of the [SOLID  principles](#term-solid-principles), nicely explained by [Brett Schuchert](http://martinfowler.com/articles/dipInTheWild.html), and closely related to the [SDP](#term-stable-dependencies-principle) and [SAP](#term-stable-abstractions-principle).

{#term-deployment}
### Deployment

Bring software onto its execution environment (hardware, processor etc). Put software into operation.

{#term-deployment-view}
### Deployment View

Architectural view showing the technical infrastructure where a system or artifacts will be
deployed and executed.

  "This view defines the physical environment in which the system is intended to run, including the hardware environment your system needs (e.g., processing nodes, network interconnections, and disk storage facilities), the technical environment requirements for each node (or node type) in the system, and the mapping of your software elements to the runtime environment that will execute them."
  (as defined by [Rozanski+2011](http://www.viewpoints-and-perspectives.info/home/viewpoints/deployment/))

{#term-design-pattern}
### Design Pattern

General or generic reusable solution to a commonly occurring problem within a given context in design.
Initially conceived by the famous architect [Christopher Alexander](https://en.wikipedia.org/wiki/Christopher_Alexander),
the concept of _design patterns_
was taken up by software engineers.

In our opinion, every serious software developer should
know at least some patterns from the pioneering [Gang-of-Four](https://en.wikipedia.org/wiki/Design_Patterns)
book by Erich Gamma ([Gamma+1994](#ref-gamma-1994)) and his three allies.


{#term-design-principle}
### Design Principle

Set of guidelines that helps software developers to design and implement better solutions,
where "better" could, for example, mean one or more of the following:

  * low [coupling](#term-coupling).
  * high [cohesion](#term-cohesion).
  * [separation of concerns](#term-separation-of-concern) or adherence to the [Single Responsibility Principle](#term-single-responsibility-principle).
  * adherence to the [Information Hiding](#term-information-hiding) principle.
  * avoid *Rigidity*: A system or element is difficult to change because every change potentially
   affects many other elements.
  * avoid *Fragility*: When elements are changed, unexpected results, defects or otherwise negative consequences
   occur at other elements.
  * avoid *Immobility*: An element is difficult to reuse because it cannot be disentagled from the rest of the system.

{#term-design-rationale}
### Design Rationale
An explicit documentation of the reasons behind decisions made when designing any architectural element. 

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
### Domain Model
The domain model is a concept of [Domain-Driven Design](#term-DDD). I provides a system of abstractions that describes selected aspects of a domain and can be used to solve problems related to that domain.


{#term-drawing-tool}
### Drawing Tool

A tool to create drawings that can be used in architecture documentation. Example: Visio, OmniGraffle, PowerPoint, etc. Drawing tools treat each drawing as a separate thing, this causes maintenance overhead when updating an element of the architecture that is shown in several diagrams (as opposed to a [Modeling Tool](#term-modeling-tool)).

{#term-economicalness}
### Economicalness

Being economical, simple, lean or achievable with relatively low effort. 


{#term-embedded-systems}
### Embedded System

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

Structures and concepts for the IT support of an entire company. Atomic subject matters of the enterprise architecture are single software systems also referred to as "applications".

{#term-entity}
### Entity
Category: DDD

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


{#term-fault-tolerance-quality-attribute}
### Fault Tolerance Quality Attribute
Degree to which a system, product or component operates as intended despite the presence of hardware or software faults.
Is a sub-characteristic of: [reliability](#term-reliability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-filter}
### Filter

Part of the pipe-and-filter architectural style that creates or transforms data.
Filters are typically executed independently from other filters.

{#term-fitness-function}
### Fitness Function
"An architectural fitness function provides an objective integrity assessment of some architectural characteristics." ([Ford+2017](#ref-ford-2017)).

A fitness function is derived from manual evaluations and automated tests and shows to which extent architectural or quality requirements are met. 

{#term-function-signature}
### Function Signature
(Synonym: type or method signature) defines input and output of functions or methods.

A signature can include:

* parameters and their types
* return value and type
* exception thrown or errors raised

{#term-functional-appropriateness-quality-attribute}
### Functional Appropriateness Quality Attribute
Degree to which the functions facilitate the accomplishment of specified tasks and objectives.
Is a sub-characteristic of: [functional suitability](#term-functional-suitability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-functional-completeness-quality-attribute}
### Functional Completeness Quality Attribute
Degree to which the set of functions covers all the specified tasks and user objectives.
Is a sub-characteristic of: [functional suitability](#term-functional-suitability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-functional-correctness-quality-attribute}
### Functional Correctness Quality Attribute
Degree to which a product or system provides the correct results with the needed degree of precision.
Is a sub-characteristic of: [functional suitability](#term-functional-suitability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-functional-suitability-quality-attribute}
### Functional Suitability Quality Attribute
Degree to which a product or system provides functions that meet stated and implied needs when used under specified conditions. 
Is composed of the following sub-characteristics: [functional completeness](#term-functional-completeness-quality-attribute), [functional correctness](#term-functional-correctness-quality-attribute), [functional appropriateness](#term-functional-appropriateness-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-fmc}
### Fundamental Modeling Concepts (FMC)

[Fundamental Modeling Concepts](http://fmc-modeling.org/) is a graphical notation for modeling and documenting software systems. From their website:
"FMC provide a framework for the comprehensive description of software-intensive systems. It is based on a precise terminology and supported by a graphical notation which can be easily understood".


{#term-gateway}
### Gateway

A (design or architecture) pattern: An element of that encapsulates
access to a (usually external) system or resource.
See also [wrapper](#term-wrapper), [adapter](#term-adapter).

{#term-global-analysis}
### Global Analysis

Systematic approach to achieve desired quality attributes.
Developed and documented by Christine Hofmeister (Siemens Corporate Research).
Global analysis is described in [Hofmeister+2000].

{#term-heterogeneous-architectural-style}
### Heterogeneous Architectural Style

see _hybrid architecture style_.

{#term-heuristic}
### Heuristic

Informal rule, rule-of-thumb. Any way of problem solving not guaranteed to be optimal,
but somehow sufficient. Examples from [Object-Oriented Design](http://www.vincehuston.org/ood/oo_design_heuristics.html) or [User Interface Design](https://www.nngroup.com/articles/ten-usability-heuristics/).

{#term-hybrid-architecture-style}
### Hybrid Architecture Style

Combination of two or more existing architecture styles or
patterns. For example, an MVC construct embedded in a layer
structure.

{#term-ieee-1471}
### IEEE-1471

Standard _Recommended Practice for Architectural Description of Software-Intensive Systems_,
defined as ISO/IEC 42010:2007. Defines a (abstract) framework for the description of software architectures.

{#term-incremental-development}
### Incremental Development

see [_iterative and incremental development_](#term-iterative-and-incremental-development).


{#term-information-hiding}
### Information Hiding

A fundamental principle in software design: Keep those design or implementation decisions
_hidden_ that are likely to change, thus protecting other parts of the system from  modification if these decisions or implementations are changed. Is one important
attributes of [blackboxes](#term-blackbox). Separates interface from implementation.

  The term [encapsulation](#term-encapsulation) is often used interchangeably with information hiding.

{#term-installability-quality-attribute}
### Installability Quality Attribute
Degree of effectiveness and efficiency with which a product or system can be successfully installed and/or uninstalled in a specified environment.
Is a sub-characteristic of: [portability](#term-portability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-integrity}
### Integrity 

Various meanings:

Category: Security

One of the basic [Security Goals](#term-security-goals) which means maintaining and assuring accuracy and completeness of data. Usually this is achieved by the usage of cryptographic algorithms to create a digital signature.

Category: Foundation

Data or behavioral integrity:

  * Degree to which clients (of a database) get identical results for identical queries (e.g. Monotonic-Read-Consistency, Montonic-Write-Consistency, Read-Your-Writes-Consistency etc.)
  * Degree, to which a system behaves coherent, replicable and reasonable.

See also [consistency](#term-consistency).

{#term-integrity-quality-attribute}
### Integrity Quality Attribute
Degree to which a system, product or component prevents unauthorized access to, or modification of, computer programs or data.
Is a sub-characteristic of: [security](#term-security-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010, Security

{#term-interface}
### Interface

Multiple meanings, depending on context:

  1. Boundary across which two building blocks interact or communicate with each other.
  2. Design construct that provides an abstraction of the behavior of concrete components, declares possible interactions with these components and constraints for these interactions.

An example for the second meaning is the programming language construct from the object-oriented language Java(tm):

{lang="java"}
~~~~~~~~
/* File name : Animal.java */
interface Animal {
   public void eat();
   public void move();
}

/* File name : Horse.java */
public class Horse implements Animal {

   public void eat() {
      System.out.println("Horse eats");
   }

   public void move() {
      System.out.println("Horse moves");
   } 
~~~~~~~~

{#term-interface-segregation-principle}
### Interface Segregation Principle (ISP)

Building blocks (classes, components) should not be forced to depend on methods they
don't use. ISP splits larger interfaces into smaller and more (client) specific
ones so that clients will only need to know about methods that they actually use.

{#term-interoperability-quality-attribute}
### Interoperability Quality Attribute
Degree to which two or more systems, products or components can exchange information and use the information that has been exchanged.
Is a sub-characteristic of: [compatibility](#term-compatibility-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

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

For a list of quality attributes defined by the ISO 25010 standard, refer to [ISO 25010](#term-iso-25010)

{#term-iterative-development}
### Iterative Development

"Development approach that _cycles_ through development phases,
from gathering requirements to delivering functionality in a working release."
(quoted from [c2-wiki](http://c2.com/cgi/wiki?IterativeDevelopment))

  Such cycles are repeated to improve either functionality, quality or both.

  Contrast to the [_Waterfall Development_](#term-waterfall-development).


{#term-iterative-and-incremental-development}
### Iterative and Incremental Development

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

{#term-latency}
### Latency
Latency is the time delay between the cause and the effect of some change in a system.

In computer networks, latency describes the time it takes for an amount of data (_packet_) to get from one specific location to another.

In interactive systems, latency is the time interval between some input to the system and the audio-visual response.
Often a delay exists, often caused by network delays.

{#term-layer}
### Layer

Grouping of building blocks or components that (together) offer a
cohesive set of services to other layers.
Layers are related to each other by the ordered relation _allowed to use_.

{#term-learnability-quality-attribute}
### Learnability Quality Attribute
Degree to which a product or system can be used by specified users to achieve specified goals of learning to use the product or system with effectiveness, efficiency, freedom from risk and satisfaction in a specified context of use.
Is a sub-characteristic of: [usability](#term-usability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-liskov-substitution-principle}
### Liskov Substitution Principle

Refers to object oriented programming: If you use inheritance, do it right:
Instances of derived types (subclasses)
must be completely substitutable for their base types. If code uses a base class,
these references can be replaced with any instance of a derived class
without affecting the functionality of that code.
