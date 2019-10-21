package com.tyss;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSelectReqText {
	
		static {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		}
		static Boolean found;
		static WebElement ele;
		static int count=1;
		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
	 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OnePlus",Keys.ENTER);
	        Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			try {
			WebElement ele = driver.findElement(By.xpath("//div[@class='r']/descendant::h3[contains(.,'OnePlus - Home | Facebook')]"));
			found=true;
			}
			catch (Exception NoSuchElementException)
			{
			 found= false;
			}
			while(count==1)
			if(found)
			{
		    driver.findElement(By.xpath("//div[@class='r']/descendant::h3[contains(.,'OnePlus - Home | Facebook')]")).click();
			js.executeScript("arguments[0].scrollIntoView()",ele);
			ele.click();
			count++;
			break;
			}
		    else
		    {
		    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	        	driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
	        	Thread.sleep(1000);
	        	found= driver.findElement(By.xpath("//div[@class='r']/descendant::h3[contains(.,'OnePlus - Home | Facebook')]")).isDisplayed();;
		    }
			
			/*if(found)
				driver.findElement(By.xpath("//h3[contains(.,'OnePlus - Home | Facebook')]")).click(); 
			else
			{
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	        	driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
			    ele= driver.findElement(By.xpath("//h3[contains(.,'OnePlus - Home | Facebook')]")).isDisplayed();
	        	
	        }*/
				
				
				
				
				
				
				
				
				
				
		/*	}
			 next1 = driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).isEnabled();
	        Thread.sleep(2000);

	        while(next1)
	        {
	        	driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
	        	Thread.sleep(2000);
	        	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	        	next1 = driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).isEnabled();
	       
	        	
	        	
	        }*/
			
	}
}
