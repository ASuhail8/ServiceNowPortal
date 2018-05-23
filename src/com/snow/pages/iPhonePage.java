package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.generics.BasePage;

public class iPhonePage extends BasePage
{
	
	
	@FindBy(xpath="//button[contains(.,' Add to Cart ')]")
	private WebElement Add2Cart;
	
	@FindBy(xpath="(//span[.='Cart'])[1]")
	private WebElement cart;
	
	@FindBy(xpath="(//a[.='View Cart'])[2]")
    private WebElement viewCart;	

	public iPhonePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public void Add2cart()
	{
		Add2Cart.click();
	}
	
	
	
	public void clickOnViewCart()
	{
		viewCart.click();
	}
}
