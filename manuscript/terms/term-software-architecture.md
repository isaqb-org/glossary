{lang=en}
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

