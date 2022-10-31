package com.interviewquestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://littlecanadian.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("(//a[@href='/collections/all'])[2]")).click();
	
		WebElement sprouts = driver.findElement(By.xpath("(//a[@class='grid-product__link'])[2]"));
		Actions a=new Actions(driver);
		a.contextClick(sprouts).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String id:windowHandles)
		{
			System.out.println(id);	
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		
	}

}
