package com.falgun.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.falgun.Utilityy.base_class;


	public class loginpageLocators extends base_class{
		
		public  loginpageLocators() {
			
		PageFactory.initElements(driver, this);

			
		}

		@FindBy(how = How.ID, using = "loginusername")
		public WebElement UserName;
		
		@FindBy(how = How.ID, using = "loginpassword")
		public WebElement PassWord;
		@FindBy(how = How.XPATH, using = "//button[text()='Log in']")
		public WebElement LoginButton;


		
}
