package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_File {
       public static Properties p;
       
	public Property_File() throws IOException {
		File f = new File("C:\\Users\\Administrator\\eclipse-work\\MavenProject2\\src\\main\\java\\com\\propertyfile\\input.properties");
	   FileInputStream fis = new FileInputStream(f);
	    p = new Properties();
	  p.load(fis);
	}

   public String geturl() {
       String url = p.getProperty("url");
       return url;
}
    public String getusername() {
      String username = p.getProperty("username");
      return username;
	}

  public String getpassword() {
     String password = p.getProperty("password");
     return password;
}
  public String getlocation() {
     String location = p.getProperty("location");
     return location;
  }
  public String gethotel() {
      String hotel = p.getProperty("hotel");
      return hotel;
      
}
public String getroom_type() {
   String roomtype = p.getProperty("room_type");
   return roomtype;
   }
public String getroom_no() {

	String roomno = p.getProperty("room_no");
	return roomno;
}
public String getdatepick_in() {

	String datepickin = p.getProperty("datepick_in");
	return datepickin;
}
public String getdatepick_out() {
String datepickout = p.getProperty("datepick_out");
	return datepickout;
	}
public String getAdultroom() {
   String Adultroom = p.getProperty("Adultroom");
  return Adultroom;
}
public String getChildroom() {
 
	String Childroom = p.getProperty("Childroom");
	return Childroom;
	}
public String getFname() {

	String Fname = p.getProperty("Fname");
	return Fname;
}
public String getLname() {

	String Lname = p.getProperty("Lname");
	return Lname;
}
public String getAddress() {
  String Address = p.getProperty("Address");
	return Address;
}
public String getCc_num() {
String Ccnum = p.getProperty("Cc_num");
	return Ccnum;
}

public String getCc_Type() {
String CcType = p.getProperty("Cc_Type");
	return CcType;
	
}

public String getCc_month() {
 String ccmonth = p.getProperty("Cc_month");
return ccmonth;

}

public String getCc_year() {

	String ccyear = p.getProperty("Cc_year");
	return ccyear;
	
}
public String getCc_cvv() {
String cccvv = p.getProperty("Cc_cvv");
return cccvv;
}

























}
