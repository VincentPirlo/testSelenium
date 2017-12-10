/**   
* @Title: BasePage.java 
* @Package com.vincent.pandeobject 
* @Description: TODO
* @author Vincent  
* @date 2017年12月10日 下午7:19:11 
* @version V1.0   
*/ 
package com.vincent.pandeobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

/**
 * http://www.cnblogs.com/tobecrazy/p/4553444.html
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月10日下午7:19:11
 */
public class BasePage {
	
	protected WebDriver driver;
	protected String[][] locatorMap;
	
	protected BasePage(WebDriver driver) throws IOException {
		this.driver = driver;
		locatorMap = ReadExcelUtil.getLocatorMap();
	}
	
	
}
