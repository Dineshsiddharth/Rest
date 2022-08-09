package org.uniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class PutMethod {
	public void putRequestMethod () throws UnirestException {
		HttpResponse<JsonNode>jsonResponse=Unirest.put("https://reqres.in/api/users/2").body("{\r\n"+"\"name\":\"mor\",\r\n"+"\"job\":\"leader2\"\r\n"+"}").asJson();
		System.out.println("Status Code : "+jsonResponse.getStatus());
		System.out.println("Status Message : "+jsonResponse.getStatusText());
		JsonNode body = jsonResponse.getBody();
		System.out.println(body);

	}


	public static void main (String []args) throws UnirestException {
		PutMethod put=new PutMethod();
		put.putRequestMethod ();
	}

}
