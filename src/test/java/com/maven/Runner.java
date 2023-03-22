package com.maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.Baseclass;

public class Runner extends Baseclass {
	public static void main(String[] args) {
		     launchbrowser();
		     urllaunch("https://adactinhotelapp.com");		
		 	   WebElement username = driver.findElement(By.id("username"));
			    sendkeys(username, "PRIYADHARSHINIRATHA");
		   	  
			    WebElement password = driver.findElement(By.id("password"));
				sendkeys(password, "Radha1991");
		   	   WebElement login = driver.findElement(By.id("login"));
				click(login);
		   	    WebElement single = driver.findElement(By.id("location"));
				selectbyvalue(single, "Adelaide");
				WebElement single1 = driver.findElement(By.id("hotels"));
				selectbyvalue(single1, "Hotel Hervey");
				WebElement roomtype = driver.findElement(By.id("room_type"));
				selectbyvalue(roomtype, "Double");
				WebElement noofroom = driver.findElement(By.id("room_nos"));
				selectbyvisibletext(noofroom, "5 - Five");
				WebElement indate = driver.findElement(By.id("datepick_in"));
				clear(indate);
				indate.sendKeys("13/11/2022");
				WebElement outdate = driver.findElement(By.id("datepick_out"));
				clear(outdate);
				outdate.sendKeys("13/11/2022");
				WebElement adultroom = driver.findElement(By.id("adult_room"));
				selectbyindex(adultroom, 3);
				WebElement childroom = driver.findElement(By.id("child_room"));
				selectbyindex(childroom, 2);
				WebElement submit = driver.findElement(By.id("Submit"));
				click(submit);
				WebElement radio = driver.findElement(By.id("radiobutton_0"));
				click(radio);
				WebElement element = driver.findElement(By.id("continue"));
				click(element);
				WebElement fname = driver.findElement(By.id("first_name"));
				sendkeys(fname, "Priya");
				WebElement lname = driver.findElement(By.id("last_name"));
				sendkeys(lname, "Radha");
				WebElement address = driver.findElement(By.id("address"));
				sendkeys(address, "Orathanadu,thanjavur");
				WebElement ccmun = driver.findElement(By.id("cc_num"));
				sendkeys(ccmun, "5432678907653245");
				WebElement cctype = driver.findElement(By.id("cc_type"));
			    selectbyindex(cctype, 3);
				WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
				 selectbyvalue(expmonth, "4");
				WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
				selectbyvisibletext(ccexpyear, "2022");
				WebElement cvv = driver.findElement(By.id("cc_cvv"));
				sendkeys(cvv, "456");
				WebElement book = driver.findElement(By.id("book_now"));
				click(book);
					
			}

}
