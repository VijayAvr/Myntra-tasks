package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=5888593651421896387&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=CjwKCAjwnZaVBhA6EiwAVVyv9MBrRKbfBxLsWvh1Wps6p6Osg2_WK9OyMchVR_ehVZytRQQIFwYgHxoCv90QAvD_BwE");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
	WebElement sellers = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
	sellers.click();
	String text = sellers.getText();
	System.out.println(text);
	
	}
	

}
