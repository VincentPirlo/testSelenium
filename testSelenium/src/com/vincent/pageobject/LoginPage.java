package com.vincent.pageobject;
import org.openqa.selenium.*;

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
