package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutlookLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.get("https://login.microsoftonline.com"); 
	    Thread.sleep(1000);
	    driver.findElement(By.id("i0116")).sendKeys("rnkavhale7797@outlook.com");
	    driver.findElement(By.id("idSIButton9")).click();
	    
	    Thread.sleep(4000);
	    driver.findElement(By.id("i0118")).sendKeys("12345678");
	    
	    driver.findElement(By.id("idSIButton9")).click();
	    driver.close();
}
}
