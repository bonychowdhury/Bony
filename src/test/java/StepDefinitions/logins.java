package StepDefinitions;

import com.falgun.Utilityy.base_class;
import com.falgun.Utilityy.utilityyy;
import com.falgun.action.homepageActions;
import com.falgun.action.loginpageActions;
import com.falgun.action.profilepageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class logins extends base_class {
	homepageActions HomepageActions = new homepageActions();
	loginpageActions LoginpageActions = new loginpageActions();
	profilepageActions ProfilepageActions = new profilepageActions();
	
	@Given("^Launch \"([^\"]*)\" for demo$")
	public void launch_for_demo(String URL) throws Throwable {
		getURL(URL); 
		
		utilityyy.takescreenshot(driver, "Home Page");
	}

	@Then("^Click LoginLink$")
	public void click_LoginLink() throws Throwable {
		HomepageActions.ClickLoginLink();  
	}

	@Then("^Enter username and password and click Login Button$")
	public void enter_username_and_password_and_click_Login_Button() throws Throwable {
		
		LoginpageActions.UserCredential(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		utilityyy.takescreenshot(driver, "Login Page");
	}


	@Then("^Verify user login sucessfully profile page$")
	public void verify_user_login_sucessfully_profile_page() throws Throwable {
		ProfilepageActions.Verifyuserloginsucessfullyprofilepage();
		utilityyy.takescreenshot(driver, "Profile Page");
	}
	@Then("^User click logout link$")
	public void user_click_logout_link() throws Throwable {
		ProfilepageActions.Userclicklogoutlink();   
	}

	@Then("^Verify user logout sucessfully profile page$")
	public void verify_user_logout_sucessfully_profile_page() throws Throwable {
		ProfilepageActions.verifylogout();
		utilityyy.takescreenshot(driver, "Logout page");
	}
	@Then("^Enter username and click Login Button$")
	public void enter_username_and_click_Login_Button() throws Throwable {
		LoginpageActions.UserCredential(prop.getProperty("USERNAME"), "PA");
	}

	@Then("^Verify user login unsucessfull$")
	public void verify_user_login_unsucessfull() throws Throwable {
	driver.switchTo().alert().accept();
	utilityyy.takescreenshot(driver, "Wrong alert");
	}

}
