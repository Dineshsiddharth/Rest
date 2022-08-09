package org.nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimplePut {
	
	@Test
	private void puttSmaple() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification  requestSpecification=RestAssured.given();
		requestSpecification.header("Content-Type","application/json");
		requestSpecification.body("{\r\n" + 
				"    \"name\": \"Siddharth\",\r\n" + 
				"    \"job\": \"Baby\"\r\n" + 
				"}");
		Response response= requestSpecification.request(Method.PUT,"/api/users/757");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());

	}

}
