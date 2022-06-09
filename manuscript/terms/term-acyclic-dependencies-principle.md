{lang=en}
### Acyclic Dependencies Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that there be no cycles in the dependence graph of a system, which is also a [necessity](https://en.wikipedia.org/wiki/Directed_acyclic_graph) for [*hierarchical* decomposition](https://en.wikipedia.org/wiki/Functional_decomposition).

Avoiding dependence cycles is essential for [low coupling](#term-coupling) and [maintainability](#term-maintainability-quality-attribute), as *all* components in a dependence cycle effectively (even if indirectly) depend on each other, which makes it hard to understand, change or replace any part of the cycle in isolation (also see [Lilienthal-2019](#ref-lilienthal-2019)).

Although Robert C. Martin ([Martin-2003](#ref-martin-2003)) expressed it in terms of large components of object-oriented software, the ADP is a *universal* principle. It goes back (at least) to one of the origins of software architecture, the classic 1972 paper "On the Criteria To Be Used in Decomposing Systems into Modules" ([Parnas-1972](#ref-parnas-1972)), which concludes that hierarchical structure along with "clean" decomposition are desirable properties of any system.

It can be argued that a dependence cycle, even before considering its various practical problems, is logically already as flawed as a [circular argument](https://en.wikipedia.org/wiki/Circular_reasoning) or [circular definition](https://en.wikipedia.org/wiki/Fallacies_of_definition#Circularity). As a structural contradiction, a cycle can neither be an *appropriate* nor meaningful model of the inherent nature and purpose of a system. And this conceptual divergence alone virtually guarantees for (unpredictable) problems to arise, which is exactly what a [*principled*](#term-design-principle) approach guards against.

Category: Design-Principle

{lang=de}
### Azyklischer Abhängigkeitsgrundsatz (ADP)

Ein Grundsatz für die Gestaltung der Struktur von Softwaresystemen
(siehe auch [Packaging-Prinzipien](#term-package-principles)). Er besagt, dass
der Abhängigkeitsgraph eines Systems keine Zyklen enthalten darf, was
auch eine
[Notwendigkeit](https://en.wikipedia.org/wiki/Directed_acyclic_graph)
für die [*hierarchische*
Zerlegung](https://en.wikipedia.org/wiki/Functional_decomposition)
ist.

Die Vermeidung von Abhängigkeitszyklen ist für [lose
Kopplung](#term-coupling) und [Wartbarkeit](#term-maintainability-quality-attribute) entscheidend,
da *alle* Komponenten in einem Abhängigkeitszyklus effektiv (auch wenn
mittelbar) voneinander abhängen, wodurch es schwierig ist, einen Teil
des Zyklus isoliert zu verstehen, zu ändern oder zu ersetzen (siehe
auch [Lilienthal-2019](#ref-lilienthal-2019)).

Auch wenn Robert C. Martin ([Martin-2003](#ref-martin-2003)) sich auf
große Komponenten objektorientierter Software bezog, ist ADP ein
*universeller* Grundsatz. Er geht (mindestens) auf einen der Ursprünge
der Softwarearchitektur zurück, den Klassiker von 1972 „On the
Criteria To Be Used in Decomposing Systems into Modules"
([Parnas-1972](#ref-parnas-1972)), der zu dem Ergebnis gelangt, dass
eine hierarchische Struktur zusammen mit einer „sauberen" Zerlegung
wünschenswerte Eigenschaften eines jeden Systems sind.

Es kann argumentiert werden, dass ein Abhängigkeitszyklus, selbst vor
Berücksichtigung seiner verschiedenen praktischen Probleme, logisch
bereits so fehlerhaft ist wie ein
[Zirkelargument](https://en.wikipedia.org/wiki/Circular_reasoning)
oder eine
[Zirkeldefinition](https://en.wikipedia.org/wiki/Fallacies_of_definition%23Circularity).
Als struktureller Widerspruch kann ein Zyklus weder ein *angemessenes*
noch ein aussagekräftiges Modell der inhärenten Natur und des Zwecks
eines Systems sein. Alleine diese konzeptuelle Abweichung führt
geradezu mit Sicherheit zur Entstehung von Problemen. Und genau das
soll durch einen [*Prinzip*](#term-design-principle)-Ansatz verhindert werden.

Kategorie: Entwurfsprinzip
