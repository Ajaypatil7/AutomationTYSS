package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in"); 
	   Thread.sleep(1000);
	    driver.findElement(By.id("nav-link-accountList")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("ap_email")).sendKeys("9730625382");
	    driver.findElement(By.id("continue")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("ap_password")).sendKeys("12345678");
	    
	    driver.findElement(By.id("signInSubmit")).click();
	    driver.close();
}
}
