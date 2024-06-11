package group1.mymarketTest;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import abstractClasses.AbstractWaits;
import shared.BaseTest;
import shared.DataReaderJson;

public class MainTest extends BaseTest{
	
	
	@Test(dataProvider="getData")
	public void getMainTest(HashMap <String,String> input) throws IOException, InterruptedException {


		MainPage mainPage = loginpage.loginApp(input.get("email"), input.get("password"));
		Thread.sleep(8000);

		CataloguePage catPage = mainPage.startSearch();

		SingleProductPage singlePage = catPage.getProduct(Integer.parseInt(input.get("productIndex")));
		
		singlePage.getNumber();

		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException{

		DataReaderJson dataReader = new DataReaderJson();
		String dir = System.getProperty("user.dir");
		List<HashMap<String,String>> data = dataReader.getJsonData(dir + "\\src\\test\\java\\shared\\data.json");
		
		return new Object[][] {{data.get(0)}, {data.get(1)}};
		
	}
		

	
	
}
