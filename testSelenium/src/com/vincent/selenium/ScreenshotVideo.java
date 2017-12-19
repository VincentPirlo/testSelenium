package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: Selenium֮������Ƶ������
 * @author: Vincent
 * @date: 2017��12��18������9:28:25
 */
public class ScreenshotVideo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://videojs.com/");
		WebElement video = driver.findElement(By.xpath("//body/section/div/video"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//��ȡ��Ƶ��URL
		jse.executeScript("return arguments[0].currentSrc;", video);
		
		//������Ƶ������15����
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(15000);
		
		//��ͣ��Ƶ
		jse.executeScript("arguments[0].pause()", video);
		Thread.sleep(3000);
		driver.quit();
	}
}
