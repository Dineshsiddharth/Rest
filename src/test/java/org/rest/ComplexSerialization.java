package org.rest;
import java.util.ArrayList;
import java.util.List;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ComplexSerialization {
	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io";
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.header("content-type","application/json");
		Category category=new Category(100,"Siddharth");
		List<String>photoUrls=new ArrayList();
		photoUrls.add("Java");
		photoUrls.add("Selenium");
		photoUrls.add("Maven");
		photoUrls.add("Cucumber");
		Tags tags=new Tags(100,"JUnit");
		Tags tags1=new Tags(200,"TestNg");
		List<Tags>tagsObject=new ArrayList();
		tagsObject.add(tags);
		tagsObject.add(tags1);
		Root root=new Root(200, category,"IPS", photoUrls, tagsObject,"Active");
		requestSpecification.body(root);
		Response response = requestSpecification.request(Method.POST,"/v2/pet");
		System.out.println(response.getStatusCode());
	}
}
