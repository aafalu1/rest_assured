package com.rest.assured.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BookingCode {

    @Test
    public void getBookingCode(){
        Response response= RestAssured.get("https://restful-booker.herokuapp.com/booking");
        response.print();
        Assert.assertEquals(response.getStatusCode(), 200, "status code did not match");
        List<Integer> bookingIds=response.jsonPath().getList("bookingid");
        System.out.println(bookingIds.size());
       Assert.assertTrue(!bookingIds.isEmpty(), "list is empty");
    }
}
