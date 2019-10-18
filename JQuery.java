package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery {
	
		static {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		}
		
		public static void main(String[] args) throws Throwable {
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/slider/");
			Thread.sleep(1000);
			WebElement frame =driver.findElement(By.xpath("iframe[@class='demo-frame']"));
			driver.switchTo().frame(frame);
			WebElement slider=driver.findElement(By.id("slider"));
			Actions a =new Actions(driver);
			WebElement cursor;
			a.dragAndDropBy(cursor, 200, 0).perform();
}

}