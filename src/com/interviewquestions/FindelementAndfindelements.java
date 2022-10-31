package com.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementAndfindelements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
			List<WebElement> findElements = driver.findElements(By.id("emai"));
	for(WebElement str:findElements)
	{
		str.sendKeys("drthrj");
		System.out.println(str);
	}
		driver.findElement(By.id("pass")).sendKeys("vrr");
	}	

}
