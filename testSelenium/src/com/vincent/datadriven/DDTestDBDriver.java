/**   
* @Title: DDTestDBDriver.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017��12��20�� ����11:03:04 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @Function: �����࣬����10.10.40.50��test.userinfo��
 * @author: Vincent
 * @date: 2017��12��20������11:03:04
 */
@RunWith(value = Parameterized.class)
public class DDTestDBDriver {
	private String username;
	private String password;
	public DDTestDBDriver(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Parameters
	public static Collection getData() {
		return DDDBUtils.driverJDBC("jdbc:mysql://10.10.40.50:3306/test", "root", "kdc");
	}
	
	@Test
	public void test() {
		System.out.println(this.username + " " + this.password);
	}
}
