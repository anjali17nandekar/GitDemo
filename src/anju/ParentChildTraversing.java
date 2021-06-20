package anju;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTraversing
{


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver obj =new ChromeDriver();
		
		
		/*obj.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
	     obj.findElement(By.xpath("//section[@id='content']/div/div/div/div/ul/li[1]")).click();
	     obj.findElement(By.xpath("//div[@id='inputWrapper']/input")).sendKeys("facebook.com");
		 obj.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		 obj.get("https://www.tutorialspoint.com/videotutorials/subscription.php");
		 obj.findElement(By.xpath("//"));
		
		obj.get("http://qaclickacademy.com/interview.php");
		obj.findElement(By.xpath("//section/div/div/div/div/ul/li[1]")).click();
		obj.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();*/

		/*obj.findElement(By.xpath("//*[@id='products_menu_item']")).click();
		obj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.findElement(By.xpath("//*[@id='products_menu_item']/following-sibling::li")).click();
		obj.findElement(By.xpath("//*[@id='products_menu_item']/following-sibling::li[2]")).click();*/
		
		//Sibling traversing
		obj.get("http://www.salesforce.com/ap/hub/sales/");
		obj.findElement(By.xpath("//*[@id='products_menu_item']/following-sibling::li[1]")).click();
		
	    obj.findElement(By.xpath("//*[@id='products_menu_item']/following-sibling::li[2]")).click();
	    
	    obj.findElement(By.xpath("//*[@id='products_menu_item']/following-sibling::li[3]")).click();
	    //obj.close();
		
		
		
	}
}
