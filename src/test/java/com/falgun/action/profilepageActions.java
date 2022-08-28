package com.falgun.action;

import org.testng.Assert;

import com.falgun.Utilityy.base_class;
import com.falgun.locator.profilepageLocators;


public class profilepageActions extends base_class {

	profilepageLocators ProfilepageLocators = new profilepageLocators();
	public void Verifyuserloginsucessfullyprofilepage () throws Exception {
		boolean profilepage = ProfilepageLocators.UserProfile.isDisplayed();
		Assert.assertTrue(profilepage);
		Thread.sleep(3000);
		
	}
	
	public void Userclicklogoutlink() {
		ProfilepageLocators.logout.click();	
	}
	public void verifylogout() {
		boolean profile = ProfilepageLocators.UserProfile.isDisplayed();
		Assert.assertFalse(profile);
				
	}
	
	
}
