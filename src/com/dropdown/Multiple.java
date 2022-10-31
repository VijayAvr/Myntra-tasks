package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		//driver.manage().window().maximize();
		WebElement multiple = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s=new Select(multiple);
		s.selectByVisibleText("Ant-Man");
	s.selectByIndex(1);
	s.selectByValue("ta");
	WebElement fs = s.getFirstSelectedOption();
	System.out.println(fs.getText());
	List<WebElement> all = s.getAllSelectedOptions();
	for(WebElement web:all)
	{
		System.out.println(web.getText());
		
	}
	List<WebElement> options = s.getOptions();
	for(WebElement we:options)
	{
		System.out.println(we.getText());
	}
//	s.deselectAll();
	}

}
