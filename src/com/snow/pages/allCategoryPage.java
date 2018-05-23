package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.generics.BasePage;

public class allCategoryPage extends BasePage {
	
	@FindBy(id="e15706fc0a0a0aa7007fc21e1ab70c2f")
    private WebElement allCat;
	
	@FindBy(xpath="//h2[contains(.,'Create Incident')]")
	private WebElement CreateINC;
	
	@FindBy(xpath="//a[contains(.,'Hardware')]")
	private WebElement Hardware;
	
	@FindBy(xpath="//h2[contains(.,'iPhone 6s')]")
	private WebElement iphone;
	
	public allCategoryPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickoncanwehelpyou()
	{
		allCat.click();
	}
	
	public void clickOnCreateINC()
	{
		CreateINC.click();
	}
	
	public void ClickOnHardware()
	{
		Hardware.click();
	}
	
	public void clickOnIphone6s()
	{
		iphone.click();
	}
	
	

}
