package com.vincent.selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
//import org.openqa.selenium.edge.*;

/**
 * @Function: Selenium���Ը���������򿪰ٶ�
 * @author: Vincent
 * @date: 2017��12��18������9:30:01
 */
public class TestBaidu {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	//System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
	//System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Internet Explorer\\MicrosoftWebDriver.exe");
	
	System.out.println("seting brwoser");
	
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new InternetExplorerDriver();
	//WebDriver driver = new EdgeDriver();
	
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://www.baidu.com");
	String title = driver.getTitle();
	System.out.println(title);
	//driver.close();
	}
}