package com.snow.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconst
{
public static WebDriver driver;

@BeforeMethod
public void preCondition()
{
	
	System.setProperty(gkey, gvalue);
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://dev56922.service-now.com/sp?sysparm_stack=no");
}

@AfterMethod
public void postCondition()
{
	driver.close();
}
	
	
}
