package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Vijay AVR\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.google.com/search?q=gmail&oq=gmail&aqs=chrome..69i57j69i61j69i65.2434j0j15&sourceid=chrome&ie=UTF-8");
		String title = Driver.getTitle();
		System.out.println(title);
		String currentUrl = Driver.getCurrentUrl();
System.out.println(currentUrl);
Driver.manage().window().maximize();
Driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s|c|550525805682|e|fb%20%27|&placement=&creative=550525805682&keyword=fb%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-431331344637%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw7cGUBhA9EiwArBAvoucT_U9k_W5UIt9gqs4SH1NgUdYT1pmrCxwo5TYTlyESwUWWF37pfRoCzjkQAvD_BwE");
Driver.navigate().back();
Driver.navigate().forward();
Driver.navigate().refresh();
Driver.close();
Driver.quit();
	}

}
