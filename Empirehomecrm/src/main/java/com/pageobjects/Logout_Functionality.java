package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Logout_Functionality extends Basetest {

	@FindBy(xpath = "//img[@alt='user']")
	WebElement clickuser;

	@FindBy(xpath = "//a[normalize-space()='Signout']")
	WebElement clickSignout;

	public Logout_Functionality() {
		PageFactory.initElements(driver, this);
	}


	

	public void verifyLogout() throws Throwable {
		Thread.sleep(2000);
		clickuser.click();
		Thread.sleep(2000);
		clickSignout.click();

		
	}
}
