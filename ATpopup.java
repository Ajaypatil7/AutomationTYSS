package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ATpopup {

	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"menuTable\"]/div[3]")).click();
		driver.findElement(By.xpath("//li[@class=\"popup_menu_item\"]/a[(contains(.,'About your actiTIME'))]")).click();
		
		
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>()
	     {
	    	 public java.lang.Boolean apply(WebDriver driver)
	    	 {
	    		 return driver.findElement(By.xpath("//td[@class=\"aboutCopyright\"]")).isDisplayed();
	    		
	    	 }
	     });
		
		String a = driver.findElement(By.xpath("//td[@class=\"aboutCopyright\"]")).getText();
		System.out.println(a);
		
		}
}
