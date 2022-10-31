package com.actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.id("doubleClickBtn"));
		Actions a=new Actions(driver);
		a.doubleClick(btn).build().perform();
	System.out.println(btn.getText());
	
	WebElement btn1 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	a.contextClick(btn1).build().perform();
	System.out.println(btn1.getText());
	
	WebElement btn2 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	a.click(btn2).build().perform();
	System.out.println(btn2.getText());
	}

}
