package com.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
	
		driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@type='text'])[1]")));
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("9988765432");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("vvd");
	driver.findElement(By.xpath("(//input[@autocorrect='off'])[3]")).sendKeys("vignesh");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rkgkj45");
	driver.findElement(By.xpath("(//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[2]")).click();
	}

}
