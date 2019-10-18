package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	
		static {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		}
		
		public static void main(String[] args) throws Throwable {
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("ring", Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id=\"pid_34709\"]/img[@class=\"hc img-responsive center-block\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class=\"buynow-block col-xs-7\"]/input[@type=\"submit\"]")).click();
			driver.close();
}

}