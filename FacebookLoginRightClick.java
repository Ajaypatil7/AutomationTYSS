package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLoginRightClick {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		Thread.sleep(1000);
		String w1=driver.findElement(By.xpath("//label[@for='email']")).getText();
		driver.findElement(By.id("email")).sendKeys(w1);
		/*WebElement log_in=driver.findElement(By.xpath("//input[@value='Log In']")); 
		Actions a= new Actions(driver);
		a.contextClick(log_in).perform();*/
}

}