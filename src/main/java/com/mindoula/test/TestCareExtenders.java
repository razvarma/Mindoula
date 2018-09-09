package com.mindoula.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.ExtentReporter;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.mindoula.util.TestUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/mindoula/features/careExtenders.feature",
		glue= {"com.mindoula.stepdefinitions"},
		format= {"pretty","html:test-outout"},
		tags= {"@Login,@VerifyCareExtender"},
		monochrome=true,
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
		dryRun=false
		)
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"}
//
@Test
public class TestCareExtenders extends AbstractTestNGCucumberTests {
	 ExtentProperties extentProperties = ExtentProperties.INSTANCE;
    ExtentReporter extentReporter;
	 ExtentReports extentReports;

	@BeforeClass
	public  void setup() {
	 ExtentTest extentTest;
	    String reprtName = "careExtenders";
	    System.out.println("IN TEST XARE EXTENDER");
	  //  extentTest = extentReporter.createTest("TestOne", "");
	    String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	    String reprtPath = "target/cucumber-reports/"+reprtName+"_"+fileSuffix+".html";
	    extentProperties.setReportPath(reprtPath);
	
	}
	@AfterClass
	public  void tearDown() {
		//extentReporter.`
		
		extentReporter.flush();
	   
	}
	

	}

