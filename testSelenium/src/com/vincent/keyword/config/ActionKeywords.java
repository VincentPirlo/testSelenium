/**   
* @Title: ActionKeywords.java 
* @Package com.vincent.keyword.config 
* @Description: TODO
* @author Vincent  
* @date 2017年11月26日 下午9:46:51 
* @version V1.0   
*/ 
package com.vincent.keyword.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月26日下午9:46:51
 */
public class ActionKeywords {
	public static WebDriver driver=null;
	
	//启动浏览器
	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//打开开源中国网址
	public static void Navigate() {
		driver.get("http://www.oschina.net/");
	}
	
	//点击登录
	public static void Login_Click() {
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/a[1]")).click();
	}
	
	//输入用户名
	public static void Input_Name() {
		driver.findElement(By.xpath("//*[@id='userMail']")).sendKeys("xxxxxx");
	}
	
	//输入密码
	public static void Input_Password() {
		driver.findElement(By.xpath("//*[@id='userPassword']")).sendKeys("yyyyyyy");
	}
	
	//点击登录按钮
	public static void Login_Button() {
		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/article/div[1]/form/div/div[5]/button")).click();
	}
	
	//点击退出
	public static void Logout_Click() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/a[3]")).click();
	}
	
	//关闭浏览器
	public static void CloseBrowser() {
		driver.quit();
	}
}
