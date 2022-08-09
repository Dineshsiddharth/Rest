package org.serialization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import  static io.restassured.RestAssured.*;


public class Serialization {
	
	
	@Test
	private void serialization() {
		Map<String,Object>jsonBody=new HashMap<String,Object > ();
		
		List<String>skills=new ArrayList<String>();
		skills.add("Java");
		skills.add("Selenium");
		skills.add("Maven");
		skills.add("TestNg");

		jsonBody.put("First Name", "DineshKumar");
		jsonBody.put("Last Name", "S");
		jsonBody.put("email", "dkdr@gmail.com");
		jsonBody.put("skills",skills);
		
		
		given()
		       .baseUri("https://reqres.in")
		       .header("Content-Type","application/json")
		       .body(jsonBody)
		       .log()
		       .all()
	    .when()
	           .post("/api/user")
	   .then()
	          .log()
	          .all();
	}
}
