package org.jsontraining;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssured_Practice1 {
public static void main(String[] args) {
	RequestSpecification given = RestAssured.given();
	RequestSpecification header = given.header("Content-Type","application/json");
}
}
