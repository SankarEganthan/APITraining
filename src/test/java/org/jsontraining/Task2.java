package org.jsontraining;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2 {
	public static void main(String[] args) throws IOException, ParseException {
FileReader fileReader = new FileReader("C:\\Users\\User\\eclipse-workspace\\APITraining\\src\\test\\resources\\Task2.json");
JSONParser jsonParser = new JSONParser();
Object parse = jsonParser.parse(fileReader);
JSONObject jsonObject = (JSONObject)parse;
Object pageObj = jsonObject.get("page");
System.out.println(pageObj);
Object object = jsonObject.get("data");
JSONArray jsonArray = (JSONArray)object;
for (int i = 0; i < jsonArray.size(); i++) {
Object object2 = jsonArray.get(i);
JSONObject jsonObject1 = (JSONObject)object2;
Object object3 = jsonObject1.get("id");
System.out.println(object3);
}
}
}
