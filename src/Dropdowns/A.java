package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	   
	    /*obj.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    obj.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    obj.findElement(By.xpath("//a[@value='GOI']")).click();
	    Thread.sleep(2000);
	    //obj.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
	    obj.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] ")).click();
	    
	    /*Thread.sleep(2000);
	    
	    obj.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	    Thread.sleep(4000);
	   int a= 1;
	    while(a<6)
	    {
	    	Thread.sleep(2000);
	    	
	    	 obj.findElement(By.id("hrefIncAdt")).click();
	    	 a++;
	    }*/
	    
        obj.navigate().to("https://spicejet.com");
	    
	    obj.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    obj.findElement(By.xpath("//a[@value='GOI']")).click();
	    Thread.sleep(2000);
	    //obj.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
	    //obj.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	    obj.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='PNQ']")).click();
	    
	    obj.findElement(By.cssSelector("[class='ui-datepicker-trigger']")).click();
	    obj.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
	    System.out.println(obj.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).getText());
	    
	    //obj.findElement(By.xpath("//*[@type=button]")).click();
	    
	    
	    /*Select dropdown = new Select(obj.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    dropdown.selectByIndex(3);
	    
	    obj.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	    obj.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li/following-sibling::li[5]")).click();
	    System.out.println(obj.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li/following-sibling::li[5]")).getText());
	    
	    obj.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
	    obj.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[3]/li/following-sibling::li[5]")).click();
	    System.out.println(obj.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[3]/li/following-sibling::li[5]")).getText());
	     */
	  
	}
}
