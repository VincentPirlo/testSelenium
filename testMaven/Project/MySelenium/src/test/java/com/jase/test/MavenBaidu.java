/**   
* @Title: MavenBaidu.java 
* @Package com.jase.test 
* @Description: TODO
* @author Vincent  
* @date 2018年11月19日 下午8:59:36 
* @version V1.0   
*/ 
package com.jase.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年11月19日下午8:59:36
 */
public class MavenBaidu {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Internet Explorer\\MicrosoftWebDriver.exe");
		
		System.out.println("seting brwoser");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new EdgeDriver();
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.baidu.com");
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
	}
}
