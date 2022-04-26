{lang=en}
### CA

A **C**ertificate **Authority** issues digital certificates to a given subject
in a [PKI](#term-pki). Usually there is a trust established to this authority
which results in the same trust level to the issued certificates.

An example is the widely used TLS-PKI where every browser includes the
root-certificates of a defined list of CAs. These CAs then check the identity
of a given internet domain owner and digitally sign his certificate for the use
with [TLS](#term-tls).

Category: Security


