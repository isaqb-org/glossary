// tag::EN[]
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


// end::EN[]

// tag::DE[]
### Packaging-Prinzipien

Grundsätze für die Gestaltung der Struktur von Softwaresystemen
([Martin-2003](#ref-martin-2003)):

-   [Reuse-Release-Equivalence-Prinzip (REP)](#term-reuse-release-equivalence-principle)

-   [Common-Reuse-Prinzip (CRP)](#term-common-reuse-principle)

-   [Common-Closure-Prinzip (CCP)](#term-common-closure-principle)

-   [Acyclic-Dependencies-Prinzip (ADP)](#term-acyclic-dependencies-principle)

-   [Stable-Dependencies-Prinzip (SDP)](#term-stable-dependencies-principle)

-   [Stable-Abstractions-Prinzip (SAP)](#term-stable-abstractions-principle)

Robert C. Martin, der das Akronym „[SOLID](#term-solid-principles)" geprägt
hat, hat auch die [Packaging-Prinzipien eingeführt]([Robert C. Martin](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod))
und häufig beide zusammen angeführt. Während die SOLID-Prinzipien auf
die Klassen-Ebene abzielen, beziehen sich die Packaging-Prinzipien auf
die Ebene größerer Komponenten, die mehrere Klassen enthalten und
eventuell unabhängig verteilt werden.

Package- und SOLID-Prinzipien haben beide das ausdrückliche Ziel,
Software [wartbar](#term-maintainability-quality-attribute) zu halten und die Anzeichen von
schlechtem Design, Rigidität, Fragilität, Immobilität und Viskosität
zu vermeiden.

Martin hat die Packaging-Prinzipien zwar bezogen auf große Komponenten
formuliert, sie gelten jedoch auch für alle anderen Größen. Ihr Kern
sind universelle Prinzipien, wie lose Kopplung, eindeutige
Verantwortung, hierarchische (azyklische) Zerlegung und die
Erkenntnis, dass sinnvolle Abhängigkeiten von spezifischen/instabilen
Konzepten zu abstrakteren/stabileren verlaufen (was sich im
[DIP](#term-dependency-inversion) wiederfindet).

Kategorie: Entwurfsprinzip

