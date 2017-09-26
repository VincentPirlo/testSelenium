package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class VerifyInfo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://email.163.com/");
		
		System.out.println("Before login===============");
		//获取当前的title和url
		System.out.println("title of current page is " + driver.getTitle());
		System.out.println("url of current page is " + driver.getCurrentUrl());
		
		//登录163邮箱idPlaceholder
		driver.findElement(By.id("userNameIpt")).clear();
		driver.findElement(By.id("userNameIpt")).sendKeys("hellovincent");//填入用户名
		driver.findElement(By.id("pwdInput")).clear();
		driver.findElement(By.id("pwdInput")).sendKeys("123456");//填入密码
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(5000);
		
		System.out.println("After login=====================");
		//获取当前的title和url
		System.out.println("title of current page is " + driver.getTitle());
		System.out.println("url of current page is " + driver.getCurrentUrl());
		
		//获取登录用户名
		String text = driver.findElement(By.id("spnUid")).getText();
		System.out.println(text);
	}
}
