package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.generics.BasePage;

public class BbcPage extends BasePage
{
	
	@FindBy(xpath="//a[.=' Browse by Categories ']")
	private WebElement Bbc;

	public BbcPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void Browsebycategory()
	{
		Bbc.click();
	}

}
