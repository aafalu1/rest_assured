package com.rest.assured.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyBookingID {

    @Test
    public void getBookingTest(){
        Response response= RestAssured.get("https://restful-booker.herokuapp.com/booking/5");
        response.print();
        Assert.assertEquals(response.getStatusCode(), 200, "status code did not match");
        System.out.println("First Name : "+response.jsonPath().getString("firstname"));
        System.out.println("Last Name: " +response.jsonPath().getString("lastname"));
        System.out.println("Total Price : " +response.jsonPath().getInt("totalprice"));
        System.out.println("deposit paid : " +response.jsonPath().getBoolean("depositpaid"));
        System.out.println("Check In Date : " +response.jsonPath().getString("bookingdates.checkin"));
        System.out.println("Check Out Date : " +response.jsonPath().getString("bookingdates.checkout"));

    }
}
