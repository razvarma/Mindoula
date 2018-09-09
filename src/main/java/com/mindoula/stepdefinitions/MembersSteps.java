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
import com.mindoula.pages.MembersPage;
//import com.mindoula.pages.Login;
import com.mindoula.util.TestBase;

import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MembersSteps extends TestBase {

MembersPage membersPage = new MembersPage(driver);
Header header = new Header(driver);
MainPage mainPage = new MainPage(driver);
	@Then("^user clicks on Members$")
	public void user_clicks_on_Members() {
		header.clickOnMegaMenuItem("members");
		sleep(5);
		addScreenshot();
	}

	@Then("^click on Add Member$")
	public void click_on_Add_Member() {
		sleep(2);
		mainPage.clickOnCreateButton("ml_addMember");
		sleep(4);
		addScreenshot();
	}

	@Then("^Enter data in Add Member Page$")
	public void enter_data_in_Add_Member_Page(DataTable arg1) {
		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {

			
			membersPage.enterDataOnAddMembersPage(data.get("fname"), data.get("mname"), data.get("lname"),
					data.get("email"),data.get("mobile"),data.get("dob"),data.get("gender"),data.get("race"),data.get("address"),data.get("home_phone"),data.get("office_phone"));
	}
		sleep(4);
		addScreenshot();

	}

}
