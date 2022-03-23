{#term-abstraction}
### Abstraction

The process of removing details to focus attention on aspects of greater importance. 
Similar in nature to the process of generalization.

A view of an element that focuses on the information relevant to a particular purpose, ignoring additional or other information.

A design construct as in "Building blocks should depend on abstractions rather than on implementations."

Category: Design-Principle


{#term-abstractness}
### Abstractness

Metric for the source code of object oriented systems: The number of abstract types
(interfaces and abstract classes) divided by the total number of types.

Category: Metric


{#term-accessibility-quality-attribute}
### Accessibility Quality Attribute
Degree to which a product or system can be used by people with the widest range of characteristics and capabilities to achieve a specified goal in a specified context of use.
Is a sub-characteristic of: [usability](#term-usability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-accountability-quality-attribute}
### Accountability Quality Attribute
Degree to which the actions of an entity can be traced uniquely to the entity.
Is a sub-characteristic of: [security](#term-security-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-accreditation}
### Accreditation
Determination procedure and certification by an authorised accreditation body (here the iSAQB(R)) confirming that the applicant meets the organizational, technical and qualitative requirements as a [training provider](#term-training-provider).


{#term-accreditation-body}
### Accreditation Body
The application for [accreditation](#term-accreditation) must be submitted through the *accreditation body* designated by the iSAQB. The accreditation body is the contact point for all questions of the training provider during the [accreditation](#term-accreditation). 
It coordinates the accreditation procedure, carries out the formal assessment of the documents submitted and organises the technical assessment in the [AUDIT WORKING GROUP](#term-audit-working-group).


{#term-accredited-training-provider}
### Accredited Training Provider
[Training Provider](#term-training-provider) with valid [accreditation](#term-accreditation) issued by the iSAQB(R).

{#term-acl}
### ACL
Access Control Lists are a way to organize and store permissions of
a [principal](#term-principal) for a specific entity. Beside implementations
on an application level a typical example for an ACL is the management of file
permissions on unix based operating systems.

Since ACLs don't scale well on a large base it is common to model access
control based on roles ([RBAC](#term-rbac)).

Category: Security

{#term-acyclic-dependencies-principle}
### Acyclic Dependencies Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that there be no cycles in the dependence graph of a system, which is also a [necessity](https://en.wikipedia.org/wiki/Directed_acyclic_graph) for [*hierarchical* decomposition](https://en.wikipedia.org/wiki/Functional_decomposition).

Avoiding dependence cycles is essential for [low coupling](#term-coupling) and [maintainability](#term-maintainability-quality-attribute), as *all* components in a dependence cycle effectively (even if indirectly) depend on each other, which makes it hard to understand, change or replace any part of the cycle in isolation (also see [Lilienthal-2019](#ref-lilienthal-2019)).

Although Robert C. Martin ([Martin-2003](#ref-martin-2003)) expressed it in terms of large components of object-oriented software, the ADP is a *universal* principle. It goes back (at least) to one of the origins of software architecture, the classic 1972 paper "On the Criteria To Be Used in Decomposing Systems into Modules" ([Parnas-1972](#ref-parnas-1972)), which *concludes* that hierarchical structure along with "clean" decomposition are desirable properties of any system.

It can be argued that a dependence cycle, even before considering its various practical problems, is logically already as flawed as a [circular argument](https://en.wikipedia.org/wiki/Circular_reasoning) or [circular definition](https://en.wikipedia.org/wiki/Fallacies_of_definition#Circularity). As a structural contradiction, a cycle can neither be an *appropriate* nor meaningful model of the inherent nature and purpose of a system. And this conceptual divergence alone virtually guarantees for (unpredictable) problems to arise, which is exactly what a [*principled*](#term-design-principle) approach guards against.

Category: Design-Principle

{#term-adaptability-quality-attribute}
### Adaptability Quality Attribute
Degree to which a product or system can effectively and efficiently be adapted for different or evolving hardware, software or other operational or usage environments.
Is a sub-characteristic of: [portability](#term-portability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-adapter}
### Adapter

The adapter is a design pattern that allows the interface of an existing component to be used from another interface. It is often used to make existing components cooperate with others without modifying their source code.

Category: Design-Pattern, Foundation.

{#term-aggregate}
### Aggregate

Aggregate is a building block of [Domain-Driven Design](#term-DDD). Aggregates are complex object structures that are made of [entities](#term-entity) and [value objects](#term-value-object). Each aggregate has a root entity and is regarded as one unit when it comes to changes. An aggregate ensure consistency and integrity of its contained entities with invariants.

Category: DDD

{#term-aggregation}
### Aggregation

A form of object [composition](#term-composition) in object-oriented programming.
It differs from composition, as aggregation does not imply ownership.
When the element is destroyed, the contained elements
remain intact.

Category: Foundation


{#term-analysability-quality-attribute}
### Analysability Quality Attribute
Degree of effectiveness and efficiency with which it is possible to assess the impact on a product or system of an intended change to one or more of its parts, or to diagnose a product for deficiencies or causes of failures, or to identify parts to be modified.
Is a sub-characteristic of: [maintainability](#term-maintainability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-appropriateness}
### Appropriateness

(syn: adequacy) Suitability for a particular purpose.


{#term-appropriateness-recognizability-quality-attribute}
### Appropriateness Recognizability Quality Attribute
Degree to which users can recognize whether a product or system is appropriate for their needs.
Is a sub-characteristic of: [usability](#term-usability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-arc42}
### arc42

Free template  for communication and documentation of software architectures.
arc42 consists of 12 (optional) parts or sections.
See <https://arc42.org> for details.

Category: Communication, Documentation


### Architecture

See [Software Architecture](#term-software-architecture)

Category: ISO-IEC-IEEE-42010


{#term-architecture-pattern}
### Architectural (Architecture) Pattern

“An architectural pattern expresses a fundamental structural organization schema for software systems. It provides a set of predefined sub-systems, specifies their responsibilities, and includes rules and guidelines for organizing the relationships between them” (Buschmann+1996, page 12). Similar to [architecture style](#term-architecture-style).

Examples include:

* Layers
* Pipes-and-Filter
* Microservices
* [CQRS](#term-cqrs)


{#term-architectural-decision}
### Architectural Decision
Decision, which has an sustainable or essential effect on the architecture.

Example: Decision about database technology or technical basics of the user interface.

Following ISO/IEC/IEEE 42010 an architectural decision pertain to system concerns. However, there is often no simple mapping between the two. A decision can affect the architecture in several ways. These can be reflected in the architecture description (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-architectural-tactic}
### Architectural Tactic
A technique, strategy, approach or decision helping to achieve one or several quality requirements.
The term was coined by [Bass+2012](#ref-bass-2012).

Category: Foundation


{#term-architecture-description}
### Architecture Description

Work product used to express an architecture (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-architecture-description-element}
### Architecture Description Element

An architecture description element is any construct in an architecture description. architecture description elements are the most primitive constructs discussed in ISO/IEC/IEEE 42010. All terms defined in ISO/IEC/IEEE 42010 are a specialization of the concept of an architecture description element (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-architecture-description-language}
### Architecture Description Language

An architecture description language (ADL) is any form of expression for use in architecture descriptions (as defined in ISO/IEC/IEEE 42010).

Examples are Rapide, Wright, SysML, ArchiMate and the viewpoint languages of RM-ODP [ISO 10746].

Category: ISO-IEC-IEEE-42010


{#term-architecture-evaluation}
### Architecture Evaluation

Quantitative or qualitative assessment of a (software or system) architecture.
Determine if an architecture can achieve its target qualities or
quality attributes

See [Assessment](#term-assessment)

D> ###### Comment (Gernot Starke)
D> In my opinion the terms _architecture analysis_ or _architecture assessment_ are more appropriate, as _evaluation_ contains _value_, implying numerical assessment or metrics, which is usually only _part_ of what you should do in architecture analysis.
D>

{#term-architecture-framework}
### Architecture Framework

Conventions, principles and practices for the description of architectures established within a specific domain of application and/or community of stakeholders (as defined in ISO/IEC/IEEE 42010).

Examples are:

* Generalised Enterprise Reference Architecture and Methodologies (GERAM) [ISO 15704] is an architecture framework.

* Reference Model of Open Distributed Processing (RM-ODP) [ISO/IEC 10746] is an architecture framework.


Category: ISO-IEC-IEEE-42010



{#term-architecture-goal}
### Architecture Goal

(syn: Architectural quality goal, Architectural quality requirement): A quality attribute that the system needs to achieve and the quality attribute is understood to be an architectural issue.

Hence, the architecture needs to be designed in a way to fulfill this architectural goal. These goals often have _long term character_ in contrast to (short term) project goals.

Category: Foundation


{#term-architecture-model}
### Architecture Model

An architecture view is composed of one or more architecture models. An architecture model uses modelling conventions appropriate to the concerns to be addressed. These conventions are specified by the model kind governing that model. Within an architecture description, an architecture model can be a part of more than one architecture view (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-architecture-objective}
### Architecture Objective

See [architecture goal](#term-architecture-goal).

{#term-architecture-quality-requirement}
### Architecture Quality Requirement

See [architecture goal](#term-architecture-goal).


{#term-architecture-rational}
### Architecture Rationale

Architecture rationale records explanation, justification or reasoning about architecture decisions that have been made. The rationale for a decision can include the basis for a decision, alternatives and trade-offs considered, potential consequences of the decision and citations to sources of additional information (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-architecture-style}
### Architecture Style

Description of element and relation types, together with constraints on how they can be used.
Often called [architecture pattern](#term-architecture-pattern).
Examples: Pipes-and-Filter, Model-View-Controller, Layers.

D> ###### Comment (Alexander Lorz)
D> Depending on who you ask, some might consider architecture styles a generalization of architecture patterns.
D> That is, "distributed system" is a style while "client-server, CQRS, broker and peer-to-peer" are more specific patterns that belong to this style.
D> However, from a practical point of view this distinction is not essential.


{#term-architecture-view}
### Architecture View

A representation of a system from a specific perspective. Important and well-known views are:

* [Context view](#term-context-view),
* Building block view
* Runtime view
* Deployment view

[Bass+2012] and [Rozanski+11] extensively discuss this concept.

Following ISO/IEC/IEEE 42010, an architecture view is a work product expressing the architecture of a system from the perspective of specific system concerns (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-architecture-viewpoint}
### Architecture Viewpoint

Work product establishing the conventions for the construction, interpretation and use of architecture views to frame specific system concerns (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-artifact}
### Artifact

Tangible by-product created or generated during development
of software. Examples of artifacts are use cases, all kinds
of diagrams, UML models, requirements and design documents,
source code, test cases, class-files, archives.

{#term-assessment}
### Assessment

See also [Evaluation](#term-architecture-evaluation).

Gathering information about status, risks or vulnerabilities of a system.
Assessment might concerning potentially all aspects
(development, organization, architecture, code etc.)


{#term-asset}
### Asset

"In information security, computer security and network security an Asset is any
data, device, or other component of the environment that supports
information-related activities. Assets generally include hardware (e.g. servers
and switches), software (e.g. mission critical applications and support
systems) and confidential information"

(quoted from [Wikipedia](https://en.wikipedia.org/w/index.php?title=Asset_(computer_security)&oldid=694606042))

Category: Security


{#term-association}
### Association
Defines a relationship between objects (in general: between components).
Each association can be described in detail by cardinalities and (role-)names.

See [coupling](#term-coupling), [dependency](#term-dependency) and
[relationship](#term-relationship)

Category: Foundation


{#term-asymmetric-cryptography}
### Asymmetric Cryptography

Asymmetric cryptography algorithms are designed that the key which is used for
encryption is different from the key used for decryption. The key for
encryption is called "public-key" the key for decryption is called
"private-key". The public key can be published and used by anyone to encrypt
information only readable by the party owning the private-key for decryption.
See [Schneier, Public-Key Algorithms, page 17](#ref-schneier-1996).

Asymmetric cryptography is fundamental for [PKI](#term-pki) and digital
signatures.

Category: Security


{#term-atam}
### ATAM

_Architecture Tradeoff Analysis Method_. Qualitative architecture evaluation method,
based upon a (hierarchical) quality tree and concrete quality scenarios.
Basic idea: Compare fine-grained quality scenarios ("quality-requirements")
with the corresponding architectural approaches to identify risks and trade-offs.


{#term-attack-tree}
### Attack Tree

Formal way to describe different approaches of an attacker to reach certain
goals. The tree is usally structured with the attack goal on top and different
approaches as child nodes. Each approach is likely to have dependencies which
are again listed as child nodes.
The possibiliy of a certain way to attack an IT-system can be analyzed by
assigning additional attributes to each node. Examples could be the estimated
costs of an attack or if an attack approach is possible or not by referencing
countermeasures.

See [Bruce Schneier on "Modeling security threats"](https://www.schneier.com/academic/archives/1999/12/attack_trees.html).

Category: Security

{#term-audit-working-group}
### Audit Working Group: 
The *audit working group* is responsible for the technical evaluation of training materials as well as for the monitoring and evaluation of training courses. 
The members of the audit working group, authorized by the iSAQB(R), are independent of the [training provider](#term-training-provider). 
The result of the assessments (the respective accreditation recommendation of the AUDIT WORKING GROUP) will be communicated to the [training provider](#term-training-provider) by the [accreditation body](#term-accreditation-body).
 

{#term-authentication}
### Authentication

Authentication is the process of confirming the claim of an identity by a given
entity. Usually this is done by verifying at least one of the authentication
factors which is known by the system:

 * knowledge (e.g. password)
 * ownership (e.g. security token)
 * inherence (e.g. biometrics)

For a stronger authentication multiple factors can be requested or at least
factors of two categories.

Category: Security


{#term-authenticity-quality-attribute}
### Authenticity Quality Attribute
Degree to which the identity of a subject or resource can be proved to be the one claimed.
Is a sub-characteristic of: [security](#term-security-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-authorization}
### Authorization

"Authorization or authorisation is the function of specifying access rights to
resources related to information security and computer security in general and
to access control in particular. More formally, "to authorize" is to define an
access policy."

(quoted from [Wikipedia](https://en.wikipedia.org/w/index.php?title=Authorization&oldid=739777234))

Category: Security


{#term-availability}
### Availability

One of the basic [Security Goals](#term-security-goals) describing a system
that can provide desired information when its needed. From a security
perspective for example denial-of-service-attacks may prevent availability.

Category: Security


{#term-availability-quality-attribute}
### Availability Quality Attribute
Degree to which a system, product or component is operational and accessible when required for use.
Is a sub-characteristic of: [reliability](#term-reliability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010, Security

{#term-blackbox}
### Black Box

View on a [building block](#term-building-block) (or [component](#term-component)) that hides the internal structure.
Blackboxes respect the [_information hiding principle_](#term-information-hiding).
They shall have clearly defined input- and output interfaces plus a precisely formulated
_responsibility_ or _objective_. Optionally a blackbox defines some quality attributes,
for example timing behavior, throughput or security aspects.

Category: Foundation

{#term-bottom-up}
### Bottom-Up Approach

Direction of work (or strategy of processing) for modeling and design.
Starting with something detailed or concrete,
working towards something more general or abstract.

  "In a bottom-up approach the individual base elements of the
  system are first specified in great detail.
  These elements are then linked together to form larger subsystems." (quote from [Wikipedia](https://en.wikipedia.org/wiki/Top-down_and_bottom-up_design))


{#term-bounded-context}
### Bounded Context

Bounded Context is principle of the strategy design of [Domain-Driven Design](#term-DDD). "A bounded context explicitly defines the context within which a [domain model](#term-domain-model) for a software system applies. Ideally, it would be preferable to have a single, unified model for all software systems in the same domain. While this is a noble goal, in reality it typically fragments into multiple models. It is useful to recognize this fact of life and work with it." (quote from Wikipedia)

"Multiple domain models are in play on any large project. Yet when code based on distinct models is combined, software becomes buggy, unreliable, and difficult to understand. Communication among team members becomes confusing. It is often unclear in what context a model should not be applied. Therefore: Explicitly set boundaries in terms of team organization, usage within specific parts of the application, and physical manifestations such as code bases and database schemas. Keep the model strictly consistent within these bounds, but don’t be distracted or confused by issues outside." (quote from Wikipedia)

Category: DDD

{#term-bridge}
### Bridge

Design pattern in which an abstraction is decoupled from its implementation,
so that the two can vary independently. In case you find that incomprehensible
(as most people) - have a look
[here](http://www.cs.sjsu.edu/~pearce/modules/patterns/platform/bridge/index.htm)

Category: Design-Pattern

{#term-broker}
### Broker

An architecture pattern used to structure distributed software systems with decoupled
components that interact by (usually remote) service invocations.

  A broker is responsible for coordinating communication, such as forwarding requests,
  as well as for transmitting results and exceptions.

Category: Architecture-Pattern

{#term-building-block}
### Building Block

General or abstract term for all kinds of artifacts from which software is constructed.
Part of the statical structure ([Building Block View](#term-building-block-view))
of software architecture.

  Building blocks can be hierarchically structured - they may contain other (smaller)
  building blocks.

  Some examples of alternative (concrete) names for building blocks:
  Component, module, package, namespace, class,
  file, program, subsystem, function, configuration, data-definition.


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

{#term-c4-model}
### C4 Model
The [C4 Model for Software Architecture Documentation](https://c4model.com/)
was developed by Simon Brown.
It consists of a hierarchical set of software architecture diagrams for context, containers, components, and code.
The hierarchy of the C4 diagrams provides different levels of abstraction, each of which is relevant to a different audience.


{#term-ca}
### CA

A **C**ertificate **Authority** issues digital certificates to a given subject
in a [PKI](#term-pki). Usually there is a trust established to this authority
which results in the same trust level to the issued certificates.

An example is the widely used TLS-PKI where every browser includes the
root-certificates of a defined list of CAs. These CAs then check the identity
of a given internet domain owner and digitally sign his certificate for the use
with [TLS](#term-tls).

Category: Security


{#term-capacity-quality-attribute}
### Capacity Quality Attribute
Degree to which the maximum limits of a product or system parameter meet requirements.
Is a sub-characteristic of: [performance efficiency](#term-performance-efficiency-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-cardinality}
### Cardinality
Describes the quantitative rating of an association or relationship.
It specifies the number of participants (objects, instances, modules etc)
of the association.

{#term-certification-program}
### Certification Program 
The iSAQB(R) CPSA(R) certification program, including its organizational components, documents (training documents, contracts) and processes.

The copyrighted abbreviation and term CPSA(R) means *Certified Professional for Software Architecture*.

{#term-cia-triad}
### CIA Triad

See [Security Goals](#term-security-goals)

Category: Security


{#term-cloud}
### Cloud
"Cloud computing is a model for enabling ubiquitous, convenient, on-demand network
access to a shared pool of configurable computing resources (e.g., networks, servers,
storage, applications, and services) that can be rapidly provisioned and released
with minimal management effort or service provider interaction."

Definition quoted from [NIST](http://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-145.pdf)
(National Institute of Standards and Technology).

The NIST definition contains the following five characteristics (quoted but abbreviated
  from the aforementioned NIST source too):

* On-demand self service: A  consumer can unilaterally provision computing  
capabilities, such as server  time  and  network  storage,  
without  requiring  human interaction with each service provider.  
* Broad network access: Capabilities are available over the network and
accessed through standard mechanisms  that  promote  use  by  heterogeneous
client  platforms.
* Resource pooling: The  provider’s  computing  resources  are  pooled  to  serve  
multiple consumers using  a  multi-tenant  model,  with  different  physical  and  
virtual resources dynamically assigned and reassigned according to consumer demand.
There is location independence in that the customer generally has no control or
knowledge over the exact location of the provided resources but may be able to
specify location at a higher level of abstraction  (e.g.,  country,  state,  or  datacenter).  
Examples of resources include storage, processing, memory, and network bandwidth.
* Rapid elasticity: Capabilities can be elastically provisioned and released,
in some cases automatically, to scale rapidly commensurate with demand.
To the consumer, the capabilities available for provisioning often appear
to be unlimited and can be appropriated in any quantity at any time.
* Measured service: Cloud systems automatically control and optimize resource
use by leveraging a metering capability at some level of abstraction
appropriate to the type of service (e.g., storage, processing, bandwidth,
and active user accounts). Resource usage can be monitored, controlled, and
reported, providing transparency for both the provider and consumer of the
utilized service.


{#term-co-existence-quality-attribute}
### Co-Existence Quality Attribute
Degree to which a product can perform its required functions efficiently while sharing a common environment and resources with other products, without detrimental impact on any other product.
Is a sub-characteristic of: [compatibility](#term-compatibility-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-cohesion}
### Cohesion

The degree to which elements of a building block, component or module belong together is called [cohesion](https://en.wikipedia.org/wiki/Cohesion_%28computer_science%29).
It measures the strength of relationship between pieces of functionality within a given component. In cohesive systems, functionality is strongly related.
  It is usually characterized as _high cohesion_ or _low cohesion_.
  Strive for high cohesion, because high cohesion often implies reusability,
  low coupling and understandability.

{#term-command}
### Command

Design pattern in which an object is used to encapsulate
an action. This action might be invoked or executed at a later time.

{#term-common-closure-principle}
### Common Closure Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It directly and explicitly restates the [Single Responsibility Principle](#term-single-responsibility-principle) for larger components. 

The subcomponents of a component should ideally have the exact same reasons to change. A change request that effects one of them should effect all of them, but it should *not* effect anything else outside their enclosing component.

Thereby, each expected change request would effect a minimal number of components. Or put another way: Each component would be [closed](#term-open-close-principle) to a maximum number of expected change requests. The term *expected* here signifies a few important implications:

1. The inherent concepts/responsibilities of a system run deeper than a surface-level description of its behaviour. 
2. The deeper concepts/responsibilities of a system are not entirely objective but can be modeled in different ways.
3. Determining the concepts/responsibilities of a system is not just passive describing but also active *strategizing*.

This principle leads to [highly cohesive](#term-cohesion) components. It also implies [loosely coupled](#term-coupling) components because related concepts that *do* change together *do* get bundled up in the same component. When each single concept is expressed by a single component, there are no unnecessary couplings between components.

Category: Design-Principle

{#term-common-reuse-principle}
### Common Reuse Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). The subcomponents (classes) of a component should be exactly the ones that are being (re)used together. Or the other way around: Components that are being (re)used together should be packaged into a larger component. This also implies that subcomponents that are *not* frequently used in conjunction with the other subcomponents should *not* be in the respective component.

This perspective helps in deciding what belongs into a component and what doesn't. It aims at a system decomposition of [loosely coupled](#term-coupling) and [highly cohesive](#term-cohesion) components.

This obviously echoes the [Single Responsibility Principle](#term-single-responsibility-principle). It also echoes the [Interface Segregation Principle](#term-interface-segregation-principle), as it ensures that clients aren't forced to depend on concepts they don't care about.

Category: Design-Principle

{#term-compatibility-quality-attribute}
### Compatibility Quality Attribute
Degree to which a product, system or component can exchange information with other products, systems or components, and/or perform its required functions, while sharing the same hardware or software environment.
Is composed of the following sub-characteristics: [co-existence](#term-co-existence-quality-attribute), [interoperabilty](#term-interoperability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

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

Plan, principle(s) or rule(s) how to solve a specific problem.

Concepts are often _cross-cutting_ in a sense that multiple architectural
elements might be affected by a single concept. That means that implementors
of e.g. implementation units (building blocks) should adhere to the corresponding
concept.

Concepts form the basis for _conceptual integrity_.


{#term-conceptual-integrity}
### Conceptual Integrity
Concepts, rules, patterns and similar solution approaches are applied in a consistent (homogeneous, similar) way throughout the system.
Similar problems are solved in similar or identical ways.

{#term-concern}
### Concern

"A _concern_ about an architecture is a requirement, an objective, a constraint, an intention, or an aspiration a stakeholder has for that architecture." (quoted from [Rozanski+11], chapter 8)

Following ISO/IEC/IEEE 42010 a concern is defined as (system) interest in a system relevant to one or more of its stakeholders (as defined in ISO/IEC/IEEE 42010).

Note, a concern pertains to any influence on a system in its environment, including developmental, technological, business, operational, organizational, political, economic, legal, regulatory, ecological and social influences.

Category: ISO-IEC-IEEE-42010


{#term-confidentiality}
### Confidentiality

One of the basic [Security Goals](#term-security-goals) describing a system to
disclose and make information only available to authorized parties.

Category: Security


{#term-confidentiality-quality-attribute}
### Confidentiality Quality Attribute
Degree to which a product or system ensures that data are accessible only to those authorized to have access.
Is a sub-characteristic of: [security](#term-security-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-consistency}
### Consistency

A consistent systems does not contain contradictions.

* Identical problems are solved with identical (or at least similar) approaches.
* Degree, to which data and their relations comply to validation rules.
* Clients (of a database) get identical results for identical queries
(e.g. Monotonic-Read-Consistency, Montonic-Write-Consistency, Read-Your-Writes-Consistency etc.)
* With respect to behavior: Degree, to which a system behaves coherent, replicable and reasonable.


{#term-constraint}
### Constraint
A restriction on the degree of freedom you have in creating, designing, implementing or otherwise providing a solution. Constraints are often _global requirements_, such as limited development resources or a decision by senior management that restricts the way you plan, design, develop or operate a system.

Based upon a [definition from Scott Ambler](http://agilemodeling.com/artifacts/constraint.htm)


{#term-context}
### Context (of a System)

"Defines the relationships, dependencies, and interactions between the system and its environment: People, systems, and external entities with which it interacts." (quoted from [Rozanski-Woods](https://www.viewpoints-and-perspectives.info/home/viewpoints/context/))

Another definition from arc42:
"System scope and context - as the name suggests - delimits your system (i.e. your scope) from all its communication partners (neighboring systems and users, i.e. the context of your system). It thereby specifies the external interfaces." (quoted from [docs.arc42.org](https://docs.arc42.org))

Distinguish between _business_ and _technical_ context:

* The **business** context (formerly called _logical_ context) shows the external relationships from a business- or non-technical perspective. 
It abstracts from technical, hardware or implementation details.
Input-/Output relationships are named by their _business meaning_ instead of their technical properties.

* The **technical** context shows technical details, like transmission channel, technical protocoll, IP-address, bus or similar hardware details. 
Embedded systems, for example, often care for hardware-related information very early in development. 


{#term-context-view}
### Context View

Shows the complete system as one [blackbox](#term-blackbox) within its environment, either from a business perspective (_business context_) or from a technical or deployment perspective (_technical context_). 
The context view (or context diagram) shows the boundary between a system  and its environment, showing the entities in its environment (its neighbors) with which it interacts.

Neighbors can either be other software, hardware (like sensors), humans, user-roles or even organizations using the system.

See [Context](#term-context).


{#term-correspondence}
### Correspondence

A correspondence defines a relation between architectural description elements. Correspondences are used to express architecture relations of interest within an architecture description (or between architecture descriptions) (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-correspondence-rule}
### Correspondence Rule

Correspondences can be governed by correspondence rules. Correspondence rules are used to enforce relations within an architecture description (or between architecture descriptions) (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


Synonym: [Integrity](#term-integrity), homogeneity, conceptual integrity.

{#term-coupling}
### Coupling

[Coupling](https://en.wikipedia.org/wiki/Coupling_%28computer_programming%29) is the kind and degree of _interdependence_ between building blocks of
software; a measure of how closely connected two components are.
You should always aim for _low_ coupling.
Coupling is usually contrasted with [_cohesion_](#term-cohesion). Low coupling often correlates with high cohesion,
and vice versa. Low coupling is often a sign of a well-structured system.
When combined with high cohesion, it supports understandability and maintainability.

{#term-cpsa}
### CPSA(R)
Certified Professional for Software Architecture(R) – the common name for different levels of certification issued by the [iSAQB](#term-isaqb). The most common known certifications are the foundation level (CPSA-F) and the advanced level (CPSA-A).

{#term-cqrs}
### CQRS

(command query responsibility segregation): Separate the elements manipulating
(_command_) data from those just reading (_query_). This separation enables
different optimization strategies for reading and writing data (for example,
  it's much easier to cache data that's read-only than to cache data that's
  also altered.)

There's an interesting [eBook by Mark Nijhof](https://leanpub.com/cqrs)
on this subject.


{#term-cross-cutting-concept}
### Cross-Cutting Concept

See [concept](#term-concept).

Synonym: principle, rule.


{#term-cross-cutting-concern}
### Cross-Cutting Concern

Functionality of the architecture or system that affects several elements.
Examples of such concerns are logging, transactions, security, exception handling, caching etc.

Often these concerns will be addressed in systems via [concepts](#term-concept).


{#term-curriculum}
### Curriculum

The learning process provided by a school (here: iSAQB as the institution governing software architecture education). It includes the content of courses (the syllabus), the methods employed, and other aspects, like norms and values, which relate to the way the education including certification and examination is organized.


{#term-cyclomatic-complexity}
### Cyclomatic Complexity

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

{#term-domain-model}
### Domain Model
The domain model is a concept of [Domain-Driven Design](#term-DDD). I provides a system of abstractions that describes selected aspects of a domain and can be used to solve problems related to that domain.


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

{#term-iso-25010}
### ISO 25010

Standards to describe (and evaluate) _software product quality_.
"The quality model determines which quality characteristics will be taken into account when evaluating the properties of a software product." (quote from the [ISO website](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010))

For a list of quality attributes defined by the ISO 25010 standard, refer to [ISO 25010](#term-iso-25010)

{#term-iso-9126}
### ISO 9126

(Deprecated) standard to describe (and evaluate) _software product quality_.
Has been superseded by [ISO 25010](#term-iso-25010), see below.


{#term-iterative-and-incremental-development}
### Iterative and Incremental Development

Combination of iterative and incremental approaches for software development.
These are essential parts of the various _agile_ development approaches,
e.g. Scrum and XP.

{#term-iterative-development}
### Iterative Development

"Development approach that _cycles_ through development phases,
from gathering requirements to delivering functionality in a working release."
(quoted from [c2-wiki](http://c2.com/cgi/wiki?IterativeDevelopment))

  Such cycles are repeated to improve either functionality, quality or both.

  Contrast to the [_Waterfall Development_](#term-waterfall-development).


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
{#term-maintainability-quality-attribute}
### Maintainability Quality Attribute
Degree of effectiveness and efficiency with which a product or system can be modified to improve it, correct it or adapt it to changes in environment, and in requirements.
Is composed of the following sub-characteristics: [modularity](#term-modularity-quality-attribute), [reusability](#term-reusability-quality-attribute), [analysability](#term-analysability-quality-attribute), [modifiability](#term-modifiability-quality-attribute), [testability](#term-testability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-maturity-quality-attribute}
### Maturity Quality Attribute
Degree to which a system, product or component meets needs for reliability under normal operation.
Is a sub-characteristic of: [reliability](#term-reliability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-MFA}
### MFA

For Multi-Factor-Authentication see [Authentication](#term-authentication).

Category: Security


{#term-microservice}
### Microservice

An architectural style, proposing to divide large systems into small units.
"Microservices have to be implemented as virtual machines, as more light-weight alternatives such as Docker containers or as individual processes. Thereby they can easily be brought into production individually." (quoted from the (free) [LeanPub booklet on Microservices](https://leanpub.com/microservices-primer) by [Eberhard Wolff](http://microservices-book.com))

{#term-model-driven-architecture}
### Model Driven Architecture (MDA)

[Model Driven Architecture (MDA)](http://www.omg.org/mda/) is an OMG-Standard for model based software development.
Definition: "An approach to IT system specification that separates the specification of functionality from the specification of the implementation of that functionality on a specific technology platform."

{#term-model-kind}
### Model Kind

Conventions for a type of modeling (as defined in ISO/IEC/IEEE 42010).

Note, examples of model kinds include data flow diagrams, class diagrams, Petri nets, balance sheets, organization charts and state transition models.

Category: ISO-IEC-IEEE-42010

{#term-model-driven-software-development}
### Model-Driven Software Development (MDSD)

The underlying idea is to generate code from more abstract models of requirements or the domain.

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


{#term-modeling-tool}
### Modeling Tool

A tool that creates models (e.g. UML or BPMN models). Can be used to create consistent diagrams for documentation because it has the advantage that each model element exists only once but can be consistently displayed in many diagrams (as opposed to a mere [Drawing Tool](#term-drawing-tool)).

{#term-modifiability-quality-attribute}
### Modifiability Quality Attribute
Degree to which a product or system can be effectively and efficiently modified without introducing defects or degrading existing product quality.
Is a sub-characteristic of: [maintainability](#term-maintainability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-modular-programming}
### Modular Programming

"Software design technique that separates the functionality of a program into independent,
interchangeable _modules_, so that each module contains everything necessary to execute
only one aspect of the desired functionality.

  Modules have _interfaces_ expressing the elements provided and required by the module.
  The elements defined in the interface are detectable by other modules."
   (quoted from [Wikipedia](https://en.wikipedia.org/wiki/Modular_programming))


{#term-modularity-quality-attribute}
### Modularity Quality Attribute
Degree to which a system or computer program is composed of discrete components such that a change to one component has minimal impact on other components.
Is a sub-characteristic of: [maintainability](#term-maintainability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-module}
### Module

(see also [Modular programming](#term-modular-programming))

  1. structural element or building block, usually regarded as a _black box_ with
  a clearly defined responsibility. It encapsulates data and code and
  provides public interfaces, so clients can access its functionality.
  This meaning has first been
  described in a groundbreaking and fundamental paper from David L. Parnas:
  [On the Criteria to be Used in Decomposing Software into Modules](http://www.cs.umd.edu/class/spring2003/cmsc838p/Design/criteria.pdf)
  2. In several programming languages, _module_ is a construct for aggregating
  smaller programming units, e.g. in Python. In other languages (like Java),
  modules are called _packages_.

  3. The CPSA(R)-Advanced Level is currently divided into several modules, which can be learned or taught separately and in any order. The exact relationships between these modules and the contents of these modules are defined in the respective curricula.

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


{#term-non-repudiation-quality-attribute}
### Non-repudiation Quality Attribute
Degree to which actions or events can be proven to have taken place, so that the events or actions cannot be repudiated later.
Is a sub-characteristic of: [security](#term-security-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-notation}
### Notation

A system of marks, signs, figures, or characters that is used to represent information. Examples: prose, table, bullet point list, numbered list, UML, BPMN.


{#term-observer}
### Observer

(Design pattern) "...  in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods." (quoted from [Wikipedia](https://en.wikipedia.org/wiki/Observer_pattern))
The Observer pattern is a key pattern to complement the [model–view–controller (MVC)](#term-model-view-controller) architectural pattern.


{#term-open-close-principle}
### Open-Close-Principle (OCP)

"Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification" (Bertrand Meyer, 1998).
In plain words:
To _add_ functionality (extension) to a system, you should _not need to modify_ existing code.
Part of Robin Martins "SOLID" principles for object-oriented systems.
Can be implemented in object oriented languages by interface inheritance, in a more general way as _plugins_.


{#term-operability-quality-attribute}
### Operability Quality Attribute
Degree to which a product or system has attributes that make it easy to operate and control.
Is a sub-characteristic of: [usability](#term-usability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-owasp}
### OWASP

The **Open Web Application Security Project** is a worldwide
non-profit online organization founded 2001 for improving the security of
software. It is a rich source for information and best practices in the field
of web security. See [https://www.owasp.org/](https://www.owasp.org/).

The OWASP-Top-10 is a frequently referenced list of attack categories based on
the projects data survey.

Category: Security

{#term-package-principles}
### Package Principles

Fundamental principles for designing the structure of software systems ([Martin-2003](#ref-martin-2003)):

* [Reuse/Release Equivalence Principle (REP)](#term-reuse-release-equivalence-principle)
* [Common Reuse Principle (CRP)](#term-common-reuse-principle)
* [Common Closure Principle (CCP)](#term-common-closure-principle)
* [Acyclic Dependencies Principle (ADP)](#term-acyclic-dependencies-principle)
* [Stable Dependencies Principle (SDP)](#term-stable-dependencies-principle)
* [Stable Abstractions Principle (SAP)](#term-stable-abstractions-principle)

Robert C. Martin, who coined the "[SOLID](#term-solid-principles)" acronym, also [introduced the Package Principles]([Robert C. Martin](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod)) and frequently reiterated both in conjunction. Whereas the SOLID Principles target the level of classes, the Package Principles target the level of larger components that contain multiple classes and might get deployed independently.

Package- and SOLID Principles share the explicit goal of keeping software [maintainable](#term-maintainability-quality-attribute) and avoiding the symptoms of degraded design: rigidity, fragility, immobility, and viscosity.

While Martin expressed the Package Principles in terms of large-scale components, they apply at other scales as well. Their core are universal principles like low coupling, high cohesion, single responsibility, hierarchical (acyclic) decomposition, and the insight that meaningful dependencies go from specific/unstable concepts to more abstract/stable ones (which echoes the [DIP](#term-dependency-inversion)).

Category: Design-Principle


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

{#term-performance-efficiency-quality-attribute}
### Performance Efficiency Quality Attribute
Performance relative to the amount of resources used under stated conditions.

Resources can include other software products, the software and hardware configuration of the system, and materials (e.g. print paper, storage media).

Is composed of the following sub-characteristics: [time behaviour](#term-time-behaviour-quality-attribute), [resource utilization](#term-resource-utilization-quality-attribute), [capacity](#term-capacity-quality-attribute).

Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-perspective}
### Perspective

A perspective is used to consider a set of related quality properties and concerns of a system.

Architects apply perspectives iteratively to the system's _architectural views_ in order to assess the effects of _architectural design decisions_ across multiple _viewpoints_ and _architectural views_.

[Rozanski+11](#ref-rozanski-2011) associates with the term _perspective_ also activities, tactics, and guidelines that must be considered if a system should provide a set of related quality properties and suggests the following perspectives:

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

{#term-pikachu}
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

Short for **Public-Key-Infrastructure**. A concept of managing digital certificates
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


{#term-portability-quality-attribute}
### Portability Quality Attribute
Degree of effectiveness and efficiency with which a system, product or component can be transferred from one hardware, software or other operational or usage environment to another.
Is composed of the following sub-characteristics: [adaptability](#term-adaptability-quality-attribute), [installability](#term-installability-quality-attribute), [replaceability](#term-replaceability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

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
### Pseudo-Randomness

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
### Qualitative Evaluation

Finding risks concerning the desired quality attributes of a system. Analyzing or
assessing if a system or its architecture can meet the desired or required quality goals.

  Instead of calculating or measuring certain characteristics of systems or architectures,
  qualitative evaluation is concerned with risks, trade-offs and sensitivity points.

  See also [_assessment_](#term-assessment).


{#term-quality}
### Quality

see [_software quality_](#term-software-quality) and [quality attributes](#term-quality-attribute).


{#term-quality-attribute}
### Quality Attribute

Software quality is the degree to which a system possesses the desired combination of _attributes_ (see: [software quality](#term-software-quality)).

The Standard [ISO-25010](#term-iso-25010) defines the following quality attributes:

- [Functional suitability](#term-functional-suitability-quality-attribute)
	- [Functional completeness](#term-functional-completeness-quality-attribute)
	- [Functional correctness](#term-functional-correctness-quality-attribute)
	- [Functional appropriateness](#term-functional-appropriateness-quality-attribute)
- [Performance efficiency](#term-performance-efficiency-quality-attribute)
	- [Time behaviour](#term-time-behaviour-quality-attribute)
	- [Resource utilization](#term-resource-utilization-quality-attribute)
	- [Capacity](#term-capacity-quality-attribute)
- [Compatibility](#term-compatibility-quality-attribute)
	- [Co-existence](#term-co-existence-quality-attribute)
	- [Interoperability](#term-interoperability-quality-attribute)
- [Usability](#term-usability-quality-attribute)
	- [Appropriateness recognizability](#term-appropriateness-recognizability-quality-attribute)
	- [Learnability](#term-learnability-quality-attribute)
	- [Operability](#term-operability-quality-attribute)
	- [User error protection](#term-user-error-protection-quality-attribute)
	- [User interface aesthetics](#term-user-interface-aesthetics-quality-attribute)
	- [Accessibility](#term-accessibility-quality-attribute)
- [Reliability](#term-reliability-quality-attribute)
	- [Availability](#term-availability-quality-attribute)
	- [Fault tolerance](#term-fault-tolerance-quality-attribute)
	- [Recoverability](#term-recoverability-quality-attribute)
- [Security](#term-security-quality-attribute)
	- [Confidentiality](#term-confidentiality-quality-attribute)
	- [Integrity](#term-integrity-quality-attribute)
	- [Non-repudiation](#term-non-repudiation-quality-attribute)
	- [Accountability](#term-accountability-quality-attribute)
	- [Authenticity](#term-authenticity-quality-attribute)
- [Maintainability](#term-maintainability-quality-attribute)
	- [Modularity](#term-modularity-quality-attribute)
	- [Reusability](#term-reusability-quality-attribute)
	- [Analysability](#term-analysability-quality-attribute)
	- [Modifiability](#term-modifiability-quality-attribute)
	- [Testability](#term-testability-quality-attribute)
- [Portability](#term-portability-quality-attribute)
	- [Adaptability](#term-adaptability-quality-attribute)
	- [Installability](#term-installability-quality-attribute)
	- [Replaceability](#term-replaceability-quality-attribute)


It's helpful to distinguish between:

* _runtime quality attributes_ (which can be observed at execution time of the system),
* non-runtime quality attributes_ (which cannot be observed as the system executes) and
* business quality attributes (cost, schedule, marketability, appropriateness for organization)

Examples of runtime quality attributes are functional suitability, performance efficiency, security, reliability, usability and interoperability.

Examples of non-runtime quality attributes are modifiability, portability, reusability, integratability, and testability.

{#term-quality-characteristic}
### Quality Characteristic

synonym: _quality attribute_.

{#term-quality-model}
### Quality Model
(from ISO 25010) A model that defines quality characteristics that relate to static properties of software and dynamic properties of the computer system and software products. The quality model provides consistent terminology for specifying, measuring and evaluating system and software product quality.

The scope of application of the quality models includes supporting specification and evaluation of software and software-intensive computer systems from different perspectives by those associated with their acquisition, requirements, development, use, evaluation, support, maintenance, quality assurance and control, and audit.

{#term-quality-requirement}
### Quality Requirement

Characteristic or attribute of a component of a system. Examples include
runtime performance, safety, security, reliability or maintainability.
See also _software quality_.


{#term-quality-tree}
### Quality Tree

(syn: quality attribute utility tree).
A hierarchical model to describe product quality:
The root "quality" is hierarchically refined in _areas_ or topics, which itself are refined again. Quality scenarios form the leaves of this tree.

  * Standards for product quality, like [ISO 25010](#term-iso-25010), propose _generic_ quality trees.
  * The quality of a specific system can be described by a _specific_ quality tree (see the example below).

  {width=60%}  
  ![Sample Quality Tree](images/QualityTree.png)


{#term-quantative-evaluation}
### Quantitative Evaluation

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
**Role-Based-Access-Control** usually to be implemented more
efficient than an [ACL](#term-acl) based system and makes for example deputy
arrangements possible.

Category: Security


{#term-recoverability-quality-attribute}
### Recoverability Quality Attribute
Degree to which, in the event of an interruption or a failure, a product or system can recover the data directly affected and re-establish the desired state of the system.
Is a sub-characteristic of: [reliability](#term-reliability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-redesign}
### Redesign
The alteration of software units in such a way that they fulfill a similar purpose as before, but in a different manner and possibly by different means. Often mistakenly called refactoring.


{#term-refactoring}
### Refactoring
A term denoting the improvement of software units by changing their internal structure without changing the behavior. (see
“Refactoring is the process of changing a software system in such a way that it does not alter the external behavior of the code yet improves the internal structure.” Refactoring, Martin Fowler, 1999    
Not to be confused with re*design*


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


{#term-reliability-quality-attribute}
### Reliability Quality Attribute
Degree to which a system, product or component performs specified functions under specified conditions for a specified period of time.
Is composed of the following sub-characteristics: [maturity](#term-maturity-quality-attribute), [availability](#term-availability-quality-attribute), [fault tolerance](#term-fault-tolerance-quality-attribute), [recoverability](#term-recoverability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010


{#term-replaceability-quality-attribute}
### Replaceability Quality Attribute
Degree to which a product can replace another specified software product for the same purpose in the same environment.
Is a sub-characteristic of: [portability](#term-portability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-repository}
### Repository

In architecture documentation: A place where artifacts are stored before an automatic build process collects them into one consistent document.
In [Domain-Driven Design](#term-DDD): Repository is a building block of [Domain-Driven Design](#term-DDD). A repository hides technical details of the infrastructure layer to the domain layer. Repositories return [entities](#term-entity) that are persisted in the database.


{#term-resource-utilization-quality-attribute}
### Resource Utilization Quality Attribute
Degree to which the amounts and types of resources used by a product or system, when performing its functions, meet requirements.
Is a sub-characteristic of: [performance efficiency](#term-performance-efficiency-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.
Category: Quality, ISO 25010

{#term-reusability-quality-attribute}
### Reusability Quality Attribute
Degree to which an asset can be used in more than one system, or in building other assets.
Is a sub-characteristic of: [maintainability](#term-maintainability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-reuse-release-equivalence-principle}
### Reuse/Release Equivalence Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that large components are "released" and under version control, in particular if the system uses them from multiple points. Even if we don't release them publicly, we should extract such components from the system and provide them through an external dependency manager with proper version control.

The REP contains two different insights:

1. On the large scale, [modularity](#term-modularity-quality-attribute) and [low coupling](#term-coupling) require more than type separation.
2. [Reusability](#term-reusability-quality-attribute) of components (even if all "reuse" is internal) translates to overall [maintainability](#term-maintainability-quality-attribute).

Category: Design-Principle


{#term-risk}
### Risk
Simply said, a risk is the possibility that a problem occurs.
A risk involves _uncertainty_ about the effects, consequences or implications of an activity or decision, usually with a negative connotation concerning a certain value (such as health, money, or qualities of a system like availability or security).


{#term-rm-odp}
### RM/ODP

The [_Reference Model for Open Distributed Processing_](https://en.wikipedia.org/wiki/RM-ODP) is an (abstract) metamodel
for documentation of information systems. Defined in ISO/IEC 10746.


{#term-round-trip-engineering}
### Round-trip Engineering

"Concept of being able to make any kind of change to a model as well as to the code generated from that model. The changes always propagate bidirectional and both artifacts are always consistent." (quoted from
  [Wikipedia](https://en.wikipedia.org/wiki/Model-driven_software_development))

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


{#term-solid-principles}
### S.O.L.I.D. principles

SOLID (single responsibility, open-closed, Liskov substitution, interface segregation and dependency inversion) is an acronym for some principles
(named by [Robert C. Martin](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod))
to improve object-oriented programming and design. The principles make it more likely that a developer will write code that is easy to maintain and extend over time.

For some additional sources, see [Martin-SOLID](#ref-martin-solid).

{#term-scenario}
### Scenario

Quality scenarios document required quality attributes.
They "... are brief narratives of expected or anticipated use of a system from both development and end-user viewpoints." ([Kazman+1996](#ref-kazman-1996))
Thus, they help to describe required or desired qualities of a system in pragmatic and informal manner, yet making the abstract notion of “quality” concrete and tangible.

  {width=50%}
  ![Generic form of (Quality) scenario](images/schematic-Q-scenario.png)

  * Event/stimulus: Any condition or event arriving at the system
  * System (or part of the system) is stimulated by the event.
  * Response: The activity undertaken after the arrival of the stimulus.
  * Metric (response measure): The response should be measurable in some fashion.

Usually scenarios are differentiated into:

* Usage scenarios (application scenarios)
* Change scenarios (modification or growth scenarios)
* Failure scenarios (boundary, stress, or exploratory scenarios)

{#term-sdl}
### SDL

A **Secure-Development-Lifecycle** is a companies usual software
development process with additional practices of engineering secure software.
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


{#term-security-quality-attribute}
### Security Quality Attribute
Degree to which a product or system protects information and data so that persons or other products or systems have the degree of data access appropriate to their types and levels of authorization.
Is composed of the following sub-characteristics: [confidentiality](#term-confidentiality-quality-attribute), [integrity](#term-integrity-quality-attribute), [non-repudiation](#term-non-repudiation-quality-attribute), [accountability](#term-accountability-quality-attribute), [authenticity](#term-authenticity-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

{#term-self-contained-system}
### Self Contained System (SCS)

An architectural style, similar to [Microservices](#term-microservice). To quote from the site
[scs-architecture.org](http://scs-architecture.org/):

  "The Self-contained System (SCS) approach is an architecture that focuses on a separation of the functionality into many independent systems, making the complete system a collaboration of many smaller software systems. This avoids the problem of large monoliths that grow constantly and eventually become unmaintainable"


{#term-sensitivity-point}
### Sensitivity Point

(in qualitative evaluation like ATAM):
Element of the architecture or system influencing several quality attributes.
For example, if one component is responsible for both runtime performance _and_ robustness, that component is a sensitivity point.

Casually said, if you mess up a sensitivity point, you will most often have more than one problem.


{#term-separation-of-concern}
### Separation of Concerns (SoC)

Any element of an architecture should have exclusivity and singularity of responsibility and purpose: No element should share the responsibilities of another element or contain unrelated responsibilities.

  Another definition is "breaking down a system into elements that overlap
  as little as possible."

  Famous Edgar Dijkstra said in 1974: “Separation of concerns ... even if not perfectly possible, is the only available technique for effective ordering of one’s thoughts”.

  Similar to the [Single Responsibility Principle](#term-single-responsibility-principle).


{#term-sequence-diagram}
### Sequence Diagram

Type of diagram to illustrate how elements of an architecture interact
to achieve a certain scenario. It shows the sequence (flow) of messages
between elements. As parallel vertical lines it shows
the lifespan of objects or components, horizontal lines
depict interactions between these components. See the following example.

![Example of Sequence Diagram](images/sequence-diagram-sample.png)

{#term-service}
### Service
t.b.d.


{#term-service-ddd}
### Service (DDD)

Service is a building block of [Domain-Driven Design](#term-DDD). Services implement logic or processes of the business domain that are not executed by entities alone. A service is stateless and the parameters and return values of its operations are [entities](#term-entity), [aggregates](#term-aggregate) and [value objects](#term-value-object).

{#term-signature}
### Signature

Signature of function or method: See [function signature](#term-function-signature)

Digital signature: Method for verifying the authenticity of data or documents.

{#term-single-responsibility-principle}
### Single Responsibility Principle (SRP)

Each element within a system or architecture should have a single
responsibility, and that all its functions or services should be
aligned with that responsibility.

[Cohesion](#term-cohesion) is sometimes considered to be associated with the SRP.


{#term-singleton}
### Singleton

"Design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system." (quoted from [Wikipedia](https://en.wikipedia.org/wiki/Singleton_pattern).


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

Although the term often refers to the _software architecture of an IT system_, it is also used to refer to _software architecture as an engineering science_.

Category: ISO-IEC-IEEE-42010

{#term-software-quality}
### Software Quality

(from IEEE Standard 1061): Software quality is the degree to which software possesses a desired combination of attributes. This desired combination of attributes need to be clearly defined; otherwise, assessment of quality is left to intuition.

(from ISO/IEC Standard 25010): The quality of a system is the degree to which the system satisfies the stated and implied needs of its various stakeholders, and thus provides value. These stated and implied needs are represented in the ISO 25000 quality models that categorize product quality into characteristics, which in some cases are further subdivided into subcharacteristics.

{#term-stable-abstractions-principle}
### Stable Abstractions Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that the abstractness of components is proportional to their stability. The closely related [SDP](#term-stable-dependencies-principle) also explains the notion of *stability* in this context.

We want components that represent abstract concepts and responsibilities to require little or no modification because many conceptually more specific (concrete) components depend on them. And we want components that should or could not easily change to be at least abstract enough so we can extend them. This relates to the [OCP](#term-open-close-principle).

The SAP can sound like a circular argument until the underlying idea shines through: *Concrete* things and concepts are naturally more volatile, specific, arbitrary and numerous than *abstract* ones. The component structure of a system simply should reflect that. General logic, the system's physical artifacts as well as its functional and technical concepts should all be in congruence.

The SAP is closely related to the [SDP](#term-stable-dependencies-principle). Their combination amounts to a more general and arguably more profound version of the [DIP](#term-dependency-inversion): Specific concepts naturally depend on more *abstract* ones because they are composed or derived from more general-purpose building blocks. And dependent concepts are naturally more *specific* because they are defined by more information than their dependencies (assuming there are [no dependence cycles](#term-acyclic-dependencies-principle)).

Category: Design-Principle

{#term-stable-dependencies-principle}
### Stable Dependencies Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that frequently changing components depend on more stable ones.

Part of the volatility of a component is [expected](#term-common-closure-principle) and naturally implied by its particular responsibility.

But stability in this context is also a function of incoming and outgoing dependencies. A component that is heavily depended on by others is harder to change and condsidered to be more stable. A component that heavily depends on others has more reasons to change and is considered to be less stable.

So in regards to dependence, a component with many clients should not depend on one with many dependencies. A single component with both of these properties is also a red flag. Such a component has many reasons to change but is at the same time hard to change.

Original definitions of the SDP (like [Martin-2003](#ref-martin-2003)) involve a [metric *I* of instability](https://en.wikipedia.org/wiki/Software_package_metrics). Unfortunately, that metric doesn't capture intended/inherent volatility, transitive dependence or cases like the red flag mentioned above. But we value the idea of the SDP regardless of how it can be measured.

The SDP is closely related to the [SAP](#term-stable-abstractions-principle). Their combination amounts to a version of the [DIP](#term-dependency-inversion) (more on this under [SAP](#term-stable-abstractions-principle)).

Category: Design-Principle

{#term-stakeholder}
### Stakeholder

Person or organization that can be affected by
or have in interest (_stake_) in a system, its development
or execution.

Examples include users, employees, owners, administrators, developers, designers, project- or product-managers, product-owner, project manager, requirements engineers, business-analysts, government agencies, enterprise architects etc.

Following ISO/IEC/IEEE 42010 a stakeholder is a (system) individual, team, organization, or classes thereof, having an interest in a system (as defined in ISO/IEC/IEEE 42010).

Such interest can be positive (e.g. stakeholder wants to benefit from the system), neutral (stakeholder has to test or verify the system) or negative (stakeholder is competing with the system or wants it to fail).

Category: ISO-IEC-IEEE-42010


{#term-structural-element}
### Structural Element

see [Building Block(#term-building-block) or [Component](#term-component)


{#term-structure}
### Structure

An arrangement, order or organization of interrelated elements in a system.
Structures consist of building blocks (structural elements)
and their relationships (dependencies).

  Structures in software architecture are often used in [architecture views](#term-architecture-view),
  e.g. the [building block view](#term-building-block-view).
  A documentation template (e.g. [arc42](#term-arc42)) is
  a kind of structure too.


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

* software-intensive systems as described in [IEEE Std 1471:2000]: “any system where software contributes essential influences to the design, construction, deployment, and evolution of the system as a whole” to encompass “individual applications, systems in the traditional sense, subsystems, systems of systems, product lines, product families, whole enterprises, and other aggregations of interest”.

Category: ISO-IEC-IEEE-42010


{#term-system-of-interest}
### System-of-Interest

System-of-Interest (or simply, system) refers to the system whose architecture is under consideration in the preparation of an architecture description (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-template}
### Template (for Documentation)

Standardized order of artifacts used in software development.
It can help base other files, especially documents in a predefines
structure without prescribing the content of these single files.

  A well known example of such templates is [arc42](http://arc42.de)

{#term-temporal-coupling}
### Temporal Coupling
Different interpretations exist from various sources. Temporal coupling:

* means that processes that are communicating will both have to be up and running. See [Tanenbaum+2016](#ref-tanenbaum-steen).
* when you often commit (_modify_) different components at the same time. See [Tornhill-2015](#ref-tornhill-crime-scene).
* when there's an implicit relationship between two, or more, members of a class requiring clients to invoke one member before the other. Mark Seemann, see <https://blog.ploeh.dk/2011/05/24/DesignSmellTemporalCoupling/>
* means that one system needs to wait for the response of another system before it can continue processing. See <https://www.beeworks.be/blog/2017/rest-antipattern.html>

{#term-testability-quality-attribute}
### Testability Quality Attribute
Degree of effectiveness and efficiency with which test criteria can be established for a system, product or component and tests can be performed to determine whether those criteria have been met.
Is a sub-characteristic of: [maintainability](#term-maintainability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.
Category: Quality, ISO 25010

{#term-time-behaviour-quality-attribute}
### Time Behaviour Quality Attribute
Degree to which the response and processing times and throughput rates of a product or system, when performing its functions, meet requirements.
Is a sub-characteristic of: [performance efficiency](#term-performance-efficiency-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.

Category: Quality, ISO 25010

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
### TOGAF

[_The Open Group Architecture Framework_](http://www.opengroup.org/subjectareas/enterprise/togaf) is a conceptual framework for planning and maintenance of enterprise IT architectures.

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
### Trade-Off

(syn: compromise). A balance achieved or negotiated between two desired or
required but usually incompatible or contradicting features. For example,
software development usually has to tradeoff memory consumption and runtime
speed.

  More colloquially, if one thing increases, some other thing must decrease.

  Even more colloquially: There is no free lunch. Every quality attribute
  has a price among other quality attributes.

{#term-trainer}
### Trainer
A trainer is a person who conducts a training course himself, provided that this is carried out within the framework of a accreditation granted to an accredited [training provider](#term-training-provider). Accordingly, accredited training providers may only organise and conduct CPSA training courses with accredited trainers. Only accredited training providers can apply for trainer [accreditations](#term-accreditation).

{#term-training-level}
### Training Level
The iSAQB® CPSA education programme is divided into (currently) two Training Levels: *Foundation Level* and
*Advanced Level*. The Training Levels should contain knowledge that builds upon one another. The exact relationships between each other and the contents of the Training Level are defined in the respective curricula (_syllabi_).

{#term-training-provider}
### Training Provider
An organisation or person who holds the rights of use to accredited training materials or who has purchased [accreditation](#term-accreditation) for training materials, provides trainers and infrastructure and conducts training courses.


{#term-ubiquitous-language}
### Ubiquitous Language
A concept of [Domain-Driven Design](#term-DDD): The ubiquitous language is a language that is structured around the [domain model](#term-domain-model). It is used by all team members to connect all the activities of the team with the software. The ubiquitous language is a living thing that is evolving during a project and will be changed during the whole live cycle of the software.


{#term-uml}
### Unified Modeling Language (UML)

[(UML)](http://uml.org) is a graphical language for visualizing, specifying and documenting the artifacts and structures of a software system.

* For building block views or the context view, use component diagrams, with either components, packages or classes to denote building blocks.
* For runtime views, use sequence- or activity diagrams (with swimlanes). Object diagrams can theoretically be used, but are practically not adviced, as they become cluttered even for small scenarios.
* For Deployment views, use deployment diagrams with node symbols.

{#term-unit-test}
### Unit Test
Test of the smallest testable parts of system to determine whether they are fit for use.

Depending on implementation technology, a _unit_ might be a method, function, interface or similar element.

{#term-usability-quality-attribute}
### Usability Quality Attribute
Degree to which a product or system can be used by specified users to achieve specified goals with effectiveness, efficiency and satisfaction in a specified context of use.
Is composed of the following sub-characteristics: [appropriateness recognizability](#term-appropriateness-recognizability-quality-attribute), [learnability](#term-learnability-quality-attribute), [operability](#term-operability-quality-attribute), [user error protection](#term-user-error-protection-quality-attribute), [user interface aesthetics](#term-user-interface-aesthetics-quality-attribute), [accessibility](#term-accessibility-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.
Category: Quality, ISO 25010

{#term-user-error-protection-quality-attribute}
### User Error Protection Quality Attribute
Degree to which a system protects users against making errors.
Is a sub-characteristic of: [usability](#term-usability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.
Category: Quality, ISO 25010

{#term-user-interface-aesthetics-quality-attribute}
### User Interface Aesthetics Quality Attribute
Degree to which a user interface enables pleasing and satisfying interaction for the user.
Is a sub-characteristic of: [usability](#term-usability-quality-attribute).
Refer to [ISO 25010](http://iso25000.com/index.php/en/iso-25000-standards/iso-25010) website.
Category: Quality, ISO 25010

{#term-uses-relationship}
### Uses Relationship

Dependency that exists between two building blocks.
If A uses B than execution of A depends on the
presence of a correct implementation of B.


{#term-value-object}
### Value Object

Value Object is a building block of [Domain-Driven Design](#term-DDD). ValueObjects do not have a conceptual identity of their own and should be treated as immutable. They are used to describe the state of [entities](#term-entity) and may be composed of other value objects but never of [entities](#term-entity).


{#term-view}
### View

see: [architecture view](#term-architecture-view)


{#term-waterfall-development}
### Waterfall Development

Development approach "where you gather all the requirements up front, do all necessary design, down to a detailed level, then hand the specs to the coders, who write the code; then you do testing (possibly with a side trip to IntegrationHell) and deliver the whole thing in one big end-all release. Everything is big including the risk of failure." (quoted from the [C2 wiki](http://c2.com/cgi/wiki?IterativeDevelopment))

Contrast to [_iterative development_](#term-iterative-development).


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
### White Box

Shows the internal structure of a system or building block, made up from blackboxes and the internal/external relationships and interfaces.

See also [Black Box](#term-blackbox).

{#term-workflow-management-system}
### Workflow Management System (WFMS)

Provides an infrastructure for the set-up, performance and monitoring of a defined sequence of tasks, arranged as a workflow. (quoted from Wikipedia)


{#term-wrapper}
### Wrapper

(syn: Decorator, Adapter, Gateway) Patterns to abstract away the concrete interface or implementation of a component. Attach additional responsibilities to an object dynamically.

Depending on the sources, the semantics of the term _wrapper_ may vary.

D> ###### Comment (Gernot Starke)
D> The tiny differences found in literature regarding this term often don't matter in real-life. _Wrapping_ a component or building-block shall have a clear semantics within a single software system.  
