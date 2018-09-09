package com.mindoula.util;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
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
import com.mindoula.config.*;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;
import com.cucumber.listener.Reporter;
//import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.LogStatus;

import gherkin.formatter.model.Result;

public class TestBase {

	public static WebDriver driver;
	public  Properties prop, objProp;
	public  WebDriverWait wait;
	//public  CustomeExtent ce;
	private boolean initialized = false;
	
	public TestBase()
	{
		System.out.println("In test base constructor");
		this.driver = driver;
		prop = new Properties();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("src/main/java/com/mindoula/config/config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void init() {
		
		if(driver==null)
		{
		String browsername = prop.getProperty("browser");
		if (browsername.toUpperCase().equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//resources//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.toUpperCase().equals("FIREFOX")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		// driver.manage().
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
	}
	
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
	public void sleep(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
