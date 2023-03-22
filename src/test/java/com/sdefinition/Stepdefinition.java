package com.sdefinition;

import java.io.IOException;
import java.util.Optional;

import com.base.Baseclass;
import com.pomanager.Page_Object_Manager;
import com.propertyfile.Instance_Property;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass {

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
    
	@Before
	private void beforehooks(Scenario s) {
      
    	String name = s.getName();
    	System.out.println("Scenario name :" +name);
}
	@After
    private void afterhooks(Scenario s) throws IOException {
     Status status = s.getStatus();
     System.out.println("Scenario  status:" +status);
     if (s.isFailed()){
    		  
    	
    	 screenshot("C:\\Users\\Administrator\\eclipse-work\\Selenium\\Screenshot\\hooks.png");
     }
	}
	
	@Given("^lauch the url$")
	public void lauch_the_url() throws Throwable {
		String url = Instance_Property.getInstance().geturl();
		urllaunch("https://adactinhotelapp.com/");	
	}

	@When("enter the {string} in the username feild")
	public void enter_the_in_the_username_feild(String username) {
		sendkeys(pom.getInstanceLogin().getUsername(), username);
	//	sendkeys(pom.getInstanceLogin().getUsername(), "PRIYADHARSHINIRATHA");
	}

	@When("enter the {string} in the password feild")
	public void enter_the_in_the_password_feild(String password) {
		sendkeys(pom.getInstanceLogin().getPassword(), password);
		//	sendkeys(pom.getInstanceLogin().getPassword(), "Radha1991");

	}

	@Then("^checking the functionlity of login page its navigate to search hotel page$")
	public void checking_the_functionlity_of_login_page_its_navigate_to_search_hotel_page() throws Throwable {
		click(pom.getInstanceLogin().getLoginbtn());
	}

	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
		String location = Instance_Property.getInstance().getlocation();
		selectbyvalue(pom.getInstanceSearch().getLocation(), "Adelaide");
	}

	@When("^user select the hotel name$")
	public void user_select_the_hotel_name() throws Throwable {
		String hotel = Instance_Property.getInstance().gethotel();
		selectbyvalue(pom.getInstanceSearch().getHotels(), "Hotel Hervey");
	}

	@When("^user select room type$")
	public void user_select_room_type() throws Throwable {
		String room_type = Instance_Property.getInstance().getroom_type();
		selectbyvalue(pom.getInstanceSearch().getRoomtype(), "Double");
	}

	@When("^user select no of rooms needed$")
	public void user_select_no_of_rooms_needed() throws Throwable {
		String room_no = Instance_Property.getInstance().getroom_no();
		selectbyvisibletext(pom.getInstanceSearch().getRoomnos(), "5 - Five");

	}

	@When("^user select pickin date$")
	public void user_select_pickin_date() throws Throwable {
		clear(pom.getInstanceSearch().getDatepick_in());
		String datepick_in = Instance_Property.getInstance().getdatepick_in();
		sendkeys(pom.getInstanceSearch().getDatepick_in(),"13/11/2022");
	}

	@When("^user select pickout date$")
	public void user_select_pickout_date() throws Throwable {
		clear(pom.getInstanceSearch().getDatepickout());
		String datepick_out = Instance_Property.getInstance().getdatepick_out();
		sendkeys(pom.getInstanceSearch().getDatepickout(),"13/11/2022");
	}

	@When("^user select no of adult room needed$")
	public void user_select_no_of_adult_room_needed() throws Throwable {
		selectbyindex(pom.getInstanceSearch().getAdult_room(), 3);

	}

	@When("^user select no of child room needed$")
	public void user_select_no_of_child_room_needed() throws Throwable {
		selectbyindex(pom.getInstanceSearch().getChild_room(), 2);

	}

	@Then("^click the submit button its navigate to hotel select Page$")
	public void click_the_submit_button_its_navigate_to_hotel_select_Page() throws Throwable {
		click(pom.getInstanceSearch().getSubmit());

	}

	@When("^select the hotel which the user need$")
	public void select_the_hotel_which_the_user_need() throws Throwable {
		click(pom.getInstanceClickandSearch().getRadiobtnclick());

	}

	@Then("^click continue button its navigate to hotel booking page$")
	public void click_continue_button_its_navigate_to_hotel_booking_page() throws Throwable {
		click(pom.getInstanceClickandSearch().getContinuebtn());

	}

	@When("^User enter the firstname$")
	public void user_enter_the_firstname() throws Throwable {
		String Fname = Instance_Property.getInstance().getFname();
		sendkeys(pom.getbookhotel().getFname(), "Priya");
	}

	@When("^user enter the lastname$")
	public void user_enter_the_lastname() throws Throwable {
		String Lname = Instance_Property.getInstance().getLname();
		sendkeys(pom.getbookhotel().getLname(), "Radha");
	}

	@When("^user enter the Address$")
	public void user_enter_the_Address() throws Throwable {
		String Address = Instance_Property.getInstance().getAddress();
		sendkeys(pom.getbookhotel().getAddress(), "Orathanadu,thanjavur");
	}

	@When("^user enter the credit card number$")
	public void user_enter_the_credit_card_number() throws Throwable {
		String Cc_num = Instance_Property.getInstance().getCc_num();
		sendkeys(pom.getbookhotel().getCc_num(), "5432678907653245");
	}

	@When("^user Select the credit type$")
	public void user_Select_the_credit_type() throws Throwable {
		selectbyindex(pom.getbookhotel().getCc_type(), 3);

	}

	@When("^user select the credit card exp month$")
	public void user_select_the_credit_card_exp_month() throws Throwable {
		String Cc_month = Instance_Property.getInstance().getCc_month();
		selectbyvalue(pom.getbookhotel().getCc_exp_month(), "4");

	}

	@When("^user select the credit card exp year$")
	public void user_select_the_credit_card_exp_year() throws Throwable {
		String Cc_year = Instance_Property.getInstance().getCc_year();
		selectbyvisibletext(pom.getbookhotel().getCc_exp_year(), "2022");
	}

	@When("^user enter the credit card cvv for payment$")
	public void user_enter_the_credit_card_cvv_for_payment() throws Throwable {
		String Cc_cvv = Instance_Property.getInstance().getCc_cvv();
		sendkeys(pom.getbookhotel().getCc_cvv(), "456");

	}

	@Then("^user choose book now for hotel booking$")
	public void user_choose_book_now_for_hotel_booking() throws Throwable {
		click(pom.getbookhotel().getBook_now());

	}


	
}
