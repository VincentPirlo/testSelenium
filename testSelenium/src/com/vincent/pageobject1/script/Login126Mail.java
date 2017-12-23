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
import org.testng.annotations.Test;

/**
 * @Function: 主程序 
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
		//读取
	}
}
