package com.Runner1;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature" , glue ="comstep")
public class Runner1 {

public static WebDriver driver;
	
	@BeforeClass
	public static void launchsetup() {
		 driver = Baseclass.launchbrowser();
		
	}
	//@AfterClass
	//public static void launchclose() {
    //  driver.close();

//	}*/


}
