package org.bddstyle;

import org.testng.annotations.Test;
import  static io.restassured.RestAssured.*;

public class PostMethod {
	
	@Test
	private void postSimple() {
	
		given()
		          .baseUri("https://reqres.in")
		          .header("Content-Type","application/json")
		          .body("{\r\n" + 
		          		"    \"name\": \"Rubi\",\r\n" + 
		          		"    \"job\": \"Begginer\"\r\n" + 
		          		"}")
		.when()
		          .post("/api/users")
		          .prettyPrint();
	}

}


