package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class AccountSuccessPage extends TestBase{
WebDriver driver;

@FindBy(xpath ="//div[@id='content']/h1[contains(text(),'Your Account ')]")
private WebElement accountSuccessPageHeading;
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String retrieveAccountSuccessfullyCreatedHeading() {
		return accountSuccessPageHeading.getText();
	}
	
}
