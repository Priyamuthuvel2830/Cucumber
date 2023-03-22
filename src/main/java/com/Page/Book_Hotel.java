package com.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

   public WebDriver driver;


	
    public Book_Hotel(WebDriver driver2) {
    	this.driver = driver2;
    	PageFactory.initElements(driver, this);
    	
    }

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	@FindBy(id = "first_name")
    private WebElement fname;
    
    @FindBy(id = "last_name")
    private WebElement lname;
    
    @FindBy(id = "address")
	private WebElement address;
    
    @FindBy(id = "cc_num")
	private WebElement cc_num;
    
    @FindBy(id = "cc_type")
    private WebElement cc_type;
    
     
    @FindBy(id = "cc_exp_month")
    private WebElement cc_exp_month;
    
    @FindBy(id = "cc_exp_year")
    private WebElement cc_exp_year;
    
    @FindBy(id = "cc_cvv")
    private WebElement cc_cvv;
    
    @FindBy(id = "book_now")
	private WebElement book_now;
	
}
