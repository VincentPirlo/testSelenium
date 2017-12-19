package com.vincent.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @Function: Selenium֮ˢ��ҳ��
 * @author: Vincent
 * @date: 2017��12��18������9:26:44
 */
public class RefreshPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://www.baidu.com";
		driver.get(url);
		
		Thread.sleep(5000);
		System.out.println("refresh the page");
		driver.navigate().refresh();
		System.out.println("refresh ok");
	}
}
