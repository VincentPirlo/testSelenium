package testIOMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @Function: �����б���IOMS��������ѡ����
 * @author: Vincent
 * @date: 2017��12��16������3:38:19
 */
public class SelectDomain {
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
		
		//�����豸����->�豸������棬���������ť
		driver.findElement(By.id("menu_lv_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_lv_1_sub_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("dmu_device_addDevBtn")).click();
		Thread.sleep(1000);
		
		
		//��������ѡ������ѡ��
		/*Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		sel.selectByIndex(1);*/
		
		//����ֵѡ������ѡ��
		/*Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		sel.selectByValue("db4ea24274b44d568253350ecf52ac22");*/
		
		//�����ı�����ѡ������ѡ��
		Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		sel.selectByVisibleText("����");
		
		//��ȡ����������ѡ��Ƚ��ı�������ȥѡ��
		/*driver.findElement(By.id("dmu_device_addDevBtn")).click();
		Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		for (WebElement e : sel.getOptions()) {
			String a = "����";
			if (a.equals(e.getText())) {
				e.click();
			}
		}*/
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}