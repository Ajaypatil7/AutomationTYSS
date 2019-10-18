package com.tyss;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class BlueStoneSubmenu {
		static {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		}

		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			Thread.sleep(5000);
			
			List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"wh-main-menu\"]/li")); // findlements is
																										// used to store all
																										// the module names
			Actions a = new Actions(driver);
			Thread.sleep(1000);
			for (WebElement name : menu) {
				String menuName = name.getText();
				System.err.println(menuName);
				Thread.sleep(6000);
				a.moveToElement(name).build().perform();
				Thread.sleep(6000);
				List<WebElement> submenu = driver.findElements(By
						.xpath("//a[contains(.,'"+menuName+"')]/parent::li/descendant::li"));
				Thread.sleep(4000);
				for (WebElement item : submenu) {
					System.out.println(item.getText());
				}
			}

		}
	}



