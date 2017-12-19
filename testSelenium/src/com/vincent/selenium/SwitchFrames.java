package com.vincent.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: Selenium之切换frame
 * @author: Vincent
 * @date: 2017年12月18日下午9:29:01
 */
public class SwitchFrames {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Mozilla Firefox\\\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		File file = new File("D:\\test-workspace\\testSelenium\\src\\frame.html");
		String filePath = file.getAbsolutePath();
		driver.get("file:///"+filePath);
		
		//切换到iframe(id = "if")
		driver.switchTo().frame("if");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
