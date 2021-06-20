package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI 
{
	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	   
	    obj.get("https://www.spicejet.com");
	    //obj.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
	    //System.out.println(obj.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).getText());
	    obj.findElement(By.cssSelector("[class='ui-datepicker-trigger']")).click();
	    obj.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
	    System.out.println(obj.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).getText());
	    //obj.findElement(By.linkText("24")).click();
	    //System.out.println(obj.findElement(By.linkText("24")).getText());
	    //obj.findElement(By.linkText("22")).click();
	    //System.out.println(obj.findElement(By.linkText("22")).getText());
	}
	    

}
