package com.maven;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Page.Login_Page;

public class stcm {

	@BeforeSuite
	public void launchbrowser() {

		System.out.println("Launch the Browser");
		
	}
	@BeforeTest
	public void geturl() {
		
		System.out.println("Get the Url");
	}
	@BeforeClass
	public void Login_Page() {

		System.out.println("Login Page open by using Valid username and Password");
	}
	@BeforeMethod
	public void SearchHotel() {

		System.out.println("Search hotel by valid  data depends upon the user needs ");
	}
	@org.testng.annotations.Test(priority = 2)
	
	public void Priya() {
		System.out.println("Priya");
	}
	@org.testng.annotations.Test(priority = 3)
	
	public void Mukil() {
		System.out.println("Mukil");
	}
	
     @org.testng.annotations.Test(priority=1)
	public void Muthuvel() {
		System.out.println("Muthuvel");
	}
	@org.testng.annotations.Test(priority = 4)
	
	public void Ragha() {
		System.out.println("Ragha");
	}
	@AfterMethod
	public void SelectHotel() {

		System.out.println("Select hotel depnds on data given by client");
	}
	@AfterClass
	public void BookHotel() {

		System.out.println("Book the Hotel");
	}
	@AfterTest
	public void CheckBooking() {
		System.out.println("Check Booking");
	}
	@AfterSuite
	public void ConfirmBooking() {
		System.out.println("Confirm Booking");
	}
		
}
