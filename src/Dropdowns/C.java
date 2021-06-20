package Dropdowns;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C
{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	   
	    obj.get("https://www.testandquiz.com/selenium/testing.html");
	    WebElement obj1 = obj.findElement(By.id("testingDropdown"));
	    Select obj3 =new Select(obj1);
	    obj3.selectByValue("Database");
	    
	    obj.findElement(By.xpath("//*[text()='Generate Alert Box']")).click();
	  //Using Alert class to first switch to or focus to the alert box 
	    Alert a1 = obj.switchTo().alert();
	  //Using accept() method to accept the alert box 
	    a1.accept();
	    
	    Thread.sleep(4000);
	    
	    obj.findElement(By.xpath("//*[text()='Generate Confirm Box']")).click();  
	    Alert alert2 = obj.switchTo().alert();
	    
	    //Using dismiss() command to dismiss the confirm box (cancel)  
	    //Similarly accept can be used to accept the confirm box
	    alert2.dismiss();
	}

}
