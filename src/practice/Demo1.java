package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.snow.generics.Autoconst;

public class Demo1 implements Autoconst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty(gkey, gvalue);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dev56922.service-now.com/sp?sysparm_stack=no");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("dr1oR6EvQuTY");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[.='Order Something']")).click();
		Thread.sleep(1000);
		/*
		driver.findElement(By.xpath("//a[.=' Apple iPad 3 ']")).click();
		Thread.sleep(1000);
		String Reqnumber = driver.findElement(By.className("//b[@class='ng-binding']")).getText();
		System.out.println(Reqnumber);
	    */
		driver.findElement(By.xpath("//a[.=' Browse by Categories ']")).click();
		driver.findElement(By.id("e15706fc0a0a0aa7007fc21e1ab70c2f")).click();
		//driver.findElement(By.xpath("//h2[contains(.,'Change Password')]")).click();
		driver.findElement(By.xpath("(//h2[contains(.,'Password Reset')])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"s2id_sp_formfield_IO:2a2be6520a0a020e00d111208c9c6391\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[.='Email'])[2]")).click();
		driver.findElement(By.xpath("(//div[.='Email'])[1]")).click();
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[.='Your request has been submitted']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='ng-binding']")).getText());
		
		
		driver.findElement(By.xpath("//span[.='System Administrator']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
	}

}
