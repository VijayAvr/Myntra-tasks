package com.keyboardactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyactions {
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement deal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	Actions a=new Actions(driver);
	a.contextClick(deal).build().perform();
	
//	Robot r=new Robot();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	
//	WebElement lighting = driver.findElement(By.xpath("//a[text()='Fashion']"));
//	a.contextClick(lighting).build().perform();
//	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	
//	driver.findElement(By.xpath("//input[@type='text']")).click();
//	
//	r.keyPress(KeyEvent.VK_P);
//	r.keyRelease(KeyEvent.VK_P);
//	r.keyPress(KeyEvent.VK_O);
//	r.keyRelease(KeyEvent.VK_O);
//	r.keyPress(KeyEvent.VK_C);
//	r.keyRelease(KeyEvent.VK_C);
//	r.keyPress(KeyEvent.VK_O);
//	r.keyRelease(KeyEvent.VK_O);
//	r.keyPress(KeyEvent.VK_M);
//	r.keyRelease(KeyEvent.VK_M);
//	r.keyPress(KeyEvent.VK_3);
//	r.keyRelease(KeyEvent.VK_3);
//	r.keyPress(KeyEvent.VK_ENTER);
//	Thread.sleep(3000);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	
//
	}

}
