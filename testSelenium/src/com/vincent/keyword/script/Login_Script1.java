/**   
* @Title: Login_Script1.java 
* @Package com.vincent.keyword.script 
* @Description: TODO
* @author Vincent  
* @date 2017年11月28日 下午9:06:20 
* @version V1.0   
*/ 
package com.vincent.keyword.script;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.vincent.keyword.config.ActionKeywords1;
import com.vincent.keyword.utility.ExcelUtils;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月28日下午9:06:20
 */
public class Login_Script1 {
	
	public static ActionKeywords1 actionKeywords;
	public static String Keywords = null;
	public static String Pageobject = null;
	public static Method[] method;
	
	public Login_Script1() {
		actionKeywords = new ActionKeywords1();
		method = actionKeywords.getClass().getDeclaredMethods();
	}
	
	public static void main(String[] args) throws Exception {
		ExcelUtils.setExcelFile("D:\\test-workspace\\testSelenium\\src\\com\\vincent\\keyword\\TestData1.xlsx", "Test Steps");
		new Login_Script1();
		for(int RowNum=1; RowNum<=ExcelUtils.getLastRowNums("Test Steps"); RowNum++) {
			Keywords = ExcelUtils.getCellData(RowNum, 5);
			Pageobject = ExcelUtils.getCellData(RowNum, 4);
//			System.out.println(Keywords);
//			System.out.println("aaa is: "+Pageobject);
			login_action();
		}
	}

	public static void login_action() {
		for(int i=0; i<method.length; i++) {
//			System.out.println(method[i].getName()+"   "+Keywords);
			if(method[i].getName().trim().equals(Keywords)) {
				try {
					method[i].invoke(actionKeywords, Pageobject);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
