package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Login_Functionality_Page extends Basetest {

	@FindBy(xpath = "//input[@placeholder='example@gmail.com']")
	      
	WebElement userid;

	@FindBy(name = "pword")
	WebElement pass;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginbutton;
	


	public Login_Functionality_Page() {
	
		PageFactory.initElements(driver, this);
	}

	public void verifylogin(String username, String password) {
		
		userid.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}
}


