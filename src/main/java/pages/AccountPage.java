package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class AccountPage extends TestBase{

	WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Edit your account information")
	private WebElement editAccountLink;
	
	public boolean DisplayStatusOfEditYourAccountInformationLink() {
		return editAccountLink.isDisplayed();
	}
	
}
