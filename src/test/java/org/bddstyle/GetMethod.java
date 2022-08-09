package org.bddstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetMethod {

	@Test
	private void getSimple() {
		RestAssured
		.given()
		          .baseUri("https://reqres.in")
		.when()
		          .get("/api/users?page=2")
		          .prettyPrint();
	}
}
