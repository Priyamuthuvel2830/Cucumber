package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Page.Book_Hotel;
import com.Page.Click_Continue;
import com.Page.Login_Page;
import com.Page.Search_Hotel;
import com.base.Baseclass;

public class Runner1 extends Baseclass {
public static void main(String[] args) {
	
     // browser and url launch
	launchbrowser();
    urllaunch("https://adactinhotelapp.com/");		
    // loginpage
    Login_Page lo = new Login_Page(driver);
    
    sendkeys(lo.getUsername(), "PRIYADHARSHINIRATHA");
  	  
	sendkeys(lo.getPassword(), "Radha1991");

	click(lo.getLoginbtn());
	//search hotel
	Search_Hotel sb = new Search_Hotel(driver);
	
	selectbyvalue(sb.getLocation(), "Adelaide");

	selectbyvalue(sb.getHotels(), "Hotel Hervey");

	selectbyvalue(sb.getRoomtype(), "Double");

	selectbyvisibletext(sb.getRoomnos(), "5 - Five");

	clear(sb.getDatepick_in());
	
	sendkeys(sb.getDatepick_in(),"13/11/2022");

	clear(sb.getDatepickout());
	
	sendkeys(sb.getDatepickout(),"13/11/2022");

	selectbyindex(sb.getAdult_room(), 3);

	selectbyindex(sb.getChild_room(), 2);

	click(sb.getSubmit());
	//click and Continue
	Click_Continue cc = new Click_Continue(driver);
	
	click(cc.getRadiobtnclick());
	
	click(cc.getContinuebtn());
	//Book a Hotel
	Book_Hotel bh = new Book_Hotel(driver);
	
	sendkeys(bh.getFname(), "Priya");

	sendkeys(bh.getLname(), "Radha");

	sendkeys(bh.getAddress(), "Orathanadu,thanjavur");

	sendkeys(bh.getCc_num(), "5432678907653245");
  
	selectbyindex(bh.getCc_type(), 3);

	selectbyvalue(bh.getCc_exp_month(), "4");

	selectbyvisibletext(bh.getCc_exp_year(), "2022");
	
	sendkeys(bh.getCc_cvv(), "456");

	click(bh.getBook_now());
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
