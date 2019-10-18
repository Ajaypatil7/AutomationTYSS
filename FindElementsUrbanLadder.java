package com.tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElementsUrbanLadder {
	static {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://urbanladder.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		List<WebElement> menu= driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]"));//findelements is used to store all the module names
		for(WebElement name:menu)
		{
			System.out.println(name.getText());  //printing the module names
		}
		
		//driver.findElement(By.xpath("//li[@class=\"topnav_item saleunit\"]")).click();
		
		List<WebElement> menu1=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
		Thread.sleep(2000);
		Actions a =new Actions(driver);
		for(WebElement name:menu1)
		{
			System.out.println(name.getText());
			a.moveToElement(name).build().perform();
			Thread.sleep(2000);
		}
		
}

}