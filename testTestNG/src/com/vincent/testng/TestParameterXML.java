/**   
* @Title: TestParameterXML.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月26日 下午9:23:59 
* @version V1.0   
*/ 
package com.vincent.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Function: 参数化测试之一使用XML传递参数（filename属性从testng.xml传递，并通过@Parameters注入到该方法中）
 * TestNG中的另一个有趣的功能是参数化测试。 在大多数情况下，您会遇到业务逻辑需要大量测试的场景。 
 * 参数化测试允许开发人员使用不同的值一次又一次地运行相同的测试。
 * TestNG可以通过两种不同的方式将参数直接传递给测试方法：使用testng.xml、使用数据提供者；
 * 在本教程中，我们将向您展示如何通过XML @Parameters或@DataProvider将参数传递给@Test方法。
 * @author: Vincent
 * @date: 2017年12月26日下午9:23:59
 */
public class TestParameterXML {
	
	Connection con;
	
	@Test
	@Parameters({"dbconfig", "poolsize"})
	public void createConnection(String dbconfig, int poolsize) {
		System.out.println("dbconfig: " + dbconfig);
		System.out.println("poolsize: " + poolsize);
		
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			//get properties file from project classpath
			String path = System.getProperty("user.dir")+"\\src\\com\\vincent\\testng\\"+dbconfig;
			System.out.println("path => " + path);
			//input = getClass().getClassLoader().getResourceAsStream(path);
			//prop.load(input);
			prop.load(new FileInputStream(path));
			
			String drivers = prop.getProperty("jdbc.driver");
			String connectionURL = prop.getProperty("jdbc.url");
            String username = prop.getProperty("jdbc.username");
            String password = prop.getProperty("jdbc.password");

            System.out.println("drivers : " + drivers);
            System.out.println("connectionURL : " + connectionURL);
            System.out.println("username : " + username);
            System.out.println("password : " + password);

            Class.forName(drivers);
            con = DriverManager.getConnection(connectionURL, username, password);
            
		} catch (Exception e) {
			//e.printStackTrace();
		} finally {
			if(input != null ) {
				try {
					input.close();
				} catch (IOException e) {
					//e.printStackTrace();
				}
			}
		}
	}
}
