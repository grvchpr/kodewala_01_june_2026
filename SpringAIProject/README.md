# Spring AI Project

A minimal Spring Boot + Spring AI starter project using OpenAI.

## What’s included

- Spring Boot application skeleton
- Spring AI OpenAI starter
- A simple REST endpoint at `/api/chat`

## Configuration

By default, Spring AI is disabled so the app starts without credentials.

To enable OpenAI, set these environment variables:

```bash
export SPRING_AI_CHAT_MODEL=openai
export OPENAI_API_KEY=your-api-key
```

Optional model override can be set in `src/main/resources/application.properties`.

## Run

```bash
./mvnw spring-boot:run
```

## Try it

```bash
curl "http://localhost:8080/api/chat?message=Explain+Spring+AI+in+one+sentence"
```

If no API key is configured, the app will still start and return a friendly setup message from the endpoint.
