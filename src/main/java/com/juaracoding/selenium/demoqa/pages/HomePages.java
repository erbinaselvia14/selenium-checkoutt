package com.juaracoding.selenium.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;


public class HomePages {
	
private WebDriver driver;
	
	//membuat constractur page factory home pages
	public HomePages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//membuat objek menggunakan xpath
	//a[normalize-space()='My Account']
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement btnMyAccount;
	
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement txtMyAccount;
	
	//method skenario
	public void clickBtnHome() {
		btnMyAccount.click();
	}
	
	public String getTxtMyAccount() {
		return txtMyAccount.getText();
	}

}
