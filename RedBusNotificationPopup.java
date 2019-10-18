package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusNotificationPopup {
	
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       }
	public static void main(String[] args) {
	    ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(co);
	    
    	driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		
}

}