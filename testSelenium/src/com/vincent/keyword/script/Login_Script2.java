/**   
* @Title: Login_Script2.java 
* @Package com.vincent.keyword.script 
* @Description: TODO
* @author Vincent  
* @date 2017年12月2日 下午2:32:43 
* @version V1.0   
*/ 

package com.vincent.keyword.script;

import com.vincent.keyword.config.ActionKeywords1;
import com.vincent.keyword.utility.StartEngine;

/**
 * @Function: TODO
 * ObjectReposity & TestData2.xlsx & ActionKeywords1.java & CommonEngine.java & Contants.java &
 * ExcelUtils2.java & OrpUtil.java & StartEngine.java
 * @author: Vincent
 * @date: 2017年12月19日下午10:13:41
 */
public class Login_Script2 {
	public static Object actionKeywords;
	
	public static void main(String[] args) {
		actionKeywords = new ActionKeywords1();
		StartEngine.Start(actionKeywords);
	}
}