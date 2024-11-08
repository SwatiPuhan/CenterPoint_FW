package com.centrepoint.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "btn-checkout")
	private WebElement checkOutOption;
	public WebElement getCheckOutOption() {
		return checkOutOption;
	}

}
