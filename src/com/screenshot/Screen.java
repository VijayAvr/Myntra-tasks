package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	public static void main(String[] args) throws IOException {

		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\eclipse-workspace\\Selenium\\screenshot\\greens.png");
		FileUtils.copyFile(src, des);
	}

	
}
