package com.falgun.locator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.falgun.Utilityy.base_class;

public class homepageLocators extends base_class {
	
public  homepageLocators() {
	
PageFactory.initElements(driver, this);

	
}

  @FindBy(how = How.ID, using = "login2")
  public WebElement LoginLink;
  
  @FindBy(how = How.ID, using = "itemc")
  public WebElement LaptopLink;
  
  @FindBy(how = How.LINK_TEXT, using = "Sony vaio i5")
  public WebElement SONYVAIOI5;
 
  @FindBy(how = How.LINK_TEXT, using = "About us")
  public WebElement aboutus;
  
  @FindBy(how = How.ID, using = "example-video")
  public WebElement playvdo;
 
  @FindBy(how = How.ID, using = "example-video_html5_api")
  public WebElement abvdo;
  
}
