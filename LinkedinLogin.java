package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("rnkavhale74245252@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.close();
	}
}
