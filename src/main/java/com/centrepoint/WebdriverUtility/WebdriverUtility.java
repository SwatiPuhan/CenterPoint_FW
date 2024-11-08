package com.centrepoint.WebdriverUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility
{
	public static Actions act;
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static WebDriverWait explicitWait(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		return wait;
		
	}
	public void waitTillVisibilityOfElement(WebDriver driver,WebElement element)
	{
		explicitWait(driver).until(ExpectedConditions.visibilityOf(element));
	}
	public static Actions action(WebDriver driver)
	{
		act=new Actions(driver);
		return act;
	}
	public void moveToTheElement(WebDriver driver,WebElement element)
	{
		action(driver).moveToElement(element).perform();
	}

}
