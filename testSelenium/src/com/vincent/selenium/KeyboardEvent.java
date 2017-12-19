package com.vincent.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @Function: Selenium֮�����¼�
 * @author: Vincent
 * @date: 2017��12��18������9:26:21
 */
public class KeyboardEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.baidu.com");
		WebElement input = driver.findElement(By.id("kw"));
		
		input.sendKeys("Selenium");
		Thread.sleep(1000);
		
		input.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		input.sendKeys(Keys.SPACE);
		input.sendKeys("�̳�");
		Thread.sleep(1000);
		
		input.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
		
		input.sendKeys(Keys.CONTROL,"x");
		Thread.sleep(1000);
		
		input.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(1000);
		
		input.sendKeys(Keys.ENTER);
		
	}
}
