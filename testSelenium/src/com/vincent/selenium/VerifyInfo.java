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
		//��ȡ��ǰ��title��url
		System.out.println("title of current page is " + driver.getTitle());
		System.out.println("url of current page is " + driver.getCurrentUrl());
		
		//��¼163����idPlaceholder
		driver.findElement(By.id("userNameIpt")).clear();
		driver.findElement(By.id("userNameIpt")).sendKeys("hellovincent");//�����û���
		driver.findElement(By.id("pwdInput")).clear();
		driver.findElement(By.id("pwdInput")).sendKeys("123456");//��������
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(5000);
		
		System.out.println("After login=====================");
		//��ȡ��ǰ��title��url
		System.out.println("title of current page is " + driver.getTitle());
		System.out.println("url of current page is " + driver.getCurrentUrl());
		
		//��ȡ��¼�û���
		String text = driver.findElement(By.id("spnUid")).getText();
		System.out.println(text);
	}
}
