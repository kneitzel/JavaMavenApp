# Java Maven Project

Example Maven Project for a Java Application.

This project includes:
- Lombok to reduce boilerplate code
- Adding module-info for dependencies that are missing these.
- Unit Tests are run at build
- static code analysis with PMD and spotbugs
- Creation of image (JLink) and app-image (JPackage)
- Creation of native binary (GraalVM)

Create native executable with GraalVM use one of these:
- ./mvnw -PGraalVM package
- ./mvnw -DGraalVM package

Create image (JLink and JPackage):
- ./mvnw -PImage package
- ./mvnw -DImage package