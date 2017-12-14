/**   
* @Title: CommonLogin.java 
* @Package com.vincent.pandeobject 
* @Description: TODO
* @author Vincent  
* @date 2017年12月12日 下午10:08:28 
* @version V1.0   
*/ 
package com.vincent.pandeobject;

import org.openqa.selenium.WebDriver;

import com.vincent.pageobject.LoginPage;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月12日下午10:08:28
 */
public class CommonLogin {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	static LoginPage loginPage;
	public static HomePage login(String email, String password) throws Exception {
		loginPage = new LoginPage(getDriver());
		loginPage.wait();
		loginPage.
	}
}
