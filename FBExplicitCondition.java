package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBExplicitCondition {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Alia");
		WebDriverWait ww = new WebDriverWait(driver,100);
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.id("email"), "Alia"));
	    driver.findElement(By.id("pass")).sendKeys("12345678");
	    driver.findElement(By.id("u_0_b")).click();
		
		driver.close();
		
		}
}
