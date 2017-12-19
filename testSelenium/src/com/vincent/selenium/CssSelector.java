/**   
* @Title: CssSelector.java 
* @Package com.vincent.selenium 
* @Description: TODO
* @author Vincent  
* @date 2017年11月21日 下午9:37:26 
* @version V1.0   
*/ 
package com.vincent.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

/**
 * @Function: Selenium之CSS选择器
 * @author: Vincent
 * @date: 2017年11月21日下午9:37:26
 */
public class CssSelector {
	@Test
	public void csstest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.baidu.com");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#kw")).sendKeys("selenium");
		//driver.findElement(By.cssSelector("#su")).click();
		
		
		File file = new File("D:\\test-workspace\\testSelenium\\src\\css.html");
		String filepath = file.getAbsolutePath();
		driver.get("file:///"+filepath);
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.xpath("id('index')/div[2]/div/ul/div/li[2]/a"));
		WebElement ele2 = driver.findElement(By.cssSelector("#index div:nth-child(2) div ul div li:nth-child(2) a"));
		Assert.assertEquals(ele1.getText(), ele2.getText());
		driver.quit();
	}

}
