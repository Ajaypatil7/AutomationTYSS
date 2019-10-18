package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour  {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
    
	WebDriver driver = new ChromeDriver();
	driver.get("http://desktop-9suslu9/login.jsp");
	
	
	Thread.sleep(1000);
String cssValue = driver.findElement(By.xpath("span[text()='Username or password is invalid. Try again.']"));
System.out.println(cssValue);

driver.close();
	}
}
