{pagebreak}

{#glossary}
# Glossary of Terms

{#term-abstraction}
### Abstraction

A view of an element that focuses on the information relevant to a particular purpose and ignores the remainder of the information.

Category: Design-Principle


{#term-abstractness}
### Abstractness

Metric for the source code of object oriented systems: The number of abstract types
(interfaces and abstract classes) divided by the total number of types.

Category: Metric

{#term-acl}
### ACL
Access Control Lists are a way to organize and store permissions of
an [principal](#term-principal) for a specific entity. Beside implementations
on an application level a typical example for an ACL is the management of file
permissions on unix based operating systems.

Since ACLs don't scale well on a large base it is common to model access
control based on roles ([RBAC](#term-rbac)).

Category: Security

{#term-adapter}
### Adapter

The adapter is a design pattern that allows the interface of an existing component to be used from another interface. It is often used to make existing components cooperate with others without modifying their source code.

Category: Design-Pattern, Foundation.

{#term-aggregate}
### Aggregate

Aggregate is a building block of [Domain-Driven Design](#term-DDD). Aggregates are complex object structures that are made of [entities](#term-entity) and [value objects](#term-value-object). Each aggregate has a root entity and is regarded as a unity when it comes to changes. An aggregate ensure consistency and integrity of its contained entities with invariants.

Category: DDD

{#term-aggregation}
### Aggregation

A form of object [composition](#term-composition) in object-oriented programming.
It differs from composition, as aggregation does not imply ownership.
When the element is destroyed, the contained elements
remain intact.

Category: Foundation


{#term-appropriateness}
### Appropriateness

(syn: adequacy) Suitability for a particular purpose.


{#term-arc42}
### arc42

Free [template](http://arc42.org) for communication and documentation of software architectures.
arc42 consists of 12 (optional) parts or sections.

Category: Communication, Documentation


### Architecture

See [Software Architecture](#term-software-architecture)

Category: ISO-IEC-IEEE-42010


{#term-architectural-decision}
### Architectural Decision
Decision, which has an sustainable or essential effect on the architecture.

Example: Decision about database technology or technical basics of the user interface.

Following ISO/IEC/IEEE 42010 an architectural decision pertain to system concerns. However, there is often no simple mapping between the two. A decision can affect the architecture in several ways. These can be reflected in the architecture description (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-architecture-description}
### Architecture description

Work product used to express an architecture (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-architecture-description-element}
### Architecture description element

An architecture description element is any construct in an architecture description. architecture description elements are the most primitive constructs discussed in ISO/IEC/IEEE 42010. All terms defined in ISO/IEC/IEEE 42010 are a specialization of the concept of an architecture description element (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-architecture-description-language}
### Architecture description language

An architecture description language (ADL) is any form of expression for use in architecture descriptions (as defined in ISO/IEC/IEEE 42010).

Examples are Rapide, Wright, SysML, ArchiMate and the viewpoint languages of RM-ODP [ISO 10746].

Category: ISO-IEC-IEEE-42010


{#term-architecture-evaluation}
### Architecture evaluation

Quantitative or qualitative assessment of a (software or system) architecture.
Determine if an architecture can achieve its target qualities or
quality attributes?

See [Assessment](#term-assessment)

  In our opinion the terms _architecture analysis_ or _architecture assessment_ are more
  appropriate, as _evaluation_ contains _value_, implying numerical
  assessment (which is usually only part of what you should do in architecture analysis).


{#term-architecture-framework}
### Architecture framework

Conventions, principles and practices for the description of architectures established within a specific domain of application and/or community of stakeholders (as defined in ISO/IEC/IEEE 42010).

Examples are:

* Generalised Enterprise Reference Architecture and Methodologies (GERAM) [ISO 15704] is an architecture framework.

* Reference Model of Open Distributed Processing (RM-ODP) [ISO/IEC 10746] is an architecture framework.


Category: ISO-IEC-IEEE-42010



{#term-architecture-goal}
### Architecture goal


(syn: Architectural quality goal, Architectural quality requirement): A quality attribute that the system
needs to achieve and the quality attribute is understood to be an architectural issue.

Hence, the architecture needs to be designed in a way to fullfill this architectural goal. These goals often have _long term character_ in contrast to (short term) project goals.

Category: Fundamental


{#term-architecture-model}
### Architecture model

An architecture view is composed of one or more architecture models. An architecture model uses modelling conventions appropriate to the concerns to be addressed. These conventions are specified by the model kind governing that model. Within an architecture description, an architecture model can be a part of more than one architecture view (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-architecture-objective}
### Architecture objective

See [architecture goal](#term-architecture-goal).

{#term-architecture-pattern}
### Architectural (architecture) pattern

“An architectural pattern expresses a fundamental structural organization schema for software systems. It provides a set of predefined sub- systems, specifies their responsibilities, and includes rules and guidelines for organizing the relationships between them” (Buschmann+1996, page 12). Similar to _Architecture style_

Examples include:

* Model-View-Controller
* Layers
* Pipes-and-Filter
* [CQRS](#term-cqrs)


{#term-architecture-quality-requirement}
### Architecture quality requirement

See [architecture goal](#term-architecture-goal).



{#term-architecture-rational}
### Architecture rational

Architecture rationale records explanation, justification or reasoning about architecture decisions that have been made. The rationale for a decision can include the basis for a decision, alternatives and trade-offs considered, potential consequences of the decision and citations to sources of additional information (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-architecture-style}
### Architecture style

Description of element and relation types,
together with constraints on how they can be used. Often called _architecture patterns_.
Examples: Pipes-and-Filter, Model-View-Controller, Layers.

{#term-architecture-view}
### Architecture view

A representation of a system from a specific perspective. Important and well-known views are:

* [Context view](#term-context-view),
* Building block view
* Runtime view
* Deployment view

[Bass+2012] and [Rozanski+11] extensively discuss this concept.

Following ISO/IEC/IEEE 42010, an architecture view is a work product expressing the architecture of a system from the perspective of specific system concerns (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-architecture-viewpoint}
### Architecture viewpoint

Work product establishing the conventions for the construction, interpretation and use of architecture views to frame specific system concerns (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010


{#term-artifact}
### Artifact

Tangible by-product created or generated during development
of software. Examples of artifacts are use cases, all kinds
of diagrams, UML models, requirements and design documents,
source code, test cases, class-files, archives.

{#term-asset}
### Asset

"In information security, computer security and network security an Asset is any
data, device, or other component of the environment that supports
information-related activities. Assets generally include hardware (e.g. servers
and switches), software (e.g. mission critical applications and support
systems) and confidential information"

(quoted from [Wikipedia](https://en.wikipedia.org/w/index.php?title=Asset_(computer_security)&oldid=694606042))

Category: Security


{#term-assessment}
### Assessment

See also [Evaluation](#term-architecture-evaluation).

Gathering information about status, risks or vulnerabilities of a system.
Assessment might concerning potentially all aspects
(development, organization, architecture, code etc.)


{#term-association}
### Association
Defines a relationship between objects (in general: between modules).
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
with the corresponding architectural approaches to identify risks and tradeoffs.


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


{#term-authentication}
### Authentication

Authentication is the process of confirming the claim of an identity by a given
entity. Usually this is done by verifying at least one of the authentication
factors which is known by the system:

 * knowledge (e.g. password)
 * ownership (e.g. security token)
 * inherence (e.g. biometrics)

For a stronger authentication mutiple factors can be requested or at least
factors of two categories.

Category: Security


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


{#term-blackbox}
### Blackbox

View on a [building block](#term-building-block) (or [component](#term-component)) that hides the internal structure.
Blackboxes respect the [_information hiding principle_](#term-information-hiding).
They shall have clearly defined input- and output interfaces plus a precisely formulated
_responsibility_ or _objective_. Optionally a blackbox defines some quality attributes,
for example timing behavior, throughput or security aspects.

Category: Foundation

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


{#term-cardinality}
### Cardinality
Describes the quantitative rating of an association or relationship.
It specifies the number of participants (objects, instances, modules etc)
of the association.

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

Plan,principle(s) or rule(s) how to solve a specific problem.

Concepts are often _crosscutting_ in a sense that multiple architectural
elements might be affected by a single concept. That means that implementors
of e.g. implementation units (building blocks) should adhere to the corresponding
concept.

Concepts form the basis for _conceptual integrity_.

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


{#term-context}
### Context (of a system)

"Defines the relationships, dependencies, and interactions between the system and its environment: People, systems, and external entities with which it interacts." (quoted from [Rozanski-Woods](http://www.viewpoints-and-perspectives.info/home/viewpoints/context/))


{#term-context-view}
### Context View

Shows the complete system as one [blackbox](#term-blackbox) within its environment, either from
a business perspective (_business context_) or from a technical or deployment
perspective (_technical context_). The context view (or context diagram) shows
the boundary between a system  and its environment, showing the entities in
its environment (its neighbours) with which it interacts.

  See [Context](#term-context).


{#term-correspondence}
### Correspondence

A correspondence defines a relation between architectural description elements. Correspondences are used to express architecture relations of interest within an architecture description (or between architecture descriptions) (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010

{#term-correspondence-rule}
### Correspondence rule

Correspondences can be governed by correspondence rules. Correspondence rules are used to enforce relations within an architecture description (or between architecture descriptions) (as defined in ISO/IEC/IEEE 42010).

Category: ISO-IEC-IEEE-42010



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
Certified Professional for Software Architecture® – the common name for different levels of certification issued by the [iSAQB](#term-isaqb). The most common known certifications are the foundation level (CPSA-F) and the advanced level (CPSA-A).

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
