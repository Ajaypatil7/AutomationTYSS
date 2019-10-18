package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderSofa {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://urbanladder.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sofa", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Walton Leatherette Sofa (Chocolate)\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"icofont-cross\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='selector']")).click();
		driver.findElement(By.xpath("//div[@class='col-md-5 no-padding text-right action-section']/a[@data-gaclick='1']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']/button[@class='action-button checkout-button']")).click();
	
	    driver.close();
	    
	    
}

}