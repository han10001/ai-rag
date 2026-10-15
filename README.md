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

Before running, copy `app/src/main/resources/application-dev-example.yml` to `app/src/main/resources/application-dev.yml` and update the Ollama and Redis connection settings for your environment.

The local `application-dev.yml` file is excluded from Git. Keep real server addresses, passwords, and API keys out of the example configuration.

## Status

This project is under active development. External AI, database, and Redis services are not configured by default.

## License

Licensed under the [Apache License 2.0](LICENSE).
