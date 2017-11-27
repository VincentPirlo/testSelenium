/**   
* @Title: ActionKeywords.java 
* @Package com.vincent.keyword.config 
* @Description: TODO
* @author Vincent  
* @date 2017��11��26�� ����9:46:51 
* @version V1.0   
*/ 
package com.vincent.keyword.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��11��26������9:46:51
 */
public class ActionKeywords {
	public static WebDriver driver=null;
	
	//���������
	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//�򿪿�Դ�й���ַ
	public static void Navigate() {
		driver.get("http://www.oschina.net/");
	}
	
	//�����¼
	public static void Login_Click() {
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/a[1]")).click();
	}
	
	//�����û���
	public static void Input_Name() {
		driver.findElement(By.xpath("//*[@id='userMail']")).sendKeys("xxxxxx");
	}
	
	//��������
	public static void Input_Password() {
		driver.findElement(By.xpath("//*[@id='userPassword']")).sendKeys("yyyyyyy");
	}
	
	//�����¼��ť
	public static void Login_Button() {
		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/article/div[1]/form/div/div[5]/button")).click();
	}
	
	//����˳�
	public static void Logout_Click() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/a[3]")).click();
	}
	
	//�ر������
	public static void CloseBrowser() {
		driver.quit();
	}
}
