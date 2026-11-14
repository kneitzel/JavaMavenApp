# Quick Start

Install JDK 25, set `JAVA_HOME` to that JDK, and check it with `./mvnw -v`. The wrapper supplies Maven; a separate Maven installation must be at least 3.9.11.

- Simply download a zip file of this project and unzip it somewhere on your computer
- open the pom.xml and change the settings at the start of the document to fit with your project

## How to use this project

### Clean up

To clean up the project, call
```./mvnw clean```

### build the application (Without building the application image)

To build the application, maven / the maven wrapper can be used. Simply do a
```./mvnw package```
to build the application.
(simply call mvnw instead of ./mvnw on windows!)

### Build the application Image (jpackage)

To build the image with jpackage, the profile image must be used:
```./mvnw -Dimage install```

### Build the native Image (GraalVM)

Set `JAVA_HOME` to GraalVM for JDK 25 and make sure `native-image` is available. Build the executable with the `native` profile:
```./mvnw -Dnative install```

### Build a fat jar file

You can build a fat jar file using the fatjar Image:
```./mvnw -Dfatjar package```

## Static code analysis results

The static code analysis is done during the build of the application. The results can be found in
- ./target/pmd.xml
- ./target/spotbugsXml.xml
