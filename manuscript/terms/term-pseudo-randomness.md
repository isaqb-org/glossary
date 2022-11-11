 // tag::EN[]
### Pseudo-Randomness

Often used in conjunction with pseudo-random-number-generators. Gathering
randomness with a high [entropy](#term-entropy) is resource intensive and
usually not required by many applications, cryptography left aside.
To address this issue pseudo-random-generators are initialized with a seed of
data and create random values based on this seed. The data will be generated
by random, but will always be the same if the generator is initialized with an
identical seed. This is called pseudo-randomness and is less performance
intensive.

Category: Security

// end::EN[]

// tag::DE[]
### Pseudo-Zufälligkeit

Häufig in Verbindung mit Pseudozufallszahlengeneratoren verwendet. Die
Erzeugung von Zufälligkeit mit hoher [Entropie](#term-entropy) ist
ressourcenintensiv und, abgesehen von Kryptographie, nicht für viele
Anwendungen erforderlich. Zur Behebung dieses Problems werden
Pseudozufallszahlengeneratoren mit einen Daten-Startwert initialisiert
und erzeugen basierend auf diesem Startwert zufällige Werte. Die Daten
werden zufällig erzeugt, aber sind immer gleich, wenn der Generator
mit dem gleichen Startwert initialisiert wird. Dies wird als
Pseudo-Zufälligkeit bezeichnet und ist weniger leistungsintensiv.

Kategorie: Sicherheit
