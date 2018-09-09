package com.mindoula.stepdefinitions;


import org.openqa.selenium.WebDriver;

import com.mindoula.pages.LoginPage;
import com.mindoula.util.TestBase;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest extends TestBase{

	
	LoginPage loginPage = new LoginPage(driver);
	
	@Given("^User navigates to Login Page$")
	public void user_navigates_to_Login_Page() {
		
		//Initialization();
		
		addScreenshot();
	}

	@Then("^user enters login credentials$")
	public void user_enters_login_credentials() {
		loginPage.loginToSite(prop.getProperty("username"), prop.getProperty("password"));
	  addScreenshot();
	}
	
	@Then("^Validate error messages for input fields$")
	public void validate_error_messages_for_input_fields(){
		loginPage.valiateInvalidMessages();
	   addScreenshot();
	}
	
	@Then("^Verify labels in Login page$")
	public void verify_labels_in_Login_page() {
		addScreenshot();
	}

	@Then("^Validate invalid login$")
	public void validate_invalid_login()  {
		loginPage.validateInvalidLogin();
	  addScreenshot();
	}
}
