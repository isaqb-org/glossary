### Common Reuse Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). The subcomponents (classes) of a component should be exactly the ones that are being (re)used together. Or the other way around: Components that are being (re)used together should be packaged into a larger component. This also implies that subcomponents that are *not* frequently used in conjunction with the other subcomponents should *not* be in the respective component.

This perspective helps in deciding what belongs into a component and what doesn't. It aims at a system decomposition of [loosely coupled](#term-coupling) and [highly cohesive](#term-cohesion) components.

This obviously echoes the [Single Responsibility Principle](#term-single-responsibility-principle). It also echoes the [Interface Segregation Principle](#term-interface-segregation-principle), as it ensures that clients aren't forced to depend on concepts they don't care about.

Category: Design-Principle

