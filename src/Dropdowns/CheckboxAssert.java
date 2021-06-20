package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssert
{
	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	   
	    //obj.get("https://spicejet.com");
	    obj.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    Assert.assertFalse(obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    //Assert.assertFalse(False);
	    System.out.println(obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    
	    obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	    System.out.println(obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    Assert.assertTrue(obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    
	    //System.out.println(obj.findElements(By.cssSelector("input[type='checkbox']")).size())

	    obj.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	    
	    System.out.println(obj.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	    Assert.assertTrue(obj.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	    
	    obj.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(4000);
		for(int a=1;a<6;a++)
		{
			
		    Thread.sleep(2000);
		    obj.findElement(By.id("hrefIncAdt")).click();
		   
	    }
		
		Assert.assertEquals(obj.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
		System.out.println(obj.findElement(By.id("divpaxinfo")).getText());
	}
	    

}
