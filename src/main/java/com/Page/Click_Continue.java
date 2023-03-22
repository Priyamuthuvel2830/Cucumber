package com.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Continue {

	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtnclick;
	
	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	public Click_Continue(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
				
		}

	public WebElement getRadiobtnclick() {
		return radiobtnclick;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	
	
}
