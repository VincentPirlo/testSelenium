/**   
* @Title: TestParameterXML.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��26�� ����9:23:59 
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
 * @Function: ����������֮һʹ��XML���ݲ�����filename���Դ�testng.xml���ݣ���ͨ��@Parametersע�뵽�÷����У�
 * TestNG�е���һ����Ȥ�Ĺ����ǲ��������ԡ� �ڴ��������£���������ҵ���߼���Ҫ�������Եĳ����� 
 * ������������������Աʹ�ò�ͬ��ֵһ����һ�ε�������ͬ�Ĳ��ԡ�
 * TestNG����ͨ�����ֲ�ͬ�ķ�ʽ������ֱ�Ӵ��ݸ����Է�����ʹ��testng.xml��ʹ�������ṩ�ߣ�
 * �ڱ��̳��У����ǽ�����չʾ���ͨ��XML @Parameters��@DataProvider���������ݸ�@Test������
 * @author: Vincent
 * @date: 2017��12��26������9:23:59
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
