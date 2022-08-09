package org.rest;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	public static RequestSpecification requestSpecification;
	public static Response response;
	
	
	public static void  requestObject(String baseURI) {
		RestAssured.baseURI=baseURI;
		requestSpecification=RestAssured.given();
	}
	public static void quaryPrameter(String ParameterName,String ParameterValue) {
		requestSpecification=requestSpecification.queryParam(ParameterName, ParameterValue);
		}
	public static void pathParameter(String ParameterName,String ParameterValue ) {
		requestSpecification=requestSpecification.pathParam(ParameterName, ParameterValue);
	}
	public static void responseObject(String requestType,String resources) {
		if (requestType.equals("GET")) {
			response=requestSpecification.request(Method.GET,resources);
		}
		else if (requestType.equals("POST")) {
			response=requestSpecification.request(Method.POST,resources);
		}
		else if (requestType.equals("PUT")) {
			response=requestSpecification.request(Method.PUT,resources);
		}
		else  {
			response=requestSpecification.request(Method.DELETE,resources);
		}
	}
	
	public static void  printResponseBody() {
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);
	}
	public static int getStatusCode() {
		return response.getStatusCode();
	}
	public static void addHeader(String headerName,String headerValue) {
		requestSpecification=requestSpecification.header(headerName,headerValue);
	}
   public static void addpayload(String key,String value) {
	   JSONObject json=new JSONObject();
	   json.put(key,value);
	   requestSpecification=requestSpecification.body(json.toJSONString());   
   }
}
