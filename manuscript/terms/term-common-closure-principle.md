{lang=en}
### Common Closure Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It directly and explicitly restates the [Single Responsibility Principle](#term-single-responsibility-principle) for larger components. 

The subcomponents of a component should ideally have the exact same reasons to change. A change request that effects one of them should effect all of them, but it should *not* effect anything else outside their enclosing component.

Thereby, each expected change request would effect a minimal number of components. Or put another way: Each component would be [closed](#term-open-close-principle) to a maximum number of expected change requests. The term *expected* here signifies a few important implications:

1. The inherent concepts/responsibilities of a system run deeper than a surface-level description of its behaviour. 
2. The deeper concepts/responsibilities of a system are not entirely objective but can be modeled in different ways.
3. Determining the concepts/responsibilities of a system is not just passive describing but also active *strategizing*.

This principle leads to [highly cohesive](#term-cohesion) components. It also implies [loosely coupled](#term-coupling) components because related concepts that *do* change together *do* get bundled up in the same component. When each single concept is expressed by a single component, there are no unnecessary couplings between components.

Category: Design-Principle

