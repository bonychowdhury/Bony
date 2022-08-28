package StepDefinitions;

import com.falgun.Utilityy.base_class;
import com.falgun.Utilityy.utilityyy;
import com.falgun.action.homepageActions;

import cucumber.api.java.en.Then;

public class CategoriesAboutUs extends base_class {
	homepageActions HomepageActions = new homepageActions();
	
	
	@Then("^click laptopslink$")
	public void click_laptopslink() throws Throwable {
		HomepageActions.clicklaptopslink();  
	}

	@Then("^Verify Laptops display$")
	public void verify_Laptops_display() throws Throwable {
		HomepageActions.VerifyLaptopsdisplay();  
	}
	
	@Then("^click AboutUslink and vdo play button$")
	public void click_AboutUslink_and_vdo_play_button() throws Throwable {
		HomepageActions.clickAboutUslinkandvdoplaybutton();  
	}

	@Then("^Verify AboutUsvdo display$")
	public void verify_AboutUsvdo_display() throws Throwable {
		HomepageActions.VerifyAboutUsvdodisplay();	
		
	utilityyy.takescreenshot(driver, "About Us");
	}


}
