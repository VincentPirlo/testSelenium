package com.vincent.selenium;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieOpr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youdao.com");
		
		//ªÒµ√cookie
		Set<Cookie> coo = driver.manage().getCookies();
		//¥Ú”°cookie
		System.out.println(coo);
		
		driver.quit();
	}
}
