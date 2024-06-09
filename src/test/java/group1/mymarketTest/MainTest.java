package group1.mymarketTest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import abstractClasses.AbstractWaits;
import shared.BaseTest;

public class MainTest extends BaseTest{
	
	

	@Test
	public void getMainTest() throws InterruptedException, IOException {
		
//		loginPage loginpage = launchApp();
		
//		after login

//		find search
		MainPage mainPage = loginpage.loginApp("tchlevan2@gmail.com", "Armaxsovs1112");
		Thread.sleep(8000);

		
		CataloguePage catPage = mainPage.startSearch();


		SingleProductPage singlePage = catPage.getFirstProduct();;
		
		singlePage.getNumber();

		
	}
		

	
	
}
