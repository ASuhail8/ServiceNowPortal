package com.snow.generics;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage 
{
	public static WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public static void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is matching- "+"("+eTitle+")",true);
		}
		catch(Exception e)
		{
		Reporter.log("Title not matching",true);
		Assert.fail();
		}
	}
	
	
}
