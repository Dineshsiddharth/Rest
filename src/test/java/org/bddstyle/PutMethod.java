package org.bddstyle;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PutMethod {
	
	@Test
	private void putSimple() {
	
		given()
		          .baseUri("https://reqres.in")
		          .header("Content-Type","application/json")
		          .body("{\r\n" + 
		          		"    \"name\": \"Rubi\",\r\n" + 
		          		"    \"job\": \"HouseWife\"\r\n" + 
		          		"}")
		.when()
		          .put("/api/users/52")
		          .prettyPrint();
	}

}


