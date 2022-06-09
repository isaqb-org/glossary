{lang=en}
### Common Reuse Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). The subcomponents (classes) of a component should be exactly the ones that are being (re)used together. Or the other way around: Components that are being (re)used together should be packaged into a larger component. This also implies that subcomponents that are *not* frequently used in conjunction with the other subcomponents should *not* be in the respective component.

This perspective helps in deciding what belongs into a component and what doesn't. It aims at a system decomposition of [loosely coupled](#term-coupling) and [highly cohesive](#term-cohesion) components.

This obviously echoes the [Single Responsibility Principle](#term-single-responsibility-principle). It also echoes the [Interface Segregation Principle](#term-interface-segregation-principle), as it ensures that clients aren't forced to depend on concepts they don't care about.

Category: Design-Principle

{lang=de}
### Common-Reuse-Prinzip

Ein Grundsatz für die Gestaltung der Struktur von Softwaresystemen
(siehe auch [Packaging-Prinzipien](#term-package-principles)). Die
Unterkomponenten (Klassen) einer Komponente sollen genau die sein, die
zusammen (wieder)verwendet werden. Oder anders herum: Komponenten, die
zusammen (wieder)verwendet werden, sollen in eine größere Komponente
gepackt werden. Dies bedeutet auch, dass Unterkomponenten, die *nicht*
häufig zusammen mit anderen Unterkomponenten verwendet werden, *nicht*
in der entsprechenden Komponente sein sollen.

Diese Perspektive hilft bei der Entscheidung, was in eine Komponente
gehört und was nicht. Sie zielt auf eine Systemzerlegung mit [lose
gekoppelten](#term-coupling) und [stark kohärenten](#term-cohesion)
Komponenten ab.

Dies steht natürlich im engen Zusammenhang mit dem
[Single-Responsibility-Prinzip](#term-single-responsibility-principle). Außerdem besteht ein
Zusammenhang zum [Schnittstellenaufteilungsprinzip](#term-interface-segregation-principle), da
das Prinzip sicherstellt, dass Clients nicht gezwungen werden, von
Konzepten abzuhängen, die für sie bedeutungslos sind.

Kategorie: Entwurfsprinzip

