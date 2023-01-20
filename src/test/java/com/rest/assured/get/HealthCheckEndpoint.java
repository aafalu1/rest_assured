package com.rest.assured.get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class HealthCheckEndpoint {

    @Test
    public void healthCheck() {
        given()
                .when()
                .get("https://restful-booker.herokuapp.com/ping")
                .then()
                .assertThat()
                .statusCode(201);
    }
}
