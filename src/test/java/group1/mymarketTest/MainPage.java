package group1.mymarketTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractClasses.AbstractWaits;

public class MainPage extends AbstractWaits{

	
	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='ძებნა']")
	WebElement search;
	@FindBy(css="[name='searchValue']")
	WebElement searchInput;
	
	public CataloguePage startSearch(String prodName) throws InterruptedException {
		searchInput.sendKeys(prodName);
		search.click();
		return new CataloguePage(driver);
	}
	
}
