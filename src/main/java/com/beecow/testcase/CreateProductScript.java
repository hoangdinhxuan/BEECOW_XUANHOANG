package com.beecow.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.CreateProductPage;
import com.beecow.actions.HomePage;
import com.beecow.actions.LoginPage;

import CommonPage.Commontestcase;

public class CreateProductScript extends Commontestcase {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	CreateProductPage createProductPage;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void BeforeClass(String browser, String version, String url) throws Exception {
		driver = openMultiBrowser(browser, version, url);
		homePage = PageFactory.initElements(driver, HomePage.class);
		loginPage = homePage.clickdangnhap();
//		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.inputEmailorSdt("genymotionios@gmail.com");
		loginPage.iputMatkhau("1234@abcd");
		homePage = loginPage.clickbuttonDangnhap();
		Thread.sleep(2000);
		createProductPage = homePage.clickSellerPage();
	}

	@Test
	public void TC_01() throws InterruptedException {
		createProductPage.clickPostProduct();
		createProductPage.clickCate1();
		createProductPage.clickRandomValueCate1();
		createProductPage.clickCate2();
		createProductPage.clickRandomValueCate2();
		createProductPage.clickRandomCat3();
		Thread.sleep(5000);

	}

	@AfterClass
	public void AfterClass() {
		//closeBrowser();
	}

}
