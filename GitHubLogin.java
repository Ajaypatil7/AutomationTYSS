package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(1000);
		driver.findElement(By.id("login_field")).sendKeys("Ajaypatil7");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("12345678");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		driver.close();
	}
}
