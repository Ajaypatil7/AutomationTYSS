package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://desktop-9suslu9/login.jsp");
	
	int unlocation = driver.findElement(By.name("username")).getLocation().getX();
	
	int pwlocation = driver.findElement(By.name("pwd")).getLocation().getX();
	
	System.out.println(unlocation);
	System.out.println(pwlocation);
	if(unlocation==pwlocation)
	{
		System.out.println("both are same");
	}
	else {
		System.out.println("fail");
	}
	
	driver.close();
}
}
