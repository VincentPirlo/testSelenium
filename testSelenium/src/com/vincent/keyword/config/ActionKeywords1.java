/**   
* @Title: ActionKeywords1.java 
* @Package com.vincent.keyword.config 
* @Description: TODO
* @author Vincent  
* @date 2017��11��28�� ����9:16:14 
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
 * @date: 2017��11��28������9:16:14
 */
public class ActionKeywords1 {
	public static WebDriver driver = null;
	
	//��������������
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
	
	//�򿪿�Դ�й���ַ
	public static void Navigate(String OR) {
		try {
			driver.get(Contants.url);
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//�����¼
	public static void Login_Click(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//�����û���
	public static void Input_Name(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).clear();
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).sendKeys(Contants.userName);
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//��������
	public static void Input_Password(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).sendKeys(Contants.userPassword);
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//�����¼��ť
	public static void Login_Button(String OR) {
		try {
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//����˳�
	public static void Logout_Click(String OR) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		} catch (Exception e) {
			e.printStackTrace();
			StartEngine.bResult = false;
		}
	}
	
	//�ر������
	public static void CloseBrowser(String OR) {
		driver.quit();
	}
}
