package com.vincent.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @Function: Selenium֮���������б�
 * @author: Vincent
 * @date: 2017��12��18������8:29:20
 */
public class DropdownBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.linkText("����")).click();
		driver.findElement(By.linkText("��������")).click();
		
		Thread.sleep(3000);
		Select sel = new Select(driver.findElement(By.id("nr")));	//(By.name("NR")));
		//sel.selectByValue("50");
		for(WebElement e:sel.getOptions()) {
			String a="ÿҳ��ʾ50��";
			if (a.equals(e.getText())) {
				e.click();
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
