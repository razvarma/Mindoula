package com.mindoula.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.ITestResult;

import com.mindoula.base.BasePage;
import com.mindoula.util.TestBase;

public class MembersPage extends BasePage {
	

	public MembersPage(WebDriver driver)
	{
		super(driver);
	}

	public void enterDataOnAddMembersPage(String fname, String mname, String lname, String email, String mobile, String dob, String gender, String race, String address, String home_phone, String office_phone) {
		// TODO Auto-generated method stub
		findElement("am_fname").sendKeys(fname);
		findElement("am_mname").sendKeys(mname);
		findElement("am_lname").sendKeys(lname);
		findElement("am_email").sendKeys(email);
		findElement("am_mobile").sendKeys(mobile);
		findElement("am_dob").sendKeys(dob);
		findElement("am_gender").click();
	//	driver.findElement(By.xpath(getElementPath("am_gender_dropdown").replace("$gender$", gender).substring(6))).click();
		
		findElement("am_race").click();
		/*WebElement raceVal = driver.findElement(By.xpath(getElementPath("am_race_dropdown").replace("$race$", race).substring(6)));
		raceVal.click();
		findElement("am_address").sendKeys(address);
		findElement("am_hphone").sendKeys(home_phone);
		findElement("am_ophone").sendKeys(office_phone);
		findElement("am_submit").click();*/
	}

}
