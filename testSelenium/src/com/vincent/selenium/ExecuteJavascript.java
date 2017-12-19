package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

/**
 * @Function: Selenium之执行Javascript
 * @author: Vincent
 * @date: 2017年12月18日下午9:23:59
 */
public class ExecuteJavascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(700, 600));
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
		Thread.sleep(3000);
		
		//将页面滚动条拖到底部
		((JavascriptExecutor)driver).executeScript("window.scrollTo(100,800);");
		Thread.sleep(3000);
		System.out.println("end");
		driver.quit();
	}
}
