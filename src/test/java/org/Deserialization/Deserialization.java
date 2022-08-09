package org.Deserialization;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deserialization {
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given();
		RequestSpecification pathParam = requestSpecification.pathParam("page","2");
		RequestSpecification header = requestSpecification.header("content-Type","application/jason");
		Response response = requestSpecification.request(Method.GET,"/api/users/{page}");
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
		Root root=new Root();
		Root as = response.as(Root.class);
		String first_name = as.getData().getFirst_name();
		System.out.println(first_name);
		String last_name = as.getData().getLast_name();
		System.out.println(last_name);
		String email = as.getData().getEmail();
		System.out.println(email);
	}

}
