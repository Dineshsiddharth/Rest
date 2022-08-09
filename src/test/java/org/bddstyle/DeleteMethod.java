package org.bddstyle;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteMethod {
	
	@Test
	private void deleteSimple() {
		
		given()
		      .baseUri("https://reqres.in/api")
		.when()
		      .delete("/users/2").getStatusCode();
		
	}
}
