package com.tyss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartJavaBooks {
	static {
		      System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	       }

	public static void main(String[] args) throws Throwable {
		
		double i=0;
		double big=0;
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
	    driver.findElement(By.xpath("//div[@class=\"O8ZS_U\"]/input")).sendKeys("javabooks",Keys.ENTER);
		List<WebElement> element = driver.findElements(By.xpath("div//[@class='hGSR34']"));
		for(WebElement subelement:element)
		{
			
		}
		
		
		
	}
}
