{lang=en}
### Stable Dependencies Principle

A fundamental principle for designing the structure of software systems (also see [Package Principles](#term-package-principles)). It demands that frequently changing components depend on more stable ones.

Part of the volatility of a component is [expected](#term-common-closure-principle) and naturally implied by its particular responsibility.

But stability in this context is also a function of incoming and outgoing dependencies. A component that is heavily depended on by others is harder to change and condsidered to be more stable. A component that heavily depends on others has more reasons to change and is considered to be less stable.

So in regards to dependence, a component with many clients should not depend on one with many dependencies. A single component with both of these properties is also a red flag. Such a component has many reasons to change but is at the same time hard to change.

Original definitions of the SDP (like [Martin-2003](#ref-martin-2003)) involve a [metric *I* of instability](https://en.wikipedia.org/wiki/Software_package_metrics). Unfortunately, that metric doesn't capture intended/inherent volatility, transitive dependence or cases like the red flag mentioned above. But we value the idea of the SDP regardless of how it can be measured.

The SDP is closely related to the [SAP](#term-stable-abstractions-principle). Their combination amounts to a version of the [DIP](#term-dependency-inversion) (more on this under [SAP](#term-stable-abstractions-principle)).

Category: Design-Principle

