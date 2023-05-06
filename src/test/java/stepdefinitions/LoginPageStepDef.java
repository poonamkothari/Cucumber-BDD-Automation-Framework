package stepdefinitions;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonUtils;

public class LoginPageStepDef extends TestBase{
	WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	private AccountPage accountPage;
	private CommonUtils commonUtils;
	
	
	
	public LoginPageStepDef() {
		super();
	}
	
	  @Before()
	  public void setUp() {
	  
	  driver=initializeBrowserAndOpenApplicationUrl(prop.getProperty("browser"));
	  homePage =new HomePage(driver);
	  
	  }
	
	@Given("user has navigated to login page")
	public void user_has_navigated_to_login_page() {

		homePage.clickOnMyAccountLink();
		loginPage=homePage.clickOnLoginOption();
	
		}
	@When("user enters valid email {string} into email field")
	public void user_enters_valid_email_into_email_field(String emailText) {
		
	    loginPage.enterEmailAddress(emailText);
	    }
	@And("user enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String passwordText) {
		 
	   loginPage.enterPassword(passwordText);
	}
	
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		 
	   accountPage=loginPage.clickOnLoginButton();
	}
	
	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		
	   Assert.assertTrue(accountPage.DisplayStatusOfEditYourAccountInformationLink()); 
	}
	
	@When("user enters invalid email into email field")
	public void user_enters_invalid_email_into_email_field() {
	    commonUtils=new CommonUtils();
	    loginPage.enterEmailAddress(commonUtils.getEmailWithTimeStamp());
		
	}
	
	
	@And("user enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {
		loginPage.enterPassword(invalidPasswordText);
	}

	
	@Then("user should get a warning message")
	public void user_should_get_a_warning_message() {
		
	Assert.assertTrue(loginPage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
	    
	}
	@When("user dont ener email into email field")
	public void user_dont_ener_email_into_email_field() {
		 
	   loginPage.enterEmailAddress("");
	}
	@And("user dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
		
	   loginPage.enterPassword("");
	}

	@After
	public void tearDown() {
		driver.quit();
		
	}

	

}
