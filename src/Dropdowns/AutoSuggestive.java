package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive 
{
	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	   
	    obj.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    obj.findElement(By.id("autosuggest")).sendKeys("ind");
	    Thread.sleep(3000);
	    List<WebElement> options =  obj.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	    //List<WebElement> options =  obj.findElements(By.cssSelector("li[class='ui-menu-item']"));
	    
	    for(WebElement option :options)
	    {
	    	if(option.getText().equalsIgnoreCase("India"))
	    	    {
	    		    option.click();
	    		    break;
	    	    }
	    	
	    	
	    }
	    
	    
	}

}
