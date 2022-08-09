package org.rest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class SimpleSerialization {
	public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification requestSpecification = RestAssured.given();
	requestSpecification.header("content-type", "application/json");
	PayloadPOJO pay=new PayloadPOJO("Siddharth","IPS");
	requestSpecification.body(pay);
	Response response = requestSpecification.request(Method.POST,"/api/users");
	System.out.println(response.getStatusCode());
	System.out.println(response.getBody().asPrettyString());
	}
}