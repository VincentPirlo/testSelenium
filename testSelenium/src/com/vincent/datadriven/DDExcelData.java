/**   
* @Title: DDExcelData.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月24日 下午5:57:12 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月24日下午5:57:12
 */
public class DDExcelData {
	@Test(dataProvider = "db1")
	public void ts(Map<String, String> data) throws Exception {
		this.prmap(data);
		System.out.println("===========over===========");
		System.out.println();
	}
	
	@DataProvider(name = "db1")
	public Iterator<Object[]> data() throws Exception {
		return (Iterator<Object[]>) new ExcelData("ExcelTest", "Sheet1");
	}
	
	public void prmap(Map<String, String> arr) {
		Set<String> set = arr.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(arr.get(s));
		}
	}
}
