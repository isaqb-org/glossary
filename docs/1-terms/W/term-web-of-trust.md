// tag::EN[]
### Web of Trust

Since a single [CA](#term-ca) could be an easy target for an attacker the web
of trust delegates the establishment of trust to the user. Each user decides
which other users proof of identity he trusts, usually by verifying a
fingerprint of a given key. This trust is expressed by signing the key of the
other user who can then publish it with the additional signature. A third user
can then verify this signature and decide to trust the identity or not.

The email encryption PGP is an example for a [PKI](#term-pki) based on a web of trust.

Category: Security


// end::EN[]

// tag::DE[]
### Netz des Vertrauens / Web of Trust

Da eine einzelne [CA](#term-ca) ein leichtes Ziel für einen
Angreifer sein könnte, delegiert ein Netz des Vertrauens die
Begründung des Vertrauens an den Benutzer. Jeder Benutzer entscheidet,
in der Regel durch Überprüfung eines Fingerprints eines Schlüssels,
welchem Identitätsnachweis anderer Nutzer er vertraut. Dieses
Vertrauen wird durch die Signatur des Schlüssels des anderen
Benutzers, der ihn dann mit der zusätzlichen Signatur veröffentlichen
kann, ausgedrückt. Ein dritter Benutzer kann dann diese Signatur
überprüfen und entscheiden, ob er der Identität vertraut oder nicht.

Die E-Mail-Verschlüsselung PGP ist ein Beispiel für eine auf einem
Netz des Vertrauens basierende [PKI](#term-pki). 

Kategorie: Sicherheit


