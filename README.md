# AI RAG

An early-stage Retrieval-Augmented Generation (RAG) project built with Java, Spring Boot, and Spring AI.

## Modules

- `api`: shared API definitions.
- `app`: application assembly and runtime configuration.
- `trigger`: inbound adapters and application entry points.

## Requirements

- Java 17 or later
- Maven 3.9 or later

## Build

```bash
mvn clean verify
```

## Run

After building the project, run the executable application JAR:

```bash
java -jar app/target/ai-rag-knowledge-app.jar
```

## Configuration

Place application configuration in `app/src/main/resources`. Keep API keys and other secrets outside the repository and provide them through environment variables.

## Status

This project is under active development. External AI, database, and Redis services are not configured by default.

## License

Licensed under the [Apache License 2.0](LICENSE).
