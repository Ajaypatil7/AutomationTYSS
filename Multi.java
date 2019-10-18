package com.tyss;


import java.util.List;
import java.nio.channels.SelectionKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADMIN/Desktop/multi.html");
		Thread.sleep(1000);
		WebElement w1=driver.findElement(By.id("b"));
		Select s1 = new Select(w1);
		List<WebElement> num= s1.getOptions();
		if(s1.isMultiple())
		{
			for(WebElement nums:num)
			{
				s1.selectByValue(nums.getText());
				
				List<WebElement> opt=(s1.getAllSelectedOptions());
				for(WebElement optn:opt)
				{
					System.out.println(optn.getText());
				}
				System.out.println(s1.getFirstSelectedOption().getText());
				s1.deselectAll();
			}
		}
		
	    
	
		
}
	

	}
