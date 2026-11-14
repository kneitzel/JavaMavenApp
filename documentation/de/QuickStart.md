# Schnellstart

Installiere JDK 25, setze `JAVA_HOME` auf dieses JDK und prüfe es mit `./mvnw -v`. Der Wrapper stellt Maven bereit; eine separate Maven-Installation muss mindestens Version 3.9.11 haben.

- Lade einfach das Projekt als ZIP Datei von GitHub und entpacke es an einer 
Stelle Deiner Wahl auf dem Computer.
- Öffne die pom.xml und ändere die Einstellungen am Anfang des Dokumentes.

**Hinweis**: Im folgenden werden die Befehle für Unix artige Systeme / macos
angegeben. Unter Windows kannst Du am Anfang des Befehles das ./mvnw durch mvnw
ersetzen.

## Wie kannst Du das Projekt nutzen

### Projekt bereinigen

Um das Projekt zu bereinigen, kannst Du
```./mvnw clean```
aufrufen.

### Übersetzen der Anwendung (Ohne ein Image zur Weitergabe zu bauen)

Um die Anwendung zu übersetzen kannst Du aufrufen:
```./mvnw package```

### Bau des Application Images zur Weitergabe (JPackage)

Um das Image mit JPackage zu bauen, rufst du einfach Maven mit dem Profil Image und dem
Ziel install auf:
```./mvnw -Dimage install```

### Bau des native Images zur Weitergabe (GraalVM)

Setze `JAVA_HOME` auf GraalVM für JDK 25 und stelle sicher, dass `native-image` verfügbar ist. Baue das Programm mit dem Profil `native`:
```./mvnw -Dnative install```

## Bau einer fat jar Datei

Über das Profil `fatjar` lässt sich eine JAR-Datei mit allen Abhängigkeiten bauen.
```./mvnw -Dfatjar package```

## Ergebnisse der statischen Codeanalyse

Die Codeanalyse läuft automatisch beim Bau des Projektes und die Ergebnisse
finden sich in:
- ./target/pmd.xml
- ./target/spotbugsXml.xml
