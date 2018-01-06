/**   
* @Title: ExcelDataTest.java 
* @Package com.vincent.datadriveno 
* @Description: TODO
* @author Vincent  
* @date 2018年1月6日 下午11:14:24 
* @version V1.0   
*/ 
package com.vincent.datadriveno;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月6日下午11:14:24
 */
public class ExcelDataTest {
	@Test(dataProvider = "db1")
	public void ts(Map<String, String> data) throws Exception {
		this.prmap(data);
		System.out.println("============over==========");
		System.out.println();
	}
	
	@DataProvider(name = "db1")
	public Iterator<Object[]> datta() throws Exception {
		return (Iterator<Object[]>)new ExcelData("datadriveno.xls","Sheet1");
	}
	
	public void prmap(Map<String, String> arr) {
		Set<String> set = arr.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String s = (String) iter.next();
			System.out.println(arr.get(s));
		}
	}
}
