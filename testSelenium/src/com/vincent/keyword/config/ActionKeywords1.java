/**   
* @Title: ActionKeywords1.java 
* @Package com.vincent.keyword.config 
* @Description: TODO
* @author Vincent  
* @date 2017年11月28日 下午9:16:14 
* @version V1.0   
*/ 
package com.vincent.keyword.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vincent.keyword.utility.Contants;
import com.vincent.keyword.utility.OrpUtil;
import com.vincent.keyword.utility.StartEngine;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月28日下午9:16:14
 */
public class ActionKeywords1 {
	public static WebDriver driver = null;
	
	//启动浏览器并最大化
	public static void OpenBrowser(String OR) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//打开开源中国网址
	public static void Navigate(String OR) {
		try {
			driver.get(Contants.url);
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//点击登录
	public static void Login_Click(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//输入用户名
	public static void Input_Name(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).clear();
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).sendKeys(Contants.userName);
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//输入密码
	public static void Input_Password(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).sendKeys(Contants.userPassword);
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//点击登录按钮
	public static void Login_Button(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//点击退出
	public static void Logout_Click(String OR) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//关闭浏览器
	public static void CloseBrowser(String OR) {
		driver.quit();
	}
}
