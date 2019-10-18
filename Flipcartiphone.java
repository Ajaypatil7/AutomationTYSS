package com.tyss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartiphone {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
	
		driver.findElement(By.xpath("//div[@class=\"O8ZS_U\"]/input")).sendKeys("Iphone",Keys.ENTER);
        
        driver.findElement(By.xpath("//div[@class=\"col col-7-12\"]/div[contains(.,'Apple iPhone 7 (Black, 32 GB)')]")).click();
        Set<String> sabtab = driver.getWindowHandles();
        for(String tab: sabtab)
        {
        	driver.switchTo().window(tab);
        	
        }
		
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA iwYpF9 _7UHT_c\"]")).click();
		}
}
