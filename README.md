# Gatling Java + Gradle example (Java 21)

This is a minimal ready-to-run Gatling project using **Gatling 3.14.3** and the official **Gradle plugin 3.14.3.8** configured for **Java 21**.

## Requirements
- JDK 21
- Gradle 8.6+ (or any compatible Gradle on your machine)
- Internet access to download dependencies

## Run
Run all simulations:
```bash
./gradlew gatlingRun
```

Run a single simulation (fully-qualified class name):
```bash
./gradlew gatlingRun --simulation simulations.BasicSimulation
```

Reports will be generated under `build/reports/gatling` (HTML).
