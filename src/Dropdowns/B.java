package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B 
{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	    /*obj.get("https:spicejet.com");
	    Thread.sleep(4000);
	    obj.findElement(By.id("divpaxinfo")).click();
	   
	    Select obj2 =new Select(obj.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    obj2.getOptions();

	    
	    Select obj3 =new Select(obj.findElement(By.id("ctl00_mainContent_ddl_Child")));
	    obj3.selectByIndex(3);
	    
	    /*obj.get("https://rahulshettyacademy.com/dropdownsPractise");
	    obj.findElement(By.id("divpaxinfo")).click();
	    for(int i=1;i<=6;i++)
	    {
	         obj.findElement(By.id("hrefIncAdt")).click();
	    }
	    obj.findElement(By.id("btnclosepaxoption")).click();*/
	    
	    obj.get("https://www.goair.in");
	    obj.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
	    obj.findElement(By.xpath("//*[@class='pax_link_common']")).click();
	    //Select obj2 =new Select(obj.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    
	    
	    
	    
	}
}
