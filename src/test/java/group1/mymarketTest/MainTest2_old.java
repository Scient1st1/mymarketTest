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

public class MainTest2_old {
	
	@Test
	public void getMainPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mymarket.ge/ka/");
		loginPage loginpage = new loginPage(driver);
		WebElement loginBtn = driver.findElement(By.cssSelector("[href*='login']"));
		loginBtn.click();
		WebElement userLogin = driver.findElement(By.id("Email"));
		WebElement userPass = driver.findElement(By.id("Password"));
		WebElement profileLoginBtn = driver.findElement(By.xpath("//button[contains(text(), 'შესვლა')]"));
		userLogin.sendKeys("tchlevan2@gmail.com");
		userPass.sendKeys("Armaxsovs1112");
		profileLoginBtn.click();
		
//		after login
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement agreeTerms = driver.findElement(By.cssSelector("[id=\"headlessui-dialog-panel-:ri:\"] div div button:nth-child(2)"));
//		wait.until(ExpectedConditions.visibilityOf(agreeTerms));
//		agreeTerms.click();
		
//		find search
		Thread.sleep(8000);
		WebElement search = driver.findElement(By.xpath("//*[text()=\"ძებნა\"]"));
		search.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root svg")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#root svg")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-col a")));
		List <WebElement> products = driver.findElements(By.cssSelector(".card-col a"));
		System.out.println(products);
		WebElement first = products.get(0);
		first.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='d-flex align-items-center show-number p-8px p-lg-12px']")));
		WebElement showNumber = driver.findElement(By.xpath("//div[@class='d-flex align-items-center show-number p-8px p-lg-12px']"));
		showNumber.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".opacity-50")));
		String number = showNumber.findElement(By.cssSelector(".text-dark-gray")).getText();
		System.out.println(number);
	}
		

	
	
}
