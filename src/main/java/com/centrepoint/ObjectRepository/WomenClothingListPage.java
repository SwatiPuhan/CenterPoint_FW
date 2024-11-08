package com.centrepoint.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenClothingListPage 
{
	public WomenClothingListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


@FindBy(id = "prodItemImgLink0")
private WebElement productImg;
@FindBy(xpath="//div[@class='product-details current-quickview gallery-js-ready autorotation-active']/descendant::div[@class='product-size-container']/descendant::span[@data-key='8']")
private WebElement size;
@FindBy(xpath = "//div[@class='product-details current-quickview gallery-js-ready autorotation-active']/descendant::div[@class='product-size-container']/following-sibling::button")
private WebElement addToBasket;
@FindBy(id="small-cart")
private WebElement cart;




public WebElement getAddToBasket() {
	return addToBasket;
}


public WebElement getProductImg() {
	return productImg;
}


public WebElement getSize() {
	return size;
}


public WebElement getCart() {
	return cart;
}
}