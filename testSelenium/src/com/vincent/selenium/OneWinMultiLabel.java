/**   
* @Title: OneWinMultiLabel.java 
* @Package com.vincent.selenium 
* @Description: TODO
* @author Vincent  
* @date 2017年12月21日 下午10:48:06 
* @version V1.0   
*/ 
package com.vincent.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @Function: 一个浏览器窗口上打开多个标签页
 * https://segmentfault.com/q/1010000008067562
 * @author: Vincent
 * @date: 2017年12月21日下午10:48:06
 */
public class OneWinMultiLabel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.baidu.com");
		
		Thread.sleep(2000);
		
		/*String js = "window.open('https://www.zhihu.com/')";
		((JavascriptExecutor)driver).executeScript(js);
		
		String js1 = "window.open('about:blank')";
		((JavascriptExecutor)driver).executeScript(js1);
		
		String js2 = "window.open('')";
		((JavascriptExecutor)driver).executeScript(js2);*/
		
		Actions actions = new Actions(driver);

		actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
