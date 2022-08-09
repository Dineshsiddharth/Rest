package org.rest;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class SimpleGet {
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestObject = RestAssured.given();
	    requestObject.queryParam("page","2");
	    Response response = requestObject.request(Method.GET,"/api/users");
	    String asString = response.getBody().asString();
	    System.out.println(asString);
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    String asPrettyString = response.getBody().asPrettyString();
	    System.out.println(asPrettyString);
	    int statusCode = response.getStatusCode();
	    System.out.println(statusCode);
	    Assert.assertEquals(statusCode, 200);
	    System.out.println("Successful Response");
	    
		
	}

}
