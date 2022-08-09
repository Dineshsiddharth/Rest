package org.bddstyle;

import java.io.File;

import org.testng.annotations.Test;
import  static io.restassured.RestAssured.*;

public class PostFromExternalFile {
	
	
	@Test
	private void postfromExternal() {
		
		File jsonFile=new File("post.json");
		
		given()
		       .baseUri("https://reqres.in")
		       .header("Content-Type","application/json")
		       .body(jsonFile)
		.when()
		       .post("/api/users")
		       .prettyPrint();
	
	}

}
