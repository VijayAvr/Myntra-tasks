package com.webelements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	public static void main(String[] args) throws  InterruptedException, IOException {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.facebook.com/login/");
		drive.manage().window().maximize();
		drive.findElement(By.id("email")).sendKeys("dvbggfr@gmail.com");
		drive.findElement(By.id("pass")).sendKeys("defvr");
		drive.findElement(By.name("login")).click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)drive;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Vijay AVR\\Desktop//Facebook.jpeg‪");
		FileUtils.copyFile(src,dest);
		
	}

}
