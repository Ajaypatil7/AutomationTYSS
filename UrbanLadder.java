package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://urbanladder.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sofa", Keys.ENTER);
	    driver.close();
	
	}

}