package com.beecow.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.ui.CreateProductPageUI;
import com.beecow.ui.HomePageUI;

import CommonPage.commonFunction;

public class CreateProductPage extends commonFunction {

	public CreateProductPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage clickdangnhap() {
		waitVisible(HomePageUI.DANGNHAP_TXT);
		click(HomePageUI.DANGNHAP_TXT);
		return PageFactory.initElements(driver, LoginPage.class);
	}

	public void clickPostProduct() {
		waitVisible(CreateProductPageUI.POST_BTN);
		click(CreateProductPageUI.POST_BTN);
	}

	public void clickCate1() {
		waitVisible(CreateProductPageUI.CATE1_BTN);
		click(CreateProductPageUI.CATE1_BTN);
	}

	public void clickRandomValueCate1() {
		waitVisible(CreateProductPageUI.CATE1_LIST);
		clickRandomCombobox(CreateProductPageUI.CATE1_LIST);
	}

	public void clickCate2() {
		waitVisible(CreateProductPageUI.CATE2_BTN);
		click(CreateProductPageUI.CATE2_BTN);
	}

	public void clickRandomValueCate2() {
		waitVisible(CreateProductPageUI.CATE2_LIST);
		clickRandomCombobox(CreateProductPageUI.CATE2_LIST);
	}

	public void clickRandomCat3() {
		if (checkElementDisplayed(CreateProductPageUI.CAT3)) {
			waitVisible(CreateProductPageUI.CAT3);
			click(CreateProductPageUI.CAT3);
			waitVisible(CreateProductPageUI.CAT3_LIST);
			clickRandomCombobox(CreateProductPageUI.CAT3_LIST);
		}
	}

}