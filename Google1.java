package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");
		Thread.sleep(2000);
		java.util.List<WebElement> submenu = driver.findElements(By.xpath("//form[@action='/search']"));
		
		for(WebElement item:submenu)
		{
			System.out.println(item.getText());
			
		}
		driver.findElement(By.xpath("//div[@class= 'aajZCb' /descendant::li[4]")).click();
		Thread.sleep(3000);
}
	
	}
