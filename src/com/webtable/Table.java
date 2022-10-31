package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
	
		WebElement tab = driver.findElement(By.xpath("//table[@cellspacing='0']"));
	System.out.println(tab.getText());
	System.out.println("----------");
	
	String text = driver.findElement(By.xpath("(//table[@cellspacing='0'])//tr[4]")).getText();
System.out.println(text);
	List<WebElement> s = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement web : s)
	{
		web.click();
	}
	}

	}

