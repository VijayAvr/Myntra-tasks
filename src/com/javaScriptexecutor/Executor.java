package com.javaScriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		
		//WebElement watch = driver.findElement(By.xpath("//a[@title='Special Offers']"));
	//js.executeScript("arguments[0].scrollIntoView();", watch);
	//Thread.sleep(3000);
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	js.executeScript("document.getElementById('text').value='seleniumtesting.com';", search);
	}

}
