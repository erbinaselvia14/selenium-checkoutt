package com.juaracoding.selenium.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;

public class AddCartProductDuaPages {

	private WebDriver driver;

	// constructor
	public AddCartProductDuaPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
	private WebElement btnDashboard;
	
	@FindBy(xpath ="//div[contains(@class,'noo-row')]//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]")
	private WebElement btnImage;
	
	@FindBy(xpath ="//h1[@class='product_title entry-title']")
	private WebElement txtTitle;
	
	@FindBy(xpath ="//select[@id='pa_color']")
	private WebElement listColor;
	
	@FindBy(xpath ="//select[@id='pa_size']")
	private WebElement listSize;
	
	@FindBy(xpath ="//button[normalize-space()='Add to cart']")
	private WebElement btnAdd;
	
	@FindBy(xpath="//div[@role='alert']")
	private WebElement txtAdded;
	
	public void btnDashboard() {
		btnDashboard.click();
	}
	
	public void btnImage() {
		btnImage.click();
	}
	
	public String getTxtTitle() {
		return txtTitle.getText();
	}
	
	public void pilihColor() {
		Select selectColor = new Select(listColor);
		selectColor.selectByVisibleText("White");
		selectColor.selectByIndex(1);
		listColor.click();
	}
	
	public void pilihSize() {
		Select selectSize = new Select(listSize);
		selectSize.selectByVisibleText("Medium");
		selectSize.selectByIndex(2);
		listSize.click();		
	}
	
	public void clickBtnAdd() {
		btnAdd.click();
	}
	
	public String getTxtAdded() {
		return txtAdded.getText();
	}
}
