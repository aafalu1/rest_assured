package com.rest.assured.create;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.PrintStream;

public class CreateBodyRequest {


    @Test
    public void creareBookingTest() {
/*
"firstname": "Susan",
    "lastname": "Jackson",
    "totalprice": 982,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2019-02-03",
        "checkout": "2021-07-03"
 */
//        JSONObject body = new JSONObject();
//        JSONObject dates = new JSONObject();
//        body.put("firstname", "Ramesh");
//        body.put("lastname", "Aadhikari");
//        body.put("totalprice", 200);
//        body.put("depositpaid", false);
//        dates.put("checkin", "2023-01-10");
//        dates.put("checkout", "2023-01-12");
//        body.put("bookingdates", dates);
//        body.put("additionalneeds", "vegan lunch");
//
//        Response response = RestAssured.given().contentType(ContentType.JSON).
//                body(body.toString())
//                .post("https://restful-booker.herokuapp.com/booking/");
//        response.print();
        Response response1 = RestAssured.get("https://restful-booker.herokuapp.com/booking/6082", new Object[0]);
        response1.print();
        Assert.assertEquals(response1.getStatusCode(), 200, "status code did not match");
        System.out.println(response1.jsonPath().getString("firstname"));
        System.out.println(response1.jsonPath().getString("lastname"));
        System.out.println(response1.jsonPath().getInt("totalprice"));
    }
}
