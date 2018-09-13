package testIOMS;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddDevices {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.10.40.165");
		Thread.sleep(500);
		
		//登录
		driver.findElement(By.id("real_username")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.id("fake_pass")).click();
		driver.findElement(By.id("real_pass")).sendKeys("admin888");
		Thread.sleep(500);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(500);		
		
		
		int firstmax = 223;
		int ttfmax = 225;
		int min = 1;
		for(int i=0; i<2000; i++) {
			Random random = new Random();
			int firstip = random.nextInt(firstmax)%(firstmax-min+1) + min;
			int secip = random.nextInt(ttfmax)%(ttfmax-min+1) + min;
			int thirdip = random.nextInt(ttfmax)%(ttfmax-min+1) + min;
			int fourthip = random.nextInt(ttfmax)%(ttfmax-min+1) + min;
//			System.out.println(i + "====" + firstip + "." + secip + "." + thirdip + "." + fourthip);
			String ip = firstip + "." + secip + "." + thirdip + "." + fourthip;
			
			
			//进入设备管理界面
			WebElement sbzx = driver.findElement(By.id("menu_lv_1"));
			sbzx.click();
			Thread.sleep(500);
			
			WebElement sbgl = driver.findElement(By.id("menu_lv_1_sub_1"));
			sbgl.click();
			Thread.sleep(500);
			
			//点击入网
			driver.findElement(By.id("dmu_device_addDevBtn")).click();
			
			driver.findElement(By.id("dmu_device_winadddev_nameEdit")).sendKeys(ip);
			driver.findElement(By.id("dmu_device_winadddev_ipEdit")).sendKeys(ip);
			
			Select selType = new Select(driver.findElement(By.id("dmu_device_childTypeCombo")));
			for(WebElement e : selType.getOptions()) {
				String type = "交换机";
				if(type.equals(e.getText())) {
					e.click();
				}
			}
			
			Select selProtocol = new Select(driver.findElement(By.id("dmu_device_winadddev_accProtocolCombo")));
			for(WebElement e : selProtocol.getOptions()) {
				String protocol = "stdsnmp";
				if(protocol.equals(e.getText())) {
					e.click();
				}
			}
			
			Select selDomain = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
			for (WebElement e : selDomain.getOptions()) {
				String a = "teststdgroup";
				if (a.equals(e.getText())) {
					e.click();
				}
			}
			
//			Select selZuwang = new Select(driver.findElement(By.id("dmu_device_winadddev_topoTypeCombo")));
//			for(WebElement e : selZuwang.getOptions()) {
//				String a = "从机";
//				if(a.equals(e.getText())) {
//					e.click();
//				}
//			}
			
//			driver.findElement(By.id("dmu_device_winadddev_writeToAgent_chkbox")).click();
			
			driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[2]/div/div[2]/div/div[2]/div[3]")).click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		
	}
}
