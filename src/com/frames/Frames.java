package com.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		//driver.manage().window().maximize();
	
	WebElement name = driver.findElement(By.id("firstFr"));
	driver.switchTo().frame(name);
	driver.findElement(By.name("fname")).sendKeys("vicky");
	Thread.sleep(3000);
driver.findElement(By.name("lname")).sendKeys("vignesh");
Thread.sleep(3000);
driver.switchTo().defaultContent();
WebElement frame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
driver.switchTo().frame(frame);
driver.findElement(By.name("email")).sendKeys("cemewk@gmail.com");
//	WebElement outer = driver.findElement(By.xpath("//iframe[@src='page.html']"));
//	driver.switchTo().frame(outer);
//	WebElement inner = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
//	driver.switchTo().frame(inner);
//	driver.findElement(By.xpath("//button[@id='Click1']")).click();
//	driver.switchTo().defaultContent();
//	
//	
//	WebElement one = driver.findElement(By.xpath("//iframe[@src='countframes.html']"));
//	driver.switchTo().frame(one);
//	
//	Dimension size = driver.findElement(By.tagName("iframe")).getSize();
//	System.out.println(size);
}

}
