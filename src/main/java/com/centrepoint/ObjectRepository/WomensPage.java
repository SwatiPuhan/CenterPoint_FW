package com.centrepoint.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensPage 
{
	public WomensPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  @FindBy(id="btn-cat-1")
  private WebElement clothingOptions;
public WebElement getClothingOptions() {
	return clothingOptions;
}
  
}
