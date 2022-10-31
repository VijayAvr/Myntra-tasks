package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsmethods {
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.Chrome.Driver","D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		String title = Driver.getTitle();
		System.out.println(title);
		String currentUrl = Driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement findElement = Driver.findElement(By.id("email"));
		findElement.sendKeys("tamana@gmail.com");
		
		
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);
		
		boolean displayed = findElement.isDisplayed();
		System.out.println(displayed);
		boolean enabled = findElement.isEnabled();
		System.out.println(enabled);
//		
//		findElement.clear();
//		
		
		WebElement findElement2 = Driver.findElement(By.name("pass"));
		findElement2.sendKeys("sdfgrg");
		
		String attribute2 = findElement2.getAttribute("name");
		System.out.println(attribute2);
		
		WebElement findElement3 = Driver.findElement(By.name("login"));
		findElement3.click();
	boolean selected = findElement3.isSelected();
		System.out.println(selected);
		
		
		
	}

}
