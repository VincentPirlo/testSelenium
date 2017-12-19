/**   
* @Title: LoginScript.java 
* @Package com.vincent.keyword.script 
* @Description: TODO
* @author Vincent  
* @date 2017年11月26日 下午9:47:17 
* @version V1.0   
*/ 
package com.vincent.keyword.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vincent.keyword.config.ActionKeywords;
import com.vincent.keyword.utility.ExcelUtils;

/**
 * @Function: TODO 
 * TestData.xlsx & ActionKeywords.java
 * @author: Vincent
 * @date: 2017年11月26日下午9:47:17
 */
public class LoginScript {
	public static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		ExcelUtils.setExcelFile("D:\\test-workspace\\testSelenium\\src\\com\\vincent\\keyword\\TestData.xlsx", "steps");
		ActionKeywords actionKeyWords = new ActionKeywords();
		String Keywords = null;
		
		for(int RowNum=1; RowNum<=ExcelUtils.getLastRowNums("steps"); RowNum++) {
			Keywords = ExcelUtils.getCellData(RowNum, 3);
			if(Keywords.trim().equals("OpenBrowser")) {
				actionKeyWords.OpenBrowser();
			}
			else if(Keywords.trim().equals("Navigate")) {
				actionKeyWords.Navigate();
			}
			else if(Keywords.trim().equals("Login_Click")){
				actionKeyWords.Login_Click();
			}
			else if(Keywords.trim().equals("Input_Name")){
				actionKeyWords.Input_Name();
			}
			else if(Keywords.trim().equals("Input_Password")){
				actionKeyWords.Input_Password();
			}
			else if(Keywords.trim().equals("Login_Button")){
            	actionKeyWords.Login_Button();
			}
			else if(Keywords.trim().equals("Logout_Click")){
            	actionKeyWords.Logout_Click();
			}
			else if(Keywords.trim().equals("CloseBrowser")){
            	actionKeyWords.CloseBrowser();
			}
		}
	}
}
