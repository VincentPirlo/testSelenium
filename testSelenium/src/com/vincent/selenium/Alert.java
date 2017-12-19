package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @Function: Selenium֮������
 * @author: Vincent
 * @date: 2017��12��18������8:13:52
 */
public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		
		//�����ͣ�����á�����
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("����"))).perform();
		
		//����������
		driver.findElement(By.className("setpref")).click();
		Thread.sleep(2000);
		
		//��������
		driver.findElement(By.className("prefpanelgo")).click();
		Thread.sleep(2000);
		
		//���ܵ���
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
