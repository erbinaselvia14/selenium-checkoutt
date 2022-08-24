package com.juaracoding.selenium.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;


public class UserLoginPages {

	private WebDriver driver;

	// membuat constractur page factory login pages
	public UserLoginPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// membuat objek menggunakan xpath
	@FindBy(xpath ="//label[@for='user_login']")
	private WebElement txtTitleFormUserName;
	
	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement usernameUser;

	@FindBy(xpath = "//input[@id='user_pass']")
	private WebElement passwordUser;
	
	@FindBy(xpath ="//input[@id='rememberme']")
	private WebElement btnRememberMe;

	@FindBy(xpath = "//input[@id='wp-submit']")
	private WebElement btnLoginUser;

	@FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/strong[1]")
	private WebElement txtNameUser;

	// method scenario
	// parameter
	public String getTxtTitleForm() {
		return txtTitleFormUserName.getText();
	}
	
	public void loginUser(String usernameUser, String passwordUser) {
		// step
		this.usernameUser.sendKeys(usernameUser);
		this.passwordUser.sendKeys(passwordUser);
	}
	
	public void clickBtnRememberMe() {
		btnRememberMe.click();
	}
	
	public void clikcBtnLogIn() {
		btnLoginUser.click();
	}

	public String getTxtNameUser() {
		return txtNameUser.getText();
	}
}
