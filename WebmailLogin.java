package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebmailLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.get("http://webmail.testyantra.in/"); 
	    driver.findElement(By.id("user")).sendKeys("ajay.k@testyantra.in");
	    
	    
	    Thread.sleep(1000);
	    driver.findElement(By.id("pass")).sendKeys("12345678");
	    
	    driver.findElement(By.id("login_submit")).click();
	    driver.close();
}
}
