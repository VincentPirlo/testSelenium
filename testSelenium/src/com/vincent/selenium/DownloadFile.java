package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * @Function: Selenium之下载文件
 * @author: Vincent
 * @date: 2017年12月18日下午8:28:39
 */
public class DownloadFile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("browser.download.folderList",2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
		firefoxProfile.setPreference("browser.download.dir","D:\\test-workspace\\testSelenium\\src");
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		WebDriver driver = new FirefoxDriver(firefoxProfile);
		
		driver.get("https://pypi.Python.org/pypi/selenium");
		driver.findElement(By.partialLinkText("selenium-2")).click();
		driver.quit();
		
	}
}
