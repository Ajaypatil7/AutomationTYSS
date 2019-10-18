package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.findElement(By.name("btnLogin")).click();
		
		Alert a = driver.switchTo().alert(); //driver.switchTo().alert().accept();
		System.out.println(a.getText());
		a.accept();
		
     }

}