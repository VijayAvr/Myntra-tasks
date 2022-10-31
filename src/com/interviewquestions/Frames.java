package com.interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("WEbdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		//WebElement frame = driver.findElement(By.id("firstFr"));
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mass");
		driver.findElement(By.name("lname")).sendKeys("mmmmmmm");
		//driver.switchTo().defaultContent();
		//WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		//driver.findElement(By.xpath(""));
		driver.findElement(By.name("email")).sendKeys("massmm@gmail.com");
				
	}

}
