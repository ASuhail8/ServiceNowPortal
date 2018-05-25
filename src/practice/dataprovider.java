package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.snow.generics.Autoconst;

public class dataprovider implements Autoconst

{
	WebDriver driver;

	@BeforeMethod
	public void precondtion()
	{
		System.setProperty(gkey, gvalue);
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dev56922.service-now.com/sp?sysparm_stack=no");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data = new Object[2][2];
		data[0][0]="admin";
		data[0][1]="password";
		data[1][0]="admin1";
		data[1][1]="password2";		
		
		return data;
		
	}
	
	
	
	
	@Test(dataProvider="getData")
	public void enterData(String un, String pwd)
	{
	
		
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys(un);
		
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(pwd);
	
	
		
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	
}
