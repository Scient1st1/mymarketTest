package group1.mymarketTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractClasses.AbstractWaits;

public class SingleProductPage extends AbstractWaits {
	WebDriver driver;
	public SingleProductPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='d-flex align-items-center show-number p-8px p-lg-12px']")
	WebElement showNumber;
	@FindBy(css=".text-dark-gray")
	WebElement number;
	By divsBy = By.xpath("//div[@class='d-flex align-items-center show-number p-8px p-lg-12px']");
	
	public void getNumber() {
		waitForElementToAppear(divsBy);
		showNumber.click();
		number.getText();
	}
	
//	WebElement showNumber = driver.findElement(By.xpath("//div[@class='d-flex align-items-center show-number p-8px p-lg-12px']"));
//	showNumber.click();
//	String number = showNumber.findElement(By.cssSelector(".text-dark-gray")).getText();

}
