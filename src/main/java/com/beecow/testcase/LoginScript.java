package com.beecow.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.HomePage;
import com.beecow.actions.LoginPage;

import CommonPage.Commontestcase;

public class LoginScript extends Commontestcase {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void BeforeClass(String browser, String version, String url) {
		driver = openMultiBrowser(browser, version, url);

	}

//
//	@BeforeMethod
//	public void BeforeMethod() {
//		loginPage.clearUserNameByJs();
//	}

//	@Test
//	public void TC_01_LoginEmptyEmailAndPassWord() {
//		homePage = PageFactory.initElements(driver, HomePage.class);
//		loginPage = homePage.clickdangnhap();
////        loginPage = PageFactory.initElements(driver, LoginPage.class);
//		loginPage.inputEmailorSdt("");
//		loginPage.iputMatkhau("");
//		loginPage.clickbuttonDangnhap();
//		verifyEqual(loginPage.getDynamicText("Hãy nhập email / số điện thoại và mật khẩu"),
//				"Hãy nhập email / số điện thoại và mật khẩu");
//	}

//	
//	@Test
//	public void TC_02_LoginWrongSDTFormat()
//	{	
//		
//		loginPage.inputUserName("1234");
//		loginPage.inputPassword("");
//		loginPage.clickDangNhap();
//		verifyEqual(loginPage.WarningDangNhapEmailSDT_LBL(), "Hãy nhập email / số điện thoại và mật khẩu");
//		verifyEqual(loginPage.WarningDangNhapWrongSDT_LBL(), "Số điện thoại không đúng");
//		
//	}
//	@Test
//	public void TC_03_LoginWrongEMAILFormat() throws InterruptedException
//	{
//		
//		
//		loginPage.inputUserName("5678abcd");
//		loginPage.inputPassword("");
//		loginPage.clickDangNhap();
//		verifyEqual(loginPage.WarningDangNhapEmailSDT_LBL(), "Hãy nhập email / số điện thoại và mật khẩu");
//		verifyEqual(loginPage.WarningDangNhapWrongEMAIL_LBL(), "Email không đúng");
//	}
//	@Test
//	public void TC_04_LoginIncorrectAccount()
//	{
//		
//		
//		loginPage.inputUserName("genymotionios@gmail.com");
//		loginPage.clickDangNhap();
//		verifyEqual(loginPage.WarningDangNhapEmailSDT_LBL(), "Hãy nhập email / số điện thoại và mật khẩu");		
//	}
//	@Test
//	public void TC_05_LoginIncorrectAccountAndIncorrectPassword()
//	{
//		
//		
//		loginPage.inputUserName("genymotionios@gmail.com");
//		loginPage.inputPassword("123");
//		loginPage.clickDangNhap();
//		verifyEqual(loginPage.WarningDangNhapEmailSDT_LBL(), "Hãy nhập email / số điện thoại và mật khẩu");		
//		verifyEqual(loginPage.getTextInvalidPassWordErr(), "Tối thiểu 6 ký tự");
//	
	@Test
	public void TC_06_LoginIncorrectEmailOrSdtOrPassword()
	{				
		loginPage.inputEmailorSdt("genymotionios@gmail.com");
		loginPage.iputMatkhau("1234@abcd");
		loginPage.clickbuttonDangnhap();
//		verifyEqual(loginPage.getTextInvalidEmailOrSdtOrPassword(), "Sai email / số điện thoại hoặc mật khẩu");
	}
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}

}
