package com.pomanager;

import org.openqa.selenium.WebDriver;

import com.Page.Book_Hotel;
import com.Page.Click_Continue;
import com.Page.Login_Page;
import com.Page.Search_Hotel;

public class Page_Object_Manager {
  
	public WebDriver driver;
	
	private  Login_Page lo;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getInstanceLogin() {
	if (lo == null) {
	 lo = new Login_Page(driver);
	}
    return lo;
	}
	
	private Search_Hotel sb;
	
	public Search_Hotel getInstanceSearch() {
		if (sb == null) {
			sb = new Search_Hotel(driver);
		}
		
		return sb;
		
	}
	private Click_Continue cc;
	
     public Click_Continue getInstanceClickandSearch() {
		
    	 if (cc == null) {
			cc = new Click_Continue(driver);
		}
    	 return cc;

	}
	private Book_Hotel bh;
	
	public Book_Hotel getbookhotel() {
		if (bh == null) {
			bh = new Book_Hotel(driver);
		}
		
		return bh;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
