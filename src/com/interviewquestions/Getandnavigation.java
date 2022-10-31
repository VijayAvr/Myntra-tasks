package com.interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getandnavigation {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//it will wait for page laod
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		driver.get("https://twitter.com/login");
		//it doesnt wait for page load
		driver.navigate().to("https://telegram.org/");
		driver.navigate().to("https://www.cricbuzz.com/");
		driver.navigate().to("https://www.youtube.com/");
		
	}

}
