/**   
* @Title: DDTestng.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017年12月19日 下午10:57:20 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Function: TestNG数据驱动--使用@DataProvider注解定义当前方法中的返回对象作为测试脚本的测试数据集。
 * @author: Vincent
 * @date: 2017年12月19日下午10:57:20
 */
public class DDTestng {
	private static WebDriver driver;
	@DataProvider(name="searchData")
	public static Object[][] data() {
		return new Object[][] {{"老九门","演员","赵丽颖"},{"X站警天启","导演","布莱恩·辛格"},{"诛仙青云志","编剧","张戬"}};  
	}
	
	@Test(dataProvider="searchData")
	public void testSearch(String searchdata1, String searchdata2, String searchResult) {
		
		
		//打开sogou首页
		driver.get("https://www.sogou.com/");
		
		//输入搜索条件
		driver.findElement(By.id("query")).sendKeys(searchdata1+" "+searchdata2);
		
		//单击搜索按钮
		driver.findElement(By.id("stb")).click();
		
		//搜索后，等待3秒显示搜索结果
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//判断搜索的结果是否包含期望的关键字
		Assert.assertTrue(driver.getPageSource().contains(searchResult));
	}
	
	@BeforeMethod
	public void beforeMethod() {
		//设定Chrome浏览器的驱动路径并最大化窗口
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//设定等待时间为5秒
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
