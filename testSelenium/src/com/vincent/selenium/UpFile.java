package com.vincent.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: Selenium֮�ϴ��ļ�
 * @author: Vincent
 * @date: 2017��12��18������9:31:49
 */
public class UpFile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		File file = new File("D:\\test-workspace\\testSelenium\\src\\upfile.html");
		String filePath = file.getAbsolutePath();
		driver.get("file:///"+filePath);
		Thread.sleep(3000);
		driver.findElement(By.name("file")).sendKeys("D:\\test-workspace\\testSelenium\\src\\upfile.txt");
		Thread.sleep(5000);
		driver.quit();
		
	}
}
