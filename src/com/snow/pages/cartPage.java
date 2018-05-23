package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.generics.BasePage;

public class cartPage extends BasePage
{

	@FindBy(xpath="//span[.='Proceed to Checkout']")
	private WebElement PTC;
	
	@FindBy(xpath="//span[.='Checkout']")
	private WebElement checkout;
	
	public cartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPTC()
	{
		PTC.click();
	}
	
	public void clickonCheckout()
	{
		checkout.click();
	}
	

}
