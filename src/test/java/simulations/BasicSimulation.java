package simulations;

import io.gatling.javaapi.core.* ;
import io.gatling.javaapi.http.* ;

import static io.gatling.javaapi.core.CoreDsl.* ;
import static io.gatling.javaapi.http.HttpDsl.* ;

public class BasicSimulation extends BaseSimulation {

    HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://httpbin.org")
            .acceptHeader("application/json")
            .userAgentHeader("Gatling-Gradle-Java21");

    ScenarioBuilder scn = scenario("BasicScenario")
            .exec(http("GET /get").get("/get"))
            .pause(1);

    {
        setUp(scn.injectOpen(atOnceUsers(5))).protocols(httpProtocol);
    }
}
