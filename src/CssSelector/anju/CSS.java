package CssSelector.anju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\anjal\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://login.salesforce.com/");
		obj.findElement(By.cssSelector("[class*='input r4']")).sendKeys("NandekarAN@dllgroup.com");
		
		obj.findElement(By.cssSelector("#password")).sendKeys("Instagram@1995");
		
		//obj.findElement(By.xpath("//*[@type='submit']")).click();
		obj.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(obj.findElement(By.cssSelector("[id='error']")).getText());
	}

}
