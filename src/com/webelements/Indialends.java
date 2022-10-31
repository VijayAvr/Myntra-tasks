package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indialends {
	public static void main(String[] args)
	{
		System.setProperty("webDriver.chrome.driver","D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://indialends.com/personal-loan");
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	name.sendKeys("vivin");
	driver.findElement(By.xpath("//label[@class='custom-control-label ']")).click();
	driver.findElement(By.xpath("//span[@class='custom-select-trigger']")).click();
	driver.findElement(By.xpath("//span[text()='Self Employed (Dr./CA)']"))
.click();	}
	
	

}
