package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountSuccessPage;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterPageStepDef extends TestBase {
	WebDriver driver;
	HomePage homePage;
	private RegisterPage registerPage;
	private AccountSuccessPage accountSuccessPage;
	
	
	public RegisterPageStepDef() {
		super();
	}
	
	
	@Before
	public void setUp() {
	driver=	initializeBrowserAndOpenApplicationUrl(prop.getProperty("browser"));
	homePage =new HomePage(driver);
	}

	@Given("user navigates to rister account page")
	public void user_navigates_to_rister_account_page() {
		homePage.clickOnMyAccountLink();
		registerPage=homePage.clickOnRegisterOption();
		
		}
	@When("user enters below deatails")
	public void user_enters_below_deatails(DataTable datatable) {
	Map<String, String> dataMap = datatable.asMap(String.class,String.class);
		registerPage.enterFirstName(dataMap.get("firstName"));
		registerPage.enterLastName(dataMap.get("lastName"));
		registerPage.enterEmailAddress(dataMap.get("email"));
        registerPage.enterTelephone(dataMap.get("telephone"));
        registerPage.enterPassword(dataMap.get("password"));
        registerPage.enterConfirmPassword(dataMap.get("password"));
	}
	@And("user selects privacy policy checkbox")
	public void user_selects_privacy_policy_checkbox() {
		registerPage.selectPrivacyPolicy();
		
		}
	
	@And("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		accountSuccessPage=registerPage.clickOnContinueButton();
	}
	@Then("User account should be created")
	public void User_account_should_be_created() {
		Assert.assertEquals("Your Account Has Been Created!", accountSuccessPage.retrieveAccountSuccessfullyCreatedHeading());
	}
	
	@When("user selects new for Newsletter")
	public void user_selects_new_for_newsletter() {
	    registerPage.clickOnNewsLetterCheckBox();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}

