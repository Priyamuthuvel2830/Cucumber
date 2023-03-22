package com.maven;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.base.Baseclass;
import com.pomanager.Page_Object_Manager;
import com.propertyfile.Instance_Property;

public class datadriven_Runner extends Baseclass {
public static WebDriver driver = launchbrowser();
public static Page_Object_Manager pom = new Page_Object_Manager(driver);
public static void main(String[] args) throws IOException {
String url = Instance_Property.getInstance().geturl();
urllaunch("https://adactinhotelapp.com/");		
   // loginpage
        String username = Instance_Property.getInstance().getusername(); 
		sendkeys(pom.getInstanceLogin().getUsername(), "PRIYADHARSHINIRATHA");
  	     String password = Instance_Property.getInstance().getpassword();
		sendkeys(pom.getInstanceLogin().getPassword(), "Radha1991");
    	click(pom.getInstanceLogin().getLoginbtn());
	//search hotel
	String location = Instance_Property.getInstance().getlocation();
	selectbyvalue(pom.getInstanceSearch().getLocation(), "Adelaide");
	String hotel = Instance_Property.getInstance().gethotel();
	selectbyvalue(pom.getInstanceSearch().getHotels(), "Hotel Hervey");
	String room_type = Instance_Property.getInstance().getroom_type();
	selectbyvalue(pom.getInstanceSearch().getRoomtype(), "Double");
	String room_no = Instance_Property.getInstance().getroom_no();
	selectbyvisibletext(pom.getInstanceSearch().getRoomnos(), "5 - Five");
	clear(pom.getInstanceSearch().getDatepick_in());
	String datepick_in = Instance_Property.getInstance().getdatepick_in();
	sendkeys(pom.getInstanceSearch().getDatepick_in(),"13/11/2022");
	clear(pom.getInstanceSearch().getDatepickout());
	String datepick_out = Instance_Property.getInstance().getdatepick_out();
	sendkeys(pom.getInstanceSearch().getDatepickout(),"13/11/2022");
	//String Adultroom = Instance_Property.getInstance().getAdultroom();
	selectbyindex(pom.getInstanceSearch().getAdult_room(), 3);
	//String Childroom = Instance_Property.getInstance().getChildroom();
	selectbyindex(pom.getInstanceSearch().getChild_room(), 2);
	click(pom.getInstanceSearch().getSubmit());
	//click and Radiobutton
	click(pom.getInstanceClickandSearch().getRadiobtnclick());
	click(pom.getInstanceClickandSearch().getContinuebtn());
	//Book a Hotel
	String Fname = Instance_Property.getInstance().getFname();
	sendkeys(pom.getbookhotel().getFname(), "Priya");
	String Lname = Instance_Property.getInstance().getLname();
	sendkeys(pom.getbookhotel().getLname(), "Radha");
	String Address = Instance_Property.getInstance().getAddress();
	sendkeys(pom.getbookhotel().getAddress(), "Orathanadu,thanjavur");
	String Cc_num = Instance_Property.getInstance().getCc_num();
	sendkeys(pom.getbookhotel().getCc_num(), "5432678907653245");
 	//String Cc_type = Instance_Property.getInstance().getCc_Type();
	selectbyindex(pom.getbookhotel().getCc_type(), 3);
	String Cc_month = Instance_Property.getInstance().getCc_month();
	selectbyvalue(pom.getbookhotel().getCc_exp_month(), "4");
	String Cc_year = Instance_Property.getInstance().getCc_year();
	selectbyvisibletext(pom.getbookhotel().getCc_exp_year(), "2022");
	String Cc_cvv = Instance_Property.getInstance().getCc_cvv();
	sendkeys(pom.getbookhotel().getCc_cvv(), "456");
	click(pom.getbookhotel().getBook_now());
			
	}
}

	