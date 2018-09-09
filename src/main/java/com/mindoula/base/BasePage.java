package com.mindoula.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.mindoula.util.TestUtil;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public  static Properties objProp1 = new Properties();;
	public BasePage(){}
	//Constructor overloading 
	public BasePage(WebDriver driver){
		System.out.println("In Base Page");
		//this driver needs to be shared across all page classes.
		this.driver=driver;
		
		
	}

	public void sleep(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

	public void wait(WebElement ele) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));}

	public WebElement findElement(String eleName) {

		WebElement ele = null;
		System.out.println("Element Name=" +eleName);
		//System.out.println("MENU ICON = " + objProp1.getProperty(eleName));
		//String objDetails = objProp1.getProperty(eleName);
		String objDetails =eleName;
		if (objDetails.substring(0, 2).toLowerCase().equals("id")) {
			ele = driver.findElement(By.id(objDetails.substring(3)));
		} else if (objDetails.substring(0, 5).toLowerCase().equals("xpath")) {
			ele = driver.findElement(By.xpath(objDetails.substring(6)));
		}
		return ele;}

	public WebElement findElementWithXpath(String xpathDetails) {
		WebElement ele = null;
		ele = driver.findElement(By.xpath(xpathDetails.substring(6)));
		return ele;
	}
	
	public WebElement findElementWithId(String xpathDetails) {
		WebElement ele = null;
		ele = driver.findElement(By.id(xpathDetails.substring(3)));
		return ele;
	}
	
	//public String getElementPath(String eleName) {
	//	return objProp1.getProperty(eleName);
//	}

	public void addScreenshot() {
		String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		addScreenshot(fileSuffix);
	}
	
	public void compareValues(String fieldName,String appValue,String featureValue) {
		Reporter.addStepLog("Comparison Field Name: " + fieldName);
		//Reporter.addStepLog(Reporter.getExtentReport().createTest("Test Step").log(Status.PASS, "PASSED STEP").);
		//ce.customResult("passed","Custom Text");
		//ce.customResult("failed","Custom Text");
		
		if(appValue.trim().equals(featureValue.trim())) {
			Reporter.addStepLog("Comparison Result: PASS" );
		}else {
			Reporter.addStepLog("Comparison Result: FAIL" );
		}
		Reporter.addStepLog("Expected Value: "+featureValue);
		Reporter.addStepLog("Actual Value: "+appValue);
		Reporter.addStepLog("------------------------------------------------------------------------- ");
	}

	public void addScreenshot(String screenshotName) {
		screenshotName = screenshotName.replaceAll(" ", "_");
		try {
			sleep(2);
			// This takes a screenshot from the driver at save it to the specified location
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			// Building up the destination path for the screenshot to save
			// Also make sure to create a folder 'screenshots' with in the cucumber-report
			// folder
			File destinationPath = new File(
					System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

			// Copy taken screenshot from source location to destination location
			FileUtils.copyFile(sourcePath, destinationPath);

			// This attach the specified screenshot to the test
			Reporter.addScreenCaptureFromPath(destinationPath.toString());

		} catch (IOException e) {
		}
	}

}
