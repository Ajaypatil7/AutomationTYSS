package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookDOB {
	private static final String Select = null;

	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
	    Select s = new Select(day);
	    s.selectByValue("20");
	   // s.selectByIndex(21);
	    WebElement month = driver.findElement(By.id("month"));
	    Select m = new Select(month);
	    m.selectByValue("8");
	     WebElement year = driver.findElement(By.id("year"));
	    Select y = new Select(year);
	    y.selectByValue("1996");
	   
	    
	    
		
}
	
}
