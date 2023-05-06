package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{
	
	 WebDriver driver;
	 
	 
	@FindBy(id="input-email")
	@CacheLookup
	private WebElement emailField;
	
	
	@FindBy(id="input-password")
	@CacheLookup
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	private WebElement loginButton;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	@CacheLookup
	private WebElement WarningMessage;
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	public void enterEmailAddress(String emailText) {
		emailField.sendKeys(emailText);
	}
	public void enterPassword(String passwordText) {
		passwordField.sendKeys(passwordText);
	}
	
	public AccountPage clickOnLoginButton() {
		loginButton.click();
		return new AccountPage(driver);
	}
	public String getWarningMessageText() {
		return WarningMessage.getText();
	}
}


