package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
   
   public static WebDriver launchbrowser() {
       WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   return driver;
	 	   
}
   public static void urllaunch(String url) {
	   driver.get(url);
	
}
   public static void sendkeys(WebElement element, String input) {
	 
	    element.sendKeys(input);
}
   public static void click(WebElement button) {
	   button.click();

}
   
   public static void selectbyvalue(WebElement element, String value) {
	   Select s = new Select(element); 
       s.selectByValue(value);
            
}
   public static void selectbyindex(WebElement element, int value) {
	  Select s1 = new Select(element);
	   s1.selectByIndex(value);
}
   public static void selectbyvisibletext(WebElement element, String text) {
	   Select s2 = new Select(element);
	   s2.selectByVisibleText(text);
}
   public static void screenshot(String name) throws IOException {
	  TakesScreenshot ts = (TakesScreenshot) driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File des = new File("C:\\Users\\Administrator\\eclipse-work\\Selenium\\Screenshot\\amazonloginpage.png");
		FileUtils.copyFile(src, des); 
}
   public static void clear(WebElement element) {
	 element.clear();

}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

