package com.tyss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationSample {

		static {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		}
		
		
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/Sample.html");
		
		int unlocation = driver.findElement(By.xpath("//input[@checked]")).getLocation().getY();
		
	    int pwlocation = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).getLocation().getY();
		
		System.out.println(unlocation);
		System.out.println(pwlocation);
		if(unlocation==pwlocation)
		{
			System.out.println("both are same");
		}
		else {
			System.out.println("fail");
		}
		
		driver.close();
	}
	}

