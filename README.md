# Java Maven Project

Example Maven Project for a Java Application.

**Update**: Added reporting to create a site (html documentation of project)

This project includes:
- Lombok to reduce boilerplate code
- static code analysis with PMD and spotbugs
- Creation of a self-contained app image (jpackage)
- Creation of native binary (GraalVM)

Verified on macOS (Apple Silicon) with OpenJDK 25.0.5 and the Maven wrapper.

## Requirements

Install JDK 25 and point `JAVA_HOME` at it. Run `./mvnw -v` to confirm Maven is using JDK 25. The wrapper supplies Maven; if you use your own installation, use Maven 3.9.11 or later.

Use GraalVM for JDK 25 with `native-image` when building the optional native executable.

## Documentation

- **[Documentation in English](documentation/en/_Index.md)**
- **[Dokumentation in Deutsch](documentation/de/_Index.md)**

**Important: ChatGPT was utilized to generate the documentation based on
predefined content specifications, as it represents the fastest way to produce
comprehensive documentation.**
