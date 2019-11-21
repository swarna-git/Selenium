package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginLoadingPage;
import pageObjects.LoginPage;
import resources.BaseClass;

public class LoginSteps extends BaseClass{
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		driver=DriverIntialize();

         }

    @When("^user enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	LoginPage login=new LoginPage(driver);
   	  login.Email().sendKeys(username);
   	 login.Password().sendKeys(password);
   	  login.Submit().click();
         }

    @Then("^Verify the user is successfully logged in$")
    public void verify_the_user_is_successfully_logged_in() throws Throwable {
        }

    @And("^Navigate to \"([^\"]*)\" url$")
    public void navigate_to_something_url(String strArg1) throws Throwable {
    	driver.get(strArg1);
         }

    @And("^click on Login link on Home page to land on SIgn in Page$")
    public void click_on_login_link_on_home_page_to_land_on_sign_in_page() throws Throwable {
    	 LoginLoadingPage LLoad=new LoginLoadingPage(driver);
    	 if(LLoad.PoPUpsize()>0)
    	 {
    		LLoad.PopUp().click(); 
    	 }
    	 LLoad.LoginLoad().click();
          }

    @And("^Close browser$")
    public void close_browser() throws Throwable {
    	driver.quit();
        }

	
}
