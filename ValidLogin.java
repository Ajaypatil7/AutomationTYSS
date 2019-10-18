package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLogin{

			static {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			}

			public static void main(String[] args) throws InterruptedException   {
			
				   WebDriver driver= new ChromeDriver();
				    driver.get("http://desktop-9suslu9/login.jsp");
				    Thread.sleep(8000);
				   
				    driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
				   driver.findElement(By.name("pwd")).sendKeys("manager");
				   Thread.sleep(1000);
				   driver.findElement(By.xpath("//a[text()='Login']")).click();
				   Thread.sleep(1000);
				    
				   String ExpectedTitle = "Enter Time-Track";
				   String ActualTitle = driver.getTitle();
				   
				   if(ActualTitle.contains(ExpectedTitle)) 
				   {
					   driver.findElement(By.xpath("//a[text()='Logout']")).click();
					   System.out.println("Title is displayed and logout");
				   }
				   else
				   {
					   System.out.println("Title is displayed and logout");
				   }
				   
				   
				 
				   Thread.sleep(1000);
			    
				   driver.close();
			    }


}
