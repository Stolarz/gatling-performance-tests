package pages;

import io.gatling.javaapi.core.ChainBuilder;
import static io.gatling.javaapi.http.HttpDsl.*;

import static io.gatling.javaapi.core.CoreDsl.*;

public class HealthCheckEndpoint {

  public ChainBuilder healthCheckPayload() {
    return exec(
        http("HealthCheck")
            .get("/health")
            .check(status().is(200))
            .check(jsonPath("$.status").is("ok"))
    );
  }
}
