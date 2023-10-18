package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LoginPage;

public class Logintest extends Basetest {

	LoginPage lf;

	public Logintest() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new LoginPage();

	}

	@Test

	public void loginvalidation() {
		lf.verifylogin();
		String Title = driver.getTitle();
		AssertJUnit.assertEquals(Title, "Empire Home Admin Panel");
		

	}

	@AfterMethod
	public void teardown() {
		  
	}
}
