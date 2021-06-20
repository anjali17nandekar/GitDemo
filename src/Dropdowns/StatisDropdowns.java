package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StatisDropdowns
{
	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	    WebDriver obj =new ChromeDriver();
	    obj.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    Select dropdown = new Select(obj.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    dropdown.selectByIndex(3);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("AED");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    //dropdown.selectByValue("INR");
	    Select dropdown1 = new Select(obj.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
	    dropdown1.selectByValue("BLR");
        System.out.println(dropdown1.getFirstSelectedOption().getText());
	}
}
