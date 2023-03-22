package com.Page;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id ="room_nos")
	private WebElement roomnos;
	
	@FindBy(id = "datepick_in")
	private WebElement datepick_in;
	
	@FindBy(id = "datepick_out")
	private WebElement datepickout;
	
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	
	@FindBy(id = "child_room")
	private WebElement child_room;
	
	@FindBy(id = "Submit")
	private WebElement Submit;
	
	
	
	
	
}
