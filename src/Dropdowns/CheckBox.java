package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver obj = new ChromeDriver();

		obj.get("https://www.spicejet.com");

		System.out.println(obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		obj.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(obj.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		obj.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(4000);
		Select obj1 = new Select(obj.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Thread.sleep(4000);
		obj1.selectByValue("6");

		// obj.findElement(By.id("ictl00_mainContent_view_date2")).isEnabled();
		System.out.println(obj.findElement(By.id("Div1")).getAttribute("style"));
		obj.findElement(By.cssSelector("[value='RoundTrip']")).click();
		// obj.findElement(By.id("ictl00_mainContent_view_date2")).isEnabled();
		System.out.println(obj.findElement(By.id("Div1")).getAttribute("style"));
		if (obj.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
