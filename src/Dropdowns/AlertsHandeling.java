package Dropdowns;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandeling 
{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	   
	    obj.get("https://rahulshettyacademy.com/AutomationPractice/");
	    obj.findElement(By.id("name")).sendKeys("anjali");
	    Thread.sleep(2000);
	  
	    obj.findElement(By.cssSelector("[value='Alert']")).click();
	    System.out.println(obj.switchTo().alert().getText()); 
	    
	    obj.switchTo().alert().accept();
	    //accept() use to accept the pop up box (ok)
	    Thread.sleep(2000);
	    
	    obj.findElement(By.cssSelector("[value='Confirm']")).click();
	    System.out.println(obj.switchTo().alert().getText());
	    obj.switchTo().alert().dismiss();
	    //dissmiss-click on cancel
	    //Using dismiss() command to dismiss the pop up confirm box (cancel)
	    
	}

}
