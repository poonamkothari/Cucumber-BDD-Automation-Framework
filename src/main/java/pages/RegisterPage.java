package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class RegisterPage extends TestBase {
	WebDriver driver;
	
	
	
	
	@FindBy(id="input-firstname")
    private WebElement firstnameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailAddressField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(name="agree")
	private WebElement PrivacyPolicycheckBoxField;
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement ContinueButtonField;
	
	@FindBy(xpath ="//input[@name='newsletter'][@value='1']")
	private WebElement RadioButtonField;
	
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String firstnameText) {
		  firstnameField.sendKeys(firstnameText); 
		  }
	
	public void enterLastName(String lastnameText) {
		lastNameField.sendKeys(lastnameText);
	}
	public void enterEmailAddress(String emailText) { 
		emailAddressField.sendKeys(emailText); 
		} 
		
	 public void enterTelephone(String telephoneText) {
		  telephoneField.sendKeys(telephoneText); 
		  } 
	 public void enterPassword(String passwordText) {
		  passwordField.sendKeys(passwordText);
	  } 
	 public void enterConfirmPassword(String confirmPasswordText) {
		  confirmPasswordField.sendKeys(confirmPasswordText); 
		  }
	 
	 public void selectPrivacyPolicy() {
		 PrivacyPolicycheckBoxField.click();
}
	 public AccountSuccessPage clickOnContinueButton() {
		 ContinueButtonField.click();
		 return new AccountSuccessPage(driver);
	 }
	 public void clickOnNewsLetterCheckBox() {
		 RadioButtonField.click();
	 }
}
