/**   
* @Title: DDTestCsvDriver.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月19日 下午11:53:34 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @Function: 测试DDCsvUtils.java（测试类）
 * @author: Vincent
 * @date: 2017年12月19日下午11:53:34
 */
@RunWith(value = Parameterized.class)
public class DDTestCsvDriver {
	private String username;
	private String password;
	public DDTestCsvDriver(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Parameters
	public static Collection getData() {
		return DDCsvUtils.driverCSV("src/userinfo.csv"); //(D:\\test-workspace\\testSelenium\\src\\userinfo.csv)
	}
	
	@Test
	public void test() {
		System.out.println(this.username + " " + this.password);
	}
}
