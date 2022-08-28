package com.falgun.action;

import org.testng.Assert;

import com.falgun.Utilityy.base_class;
import com.falgun.locator.homepageLocators;

public class homepageActions extends base_class{

	homepageLocators HomepageLocators= new homepageLocators ();
	
	public void ClickLoginLink () {
	
		HomepageLocators.LoginLink.click();
	}
	
	public void clicklaptopslink() {
		HomepageLocators.LaptopLink.click();	
		
	}
	public void VerifyLaptopsdisplay() throws Exception {
		boolean laptop = HomepageLocators.SONYVAIOI5.isDisplayed();
		Assert.assertTrue(laptop);
		
	}
	
	public void clickAboutUslinkandvdoplaybutton() throws Exception {
		HomepageLocators.aboutus.click();
		Thread.sleep(5000);
		HomepageLocators.playvdo.click();
		Thread.sleep(5000);
		
	}
	public void VerifyAboutUsvdodisplay() {
		boolean vd = HomepageLocators.abvdo.isDisplayed();
		Assert.assertTrue(vd);
	}
	
		}
	

