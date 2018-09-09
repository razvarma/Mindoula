package com.mindoula.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindoula.base.BasePage;
import com.mindoula.util.TestBase;

public class Header extends BasePage{
	public Header(WebDriver driver)
	{
		super(driver);
	}

	//static WebElement menuIcon = driver.findElement(By.xpath("//mat-icon[@class='mat-icon material-icons' and contains(text(),'menu')]"));
	private String menuIcon = "xpath://mat-icon[@class='mat-icon material-icons' and contains(text(),'menu')]";
	public  void openMegaMenu() {
		//wait(menuIcon);
		sleep(4);
		//findElement("menuIcon").click();
		findElement(menuIcon).click();
		//menuIcon.click();
	}
	
	public void clickOnMegaMenuItem(String menuItem) {
		
		String menuItemXpath = "//a[@id='nav_menu_item_"+menuItem.toLowerCase()+"']";
		sleep(8);
		driver.findElement(By.xpath(menuItemXpath)).click();
		sleep(6);
		findElement(menuIcon).click();
	}}
