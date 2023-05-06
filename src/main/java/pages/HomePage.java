package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath ="//span[text()='My Account']")
 private WebElement myAccountDropDownMenu;
	
	@FindBy(linkText = "Register")
	private WebElement RegisterOption;
	
	@FindBy(linkText = "Login")
	private WebElement LoginOption;
	
	public void clickOnMyAccountLink() {
		myAccountDropDownMenu.click();
		
	}
	public LoginPage clickOnLoginOption() {
		LoginOption.click();
		return new LoginPage(driver);
	}
	public RegisterPage clickOnRegisterOption() {
		RegisterOption.click();
		return new RegisterPage(driver);
	}
	
	

	
	
	
}
