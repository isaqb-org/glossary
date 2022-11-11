// tag::EN[]
### Reuse/Release Equivalence Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that large components are "released" and under version control, in particular if the system uses them from multiple points. Even if we don't release them publicly, we should extract such components from the system and provide them through an external dependency manager with proper version control.

The REP contains two different insights:

1. On the large scale, [modularity](#term-modularity-quality-attribute) and [low coupling](#term-coupling) require more than type separation.
2. [Reusability](#term-reusability-quality-attribute) of components (even if all "reuse" is internal) translates to overall [maintainability](#term-maintainability-quality-attribute).

Category: Design-Principle


// end::EN[]

// tag::DE[]
### Reuse-Release-Equivalence-Prinzip

Ein Grundsatz für die Gestaltung der Struktur von Softwaresystemen
(siehe auch [Packaging-Prinzipien](#term-package-principles)). Es verlangt einen
„Release" und eine Versionskontrolle von großen Komponenten,
insbesondere wenn das System sie von mehreren Punkten aus nutzt. Auch
wenn sie nicht öffentlich herausgegeben werden, sollten diese
Komponenten aus dem System extrahiert werden und durch einen externen
Dependency Manager eine ordnungsgemäße Versionskontrolle erhalten.

Das REP enthält zwei unterschiedliche Erkenntnisse:

1.  Im großen Maßstab erfordern [Modularität](#term-modularity-quality-attribute) und [lose
    Kopplung](#term-coupling) mehr als Typentrennung.

2.  Die [Wiederverwendbarkeit](#term-reusability-quality-attribute) von Komponenten (auch wenn
    die gesamte „Wiederverwendung" intern erfolgt) führt zu allgemeiner
    [Wartbarkeit](#term-maintainability-quality-attribute).

Kategorie: Entwurfsprinzip

