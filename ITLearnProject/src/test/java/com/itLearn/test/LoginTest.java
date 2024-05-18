package com.itLearn.test;

import org.testng.annotations.Test;

import com.itLearn.pages.BaseTest;
import com.itLearn.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.clickLoginLabel();
		lp.setUasername(config.getUsername());
		lp.setPassword(config.getPassword());
		lp.clickLoginButton();
		lp.clickDashboardButton();
		System.out.println("Dashboard message: " + lp.verifyDashboardMsg());
		System.out.println("Test passed.");
	}

}
