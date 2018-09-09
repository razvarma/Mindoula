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
		features="src/main/java/com/mindoula/features/loginLabelsTest.feature",
		glue= {"com.mindoula.stepdefinitions"},
		format= {"pretty","html:test-outout"},
		monochrome=true,
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
		dryRun=false
		)

@Test
public class LoginLabelsTest extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public static void setup() {
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    String reprtName = "loginLabelsTest";
	    String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	    String reprtPath = "target/cucumber-reports/"+reprtName+"_"+fileSuffix+".html";
	    extentProperties.setReportPath(reprtPath);
	}

}
