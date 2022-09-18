package org.jsontraining;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader("C:\\Users\\User\\eclipse-workspace\\APITraining\\src\\test\\resources\\Task1.json");
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject)obj;
		Object dataObj = jsonObject.get("data");
		JSONObject jsonObject2 = (JSONObject)dataObj;
		Object idObj = jsonObject2.get("id");
		Object emailObj = jsonObject2.get("email");
		Object firstNameObj = jsonObject2.get("first_name");
		Object lastNameObj = jsonObject2.get("last_name");
		Object avatarObj = jsonObject2.get("avatar");
		System.out.println(idObj);
		System.out.println(emailObj);
		System.out.println(firstNameObj);
		System.out.println(lastNameObj);
		System.out.println(avatarObj);
		
		Object supportObj = jsonObject.get("support");
		JSONObject jsonObject3 = (JSONObject)supportObj;
		Object urlObj = jsonObject3.get("url");
		Object textObj = jsonObject3.get("text");
		System.out.println(urlObj);
		System.out.println(textObj);
	}
}
