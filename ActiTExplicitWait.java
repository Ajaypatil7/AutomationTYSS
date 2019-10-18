package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTExplicitWait {

	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
       
		driver.manage().window().maximize();
		driver.get("http://desktop-9suslu9/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		WebDriverWait ww = new WebDriverWait(driver,10);
	/*	ww.until(ExpectedConditions.titleContains("alia"));*/
		ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"logout\"]"))).click();
		/*driver.findElement(By.id("logoutLink")).click();*/

		}
}
