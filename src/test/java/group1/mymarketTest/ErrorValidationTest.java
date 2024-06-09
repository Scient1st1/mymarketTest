package group1.mymarketTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import shared.BaseTest;

public class ErrorValidationTest extends BaseTest {

	public ErrorValidationTest() {
		
	}
	
	@Test
	public void wrongEmailOrPass() {
		MainPage mainPage = loginpage.loginApp("tchlevan2@gmail.com", "123456");
		loginpage.getErrorMsg();
		Assert.assertEquals("მომხმარებელი ან პაროლი არასწორია", loginpage.getErrorMsg());
		
	}

}
