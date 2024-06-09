package group1.mymarketTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractClasses.AbstractWaits;

public class loginPage extends AbstractWaits{
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[href*='login']")
	WebElement loginBtn;
	@FindBy(id="Email")
	WebElement userLogin;
	@FindBy(id="Password")
	WebElement userPass;
	@FindBy(xpath="//button[contains(text(), 'შესვლა')]")
	WebElement profileLoginBtn; 
	@FindBy(id="input-error-Password")
	WebElement errorMsg;
	
	public MainPage loginApp(String email, String password) {
		loginBtn.click();
		userLogin.sendKeys(email);
		userPass.sendKeys(password);
		profileLoginBtn.click();
		return new MainPage(driver);	
	}
	
	public void goToPage() {
		driver.get("https://www.mymarket.ge/ka/");
	}
	
	public String getErrorMsg() {
		waitForWebElementToAppear(errorMsg);
		return errorMsg.getText();
	}

}
