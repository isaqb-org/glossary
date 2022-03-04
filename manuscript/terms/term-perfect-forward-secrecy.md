### Perfect Forward Secrecy

Property of a cryptographic protocol were an attacker can't gain any
information about short-term session keys by compromising long-term keys.

Examples for protocols with perfect forward secrecy are TLS and OTR. If this
feature is enabled for [TLS](#term-tls) and an attacker gains access to a servers private
key, previously recorded communication sessions can still not be decrypted.

Category: Security

