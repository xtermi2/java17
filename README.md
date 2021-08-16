![Java CI](https://github.com/xtermi2/java17/workflows/Java%20CI/badge.svg)


# Schedule

- 2021/08/19		Final Release Candidate
- 2021/09/14		General Availability

# Java 17 Features

- [JEP 306:    Restore Always-Strict Floating-Point Semantics](https://openjdk.java.net/jeps/306)
    - Make floating-point operations consistently strict, rather than have both strict floating-point semantics (strictfp) and subtly different default floating-point semantics. This will restore the original floating-point semantics to the language and VM, matching the semantics before the introduction of strict and default floating-point modes in Java SE 1.2.
- [JEP 356:    Enhanced Pseudo-Random Number Generators](https://openjdk.java.net/jeps/356)
    - see example `MyRandomGenerator.java`
- [JEP 382:    New macOS Rendering Pipeline](https://openjdk.java.net/jeps/382)
    - Implement a Java 2D internal rendering pipeline for macOS using the Apple Metal API as alternative to the existing pipeline, which uses the deprecated Apple OpenGL API.
- [JEP 391:    macOS/AArch64 Port](https://openjdk.java.net/jeps/391)
    - Port the JDK to macOS/AArch64.
- [JEP 398:    Deprecate the Applet API for Removal](https://openjdk.java.net/jeps/398)
    - Deprecate the Applet API for removal. It is essentially irrelevant since all web-browser vendors have either removed support for Java browser plug-ins or announced plans to do so.
- [JEP 403:   Strongly Encapsulate JDK Internals](https://openjdk.java.net/jeps/403)
    - Strongly encapsulate all internal elements of the JDK, except for critical internal APIs such as sun.misc.Unsafe. It will no longer be possible to relax the strong encapsulation of internal elements via a single command-line option, as was possible in JDK 9 through JDK 16.
- [JEP 406:    Pattern Matching for switch (Preview)](https://openjdk.java.net/jeps/406)
    - see example `SwitchPatternMatching.java`
- [JEP 407:    Remove RMI Activation](https://openjdk.java.net/jeps/407)
    - Remove the Remote Method Invocation (RMI) Activation mechanism, while preserving the rest of RMI.
    - The RMI Activation mechanism is obsolete and disused. It was deprecated for removal by JEP 385 in Java SE 15. No comments were received in response to that deprecation.
- [JEP 409:    Sealed Classes](https://openjdk.java.net/jeps/409)
    - see example `Option.java` or `Shape.java`
- [JEP 410:    Remove the Experimental AOT and JIT Compiler](https://openjdk.java.net/jeps/410)
    - Remove the experimental Java-based ahead-of-time (AOT) and just-in-time (JIT) compiler. This compiler has seen little use since its introduction and the effort required to maintain it is significant. Retain the experimental Java-level JVM compiler interface (JVMCI) so that developers can continue to use externally-built versions of the compiler for JIT compilation.
    - These features were not included in the JDK 16 builds published by Oracle, and no one complained.
- [JEP 411:    Deprecate the Security Manager for Removal](https://openjdk.java.net/jeps/411)
    - Deprecate the Security Manager for removal in a future release. The Security Manager dates from Java 1.0. It has not been the primary means of securing client-side Java code for many years, and it has rarely been used to secure server-side code. To move Java forward, we intend to deprecate the Security Manager for removal in concert with the legacy Applet API (JEP 398).
- [JEP 412:    Foreign Function & Memory API (Incubator)](https://openjdk.java.net/jeps/412)
    - Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. Combination of 2 APIs introduced in previous JDKs:
    - Foreign-Memory Access API (incubator in 14, 15 and 16)
    - Foreign Linker API (incubator in 16)
    - see exaple `SortExternalOfHeap.java`
    - **TODO**
- [JEP 414:    Vector API (Second Incubator)](https://openjdk.java.net/jeps/414)
    - see example `Scalar.java`
    - update to first incubator: enhancements in response to feedback as well as performance improvements and other significant implementation enhancements.
- [JEP 415:    Context-Specific Deserialization Filters](https://openjdk.java.net/jeps/415)
    - Allow applications to configure context-specific and dynamically-selected deserialization filters via a JVM-wide filter factory that is invoked to select a filter for each individual deserialization operation.
    - **TODO**


##### Other References

- https://openjdk.java.net/projects/jdk/17/
- https://www.techgeeknext.com/java/java17-features