package com.mindoula.stepdefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mindoula.base.BasePage;
import com.mindoula.util.TestBase;
import com.mindoula.util.TestUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase  {
	

	
	@Before
	public void setUP() {
		init();
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			//addScreenshot(screenshotName);
		
		}
	}
	
	@After(order = 0)
	public void tearDown() {
		
		//driver.quit();
	}
}
