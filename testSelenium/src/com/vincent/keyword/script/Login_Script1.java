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
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Class<ActionKeywords1> clz = ActionKeywords1.class;
		Method[] method = clz.getDeclaredMethods();
		for(Method m: method) {
			System.out.println(m);
		}
		
		Method method1 = clz.getMethod("CloseBrowser",String.class);
		String str = (String)method1.invoke(new ActionKeywords1(), "haha");
		System.out.println(str);
		
	}
/*	public static ActionKeywords1 actionKeywords;
	public static String Keywords = null;
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
//			System.out.println(Keywords);
			//login_action();
		}
	}

	public static void login_action() {
		for(int i=0; i<method.length; i++) {
//			System.out.println(method[i].getName()+"   "+Keywords);
			if(method[i].getName().trim().equals(Keywords)) {
				try {
					method[i].invoke(actionKeywords,Integer.toString(i));
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
	*/
}
