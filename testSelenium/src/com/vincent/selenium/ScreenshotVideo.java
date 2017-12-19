package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: Selenium之播放视频并截屏
 * @author: Vincent
 * @date: 2017年12月18日下午9:28:25
 */
public class ScreenshotVideo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://videojs.com/");
		WebElement video = driver.findElement(By.xpath("//body/section/div/video"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//获取视频的URL
		jse.executeScript("return arguments[0].currentSrc;", video);
		
		//播放视频，播放15秒钟
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(15000);
		
		//暂停视频
		jse.executeScript("arguments[0].pause()", video);
		Thread.sleep(3000);
		driver.quit();
	}
}
