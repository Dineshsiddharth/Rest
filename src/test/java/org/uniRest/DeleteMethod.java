package org.uniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class DeleteMethod {
	public void deleteRequestMethod () throws UnirestException {
		HttpResponse<JsonNode>jsonResponse=Unirest.delete("https://reqres.in/api/users/2").asJson();
		System.out.println("Status Code : "+jsonResponse.getStatus());
		System.out.println("Status Message : "+jsonResponse.getStatusText());
		JsonNode body = jsonResponse.getBody();
		System.out.println(body);

	}


	public static void main (String []args) throws UnirestException {
		DeleteMethod delete=new DeleteMethod();
		delete.deleteRequestMethod ();
	}

}

