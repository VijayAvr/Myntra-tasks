package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args)
	{
	System.setProperty("WebDriver.chrome.Driver","C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
	driver.manage().window().maximize();
	
	WebElement ipl = driver.findElement(By.xpath("//h1[text()='IPL 2022']"));
	String text = ipl.getText();
	System.out.println(text);
	
	WebElement ip = driver.findElement(By.xpath("//h1[contains(text(),'IPL')]"));
	String text2 = ip.getText();
	System.out.println(text2);
	
	WebElement news = driver.findElement(By.xpath("//a[contains(@class,'text-white')][1]"));
	news.click();
	
	
	WebElement cricplus = driver.findElement(By.xpath("//a[@id='cricbuzz-plus-main-menu']"));
	cricplus.click();
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("india");
	}
}
