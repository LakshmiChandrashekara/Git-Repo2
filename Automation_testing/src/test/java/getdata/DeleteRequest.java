package getdata;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class DeleteRequest 
{
	public void deleteRequest() 
	{
		RequestSpecification request=RestAssured.given();
		Response response=request.delete("https://jsonplaceholder.typicode.com/posts/1");
		int code=response.getStatusCode();
		Assert.assertEquals(code,200);
	}
}
