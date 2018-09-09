package com.mindoula.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindoula.base.BasePage;
import com.mindoula.util.TestBase;

public class MainPage extends BasePage{
	
	public MainPage(WebDriver driver)
	{
		super(driver);
	}
	public void clickOnCreateButton(String btn) {
		//WebElement createBtn = driver.findElement(By.xpath("//div[@id='page_header_actions']//page-actionables//button[@id='ce_action_button']"));
			
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		  
		((JavascriptExecutor) driver).executeScript(js, findElement(btn));
		 
		findElement(btn).click();
	}
	
	public  MainPage getMainPage()
	{
		return new MainPage(driver);
	}
}
