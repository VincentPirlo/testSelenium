/**   
* @Title: LoginPage.java 
* @Package com.vincent.pandeobject 
* @Description: TODO
* @author Vincent  
* @date 2017年12月12日 下午10:40:47 
* @version V1.0   
*/ 
package com.vincent.pandeobject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.vincent.pandeobject.BasePage;
import com.vincent.pandeobject.Locator;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月12日下午10:40:47
 */
public class LoginPage extends BasePage {
	WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	
	public LoginPage(WebDriver driver) throws IOException {
		super(driver);
		driver.get("https://www.zhihu.com/#signin");
	}
	
	Locator loginEmainInputBox = new Locator("loginEmainInputBox");
	Locator loginPasswordInputBox = new Locator("loginPasswordInputBox");
	Locator loginButton = new Locator("loginButton");
	Locator profile = new Locator("profile");
	
	public void typeEmailInputBox(String email) throws Exception {
		type(loginEmainInputBox, email);
	}
	
	public void typePasswordInputBox(String password) throws Exception {
		type(loginPasswordInputBox, password);
	}
	
	public void clickOnLoginButton() throws Exception {
		click(loginButton);
	}
	
	public boolean isPresentProfile() throws IOException {
		return isElementPresent(profile, 20);
	}
	
	public void waitForPageLoad() {
		super.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
}
