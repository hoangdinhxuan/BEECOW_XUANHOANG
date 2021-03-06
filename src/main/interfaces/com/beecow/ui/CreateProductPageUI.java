package com.beecow.ui;

public class CreateProductPageUI {
	public static final String POST_PRODUCT_BTN = "//li[@class='inner-menu-mobile']//a[@beetranslate='beecow.menu.store.uploadProduct']";
	public static final String POST_BTN = "//button[@class='btn-solid-orange']//span[contains(text(),'Đăng')]";

	public static final String CATE1_BTN = "//div[contains(@class,'category-left')]/button";
	public static final String CATE1_LIST = "//div[contains(@class,'category-left')]//li";
	public static final String CATE2_BTN = "//div[contains(@class,'category-mid')]/button";
	public static final String CATE2_LIST = "//div[contains(@class,'category-mid')]//li";
	public static final String CAT3 = "//div[contains(@class,'category-right')]/button";
	public static final String CAT3_LIST = "//div[contains(@class,'category-right')]//li";
	public static final String VIEW_LIST_BTN = "//button[contains(@beetranslate,'viewList')]/span";

	// IMAGE
	public static final String IMG_MSG = "//label[contains(@beetranslate,'chooseImage')]/span";
	public static final String IMG_UPLOAD = "//div[@id='upload-empty']//input[@name='qqfile']";

	public static final String NAME_EDIT = "//input[@formcontrolname='name']";
	public static final String DES_EDIT = "//div[contains(@class,'fr-view')]/p";
	// SKU
	public static final String SKU_TXT = "//input[@id=\"org-sku\"]";
	public static final String SKU_EDIT = "//input[@formcontrolname='parentSku']";

	public static final String QUANTITY_EDIT = "//input[@formcontrolname='totalItem']";
	public static final String PRICE_EDIT = "//input[@formcontrolname='orgPrice']";
	public static final String DISCOUNT_EDIT = "//input[@formcontrolname='discount']";
	public static final String NEWPRICE_EDIT = "//input[@formcontrolname='newPrice']";
	public static final String WEIGHT_EDIT = "//input[@formcontrolname='weight']";
	public static final String WIDTH_EDIT = "//input[@formcontrolname='width']";
	public static final String LENGTH_EDIT = "//input[@formcontrolname='length']";
	public static final String HEIGHT_EDIT = "//input[@formcontrolname='height']";

	public static final String UPLOAD_PRODUCT = "//li[@class='inner-menu-mobile']/a[contains(@beetranslate,'uploadProduct')]";
	public static final String UPDATE_BTN = "//button[contains(@beetranslate,'update')]";

	// name product
	public static final String NAME_PRODUCT_TXT = "//input[@id='name']";
	public static final String PRODUCT_NAME_MSG = "//label[contains(@beetranslate,'productName')]/span";

	public static final String CAT1_DROPDOWN = "//div[contains(@class,'category-left')]//li";

	public static final String CAT2_DROPDOWN = "//div[contains(@class,'category-mid')]//li";
	public static final String CAT2_DROPDOWN_NOT_OTHER = "//div[contains(@class,'category-mid')]//ul//a[not(contains(text(),'Khác'))]";
	public static final String CAT2_DROPDOWN_OTHER = "//div[contains(@class,'category-mid')]//ul//a[contains(text(),'Khác')]";

	public static final String CAT_MSG = "//label[contains(@beetranslate,'error.category')]/span";
	public static final String CAT3_DROPDOWN = "//div[contains(@class,'category-right')]//li";
	public static final String CAT3_MSG = "//label[contains(@beetranslate,'error.category')]/span";

	// description
	public static final String DESCCRIPTION_TXT = "//div[@class='fr-element fr-view']";
//	public static final String DESCCRIPTION_TXT = "//label[contains(@beetranslate,'description')]/following-sibling::div//div[contains(@class,'fr-view')]";
	public static final String DESCCRIPTION_MSG = "//label[contains(@beetranslate,'error.description')]/span";

	// Quantity
	public static final String QUANTITY_TXT = "//input[@formcontrolname='totalItem']";
	public static final String QUANTITY_MSG = "//label[contains(@beetranslate,'itemQty')]/span";

	// Price
	public static final String PRICE_TXT = "//input[@formcontrolname='orgPrice']";
	public static final String PRICE_MSG = "//label[contains(@beetranslate,'error.price')]/span";

	// Discount:
	public static final String DISCOUNT_TXT = "//input[@formcontrolname='weight']";

	// Weight
	public static final String WEIGHT_TXT = "//input[@formcontrolname='weight']";
	public static final String WEIGHT_MSG = "//label[contains(@beetranslate,'shipping.require')]/span";

	// Width
	public static final String WIDTH_TXT = "//input[@formcontrolname='width']";
	public static final String WIDTH_MSG = "//label[contains(@beetranslate,'width')]/span";

//	Length:
	public static final String LENGTH_TXT = "//input[@formcontrolname='length']";
	public static final String LENGTH_MSG = "//label[contains(@beetranslate,'length')]/span";

	// Height:
	public static final String HEIGHT_TXT = "//input[@placeholder='Chiều cao']";
	public static final String HEIGHT_MSG = "//label[contains(@beetranslate,'height')]/span";

	public static final String POST_SUCESS_MSG = "//p[contains(@beetranslate,'postSuccess')]/span";
	public static final String UPDATE_SUCESS_MSG = "//p[contains(@beetranslate,'updateSuccess')]/span";

//	public static final String VIEW_LIST_BTN = "//button[contains(@beetranslate,'viewList')]/span";

	public static final String PRODUCT_NAME_LBL = "//div[contains(@class,'content-desc')]/p[@class='pro-name']";
	public static final String PRODUCT_NAME_LBL_2 = "//div[contains(@class,'content-desc')]/p[contains(text(),'{productname}')]";

	public static final String VIEW_EDIT_DETAIL_BTN = "//*[contains(@beetranslate,'detail.viewEdit')]";
	public static final String VIEW_EDIT_DETAIL2_BTN = "//p[contains(text(),'{productname}')]/ancestor::a//a[contains(@beetranslate,'detail.viewEdit')]";
	public static final String VIEW_EDIT_DETAIL3_BTN = "//p[contains(text(),'{productname}')]/ancestor::a//div[@id='edit-product']";
	public static final String VIEW_DETAIL_PROD = "//button[contains(@beetranslate,'viewProduct')]/span";

}
