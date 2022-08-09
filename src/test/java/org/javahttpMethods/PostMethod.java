package org.javahttpMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostMethod {

	public void postMethodExample() throws IOException {
		URL url=new URL ("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Connection-Type","application/json");
		connection.setDoOutput(true);
		
		String jsonBody="{\r\n" + 
				"    \"name\": \"Siddharth\",\r\n" + 
				"    \"job\": \"Baby\"\r\n" + 
				"}";
		

	byte[]inputJson=jsonBody.getBytes();
	OutputStream output=connection.getOutputStream();
	output.write(inputJson);
	System.out.println("ResponseCode : "+connection.getResponseCode());
	System.out.println("ResponseMessage : "+connection.getResponseMessage());

	InputStream inputStream=connection.getInputStream();
	InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
	BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
	String line;
	StringBuffer buffer=new StringBuffer();
	while((line=bufferedReader.readLine())!=null) {
		buffer.append(line);
	}
	System.out.println(buffer);
	}
	public static void main (String []args) throws IOException {
		PostMethod post =new PostMethod();
		post.postMethodExample();
	}
}








