package com.interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.id("fruits"));
		Select s=new Select(single);
		s.selectByVisibleText("Mango");
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		WebElement heros = driver.findElement(By.id("superheros"));
Select s1=new Select(heros);
s1.selectByIndex(2);
s1.selectByValue("bp");
boolean multiple = s1.isMultiple();
System.out.println(multiple);
WebElement programing = driver.findElement(By.id("lang"));
Select s2=new Select(programing);
s2.selectByValue("sharp");
List<WebElement> options = s2.getOptions();
for(WebElement web:options)
{
	System.out.println(web.getText());
}
WebElement country = driver.findElement(By.id("country"));
	Select s3=new Select(country);
	s3.selectByIndex(6);
	WebElement selectedOption = s3.getFirstSelectedOption();
	System.out.println(selectedOption.getText());
	}

}
