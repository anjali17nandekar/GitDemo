package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_Checkbox
{
	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	
	    obj.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Assert.assertFalse(obj.findElement(By.id("checkBoxOption1")).isSelected());
	    System.out.println(obj.findElement(By.id("checkBoxOption1")).isSelected());
	    
	    obj.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertTrue(obj.findElement(By.id("checkBoxOption1")).isSelected());
	    System.out.println(obj.findElement(By.id("checkBoxOption1")).isSelected());
	    
	    Thread.sleep(4000);
	    
	    obj.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertFalse(obj.findElement(By.id("checkBoxOption1")).isSelected());
	    //System.out.println(obj.findElements(By.xpath("//*[@type='checkbox']")).size());
	    
	    List <WebElement> count = obj.findElements(By.xpath("//*[@type='checkbox']"));
	    System.out.println(count.size());
	    
	    
	}

}
