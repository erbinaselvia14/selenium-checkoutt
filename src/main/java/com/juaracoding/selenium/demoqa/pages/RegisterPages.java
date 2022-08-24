package com.juaracoding.selenium.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;

public class RegisterPages {

private WebDriver driver;
	
	//membuat constractur page factory registrasi pages
	public RegisterPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//h2[normalize-space()='Register']
	@FindBy(xpath= "//h2[normalize-space()='Register']")
	private WebElement txtRegisterForm;
	
	//membuat objek menggunakan xpath
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement regisUsername;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement regisEmail;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement regisPassword;

	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegister;
	
	//skenario
	public String getTxtRegisterForm() {
		return txtRegisterForm.getText();
	}
	public void getRegisterUserName(String regisUsername) {
		this.regisUsername.sendKeys(regisUsername);
	}
	
	public void getRegisterEmail(String regisEmail) {
		this.regisEmail.sendKeys(regisEmail);
	}
	
	public void getRegisterPasswors(String regisPassword) {
		this.regisPassword.sendKeys(regisPassword);
	}
	
	public void clickBtnRegister() {
		btnRegister.click();
	}
}
