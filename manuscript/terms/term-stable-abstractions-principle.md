### Stable Abstractions Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that the abstractness of components is proportional to their stability. The closely related [SDP](#term-stable-dependencies-principle) also explains the notion of *stability* in this context.

We want components that represent abstract concepts and responsibilities to require little or no modification because many conceptually more specific (concrete) components depend on them. And we want components that should or could not easily change to be at least abstract enough so we can extend them. This relates to the [OCP](#term-open-close-principle).

The SAP can sound like a circular argument until the underlying idea shines through: *Concrete* things and concepts are naturally more volatile, specific, arbitrary and numerous than *abstract* ones. The component structure of a system simply should reflect that. General logic, the system's physical artifacts as well as its functional and technical concepts should all be in congruence.

The SAP is closely related to the [SDP](#term-stable-dependencies-principle). Their combination amounts to a more general and arguably more profound version of the [DIP](#term-dependency-inversion): Specific concepts naturally depend on more *abstract* ones because they are composed or derived from more general-purpose building blocks. And dependent concepts are naturally more *specific* because they are defined by more information than their dependencies (assuming there are [no dependence cycles](#term-acyclic-dependencies-principle)).

Category: Design-Principle

