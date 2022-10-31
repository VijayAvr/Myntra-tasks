package com.absolutexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://meesho.com/");
		drive.manage().window().maximize();
		drive.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[7]/span")).click();
	}

}
