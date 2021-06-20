package anju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args)
	{
		//switch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\chromedriver_win32_1\\ChromeDriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://demo.guru99.com/selenium/deprecated.html");
		obj.switchTo().frame("classFrame");
		obj.findElement(By.linkText("Deprecated")).click();
		obj.navigate().back();
		obj.switchTo().frame("packageFrame");
		obj.findElement(By.linkText("Action")).click();
		//obj.navigate().back();
		//obj.switchTo().frame("packageListFrame");
		//obj.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
	}

}
