package com.centrepoint.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPage 
{
	public OverViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(xpath = "//img[contains(@src,'onboarding_closebutton')]")
	private WebElement closeicon;
	@FindBy(xpath ="//div[@id='dept-women']/a[contains(@href,'department/women')]" )
	private WebElement womensOption;

	public WebElement getWomensOption() {
		return womensOption;
	}

	public WebElement getCloseicon() {
		return closeicon;
	}

		
}
