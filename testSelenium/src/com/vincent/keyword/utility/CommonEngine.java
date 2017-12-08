/**   
* @Title: CommonEngine.java 
* @Package com.vincent.keyword.utility 
* @Description: TODO
* @author Vincent  
* @date 2017年12月8日 下午9:13:06 
* @version V1.0   
*/ 
package com.vincent.keyword.utility;

import java.lang.reflect.Method;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月8日下午9:13:06
 */
public class CommonEngine {
	public static void action(String keywords, Object actionkeywords, String r, int srownum, boolean bresult) {
		
		Method[] method = actionkeywords.getClass().getDeclaredMethods();
		for(int i=0; i<method.length; i++) {
			if(method[i].getName().trim().equals(keywords)) {
//				System.out.println(method[i].getName() + "#####" + actionkeywords + keywords + "#####" + r);
				try {
					method[i].invoke(actionkeywords, r);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(bresult == true) {
					ExcelUtils2.setCellData(Contants.pass, srownum, Contants.caseResult, Contants.excelFile+"\\"+Contants.excelName2, Contants.caseSheet);
				}
				else {
					ExcelUtils2.setCellData(Contants.fail, srownum, Contants.caseResult, Contants.excelFile+"\\"+Contants.excelName2, Contants.caseSheet);
				}
				break;
			}
		}
	}
}
