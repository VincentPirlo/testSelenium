/**   
* @Title: TestCalendar.java 
* @Package testIOMS 
* @Description: TODO
* @author Vincent  
* @date 2017��12��14�� ����9:58:44 
* @version V1.0   
*/ 
package testIOMS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * �ο���http://blog.csdn.net/u010503127/article/details/50380135
 * @Function: ����IOMS�������ؼ�
 * @author: Vincent
 * @date: 2017��12��14������9:58:44
 */
public class TestCalendar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.10.40.50");
		
		//��¼IOMS
		driver.findElement(By.id("real_username")).sendKeys("admin");
		driver.findElement(By.id("fake_pass")).click();
		driver.findElement(By.id("real_pass")).sendKeys("admin888");
		driver.findElement(By.id("submit")).click();
		
		/*//�豸����-�豸����-���������ť
		driver.findElement(By.id("menu_lv_1")).click();
		driver.findElement(By.id("menu_lv_1_sub_1")).click();
		driver.findElement(By.id("dmu_device_addDevBtn")).click();
		
		//�����豸ͣ������  
		driver.findElement(By.id("dmu_device_winadddev_expireDateEdit")).click();  
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("document.getElementById('dmu_device_winadddev_expireDateEdit').readOnly=false;");  
		driver.findElement(By.id("dmu_device_winadddev_expireDateEdit")).clear();  
		driver.findElement(By.id("dmu_device_winadddev_expireDateEdit")).sendKeys("2017-12-14"); 
		*/
		
		//��־����->��־����
		driver.findElement(By.id("menu_lv_5")).click();
		driver.findElement(By.id("menu_lv_5_sub_1")).click();
		
		//���ò�ѯ��־�Ŀ�ʼʱ��
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("document.getElementById('opLog_query_startTime').readOnly=false;");  
		driver.findElement(By.id("opLog_query_startTime")).clear();  
		driver.findElement(By.id("opLog_query_startTime")).sendKeys("2017-12-14 13:25:34");
		
		Thread.sleep(3000);
		driver.quit();
	}
}