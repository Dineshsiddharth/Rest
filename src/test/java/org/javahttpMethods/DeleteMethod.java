package org.javahttpMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeleteMethod {
	public void simpleGetMethod () throws IOException  {

		URL url=new URL("http://dummy.restapiexample.com/api/v1/delete/9556");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int statusCode=connection.getResponseCode();
		System.out.println("ResponseCode : "+statusCode);

		String message=connection.getResponseMessage();
		System.out.println("ResponseMessage : "+message);
		

		InputStream inputStream=connection.getInputStream();
		InputStreamReader inputReader=new InputStreamReader(inputStream);
		BufferedReader bufferReader=new BufferedReader(inputReader);
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main (String args[]) throws IOException {

		DeleteMethod get=new DeleteMethod();
		get.simpleGetMethod();


	}
}

