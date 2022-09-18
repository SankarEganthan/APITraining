package org.jsontraining;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3_ListUsers_Main {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\APITraining\\src\\test\\resources\\Task3_ListUsers.json");

		ObjectMapper objectMapper = new ObjectMapper();
		Task3_ListUsers_Page_2 readValue = objectMapper.readValue(file, Task3_ListUsers_Page_2.class);
		ArrayList<String> course = readValue.getCourse();
		for (String data : course) {
			System.out.println(data);
		}
	}
}
