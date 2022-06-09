{lang=en}
### CQRS

(command query responsibility segregation): Separate the elements manipulating
(_command_) data from those just reading (_query_). This separation enables
different optimization strategies for reading and writing data (for example,
  it's much easier to cache data that's read-only than to cache data that's
  also altered.)

There's an interesting [eBook by Mark Nijhof](https://leanpub.com/cqrs)
on this subject.


{lang=de}
### CQRS

(Command-Query-Responsibility-Segregation): Trennt die Elemente, die
Daten manipulieren (*Befehl*) von denen, die Daten nur lesen
(*Abfrage*). Diese Trennung ermöglicht verschiedene
Optimierungsstrategien für das Lesen und Schreiben von Daten
(beispielsweise ist es wesentlich leichter, schreibgeschützte Daten zu
cachen, als Daten, die auch abgeändert werden können).

Es gibt ein interessantes [eBook von Mark Nijhof](https://leanpub.com/cqrs) zu diesem Thema.


