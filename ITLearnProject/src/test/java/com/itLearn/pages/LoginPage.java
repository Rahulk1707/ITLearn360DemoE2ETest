package com.itLearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//div[@id='primary_menu']//a[@id='loginlabel']")
	WebElement label_Login;
	
	@FindBy(xpath = "//input[@id='user_login']")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='user_pass']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='wp-submit']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement btnDashboard;
	
	@FindBy(xpath = "//h4[@class='user-nicename duserp']")
	WebElement dashboardMsg;
	
	public void clickLoginLabel() {
		label_Login.click();
	}
	
	public void setUasername(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	public void clickDashboardButton() {
		btnDashboard.click();
	}
	
	public String verifyDashboardMsg() {
		return dashboardMsg.getText();
	}

}
