package com.vincent.selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

/**
 * @Function: Selenium之findElements
 * @author: Vincent
 * @date: 2017年12月18日下午9:24:54
 */
public class GroupElements {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		File file = new File("D:\\test-workspace\\testSelenium\\src\\checkbox.html");
		String filepath = file.getAbsolutePath();
		System.out.println(filepath);
		driver.get("file:///"+filepath);
		
		List<WebElement> inputs = driver.findElements(By.tagName("input"));
		for(WebElement checkbox : inputs) {
			String type = new String(checkbox.getAttribute("type"));
			if(type.equals("checkbox")) {
				checkbox.click();
				Thread.sleep(2000);
				System.out.println("haha");
			}
		}
		
		driver.quit();
	}
}
