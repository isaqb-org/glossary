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


