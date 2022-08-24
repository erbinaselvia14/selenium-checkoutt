package com.juaracoding.selenium.demoqa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;

public class AddCartPages {

	private WebDriver driver;

	//constructor
	public AddCartPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='noo-product-item one noo-product-sm-4 not_featured post-1473 product type-product status-publish has-post-thumbnail product_cat-bodycon-dresses product_tag-bodycon-dresses product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//div[@class='owl-item active']//img[@class='product-one-thumb']")
	private WebElement btnImage;
	
	@FindBy(xpath ="//h1[@class='product_title entry-title']")
	private WebElement txtTitleProduct;
	
	//input[@id='uploadPicture']
	//select[@id='pa_color']
	//*[@id="pa_color"]/option[1]
	//*[@id="pa_color"]/option[2]
	//*[@id="pa_color"]
	//label[contains(@for, 'pa_color')]
	@FindBy(xpath ="//select[@id='pa_color']")
	private WebElement listColor;
	
	//*[@id="pa_size"]/option[2]
	//*[@id="pa_size"]
	//select[@id='pa_size']
	@FindBy(xpath ="//select[@id='pa_size']")
	private WebElement listSize;
	
	//button[normalize-space()='Add to cart']
	@FindBy(xpath ="//button[normalize-space()='Add to cart']")
	private WebElement btnAddCart;
	
	//div[@role='alert']
	@FindBy(xpath ="//div[@role='alert']")
	private WebElement txtAddedCart;
	
	public void clickBtnImg() {
		btnImage.click();
	}
	
	public String getTxtTittleProduct() {
		return txtTitleProduct.getText();
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
		selectSize.selectByIndex(1);
		listSize.click();		
	}
	
	public void clickBtnAddCart() {
		btnAddCart.click();
	}
	
	public String getTxtAddedToCart() {
		return txtAddedCart.getText();
	}
}
