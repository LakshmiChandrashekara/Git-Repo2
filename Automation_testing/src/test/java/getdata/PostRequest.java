package getdata;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class PostRequest 
{
	public void postRequest() 
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json=new JSONObject();
		json.put("userId", "EN78");
		json.put("id", 1);
		json.put("title","sunset");
		json.put("body","sun set");
		request.body(json.toJSONString());
		Response response=request.post("https://jsonplaceholder.typicode.com/posts");
		int code=response.getStatusCode();
		Assert.assertEquals(code,200);
	}

}

