package com.dynamicxpath;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dxpath {
	public static void main(String[] args)
	{
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--disable-notifications");
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(Options);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement web= driver.findElement(By.xpath("((//a[@rel='noreferrer'])[92]//preceding::a[@target='_self'])[197]"));
		Actions s=new Actions(driver);
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(a));
		s.doubleClick(web).build().perform();
	
	}

}
