package com.juaracoding.selenium.demoqa.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.selenium.demoqa.drivers.DriverSingleton;
import com.juaracoding.selenium.demoqa.pages.AddCartPages;
import com.juaracoding.selenium.demoqa.pages.AddCartProductDuaPages;
import com.juaracoding.selenium.demoqa.pages.CheckoutPages;
import com.juaracoding.selenium.demoqa.pages.HomePages;
import com.juaracoding.selenium.demoqa.pages.LoginPages;
import com.juaracoding.selenium.demoqa.pages.RegisterPages;
import com.juaracoding.selenium.demoqa.pages.SearchPages;
import com.juaracoding.selenium.demoqa.pages.UserLoginPages;

public class TestPages {
	
	public static WebDriver driver;
	private HomePages homePages;
	private RegisterPages regisPages;
	private UserLoginPages userLoginPages;
	private SearchPages searchPages;
	private AddCartPages addCartPages;
	private AddCartProductDuaPages addCartProductTwo;
	private CheckoutPages checkoutPages;
	private LoginPages loginPages;
	
	
	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		homePages = new HomePages();
		regisPages = new RegisterPages();
		userLoginPages = new UserLoginPages();
		searchPages = new SearchPages();
		addCartPages = new AddCartPages();
		addCartProductTwo = new AddCartProductDuaPages();
		checkoutPages = new CheckoutPages();
		loginPages = new LoginPages();
	}
	
	@Test
	public void testCheckOutSatu() {
		//register
//		delay(1);
//		scroll(300);
//		homePages.clickBtnHome();
		
//		System.out.println(homePages.getTxtMyAccount());
//		scroll(300);
//		System.out.println(regisPages.getTxtRegisterForm());
//		regisPages.getRegisterUserName("erbina62");
//		regisPages.getRegisterEmail("erbina62@gmail.com");
//		regisPages.getRegisterPasswors("Admin@12345");
//		regisPages.clickBtnRegister();
//		
		//login
//		userLoginPages.getTxtTitleForm();
//		userLoginPages.loginUser("erbina62", "Admin@12345");
//		userLoginPages.clickBtnRememberMe();
//		userLoginPages.clikcBtnLogIn();
		
		loginPages.login("erbina62", "Admin@12345");
		
		
		//search
		scroll(300);
		System.out.println(userLoginPages.getTxtNameUser());
		searchPages.clickBtnDashboard();
		searchPages.clickBtnSearch();
		System.out.println(searchPages.getTxtLabelSearch());
		searchPages.ClickTxtSearch("Dress");
		scroll(400);
		System.out.println(searchPages.getTxtHasilSearchTersedia());
		
		//addcart
		addCartPages.clickBtnImg();
		scroll(350);
		System.out.println(addCartPages.getTxtTittleProduct());
		scroll(450);
		addCartPages.pilihColor();
		addCartPages.pilihSize();
		addCartPages.clickBtnAddCart();
		scroll(200);
		System.out.println(addCartPages.getTxtAddedToCart());
		addCartProductTwo.btnDashboard();
		searchPages.clickBtnSearch();
		System.out.println(searchPages.getTxtLabelSearch());
		searchPages.ClickTxtSearch("Dress");
		scroll(400);
		System.out.println(searchPages.getTxtHasilSearchTersedia());
		addCartProductTwo.btnImage();
		scroll(350);
		addCartProductTwo.getTxtTitle();
		scroll(450);
		addCartProductTwo.pilihColor();
		addCartProductTwo.pilihSize();
		addCartProductTwo.clickBtnAdd();
		scroll(200);
		System.out.println(addCartProductTwo.getTxtAdded());
		checkoutPages.clikcBtnViewCart();
		scroll(900);
		
		//checkout
		checkoutPages.clickBtnCheckout();
		scroll(400);
		checkoutPages.txtName("Erbina", "Selvia", "Juara Coding");
		
		scroll(300);
		checkoutPages.txtAlamat("Bandung", "Jawa barat");
		checkoutPages.pilihCity("Bojongsoang");
		scroll(200);
		checkoutPages.txtIdentitas("110002", "08126091111");
		
		delay(1);
		scroll(-300);
		checkoutPages.clickBtnAgree();
		checkoutPages.clickBtnOrder();
		
		scroll(300);
		System.out.println(checkoutPages.getTxtBerhasilOrder());
		
	}
	
	@AfterClass
	public void closeBrowser() {
		delay(10);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}

}
