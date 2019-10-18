package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/login"); 
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("ajay");
	    driver.findElement(By.id("pass")).sendKeys("12345");
	  
	    
	}
}
