package org.uniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GetMethod {

	public void getRequestMethod () throws UnirestException {

		HttpResponse<JsonNode>jsonRequest=Unirest.get("https://reqres.in/api/users?id=417").asJson();
		System.out.println("StatusCode : "+jsonRequest.getStatus());
		System.out.println("StatusCode : "+jsonRequest.getStatusText());
		System.out.println("StatusCode : "+jsonRequest.getBody());

	}
	public static void main (String []args) throws UnirestException{
		GetMethod get=new GetMethod();
		get.getRequestMethod();
	}
}
