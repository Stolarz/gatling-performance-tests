package simulations;

import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.http;

public class BaseSimulation extends Simulation {

  HttpProtocolBuilder httpProtocol = http
      .baseUrl("http://localhost:5000") // healthcheck HTTP
      .wsBaseUrl("ws://localhost:8080") // WebSocket endpoint
      .acceptHeader("application/json")
      .userAgentHeader("Gatling-Gradle-Java21");
}
