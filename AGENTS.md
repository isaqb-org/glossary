# Agent Guidelines for iSAQB® Glossary

This document provides coding guidelines and development workflows for AI agents working on the iSAQB® Software Architecture Glossary.

## Project Overview

This is a bilingual (EN/DE) glossary of software architecture terms maintained by iSAQB® e.V. The project uses:
- **AsciiDoc** for documentation markup
- **Groovy 4.0.24** for build automation and translation processing
- **Gradle** as the build system
- **Spock Framework 2.3** for testing

The glossary contains 285+ architecture terms with translations, published on Leanpub and planned for PDF/HTML distribution.

## Build Commands

### Prerequisites
```bash
# Clone with submodules (required!)
git clone https://github.com/isaqb-org/glossary.git --recursive

# Or initialize submodules if already cloned
git submodule update --init --recursive
```

### Main Build Tasks
```bash
# Build all documentation (EN + DE)
./gradle-tools/gradlew buildDocs

# Generate translation tables from JSON
./gradle-tools/gradlew generateTranslationTables

# Sort terms alphabetically
./gradle-tools/gradlew sortTermsAlphabetically

# Run all tests
./gradlew test

# Run a single test specification
./gradlew test --tests TranslationTableSpec

# Run a specific test method
./gradlew test --tests "TranslationTableSpec.can add single term"

# Clean build artifacts
./gradlew clean

# List all available tasks
./gradlew tasks --all
```

### Important Note
The `buildDocs` task depends on `generateTranslationTables` and `sortTermsAlphabetically`, which run automatically before documentation generation.

## Project Structure

```
glossary/
├── src/
│   ├── main/groovy/           # Source code
│   │   ├── Translator.groovy          # Translation table generator
│   │   └── TranslationTable.groovy    # Translation data model
│   └── test/groovy/           # Spock test specifications
│       └── TranslationTableSpec.groovy
├── docs/                      # AsciiDoc documentation source
│   ├── 0-preamble/           # Introduction, license, contributing
│   ├── 1-terms/              # Individual term definitions (A-Z)
│   ├── 2-translations/       # Generated translation tables
│   ├── 8-references/         # Bibliography
│   ├── 9-appendices/         # About section
│   └── config/               # AsciiDoc configuration
├── translations/
│   └── isaqb-terms-translated.json  # Source of truth for translations
├── scripts/                   # Additional Gradle scripts
├── build.gradle              # Main build configuration
└── gradle-tools/             # Git submodule (iSAQB build tools)
```

## Code Style Guidelines

### Groovy Code Style

#### Imports
- Group imports logically (Groovy stdlib, Java stdlib, third-party)
- No wildcard imports
- Alphabetically ordered within groups

```groovy
import groovy.json.JsonParserType
import groovy.json.JsonSlurper

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
```

#### Class Structure
- Class name starts with capital letter (PascalCase)
- No semicolons at end of statements
- Use `final` for constants and immutable fields
- Fields declared at top of class

```groovy
class TranslationTable {
    final String sourceLanguageCode
    final String targetLanguageCode
    
    Map<String, List<String>> terms
    
    TranslationTable(String sourceLang, String targetLang) {
        this.sourceLanguageCode = sourceLang
        this.targetLanguageCode = targetLang
        terms = new HashMap<String, ArrayList<String>>()
    }
}
```

#### Naming Conventions
- **Classes**: PascalCase (e.g., `TranslationTable`, `Translator`)
- **Methods**: camelCase (e.g., `translationTableToAsciiDoc`, `parseFile`)
- **Variables**: camelCase (e.g., `sourceLanguageCode`, `nrOfTerms`)
- **Constants**: UPPER_SNAKE_CASE (e.g., `SOURCE_FILEPATH`, `LANGUAGES`)
- **Test methods**: descriptive phrases with spaces (Spock style)

```groovy
def "can add single term"() { ... }
def "translation table is well-sorted"() { ... }
```

#### Types and Declarations
- Use explicit types for method parameters and return values when clarity is needed
- Groovy's `def` is acceptable for local variables when type is obvious
- Use generic types for collections

