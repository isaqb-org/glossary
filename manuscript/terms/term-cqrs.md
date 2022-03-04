### CQRS

(command query responsibility segregation): Separate the elements manipulating
(_command_) data from those just reading (_query_). This separation enables
different optimization strategies for reading and writing data (for example,
  it's much easier to cache data that's read-only than to cache data that's
  also altered.)

There's an interesting [eBook by Mark Nijhof](https://leanpub.com/cqrs)
on this subject.


