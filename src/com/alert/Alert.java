package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']"));
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(3000); 
		driver.switchTo().alert().sendKeys("massss");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}

}
