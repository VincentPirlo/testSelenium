package com.vincent.vas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.10.40.236");
		Thread.sleep(500);
		
		//登录
		driver.findElement(By.id("real_username")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.id("fake_pass")).click();
		driver.findElement(By.id("real_pass")).sendKeys("admin888");
		Thread.sleep(500);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(500);	
		
		for(int i=89; i<1000; i++) {
			String taskName = "task" + i;
			//System.out.println(taskName);
			//进入视质轮巡>轮巡任务界面
			WebElement szlx = driver.findElement(By.id("menu_lv_12"));
			szlx.click();
			Thread.sleep(500);
			
			WebElement lxrw = driver.findElement(By.id("menu_lv_12_sub_1"));
			lxrw.click();
			Thread.sleep(500);
			
			driver.findElement(By.cssSelector("a.index-btn-add.ml10")).click();
			Thread.sleep(500);
			driver.findElement(By.id("taskName_edit")).sendKeys(taskName);
			Thread.sleep(500);
			driver.findElement(By.cssSelector("a.jstree-anchor")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"cruiseTaskNavTab\"]/div[6]/table/tbody/tr[2]/td[2]/div/div[2]/div/div[2]/div[3]")).click();
			
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(1000);
		}
		
	}
}
