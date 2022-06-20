# demo-sleuth-otel-app

Demonstration using Spring Sleuth with Open Telemetry Implementation. The Spring Sleuth dependency has a exporter that connects to a collector from Open Telemetry. The Jaeger is capable to consume data from this collector later.

## How to run?

    docker-compose up --build -d
    docker logs demo-sleuth-otel-app -f

## Example

    curl --location --request GET 'http://localhost:18888/test' \
    --header 'request-id: 123' \
    --header 'device-id: 321'

This app propagates the "request-id" header and also creates a tag with it (remote-fields). The "device-id" is not propagated but is also present as tag (local-fields). Both headers are present in the Slf4j’s MDC.