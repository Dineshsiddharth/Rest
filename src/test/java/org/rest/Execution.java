package org.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Execution extends BaseClass {
	
	@Test(priority=1)
	private void tc0() {
		requestObject("https://reqres.in/");
		quaryPrameter("page","2");
		responseObject("GET","api/users");
		printResponseBody();
		int statusCode = getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,200);
		System.out.println("Status Code is Verified");
	}
	
	@Test(priority=2)
	private void tc1() {
		requestObject("https://reqres.in/");
		addHeader("Content-Type","application/json");
		addpayload("job","IPS");
		addpayload("name","Siddharth");
		addpayload("Language", "English");
		responseObject("POST","api/users");
		printResponseBody();
		int statusCode = getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,201);
		System.out.println("Status Code is Verified");
	


	}
}
