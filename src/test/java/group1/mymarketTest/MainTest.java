package group1.mymarketTest;

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

public class MainTest {
	
	

	@Test
	public void getMainPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		loginPage loginpage = new loginPage(driver);
		loginpage.goToPage();

//		after login

//		find search
		MainPage mainPage = loginpage.loginApp("tchlevan2@gmail.com", "Armaxsovs1112");
		Thread.sleep(8000);

		
		CataloguePage catPage = mainPage.startSearch();


		SingleProductPage singlePage = catPage.getFirstProduct();;
		
		singlePage.getNumber();

		
	}
		

	
	
}
