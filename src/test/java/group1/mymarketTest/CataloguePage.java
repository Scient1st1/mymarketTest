package group1.mymarketTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractClasses.AbstractWaits;

public class CataloguePage extends AbstractWaits{
	
	WebDriver driver;
	
	public CataloguePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".card-col a")
	List <WebElement> products;
	
	By waitBy = By.cssSelector("#root svg");
	By productsBy = By.cssSelector(".card-col a");
	public SingleProductPage getFirstProduct() {
		waitForElementToAppear(waitBy);
		waitForElementToDisappear(waitBy);
		waitForElementToAppear(productsBy);
		WebElement first = products.get(0);
		first.click();
		return new SingleProductPage(driver);
	}

}
