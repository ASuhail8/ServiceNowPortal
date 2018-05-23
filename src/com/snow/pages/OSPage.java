package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.generics.BasePage;

public class OSPage extends BasePage
{

	//Decleration
	
	@FindBy(xpath="//h2[.='Order Something']")
	private WebElement OS;
	
	//initialization
	
	public OSPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void OrderSomething()
	{
		OS.click();
	}
	
	
	
}
