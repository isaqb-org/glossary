{pagebreak}

{#section-about-translations}
# Appendix D: About Translations

The [translation](#section-translations) tables are generated
by a small Groovy script from a JSON file,
located in the [public Github repository](https://github.com/isaqb-org/glossary) of this glossary.



## Format of Translation File  

The format is simple list with map entries, in file `translations/isaqb-terms-translated.json`.

{lang="JSON",linenos=on}
~~~~~~~~
[
  { en: "Appropriateness",
    de: "Angemessenheit"
  },
  { en: "Architectural View",
    de: ["Architektursicht", "Sicht"]
  }
  // many more words...
]  
~~~~~~~~

If a single (English) term has multiple translations,
as in line 6, use a JSON list.

This file is internally converted to a Java `Map<String, List<String>>`.

From that, Leanpub-Markdown is generated, one table
per language, currently German ("de") and English ("en").


## Rules for Translation

1. English is the _master_ language, code "en".
2. Every entry needs to have an English term.
3. Every entry must have at least a single translation to another language,e.g. from en to de.
4. A term might have a list of translations
in other languages (e.g. en:Tradeoff translates
to de:[Kompromiss, Abwägung]
