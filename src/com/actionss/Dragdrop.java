package com.actionss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/droppable/");
//		driver.manage().window().maximize();
//	Actions a=new Actions(driver);
//	WebElement drag = driver.findElement(By.id("draggable"));
//	WebElement drop = driver.findElement(By.id("droppable"));
//	//with using drag&drop method
//	a.dragAndDrop(drag,drop).build().perform();
//	
	//without using drag&drop method
	
	//a.clickAndHold(drag).moveToElement(drop).build().perform();
		
		driver.get("https://letcode.in/dropable");
		Actions a=new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
	a.dragAndDrop(drag, drop).build().perform();
	}

}
