/**   
* @Title: TestDisplay.java 
* @Package com.vincent.selenium 
* @Description: TODO
* @author Vincent  
* @date 2017年12月23日 下午3:51:39 
* @version V1.0   
*/ 
package com.vincent.selenium;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @Function: Selenium之操作隐藏的元素
 * http://www.cnblogs.com/fnng/p/5365900.html
 * @author: Vincent
 * @date: 2017年12月23日下午3:51:39
 */
public class TestDisplay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		File file = new File("D:\\test-workspace\\testSelenium\\src\\displayelement.html");
		String filePath = file.getAbsolutePath();
		driver.get(filePath);
		
		String js = "document.querySelectorAll('select')[0].style.display='block'";
		((JavascriptExecutor)driver).executeScript(js);
		
		Select sel = new Select(driver.findElement(ById.xpath("//select")));
		sel.selectByValue("opel");
	}
}
