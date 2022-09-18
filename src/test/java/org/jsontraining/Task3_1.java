package org.jsontraining;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3_1 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Task3.json");
		ObjectMapper objectMapper = new ObjectMapper();
		Employee readValue = objectMapper.readValue(file, Employee.class);
		Address address = readValue.getAddress();
		String streetName = address.getStreetName();
		System.out.println(streetName);
		
	}
}
