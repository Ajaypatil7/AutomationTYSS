package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfTextbox {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADMIN/Desktop/VisibilityOfTextbox.html");
		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox")))).sendKeys("hsvbsv");
		
}
	
}
