package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/dropdowns");
//	driver.manage().window().maximize();
	WebElement single = driver.findElement(By.xpath("//select[@id='fruits']"));
	Select s=new Select(single);
	s.selectByVisibleText("Orange");
	Thread.sleep(3000);
s.selectByValue("3");
	Thread.sleep(3000);
	s.selectByIndex(2);
	WebElement fs = s.getFirstSelectedOption();
	System.out.println(fs.getText());
	List<WebElement> options = s.getOptions();
	for(WebElement web:options)
	{
		System.out.println(web.getText());
	}
//s.deselectByIndex(6);
}
}
