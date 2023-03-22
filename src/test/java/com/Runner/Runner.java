package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Baseclass;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Administrator\\eclipse-work\\MavenProject2\\src\\test\\java\\com\\feature\\Application.feature" , glue ="com.sdefinition", 
plugin = {"html:Reports/multipledata.html",
                "json:Reports/cucumber.json" , "pretty"})
public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void launchsetup() {
		 driver = Baseclass.launchbrowser();
		
	}	
	//@AfterClass
	//public static void launchclose() {
    //  driver.close();

//	"com.cucumber.listener.ExtentCucumberFormatter:Reports/Adactin.html"}*/
	
	
}
