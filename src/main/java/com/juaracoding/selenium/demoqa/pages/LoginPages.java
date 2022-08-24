package com.juaracoding.selenium.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;

public class LoginPages {
	
private WebDriver driver;
	
	//membuat constractur page factory login user pages
	public LoginPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//membuat objek menggunakan xpath
	@FindBy(xpath= "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath= "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath= "//button[@name='login']")
	private WebElement btnLogin;
	
	//method scenario
	//parameter
	public void login(String username, String password) {
		//step
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click();;
	}

}
