package org.api.js;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import groovy.json.JsonParser;


public class JsonObj {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader("D:\\Tamizhbharathi\\Cucumber_Workspace\\ApiTesting\\src\\test\\resources\\JsonFiles\\input.json");
		JSONParser p = new JSONParser();
		Object obj = p.parse(f);
		JSONObject o = (JSONObject)obj;
		System.out.println(o.get("name"));
		System.out.println(o.get("email"));
		System.out.println(o.get("course"));
	}
	

}
