package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBExplicitConditionLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		 (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>()
	     {
	    	 public java.lang.Boolean apply(WebDriver driver)
	    	 {
	    		 return driver.findElement(By.id("u_0_4")).isEnabled();
	    		
	    	 }
	     });
		 driver.findElement(By.id("email")).sendKeys("Ajay");
		 driver.findElement(By.id("pass")).sendKeys("12345678");
		 Thread.sleep(2000);
		 driver.findElement(By.id("u_0_4")).click();
		 driver.close();
		
		}
}
