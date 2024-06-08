package abstractClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractWaits {
	WebDriver driver;

	public AbstractWaits(WebDriver driver) {
		this.driver = driver;
	}


	public void waitMilisecondsSleep(int mils) throws InterruptedException {
		Thread.sleep(mils);
	}
	
	public void waitForElementToAppear(By ByLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ByLocator));
	}
	
	public void waitForElementToDisappear(By ByLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ByLocator));
	}
	
//	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root svg")));
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#root svg")));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-col a")));

}
