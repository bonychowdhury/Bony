package com.falgun.TestRunnerr;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.falgun.Utilityy.base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/test/resources/Featuress"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitions",tags= {"@Lap"})
public class testrunnerClass extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void startURL() {
	base_class test = new base_class();
	test.initBrowser();
	
	}
	
	@AfterTest
	public void closeURL() {
	base_class test = new base_class();
	test.driver.quit();
		
	}
}

