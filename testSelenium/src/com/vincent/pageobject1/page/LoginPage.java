/**   
* @Title: LoginPage.java 
* @Package com.vincent.pageobject1 
* @Description: TODO
* @author Vincent  
* @date 2017��12��23�� ����10:47:59 
* @version V1.0   
*/ 
package com.vincent.pageobject1.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��12��23������10:47:59
 */
public class LoginPage {
	
	//�û��������
	@FindBy(className="dlemail")
	private WebElement uName;
	//���������
	@FindBy(className="dlpwd")
	private WebElement pwd;
	//��¼��ť
	@FindBy(id="dologin")
	private WebElement loginButton;
	//������¼��ť
	@FindBy(className="u-btn")
	private WebElement continueLogin;
	
	//�����û���
	public void inputUsername(String userName) {
		System.out.println(userName);
		uName.clear();
		uName.sendKeys(userName);
	}
	
	//��������
	public void inputPwd(String passWord) {
		pwd.clear();
		pwd.sendKeys(passWord);
	}
	
	//������¼
	public void clickLoginButton(String string) {
		loginButton.click();
	}
	
	//����������¼
	public void continueLogin(String string) {
		continueLogin.click();
	}
	
}
