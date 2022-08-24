package com.juaracoding.selenium.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;

public class CheckoutPages {

	private WebDriver driver;

	// constructor
	public CheckoutPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[@class='button wc-forward']")
	private WebElement btnViewcart;
	
	@FindBy(xpath ="//a[@class='checkout-button button alt wc-forward']")
	private WebElement btnChechOut;

	@FindBy(xpath ="//input[@id='billing_first_name']")
	private WebElement txtFirstName;
	
	@FindBy(xpath ="//input[@id='billing_last_name']")
	private WebElement txtLastName;
	
	//input[@id='billing_company']
	@FindBy(xpath ="//input[@id='billing_company']")
	private WebElement txtCompany;
	
	@FindBy(xpath ="//select[@id='select2-billing_country-container']")
	private WebElement listNegara;
	
	@FindBy(xpath ="//input[@id='billing_address_1']")
	private WebElement txtAlamat;
	
	@FindBy(xpath ="//input[@id='billing_address_2']")
	private WebElement txtAlamatDua;

	@FindBy(xpath="//input[@id='billing_city']")
	private WebElement txtCity;
	
	@FindBy(xpath="//input[@role='combobox']")
	private WebElement txtProvinsi;
	
	@FindBy(xpath="//input[@id='billing_postcode']")
	private WebElement txtPostCode;
	
	@FindBy(xpath="//input[@id='billing_phone']")
	private WebElement txtPhone;
	
	//input[@id='terms']
	@FindBy(xpath="//input[@id='terms']")
	private WebElement btnCeklis;
	
	@FindBy(xpath="//button[@id='place_order']")
	private WebElement btnPlaceOreder;
	
	@FindBy(xpath ="//p[@class='woocommerce-thankyou-order-received']")
	private WebElement txtSuksesOrder;
	
	public void clikcBtnViewCart() {
		btnViewcart.click();
	}
	public void clickBtnCheckout() {
		btnChechOut.click();
	}
	
	public void txtName(String txtFirstName, String txtLastName, String txtCompany ) {
		this.txtFirstName.sendKeys(txtFirstName);
		this.txtLastName.sendKeys(txtLastName);
		this.txtCompany.sendKeys(txtCompany);
	}
	
//	public void pilihCountry() {
//		Select selectSize = new Select(listNegara);
//		selectSize.selectByVisibleText("Iceland");
//		selectSize.selectByIndex(1);
//		listNegara.click();		
//	}
	
	public void txtAlamat(String txtAlamat, String txtAlamatDua) {
		this.txtAlamat.sendKeys(txtAlamat);
		this.txtAlamatDua.sendKeys(txtAlamatDua);	
	}
	
	public void pilihCity(String txtCity) {
		this.txtCity.sendKeys(txtCity);
	}
	
//	public void pilihProvinsi(String txtProvinsi) {
//		this.txtProvinsi.sendKeys(txtProvinsi);;
//	}
		
	public void txtIdentitas(String txtPostCode, String txtPhone) {
		this.txtPostCode.sendKeys(txtPostCode);
		this.txtPhone.sendKeys(txtPhone);
	}
	
	public void clickBtnAgree() {
		btnCeklis.click();
	}
	
	public void clickBtnOrder() {
		btnPlaceOreder.click();
	}
	
	public String getTxtBerhasilOrder() {
		return txtSuksesOrder.getText();
	}
}
