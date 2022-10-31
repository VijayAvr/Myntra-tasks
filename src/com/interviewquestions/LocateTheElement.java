package com.interviewquestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTheElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("doctors near me");
		driver.findElement(By.xpath("(//div[@role='option']/div/span[text()='doctors near me'])[1]")).click();
		//driver.findElement(By.xpath("(//div[@role='option'])[3]")).click();
		//without using index
		//driver.findElement(By.xpath("//div[@role='option']/div/span/b[text()=' for fever']")).click();
	List<WebElement> list = driver.findElements(By.xpath("//div[@lang='en']/div/div/div/a"));
	for(WebElement web:list)
	{
		System.out.println(web.getText());
	}
	}

}
