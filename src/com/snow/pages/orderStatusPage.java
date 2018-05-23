package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.snow.generics.BasePage;

public class orderStatusPage extends BasePage
{
	
	@FindBy(xpath="//b[@class='ng-binding']")
	private WebElement ReqNum;

	public orderStatusPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void DisplayReqMsg()
	{
		Reporter.log(ReqNum.getText(),true);
	}

}
