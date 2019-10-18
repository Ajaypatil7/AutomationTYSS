package com.tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderSubmoduleNames {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://urbanladder.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li")); // findelements is
																									// used to store all
																									// the module names
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement name : menu) {
			String menuName = name.getText();
			System.err.println(menuName);
			Thread.sleep(1000);
			a.moveToElement(name).build().perform();
			Thread.sleep(3000);
			List<WebElement> submenu = driver.findElements(By
					.xpath("//span[contains(.,'" + menuName + "')]/parent::li/descendant::ul[@class=\"QPOmNK\"]"));
			for (WebElement item : submenu) {
				System.out.println(item.getText());
			}
		}

	}
}
