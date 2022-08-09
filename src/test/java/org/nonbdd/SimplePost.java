package org.nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimplePost {
	@Test
	private void postSmaple() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification  requestSpecification=RestAssured.given();
		requestSpecification.header("Content-Type","application/json");
		requestSpecification.body("{\r\n" + 
				"    \"name\": \"Dinesh\",\r\n" + 
				"    \"job\": \"Tester\"\r\n" + 
				"}");
		Response response= requestSpecification.request(Method.POST,"/api/users");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());

	}

}