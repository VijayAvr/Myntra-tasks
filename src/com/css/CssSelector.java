package com.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		drive.findElement(By.cssSelector("input#email")).sendKeys("fkvmrek@gmail.com");
		drive.findElement(By.cssSelector("input[type^='pass']")).sendKeys("jerjggftf");
		drive.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
