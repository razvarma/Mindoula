package com.mindoula.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindoula.base.BasePage;
import com.mindoula.util.TestBase;

public class LoginPage extends BasePage {
	 
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	//static WebElement username = driver.findElement(By.id("auth_form_username_text"));
	//static WebElement password = driver.findElement(By.id("auth_form_password_text"));
	//static WebElement loginBtn = driver.findElement(By.id("auth_form_add_btn_submit"));
	 Actions action = new Actions(driver);
	 private String username = "id:auth_form_username_text";
	 private String password = "id:auth_form_password_text";
	 private String loginBtn = "id:auth_form_add_btn_submit";

	public void loginToSite(String uname, String pwd) {
		
		//System.out.println(ScenarioDetails.class.getName());
		findElement(username).clear();
		findElement(password).clear();
		findElement(username).sendKeys(uname);
		findElement(password).sendKeys(pwd);
		findElement(loginBtn).click();
		
	}

	public void valiateInvalidMessages() {

		String emailLbl = driver.findElement(By.xpath(
				"//input[@id='auth_form_username_text']/parent::div/span/label/mat-label")).getText()
				+ driver.findElement(By.xpath(
						"//input[@id='auth_form_username_text']/parent::div/span/label/span"))
						.getText();
		//System.out.println("Email Label =" + emailLbl );
		if (!emailLbl.equals("Email *")) {
			System.out.println("Email Label Fail");
		}
		//username.sendKeys(" ");
		findElement(username).sendKeys(" ");
		action.sendKeys(Keys.TAB).build().perform();
		sleep(2);
		String emailErrMsg = driver.findElement(By.xpath("//mat-error[@id='auth_form_username_error']")).getText();
		System.out.println(emailErrMsg);
		if (!emailErrMsg.trim().equals("Please enter a valid email address")) {
			System.out.println("Email Error Message Fail");
		}
		String pwdLbl = driver.findElement(By.xpath("//input[@id='auth_form_password_text']/parent::div/span/label/mat-label")).getText()
				+ driver.findElement(By.xpath("//input[@id='auth_form_password_text']/parent::div/span/label/span")).getText();
		if (!pwdLbl.equals("Password *")) {
			System.out.println("Password Label Fail");
		}
		//username.sendKeys(" ");
		findElement(username).sendKeys(" ");
		action.sendKeys(Keys.TAB).build().perform();
		sleep(2);
		String pwdErrMsg = driver.findElement(By.xpath("//mat-error[@id='auth_form_password_error']")).getText();
		System.out.println(pwdErrMsg);
		if (!pwdErrMsg.trim().equals("Required and must be 8 character length")) {
			System.out.println("Password Error Message Fail");
		}

	}

	public void validateInvalidLogin() {
		findElement(username).sendKeys("test@test.com");
		findElement(password).sendKeys("123456789");
		findElement(loginBtn).click();
	//	username.sendKeys("test@test.com");
	//	password.sendKeys("123456789");
	//	loginBtn.click();
		String errMsg = driver.findElement(By.xpath("//span[@id='auth_form_add_error_message']")).getText();
		if (!errMsg.trim().equals("Invalid email or password.")) {
			System.out.println("Incorrect Error Message Fail");
		}
	}
}
