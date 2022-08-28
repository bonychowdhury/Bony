package com.falgun.action;

import com.falgun.Utilityy.base_class;
import com.falgun.locator.loginpageLocators;

public class loginpageActions extends base_class {
	loginpageLocators LoginpageLocators = new loginpageLocators();
	
	public void UserCredential (String u, String p) throws Exception {
		driver.manage().deleteAllCookies();
		LoginpageLocators.UserName.sendKeys(u);
		LoginpageLocators.PassWord.sendKeys(p);
		Thread.sleep(5000);
		LoginpageLocators.LoginButton.click();
		Thread.sleep(5000);
		
	}
			
}
