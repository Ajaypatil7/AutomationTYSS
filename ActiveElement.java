package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
    
	WebDriver driver = new ChromeDriver();
	driver.get("http://desktop-9suslu9/login.jsp");
	
	String AttributeValue = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println(AttributeValue);
		
		String CssValue = driver.findElement(By.xpath("//a[text()='Login']")).getCssValue("colour");
		System.out.println(CssValue);
		
		String FontFamily = driver.findElement(By.xpath("//a[text()='Login']")).getCssValue("font-family");
		System.out.println(FontFamily);
		driver.quit();
		
	}

}
