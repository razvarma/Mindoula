package com.mindoula.stepdefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

//import org.openqa.selenium.By;

import com.mindoula.pages.CareExtendersPage;
import com.mindoula.pages.Header;
import com.mindoula.pages.MainPage;
//import com.mindoula.pages.Login;
import com.mindoula.util.TestBase;

import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CareExtendersSteps extends TestBase{

	Header header = new Header(driver);
	CareExtendersPage careExtendersPage = new CareExtendersPage(driver); 
	MainPage mainPage = new MainPage(driver);
	@Then("^user clicks on Mega Menu$")
	public void user_clicks_on_Mega_Menu(){
		 header.openMegaMenu();
	   addScreenshot();
	}

	@Then("^user clicks on careExtenders$")
	public void user_clicks_on_careExtenders(){
	  header.clickOnMegaMenuItem("careextenders");
	  sleep(5);
	  addScreenshot();
	}
	
	@Then("^click on Create button$")
	public void click_on_Create_button(){
		sleep(2);
		mainPage.clickOnCreateButton("ce_addCareExtender");
		//ce.clickOnCreateButton();
	    sleep(4);
	   addScreenshot();
	}
	
	@Then("^Verify data on CareExtenders$")
	public void verify_data_on_CareExtenders(DataTable arg1) {
		for(Map<String,String> data : arg1.asMaps(String.class, String.class)) {
					
			careExtendersPage.verifyDataOnCareExtendersPage(data.get("email"),data.get("name"),data.get("phone"),data.get("roles"),data.get("active"));
		}
	}


	@Then("^Enter data in CareExtenders Page$")
	public void enter_data_in_CareExtenders_Page(DataTable arg1) {
		
			//Reporter.log(s, level);
		//logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		for(Map<String,String> data : arg1.asMaps(String.class, String.class)) {
			
						//user_moves_to_new_deal_page();
			List<String> roles = new ArrayList<String>();
			if(data.get("Role_SuperAdmin").toUpperCase().equals("YES")) {
				roles.add("Super Admin");
			}
			if(data.get("Role_Admin").toUpperCase().equals("YES")) {
				roles.add("Administrator");
			}
			if(data.get("Role_ProgAdmin").toUpperCase().equals("YES")) {
				roles.add("Program Admin");
			}
			if(data.get("Role_ProgManager").toUpperCase().equals("YES")) {
				roles.add("Program Manager");
			}
			if(data.get("Role_CaseManager").toUpperCase().equals("YES")) {
				roles.add("Case Manager");
			}
			if(data.get("Role_Sych").toUpperCase().equals("YES")) {
				roles.add("Psychiatric Consultant");
			}
			
			careExtendersPage.enterDataOnCareExtendersPage(data.get("fname"), data.get("lname"), data.get("email"), data.get("mobile"),roles);
			
		}
		sleep(4);
	//	addScreenshot();
	}




}
