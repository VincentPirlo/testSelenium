package com.vincent.selenium;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
//import org.openqa.selenium.edge.*;

public class TestBaidu {
public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
	//System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Internet Explorer\\MicrosoftWebDriver.exe");
	
	System.out.println("seting brwoser");
	
	//WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new InternetExplorerDriver();
	//WebDriver driver = new EdgeDriver();
	
	
	driver.manage().window().maximize();
	driver.get("https://www.baidu.com");
	String title = driver.getTitle();
	System.out.println(title);
	//driver.close();
	}
}