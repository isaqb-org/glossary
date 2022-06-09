{lang=en}
### Stable Abstractions Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that the abstractness of components is proportional to their stability. The closely related [SDP](#term-stable-dependencies-principle) also explains the notion of *stability* in this context.

We want components that represent abstract concepts and responsibilities to require little or no modification because many conceptually more specific (concrete) components depend on them. And we want components that should or could not easily change to be at least abstract enough so we can extend them. This relates to the [OCP](#term-open-close-principle).

The SAP can sound like a circular argument until the underlying idea shines through: *Concrete* things and concepts are naturally more volatile, specific, arbitrary and numerous than *abstract* ones. The component structure of a system simply should reflect that. General logic, the system's physical artifacts as well as its functional and technical concepts should all be in congruence.

The SAP is closely related to the [SDP](#term-stable-dependencies-principle). Their combination amounts to a more general and arguably more profound version of the [DIP](#term-dependency-inversion): Specific concepts naturally depend on more *abstract* ones because they are composed or derived from more general-purpose building blocks. And dependent concepts are naturally more *specific* because they are defined by more information than their dependencies (assuming there are [no dependence cycles](#term-acyclic-dependencies-principle)).

Category: Design-Principle

{lang=de}
### Stable-Abstractions-Prinzip

Ein Grundsatz für die Gestaltung der Struktur von Softwaresystemen
(siehe auch [Packaging-Prinzipien](#term-package-principles)). Er fordert, dass
die Abstraktheit von Komponenten proportional zu ihrer Stabilität ist.
Das eng damit verbundene [SDP](#term-stable-dependencies-principle) erklärt auch den Begriff
*Stabilität* in diesem Zusammenhang.

Wir wollen, dass Komponenten, die abstrakte Konzepte und
Verantwortlichkeiten repräsentieren, wenig oder keine Änderungen
benötigen, weil zahlreiche konzeptionell spezifischere (konkrete)
Komponenten von ihnen abhängen. Und wir wollen, dass Komponenten, die
nicht einfach geändert werden können oder sollten, mindestens so
abstrakt sind, dass wir sie erweitern können. Dies steht mit dem
[OCP](#term-open-close-principle) in Zusammenhang.

Das SAP kann wie ein Zirkelargument klingen, bis die zugrunde liegende
Idee zu Tage tritt: *Konkrete* Dinge und Konzepte sind natürlich
volatiler, spezifischer, willkürlicher und zahlreicher als
*abstrakte*. Die Komponentenstruktur eines Systems sollte dies einfach
widerspiegeln. Die allgemeine Logik, die physischen Artefakte des
Systems sowie seine funktionalen und technischen Konzepte sollten alle
Deckungsgleich sein.

Das SAP ist eng mit dem [SDP](#term-stable-dependencies-principle) verbunden. Ihre
Kombination ergibt eine allgemeinere und wohl tiefergehende Version
des [DIP](#term-dependency-inversion): Spezifische Konzepte hängen natürlich von
*abstrakteren* ab, da sie aus universaleren Bausteinen bestehen oder
davon abgeleitet sind. Und abhängige Konzepte sind natürlich
*spezifischer*, weil sie durch mehr Informationen als ihre
Abhängigkeiten definiert sind (vorausgesetzt es gibt [keine
Abhängigkeitszyklen](#term-acyclic-dependencies-principle)).

Kategorie: Entwurfsprinzip
