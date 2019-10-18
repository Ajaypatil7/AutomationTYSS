package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailFake {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// instead of thread .sleep we can use this
		driver.findElement(By.id("identifierId")).sendKeys("rnkavhale74245252@gmail.com");
	
		driver.findElement(By.id("identifierNext")).click();
		
		driver.findElement(By.id("password")).sendKeys("1234567890");
		
		driver.close();
	}
}
