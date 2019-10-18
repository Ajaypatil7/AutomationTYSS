package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText {


		static {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException   {
		
			   WebDriver driver= new ChromeDriver();
			   
			    driver.get("http://desktop-9suslu9/login.jsp");
			    //clear the text or value present in textbox
			    driver.findElement(By.xpath("[@type"))
			    

	}

}
