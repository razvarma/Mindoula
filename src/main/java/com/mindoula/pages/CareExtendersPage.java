package com.mindoula.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.ITestResult;

import com.mindoula.base.BasePage;
import com.mindoula.util.TestBase;
public class CareExtendersPage extends BasePage {
	
	public CareExtendersPage(WebDriver driver)
	{
		super(driver);
	}
	 private String ceefname = "id:ce_form_add_firstname_text";
	 private String ceelname = "id:ce_form_add_lastname_text";
	 private String ceeemail = "id:ce_form_add_email_text";
	 private String ceemobile = "id:ce_form_add_mobile_text";
	 private String ceesubBtn = "id:member_form_add_btn_submit";
	 
	 private String ce_name = "id:ce_list_table_row_name_$id$";
	 private String ce_email = "id:ce_list_table_row_email_$id$";
	 private String ce_mobile = "id:ce_list_table_row_mobile_$id$";
	 private String ce_active = "id:ce_list_table_row_active_$id$";
	 private String ce_roles = "xpath://td[@id='ce_list_table_row_roles_$id$']//span//label";
	 private String ce_email_for_id = "xpath://td[contains(@id,'ce_list_table_row_email') and text()='$id$']";
	public void enterDataOnCareExtendersPage(String firstName, String lastName, String EmailAddress,
			String MobileNumber, List<String> roles) {
		// System.out.println(roles.toString());
		findElement(ceefname).sendKeys(firstName);
		findElement(ceelname).sendKeys(lastName);
		findElement(ceeemail).sendKeys(EmailAddress);
		findElement(ceemobile).sendKeys(MobileNumber);
		for (String role : roles) {
			String rPath = "//span[@class='mat-checkbox-label' and contains(text(),'" + role
					+ "')]//preceding-sibling::div";
			// System.out.println(rPath);
			driver.findElement(By.xpath(rPath)).click();
		}
		findElement(ceesubBtn).click();
	}

	public void verifyDataOnCareExtendersPage(String searchEmail,String f_name,String f_phone,String f_roles,String f_active) {
		
		String rowId = getIdOfEmail(searchEmail);
		String name =findElementWithId(ce_name.replace("$id$", rowId)).getText();
		
		String mobile = findElementWithId(ce_mobile.replace("$id$", rowId)).getText();
		String active = findElementWithId(ce_active.replace("$id$", rowId)).getText();
		
		String roles = "";
		List<WebElement> eles = driver.findElements(By.id(ce_roles.replace("$id$", rowId).substring(6)));
		
		for(WebElement ele:eles){
			roles = roles + ele.getText();
		}
		
		compareValues("Name",name,f_name);
		compareValues("Phone",mobile,f_phone);
		compareValues("Roles(s)",roles,f_roles);
		compareValues("Active",active,f_active);
		
		// getElementPath("ce_name").replace("$id$", newChar);
}
	public String getIdOfEmail(String email) {
		String id = findElementWithXpath(ce_email_for_id.replace("$id$", email)).getAttribute("id")
				.split("_")[5];
		return id;
	}
}
