package application;

import java.net.HttpURLConnection;

import org.junit.Test;

import play.mvc.Http.Response;
import play.test.FunctionalTest;

public class UnSecuredTest extends FunctionalTest {
	@Test
	public void testNoCheck(){
		Response response = GET("/UnSecuredController/noCheck");
		assertIsOk(response);
	}

	@Test
	public void testPermissionDenied(){
		Response response = GET("/UnSecuredController/permissionDenied");
		assertStatus(HttpURLConnection.HTTP_FORBIDDEN, response);
	}

}
