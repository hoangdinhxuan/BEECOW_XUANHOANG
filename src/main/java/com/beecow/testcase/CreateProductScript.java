package com.beecow.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
	String imgUploadMsg, nameProductMsg, catProdMsg, desProdMsg, qtyProdMsg, priceProdMsg, weightProdMsg, requiredMsg,
			locatorDataImage, nameProdMsg, productName, description, sku, quantity, price, discount, weight, width,
			length, height;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void BeforeClass(String browser, String version, String url) throws Exception {
		driver = openMultiBrowser(browser, version, url);
		homePage = PageFactory.initElements(driver, HomePage.class);
		loginPage = homePage.clickdangnhap();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.inputEmailorSdt("genymotionios@gmail.com");
		loginPage.iputMatkhau("1234@abcd");
		homePage = loginPage.clickbuttonDangnhap();
		Thread.sleep(2000);
		createProductPage = homePage.clickSellerPage();
		//
		imgUploadMsg = "Hãy chọn hình ảnh cho sản phẩm";
		nameProductMsg = "Hãy điền tên sản phẩm";
		catProdMsg = "Hãy chọn danh mục.";
		desProdMsg = "Hãy mô tả sản phẩm.";
		qtyProdMsg = "Nhập số lượng.";
		priceProdMsg = "Hãy điền giá.";
		weightProdMsg = "Hãy điền cân nặng sản phẩm.";
		requiredMsg = "Bắt buộc";
		nameProdMsg = "Hãy điền tên sản phẩm";

		// description
		description = "Description product";

		// sku
		sku = "SKUShirt";
		// Quantity
		quantity = "10";
		// Price:
		price = "8";
		// Discount:
		discount = "10";
//		Weight
		weight = "10000";
//		Width: "50"
		width = "50";
//		Length: "30"
		length = "30";
//		Height: "50"
		height = "50";
		locatorDataImage = "D:\\Xuân\\Ảnh win10\\b62029703609017d_38b476a2a1def64e_3564715569264733154671.jpg";
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.beecow.com/page/upload-product");
		productName = "XuanHoang" + randomName();
	}

//	TC8_ "1. At Home Page, click label ""Kênh bán hàng""
//	2. Click label: ""Đăng sản phẩm mới""".Verify current url is \"https://www.beecow.com/page/upload-product\"

//	@Test
//	public void TC_08() {
//		String currrentUrl = driver.getCurrentUrl();
//		assertEquals(currrentUrl, "https://www.beecow.com/page/upload-product");
//	}

//	@Test
//	public void TC_009() {
//		createProductPage.clickPostProduct();
//		verifyEqual(createProductPage.getTextImgMsg(), imgUploadMsg);
//		verifyEqual(createProductPage.getTextProductNameMsg(), nameProductMsg);
//		verifyEqual(createProductPage.getTextCatMsg(), catProdMsg);
//		verifyEqual(createProductPage.getTextDesMsg(), desProdMsg);
//		verifyEqual(createProductPage.getTextQtyMsg(), qtyProdMsg);
//		verifyEqual(createProductPage.getTextPriceMsg(), priceProdMsg);
//		verifyEqual(createProductPage.getTextWeightMsg(), weightProdMsg);
//		verifyEqual(createProductPage.getTextWidthMsg(), requiredMsg);
//		verifyEqual(createProductPage.getTextLengthMsg(), requiredMsg);
//		verifyEqual(createProductPage.getTextHeightMsg(), requiredMsg);
//	}
//
//	@Test
//	public void TC_010() throws InterruptedException {
//		createProductPage.uploadIMG(locatorDataImage);
//		createProductPage.clickPost();
//		verifyEqual(createProductPage.getTextCatMsg(), catProdMsg);
//		verifyEqual(createProductPage.getTextProductNameMsg(), nameProdMsg);
//		verifyEqual(createProductPage.getTextDesMsg(), desProdMsg);
//		verifyEqual(createProductPage.getTextQtyMsg(), qtyProdMsg);
//		verifyEqual(createProductPage.getTextPriceMsg(), priceProdMsg);
//		verifyEqual(createProductPage.getTextWeightMsg(), weightProdMsg);
//		verifyEqual(createProductPage.getTextWidthMsg(), requiredMsg);
//		verifyEqual(createProductPage.getTextLengthMsg(), requiredMsg);
//		verifyEqual(createProductPage.getTextHeightMsg(), requiredMsg);
//	}

//	@Test
//	public void TC_15() throws InterruptedException {
////		createProductPage.clickPostProduct();
//		createProductPage.clickCate1();
//		createProductPage.clickRandomValueCate1();
//		createProductPage.clickCate2();
//		createProductPage.clickRandomValueCate2();
//		createProductPage.clickRandomCat3();
//		Thread.sleep(5000);
//
//	}

//	TC33 B1. Upload image
//	B2. Input random product name
//	B3. Select random combobox "Chọn danh mục"(1)
//	B4. Select random combobox "Chọn danh mục"(2)
//	B5. Input description: "Description product"
//	B6. Input SKU: "SKUShirt"
//	B7. Input Quantity: "10"
//	B8. Input Price: "8"
//	B9. Input Discount: "10"
//	B10. Input Weight: "10000"
//	B11. Input Width: "50"
//	B12. Input Length: "30"
//	B13: Input Height: "50" 
//	B14. Click button: "Đăng"
	// Verify message is displayed "Bạn đã đăng thành công sản phẩm này"
	// 2. Click button: "Xem danh mục sản phẩm"
//		3. Verify product name and price is displayed at shop page
//		4. Click button chỉnh sửa
//		5. Verify all fields like user have inputed

	@Test
	public void TC_33() throws InterruptedException {
//		createProductPage.clickPostProduct();
		createProductPage.uploadIMG(locatorDataImage);
		createProductPage.inputNameProduct(productName);
//		createProductPage.clickPostProduct();
		createProductPage.clickCate1();
		createProductPage.clickRandomValueCate1();
		createProductPage.clickCate2();
		createProductPage.clickRandomValueCate2();
		createProductPage.clickRandomCat3();
		Thread.sleep(5000);
		createProductPage.inputDescription(description);
		createProductPage.inputSKU(sku);
		createProductPage.inputQuantity(quantity);
		createProductPage.inputPrice(price);
		createProductPage.inputDiscount(discount);
		createProductPage.inputWeight(weight);
		createProductPage.inputWidth(width);
		createProductPage.inputLength(length);
		createProductPage.inputHeight(height);
		createProductPage.clickPost();
		createProductPage.clickViewList();
		

	}

	@AfterClass
	public void AfterClass() {
//		 closeBrowser();
	}

}
