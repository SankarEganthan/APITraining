package com.api;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Sample extends BaseClass {

	@Test
	
	public void login() {
		// 1. Header
		addHeader("accept", "application/json");
		//2. Auth
		basicAuth("greenstechchennaiomr@gmail.com", "Apitesting@0000");
		//3. method type
		Response requestType = requestType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
		int statusCode = getStatusCode(requestType);
		System.out.println(statusCode);
		
		String responseBodyAsPrettyString = getResponseBodyAsPrettyString(response);
		System.out.println(responseBodyAsPrettyString);
	}

}
