package com.vincent.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: Selenium֮�л�����
 * @author: Vincent
 * @date: 2017��12��18������9:29:29
 */
public class SwitchWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		
		//��õ�ǰ���ھ��
		String sreach_handle = driver.getWindowHandle();
		System.out.println("hello"+sreach_handle);
		
		//�򿪰ٶ�ע�ᴰ��
		driver.findElement(By.linkText("��¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("����ע��")).click();
		
		//������д��ھ��
		Set<String> handles = driver.getWindowHandles();
		
		//�ж��Ƿ�Ϊע�ᴰ�ڣ�������ע�ᴰ���ϵ�Ԫ��
		for(String handle : handles) {
			if(handle.equals(sreach_handle)==false) {
				//�л���ע��ҳ��
				driver.switchTo().window(handle);
				System.out.println("now register window!");
				Thread.sleep(2000);
				driver.findElement(By.name("userName")).clear();
				driver.findElement(By.name("userName")).sendKeys("username");
				driver.findElement(By.name("phone")).clear();
				driver.findElement(By.name("phone")).sendKeys("password");
				Thread.sleep(3000);
				//�رյ�ǰ����
				driver.close();
			}
		}
		
		//�ж��Ƿ�Ϊ�ٶ���ҳ����������ҳ�ϵ�Ԫ��
		for(String handle : handles){
			if (handle.equals(sreach_handle)){
				//�л���ע��ҳ��
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.findElement(By.className("close-btn")).click();
				System.out.println("now baidu sreach page!");
				driver.findElement(By.id("kw")).sendKeys("webdriver");
				driver.findElement(By.id("su")).click();
				Thread.sleep(2000);
			}
		}
		driver.quit();
	}
}
