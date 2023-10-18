package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Holidays_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Holidays']")
	WebElement clickHolidays;

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement clickAddNew;
	
	
	@FindBy(xpath = "//input[@name='HolidayDate']")
	WebElement HolidayDate;

	@FindBy(xpath = "//input[@id='HolidayName']")
	WebElement HolidayName;

	@FindBy(xpath = "//input[@id='HolidayDesc']")

	WebElement HolidayDesc;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]/button[1]")
	WebElement clicEditbutton;
	@FindBy(xpath = "//tbody/tr[36]/td[5]/a[2]/button[1]")
	WebElement clicDelatebutton;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clicyesbutton;

	public Holidays_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Holidaysverify(String TextHolidayDate, String TextHolidayName ,String TextHolidayDesc, String REHolidayDate,String REHolidayName,String REHolidayDesc) throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		clickHolidays.click();
		Thread.sleep(2000);
		clickAddNew.click();
		Thread.sleep(2000);
		HolidayDate.click();
		Thread.sleep(2000);
		
		HolidayDate.sendKeys(TextHolidayDate);
		Thread.sleep(2000);
		
		HolidayName.sendKeys(TextHolidayName);
		Thread.sleep(2000);
	
		HolidayDesc.sendKeys(TextHolidayDesc);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		clicEditbutton.click();
		Thread.sleep(2000);
				
		HolidayDate.clear();
		HolidayDate.sendKeys(REHolidayDate);
		Thread.sleep(2000);
		HolidayName.clear();
		HolidayName.sendKeys(REHolidayName);
		Thread.sleep(2000);
		HolidayDesc.clear();
		HolidayDesc.sendKeys(REHolidayDesc);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		clicDelatebutton.click();
		Thread.sleep(2000);
		clicyesbutton.click();
	}

}
