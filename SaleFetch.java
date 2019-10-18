package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleFetch {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://urbanladder.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(5000);
		String txt=driver.findElement(By.xpath("//li[@class=\"topnav_item saleunit\"]")).getText();
		Thread.sleep(5000);
		System.out.println(txt);
		}
}
