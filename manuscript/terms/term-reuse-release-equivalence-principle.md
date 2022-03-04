### Reuse/Release Equivalence Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that large components are "released" and under version control, in particular if the system uses them from multiple points. Even if we don't release them publicly, we should extract such components from the system and provide them through an external dependency manager with proper version control.

The REP contains two different insights:

1. On the large scale, [modularity](#term-modularity-quality-attribute) and [low coupling](#term-coupling) require more than type separation.
2. [Reusability](#term-reusability-quality-attribute) of components (even if all "reuse" is internal) translates to overall [maintainability](#term-maintainability-quality-attribute).

Category: Design-Principle


