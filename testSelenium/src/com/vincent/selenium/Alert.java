package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @Function: Selenium之处理弹框
 * @author: Vincent
 * @date: 2017年12月18日下午8:13:52
 */
public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		
		//鼠标悬停“设置”链接
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
		
		//打开搜索设置
		driver.findElement(By.className("setpref")).click();
		Thread.sleep(2000);
		
		//保持设置
		driver.findElement(By.className("prefpanelgo")).click();
		Thread.sleep(2000);
		
		//接受弹窗
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
