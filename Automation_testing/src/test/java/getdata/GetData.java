package getdata;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData 
{
	@Test
	public void testResponseCode()
	{
		Response response=RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
		int code = response.getStatusCode();
		System.out.println("status code is"+code);
		Assert.assertEquals(code,200);
		String data = response.asString();
		System.out.println("Data is"+data);
		
	}
	
}
