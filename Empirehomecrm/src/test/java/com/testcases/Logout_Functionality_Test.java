package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.base.Basetest;
import com.pageobjects.LoginPage;
import com.pageobjects.Logout_Functionality;

public class Logout_Functionality_Test extends Basetest {
	LoginPage login;
	Logout_Functionality Logout;

	public Logout_Functionality_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		login = new LoginPage();
		Logout = new Logout_Functionality();

	}

	@Test
	public void LogOutvalidation() throws Throwable {
		login.verifylogin();
		Logout.verifyLogout();

		
		AssertJUnit.assertEquals( "Login","Login");

	}

	@AfterMethod
	public void teardown() {

	}

}
