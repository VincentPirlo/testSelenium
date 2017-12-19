package com.vincent.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月18日下午9:34:54
 */
public class LoginPage {
	private static WebElement element = null;
	
	public static WebElement login_Username(WebDriver driver) {
		element = driver.findElement(By.id("userNameIpt"));
		return element;
	}
	
	public static WebElement login_Password(WebDriver driver) {
		element = driver.findElement(By.id("pwdInput"));
		return element;
	}
	
	public static WebElement login_Button(WebDriver driver) {
		element = driver.findElement(By.id("btnSubmit"));
		return element;
	}
}
