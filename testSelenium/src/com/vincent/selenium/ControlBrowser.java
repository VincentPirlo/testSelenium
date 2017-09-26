package com.vincent.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class ControlBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String first_url = "https://www.baidu.com";
		String second_url = "http://news.baidu.com/";
		
		System.out.println("now access " + first_url);
		driver.get(first_url);
		System.out.println("now access " + second_url);
		driver.get(second_url);
		
		System.out.println("back to " + first_url);
		driver.navigate().back();
		
		System.out.println("forward to " + second_url);
		driver.navigate().forward();
	}
}
