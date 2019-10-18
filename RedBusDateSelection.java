package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusDateSelection {

	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       }
	public static void main(String[] args) throws Throwable {
	    ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(co);
    	driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("bengaluru");
		driver.findElement(By.id("dest")).sendKeys("Pune");
		driver.findElement(By.xpath("//label[contains(.,'Onward Date')]")).click();
		
	    String s2= driver.findElement(By.xpath("//div[@class='rb-calendar']/descendant::td[@class='monthTitle']")).getText();
	    Thread.sleep(2000);
	    String s1= "Dec 2019";
	    while(s2!=null)
	    {
	    if(s2.equals(s1))
	    {
	    	driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/descendant::td[@class='we day'][5]")).click();
	    	break;
	    }
	    else {
	    	driver.findElement(By.xpath("//div[@class='rb-calendar']/descendant::td[@class='next']")).click();
	    	Thread.sleep(1000);
	    	s2=driver.findElement(By.xpath("//div[@class='rb-calendar']/descendant::td[@class='monthTitle']")).getText();
	    	Thread.sleep(1000);
	    }
	    }
	    driver.findElement(By.id("search_btn")).click();
		//div[@class="rb-calendar"]/descendant::td[@class="next"] //calendar next button
		
		}
		
}
