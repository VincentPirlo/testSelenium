package com.vincent.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.linkText("设置")).click();
		driver.findElement(By.linkText("搜索设置")).click();
		
		
		Select sel = new Select(driver.findElement(By.xpath("//select")));
		//sel.selectByValue("50");
		Thread.sleep(3000);
		for(WebElement e:sel.getOptions()) {
			String a="每页显示50条";
			if (a.equals(e.getText())) {
				e.click();
			}
		}
		
		driver.quit();
	}
}
