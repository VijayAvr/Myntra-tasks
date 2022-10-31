package com.interviewquestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver","D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> findElements = driver.findElements(By.xpath("(//table[@id='shopping']/tbody/tr/td[2])"));
		
		for(WebElement web:findElements)
		{
			
			System.out.println(web.getText());
		}
		driver.findElement(By.xpath("(//table[@name='table']/tbody/tr/td[4])[2]")).click();
		System.out.println("success");

	}


}
