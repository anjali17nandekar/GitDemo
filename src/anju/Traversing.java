package anju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing 
{

		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
			WebDriver obj =new ChromeDriver();
			//obj.get("http://www.salesforce.com/ap/hub/sales/");
			//obj.findElement(By.xpath("//*[@id='products_menu_item']/parent::ul")).click();
			obj.get("http://www.facebook.com");
			obj.findElement(By.xpath("//*[text()='Create New Account']")).click();
			//obj.findElement(By.xpath("//div[@class='_6ltg']")).click();
			
			/*obj.get("https://www.salesforce.com/ap/hub/sales/");
			obj.findElement(By.xpath("//*[text()='Products']")).click();
			obj.findElement(By.xpath("//*[@id='products_menu_item']/following-sibling::li[1]")).click();*/
			
			//sibling traversing
			obj.get("https://www.salesforce.com/ap/hub/sales/");
			obj.findElement(By.xpath("//*[@class='leftnav-page-list']/ul/li/following-sibling::li[1]")).click();
		
			obj.findElement(By.xpath("//*[@class='leftnav-page-list']/ul/li/following-sibling::li[2]")).click();
			
			obj.findElement(By.xpath("//*[@class='leftnav-page-list']/ul/li/following-sibling::li[3]")).click();
			
			obj.findElement(By.xpath("//*[@class='leftnav-page-list']/ul/li/following-sibling::li[4 ]")).click();
			
			/*obj.get("https://www.salesforce.com/ap/hub/sales/");
			obj.findElement(By.xpath("//*[@class='active']/following-sibling::li[1]")).click();
	        obj.findElement(By.xpath("//*[@class='active']/following-sibling::li[2]")).click();
			obj.findElement(By.xpath("//*[@class='active']/following- ::li[3]")).click();*/
			
		}
}
