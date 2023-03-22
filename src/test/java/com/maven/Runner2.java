package com.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Page.Book_Hotel;
import com.Page.Click_Continue;
import com.Page.Login_Page;
import com.Page.Search_Hotel;
import com.base.Baseclass;
import com.pomanager.Page_Object_Manager;
import com.propertyfile.Instance_Property;

public class Runner2 extends Baseclass{

	public static WebDriver driver = launchbrowser();
	   
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws IOException {
	
		urllaunch("https://adactinhotelapp.com/");		
    // loginpage
    sendkeys(pom.getInstanceLogin().getUsername(), "PRIYADHARSHINIRATHA");
  	
	sendkeys(pom.getInstanceLogin().getPassword(), "Radha1991");

	click(pom.getInstanceLogin().getLoginbtn());
	//search hotel
	selectbyvalue(pom.getInstanceSearch().getLocation(), "Adelaide");

	selectbyvalue(pom.getInstanceSearch().getHotels(), "Hotel Hervey");

	
	selectbyvalue(pom.getInstanceSearch().getRoomtype(), "Double");

	selectbyvisibletext(pom.getInstanceSearch().getRoomnos(), "5 - Five");

	clear(pom.getInstanceSearch().getDatepick_in());
	
	sendkeys(pom.getInstanceSearch().getDatepick_in(),"13/11/2022");

	clear(pom.getInstanceSearch().getDatepickout());
	
	sendkeys(pom.getInstanceSearch().getDatepickout(),"13/11/2022");

	selectbyindex(pom.getInstanceSearch().getAdult_room(), 3);

	selectbyindex(pom.getInstanceSearch().getChild_room(), 2);

	click(pom.getInstanceSearch().getSubmit());
	
     //click and Radiobutton
	
	click(pom.getInstanceClickandSearch().getRadiobtnclick());
	
	click(pom.getInstanceClickandSearch().getContinuebtn());
	
	//Book a Hotel
	
	sendkeys(pom.getbookhotel().getFname(), "Priya");

	sendkeys(pom.getbookhotel().getLname(), "Radha");

	sendkeys(pom.getbookhotel().getAddress(), "Orathanadu,thanjavur");

	sendkeys(pom.getbookhotel().getCc_num(), "5432678907653245");
	  
	selectbyindex(pom.getbookhotel().getCc_type(), 3);

	selectbyvalue(pom.getbookhotel().getCc_exp_month(), "4");

	selectbyvisibletext(pom.getbookhotel().getCc_exp_year(), "2022");
		
	sendkeys(pom.getbookhotel().getCc_cvv(), "456");

	click(pom.getbookhotel().getBook_now());
			
		
	}
	}
