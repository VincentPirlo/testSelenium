package com.vincent.vas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddDiskLog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.10.40.15");
		Thread.sleep(500);
		
		//登录
		driver.findElement(By.id("real_username")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.id("fake_pass")).click();
		driver.findElement(By.id("real_pass")).sendKeys("admin888");
		Thread.sleep(500);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(500);
		
		
		for (int i=0; i<=1020; i++) {
			//进入系统管理>存储管理界面
			WebElement szlx = driver.findElement(By.id("menu_lv_6"));
			szlx.click();
			Thread.sleep(500);
			
			WebElement lxrw = driver.findElement(By.id("menu_lv_6_sub_9"));
			lxrw.click();
			Thread.sleep(500);
			
			WebElement disk = driver.findElement(By.xpath("//*[@id=\"vas_storage_disklist|2|r1001|c101\"]/div"));
			disk.click();
			
			driver.findElement(By.id("vas_storage_disk_diskpart_button")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[5]/div/div[3]/table/tbody/tr[2]/td[2]/div/div[2]/div/div[2]/div[3]")).click();
			
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(500);
			
		}
	}
		
		
}