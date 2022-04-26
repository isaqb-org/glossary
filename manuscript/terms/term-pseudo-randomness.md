{lang=en}
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


