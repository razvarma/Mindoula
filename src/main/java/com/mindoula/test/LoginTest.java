package com.mindoula.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/mindoula/features/loginTest.feature",
		glue= {"com.mindoula.stepdefinitions"},
		format= {"pretty","html:test-outout"},
		monochrome=true,
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
		dryRun=false
		)

@Test
public class LoginTest extends AbstractTestNGCucumberTests {
	@BeforeClass
	public static void setup() {
		 System.out.println("IN LOGIN TEST *******************");
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    String reprtName = "loginTest";
	    String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	    String reprtPath = "target/cucumber-reports/"+reprtName+"_"+fileSuffix+".html";
	    extentProperties.setReportPath(reprtPath);
	}
}