```groovy
// Explicit types preferred
void put(String source, List translations) { ... }
String termToAsciiDoc(String key) { ... }

// def acceptable for locals
def slurper = new JsonSlurper()
def terms = slurper.parse(file)
```

#### Error Handling
- Use assertions for validation (`assert` statements)
- Print error messages before aborting
- Call `System.exit(0)` for fatal errors
- Provide descriptive error messages

```groovy
if (term.en != null && term.en != "" && term.en.size() > 1) {
    return true
} else {
    errorMsg(term, "has no proper English (en:) source-term.")
}
```

#### Formatting
- 4 spaces for indentation (no tabs)
- Opening braces on same line
- Closing braces on new line
- Space after commas, around operators
- No space before opening parenthesis in method calls

```groovy
static TranslationTable build_EN_TranslationTable(List terms) {
    TranslationTable translationTable = new TranslationTable("en", "de")
    
    terms.each {
        String source = it.en
        translationTable.put(source, translations)
    }
    
    return translationTable
}
```

### AsciiDoc Guidelines

#### Term Files
- Each term is a separate `.adoc` file in `docs/1-terms/[A-Z]/`
- File naming: lowercase with hyphens (e.g., `adapter.adoc`, `building-block.adoc`)
- Must be explicitly included in corresponding `0-structure.adoc`
- Support both EN and DE versions using language conditionals

#### Personal Comments
Use AsciiDoc admonitions for author opinions:

```asciidoc
[NOTE]
====
Comment (Author Name)

Your personal perspective or additional context here.
====
```

## Translation System

### Translation JSON Format
File: `translations/isaqb-terms-translated.json`

```json
[
  {
    "en": "Appropriateness",
    "de": "Angemessenheit"
  },
  {
    "en": "Architectural View",
    "de": ["Architektursicht", "Sicht"]
  }
]
```

### Translation Rules
1. English (`en`) is the master language
2. Every entry MUST have an English term
3. Every entry MUST have at least one translation
4. Multiple translations use JSON arrays
5. Only `en` and `de` keys are currently supported
6. English term must differ from German translation (non-trivial)

### Validation
The `Translator.groovy` validates:
- JSON is a list of maps
- Each entry has `en` and `de` keys only
- English term is non-empty string
- German translation exists (string or list)
- Translation lists have 2+ entries
- No trivial translations (en == de)

## Testing

### Spock Framework
- Test files end with `Spec.groovy` (e.g., `TranslationTableSpec.groovy`)
- Use `setup()` for test initialization
- Use BDD-style test methods with descriptive names
- Follow given-when-then or expect pattern

```groovy
def "can add multiple translations for single word"() {
    when:
    translationTable.addWords("Tradeoff", ["Kompromiss", "Abwägung"])

    then:
    translationTable.terms.get("Tradeoff").size() == 2
    translationTable.terms.get("Tradeoff")[0] == "Kompromiss"
}
```

## Common Tasks

### Adding a New Term
1. Create `.adoc` file in appropriate `docs/1-terms/[Letter]/` directory
2. Add include directive to `docs/1-terms/[Letter]/0-structure.adoc`
3. Add translations to `translations/isaqb-terms-translated.json`
4. Run `./gradle-tools/gradlew generateTranslationTables`
5. Run `./gradle-tools/gradlew buildDocs` to verify

### Updating Translations
1. Edit `translations/isaqb-terms-translated.json`
2. Run `./gradle-tools/gradlew generateTranslationTables`
3. Verify generated files in `docs/2-translations/`

## CI/CD

GitHub Actions workflows:
- `build_main.yml` - Builds on main branch and release tags
- `build_pr.yml` - Builds and validates pull requests
- Uses shared workflows from `isaqb-org/github-workflows`

## License

All contributions are under Creative Commons Attribution 4.0 International License (CC-BY-4.0).
Royalties from Leanpub sales are donated to the Electronic Frontier Foundation (EFF).

## Additional Notes

- Always use `./gradle-tools/gradlew` (not local Gradle) for consistency
- Initialize submodules before first build
- Generated files have headers warning against manual edits
- The project uses JVM args for Java module compatibility (see `build.gradle`)
