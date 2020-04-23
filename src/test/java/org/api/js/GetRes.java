package org.api.js;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;
public class GetRes {

@Test
public void verifyStatusCode() throws ParseException {
	System.out.println("hhhh");
	Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	ResponseBody body = res.getBody();
	String str = body.asString();
	JSONParser p = new JSONParser();
	Object obj = p.parse(str);
	JSONObject jObj = (JSONObject) obj;
	Object total = jObj.get("total");
	String s = (String)total;
	System.out.println(s);
	
	JSONObject o = (JSONObject)obj;
	Object data = o.get("data");
	JSONArray arr = (JSONArray)data;
	Object ref = arr.get(0);
	JSONObject val = (JSONObject)ref;
	System.out.println(val.get("first_name"));
}
}	
	
/*	
	int t = Integer.parseInt(s);
	System.out.println(t);
	//Assert.assertEquals("verify total", 12,total);
	Object fName = jObj.get("Michael");
	String f = (String)fName;
	System.out.println(fName);
	//Assert.assertEquals("verify firstname", "Michael",fName);
	Object email = jObj.get("lindsay.ferguson@reqres.in");
	String e = (String)email;
	System.out.println(email);
	//Assert.assertEquals("verify mail", "lindsay.ferguson@reqres.in",email);
	Object lName = jObj.get("Funke");
	String l = (String)lName;
	System.out.println(lName);
	//Assert.assertEquals("verify lastname", "Funke",lName);
	Object id = jObj.get("10");
	String i = (String)id;
	int id1 = Integer.parseInt(i);
	System.out.println(id);
	//Assert.assertEquals("verify id", 12,id);	
	}		

@Test
public void get1StatusCode() {
	Response res = RestAssured.get("https://reqres.in/api/users?page=2");//200
	int code = res.getStatusCode();
	System.out.println("Get 1 response code:"+code);
}
@Test
public void get2StatusCode() {
	Response res = RestAssured.get("https://reqres.in/api/users/2");//200
	int code = res.getStatusCode();
	System.out.println("Get 2 response code:"+code);

}
@Test
public void get3StatusCode() {
	Response res = RestAssured.get("https://reqres.in/api/users/23");//404
	int code = res.getStatusCode();
	System.out.println("Get 3 response code:"+code);
}
@Test
public void get4StatusCode() {
	Response res = RestAssured.get("https://reqres.in/api/unknown");//200
	int code = res.getStatusCode();
	System.out.println("Get 4 response code:"+code);
}
@Test
public void get5StatusCode() {
	Response res = RestAssured.get("https://reqres.in/api/unknown/2");//200
	int code = res.getStatusCode();
	System.out.println("Get 5 response code:"+code);

}
@Test
public void get6StatusCode() {
	Response res = RestAssured.get("https://reqres.in/api/unknown/23");//404
	int code = res.getStatusCode();
	System.out.println("Get 6 response code:"+code);

}

}
*/