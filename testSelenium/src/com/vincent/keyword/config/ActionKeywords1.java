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

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��11��28������9:16:14
 */
public class ActionKeywords1 {
	public static WebDriver driver = null;
	
	//��������������
	public static void OpenBrowser(String OR) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//�򿪿�Դ�й���ַ
	public static void Navigate(String OR) {
		driver.get(Contants.url);
	}
	
	//�����¼
	public static void Login_Click(String OR) {
//		System.out.println(OrpUtil.readValue(OR));
		driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
	}
	
	//�����û���
	public static void Input_Name(String OR) {
		driver.findElement(By.xpath(OrpUtil.readValue(OR))).clear();
		driver.findElement(By.xpath(OrpUtil.readValue(OR))).sendKeys(Contants.userName);
	}
	
	//��������
	public static void Input_Password(String OR) {
		driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		driver.findElement(By.xpath(OrpUtil.readValue(OR))).sendKeys(Contants.userPassword);
	}
	
	//�����¼��ť
	public static void Login_Button(String OR) {
		driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
	}
	
	//����˳�
	public static void Logout_Click(String OR) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(OrpUtil.readValue(OR))).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//�ر������
	public static void CloseBrowser(String OR) {
		driver.quit();
	}
}
