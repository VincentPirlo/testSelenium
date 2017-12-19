package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @Function: Selenium之设置元素等待
 * @author: Vincent
 * @date: 2017年12月18日下午9:30:48
 */
public class TimeOut {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("http://www.baidu.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("kw")).sendKeys("selenium");
		
		driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
	}
}
