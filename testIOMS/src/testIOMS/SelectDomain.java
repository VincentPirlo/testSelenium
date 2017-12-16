package testIOMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @Function: 下拉列表——IOMS入网界面选择域
 * @author: Vincent
 * @date: 2017年12月16日下午3:38:19
 */
public class SelectDomain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.10.40.50");

		//登录IOMS
		driver.findElement(By.id("real_username")).sendKeys("admin");
		driver.findElement(By.id("fake_pass")).click();
		driver.findElement(By.id("real_pass")).sendKeys("admin888");
		driver.findElement(By.id("submit")).click();
		
		//进入设备中心->设备管理界面，点击入网按钮
		driver.findElement(By.id("menu_lv_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_lv_1_sub_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("dmu_device_addDevBtn")).click();
		Thread.sleep(1000);
		
		
		//根据索引选择下拉选项
		/*Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		sel.selectByIndex(1);*/
		
		//根据值选择下拉选项
		/*Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		sel.selectByValue("db4ea24274b44d568253350ecf52ac22");*/
		
		//根据文本内容选择下拉选项
		Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		sel.selectByVisibleText("安徽");
		
		//获取所有下拉可选项，比较文本内容再去选择
		/*driver.findElement(By.id("dmu_device_addDevBtn")).click();
		Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		for (WebElement e : sel.getOptions()) {
			String a = "安徽";
			if (a.equals(e.getText())) {
				e.click();
			}
		}*/
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}