package shared;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import group1.mymarketTest.loginPage;

public class BaseTest {

	public BaseTest() {

	}

	public WebDriver driver;
	public loginPage loginpage;
	public WebDriver initilizeDriver() throws IOException {

		Properties prop = new Properties();
		String userDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(userDir + "\\src\\test\\java\\shared\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	
	@BeforeMethod
	public loginPage launchApp() throws IOException {
		driver = initilizeDriver();
		loginpage = new loginPage(driver);
		loginpage.goToPage();
		return loginpage;
	}
	@AfterMethod
	public void shutD() {
		driver.close();
	}
}
