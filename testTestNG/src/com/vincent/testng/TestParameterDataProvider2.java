/**   
* @Title: TestParameterDataProvider2.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月26日 下午10:18:59 
* @version V1.0   
*/ 
package com.vincent.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Function: 参数化测试之二通过@DataProvider传递参数（2支持传递一个对象参数，传递一个Map对象作为参数）
 * @author: Vincent
 * @date: 2017年12月26日下午10:18:59
 */
public class TestParameterDataProvider2 {
	
	@Test(dataProvider = "dbconfig")
	public void testConnection(Map<String, String> map) {
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("[Key]: " + entry.getKey() + " [Value]: " + entry.getValue());
		}
	}
	
	@DataProvider(name = "dbconfig")
	public Object[][] providerDbConfig() {
		Map<String, String> map = readDbConfig();
		return new Object[][] {{map}};
	}
	
	public Map<String, String> readDbConfig() {
		Properties prop = new Properties();
		InputStream input = null;
		Map<String, String> map = new HashMap<String, String>();
		
		try {
			//input = getClass().getClassLoader().getResourceAsStream("D:\\test-workspace\\testTestNG\\src\\com\\vincent\\testng\\db.properties");
			String path = System.getProperty("user.dir") + "\\src\\com\\vincent\\testng\\db.properties";
			System.out.println(path);
			//prop.load(input);
			prop.load(new FileInputStream(path));
			
			map.put("jdbc.driver", prop.getProperty("jdbc.driver"));
            map.put("jdbc.url", prop.getProperty("jdbc.url"));
            map.put("jdbc.username", prop.getProperty("jdbc.username"));
            map.put("jdbc.password", prop.getProperty("jdbc.password"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch (IOException E) {
					E.printStackTrace();
				}
			}
		}
		return map;
	}
}
