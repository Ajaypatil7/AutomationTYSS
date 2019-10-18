package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-9suslu9/login.jsp");
		//get the height of username textbox
		int unheight = driver.findElement(By.name("username")).getSize().getHeight();
		
		//get the height of password textbox
		int pwheight = driver.findElement(By.name("pwd")).getSize().getHeight();
		
	System.out.println(pwheight);
		
		if(unheight==pwheight ) {
			System.out.println("height of username textbox and password textbox is same");
		}
		else {
			System.out.println("not same");
			}
	}
	
	
	
	
}
