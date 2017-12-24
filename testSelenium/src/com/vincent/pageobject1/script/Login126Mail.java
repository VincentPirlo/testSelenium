/**   
* @Title: Login126Mail.java 
* @Package com.vincent.pageobject1.script 
* @Description: TODO
* @author Vincent  
* @date 2017年12月23日 下午11:33:26 
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
 * @Function: 主程序 
 * http://www.cnblogs.com/gcgc/p/6502996.html
 * 定位语句和测试代码分离：封装在page类中
 * 测试数据与测试代码分离：读取excel文件
 * @author: Vincent
 * @date: 2017年12月23日下午11:33:26
 */
public class Login126Mail {
	public static WebDriver driver;
	
	@Test
	public static void login126Mail() throws Exception {
		//定义用例路径
		String excelPath = "D:\\test-workspace\\testSelenium\\src\\com\\vincent\\pageobject1\\data\\126MailLoginCase.xlsx";
		//读取sheet页
		ExcelUtil.setExcelFile(excelPath, "login");
		//打开浏览器
		String browserName = ExcelUtil.getCellData(1, 4);
		if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		//输入网址
		driver.get(ExcelUtil.getCellData(2, 4));
		//切换frame
		driver.switchTo().frame("x-URS-iframe");
		
		//初始化page页面（注意：要放在打开浏览器之后）
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		MainPa
	}
}
