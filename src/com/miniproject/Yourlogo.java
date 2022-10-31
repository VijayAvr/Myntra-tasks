package com.miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yourlogo {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	//driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("samuelsam55@gmail.com");
	driver.findElement(By.xpath("//div[@class='submit']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//div[@class='radio-inline'])[1]")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys("samuel");
	driver.findElement(By.id("customer_lastname")).sendKeys("sam");
	driver.findElement(By.id("email"));
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sam1234$");

	driver.findElement(By.xpath("(//div[@class='selector'])[1]")).click();
	WebElement single = driver.findElement(By.id("days"));
	Select s=new Select(single);
	s.selectByValue("5");
//	
	driver.findElement(By.id("uniform-months")).click();
	WebElement single1 = driver.findElement(By.id("months"));
	Select s1=new Select(single1);
s1.selectByIndex(3);

driver.findElement(By.id("uniform-years")).click();
WebElement single2 = driver.findElement(By.id("years"));
Select s2=new Select(single2);
s2.selectByValue("1995");
//
driver.findElement(By.xpath("(//div[@class='checker'])[1]")).click();
driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("samuel");
driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("sam");
driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("tcs");
driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("sriramNagar 3rd street");
driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("manalinewtown");
driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("chennai");
driver.findElement(By.id("uniform-id_state")).click();
WebElement single3 = driver.findElement(By.id("id_state"));
Select s3=new Select(single3);
s3.selectByVisibleText("Indiana");
//
driver.findElement(By.name("postcode")).sendKeys("47906");
driver.findElement(By.id("uniform-id_country")).click();
driver.findElement(By.id("id_country"));
driver.findElement(By.name("other")).sendKeys("nothing to say");
driver.findElement(By.xpath("(//input[@class='form-control'])[7]")).sendKeys("044-23459876");
driver.findElement(By.name("phone_mobile")).sendKeys("9876543210");
driver.findElement(By.name("alias"));
driver.findElement(By.name("submitAccount")).click();

//driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]")).sendKeys("samuelsam55@gmail.com");
//driver.findElement(By.name("passwd")).sendKeys("sam1234$");
//driver.findElement(By.id("SubmitLogin")).click();
}
}
