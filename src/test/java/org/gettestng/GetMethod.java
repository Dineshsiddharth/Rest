package org.gettestng;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class GetMethod {
	        
	
	@Test
	private void getRequestExample() {
	
		get("https://reqres.in/api/users/2").asPrettyString();
		
	
		
		
		
		
		
		
	}
	

}
