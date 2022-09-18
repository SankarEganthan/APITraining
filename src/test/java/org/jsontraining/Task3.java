package org.jsontraining;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3 extends Employee{
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
//		1. Mention the path of the json
		File file = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\Task3.json");
		
//		2. Create the object for Object mapper
		ObjectMapper mapper = new ObjectMapper();
		
//		3. Read values from json -> Pass the json file
		Employee e = mapper.readValue(file, Employee.class);
		String name = e.getName();
		System.out.println(name);
		
		String email = e.getEmail();
		System.out.println(email);
		
		long phoneNo = e.getPhoneNo();
		System.out.println(phoneNo);
		
	}

}
