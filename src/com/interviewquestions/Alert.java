package com.interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("kola mass");
		driver.switchTo().alert().accept();
		driver.findElement(By.id("modern")).click();
		
		}

}
