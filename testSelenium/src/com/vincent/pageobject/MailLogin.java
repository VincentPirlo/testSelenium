package com.vincent.pageobject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.vincent.pageobject.LoginPage;

public class MailLogin {
	private static WebDriver driver = null;
	
	public static void login(WebDriver driver, String username, String password) {
		LoginPage.login_Username(driver).sendKeys(username);
		LoginPage.login_Password(driver).sendKeys(password);
		LoginPage.login_Button(driver).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://email2.163.com/");
		
		login(driver, "username", "123456");
		Thread.sleep(5000);
		
		driver.quit();
		System.out.println("test case run end!");
	}
}
