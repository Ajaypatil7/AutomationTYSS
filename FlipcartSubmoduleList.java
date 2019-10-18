package com.tyss;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class FlipcartSubmoduleList {
		static {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		}

		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
			Thread.sleep(3000);
			
			List<WebElement> menu = driver.findElements(By.xpath("//div[@class=\"_3zdbog _3Ed3Ub\"]/ul/li")); // findlements is
																										// used to store all
																										// the module names
			Actions a = new Actions(driver);
			Thread.sleep(3000);
			for (WebElement name : menu) {
				String menuName = name.getText();
				System.err.println(menuName);
				Thread.sleep(6000);
				a.moveToElement(name).build().perform();
				Thread.sleep(6000);
				List<WebElement> submenu = driver.findElements(By
						.xpath("//a[contains(.,'"+menuName+"')]/ancestor::ul[@class=\"_2OZ78M _1fj2FQ\"]/descendant::li"));
				Thread.sleep(2000);
				for (WebElement item : submenu) {
					String s1=item.getText();
					System.out.println(s1);
					
				}
			}

		}
	}


