package org.uniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class PostMethod {
	public void postRequestMethod () throws UnirestException {
		HttpResponse<JsonNode>jsonResponse=Unirest.post("https://reqres.in/api/users").body("{\r\n"+"\"name\":\"morpheus2\",\r\n"+"\"job\":\"leader2\"\r\n"+"}").asJson();
		System.out.println("Status Code : "+jsonResponse.getStatus());
		System.out.println("Status Message : "+jsonResponse.getStatusText());
		JsonNode body = jsonResponse.getBody();
		System.out.println(body);

	}


	public static void main (String []args) throws UnirestException {
		PostMethod post=new PostMethod();
		post.postRequestMethod ();
	}
}
