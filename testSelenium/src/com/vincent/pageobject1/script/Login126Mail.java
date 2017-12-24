/**   
* @Title: Login126Mail.java 
* @Package com.vincent.pageobject1.script 
* @Description: TODO
* @author Vincent  
* @date 2017��12��23�� ����11:33:26 
* @version V1.0   
*/ 
package com.vincent.pageobject1.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vincent.pageobject1.page.LoginPage;
import com.vincent.pageobject1.util.ExcelUtil;

/**
 * @Function: ������ 
 * http://www.cnblogs.com/gcgc/p/6502996.html
 * ��λ���Ͳ��Դ�����룺��װ��page����
 * ������������Դ�����룺��ȡexcel�ļ�
 * @author: Vincent
 * @date: 2017��12��23������11:33:26
 */
public class Login126Mail {
	public static WebDriver driver;
	
	@Test
	public static void login126Mail() throws Exception {
		//��������·��
		String excelPath = "D:\\test-workspace\\testSelenium\\src\\com\\vincent\\pageobject1\\data\\126MailLoginCase.xlsx";
		//��ȡsheetҳ
		ExcelUtil.setExcelFile(excelPath, "login");
		//�������
		String browserName = ExcelUtil.getCellData(1, 4);
		if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		//������ַ
		driver.get(ExcelUtil.getCellData(2, 4));
		//�л�frame
		driver.switchTo().frame("x-URS-iframe");
		
		//��ʼ��pageҳ�棨ע�⣺Ҫ���ڴ������֮��
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		MainPa
	}
}
