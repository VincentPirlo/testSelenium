package testIOMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDomain {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.10.40.50");
		
		driver.findElement(By.id("real_username")).sendKeys("admin");
		driver.findElement(By.id("fake_pass")).click();
		driver.findElement(By.id("real_pass")).sendKeys("admin888");
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.id("dmu_device_addDevBtn")).click();
		Select sel = new Select(driver.findElement(By.id("dmu_device_winadddev_domainCombo")));
		for(WebElement e:sel.getOptions()) {
			String a = "°²»Õ";
			if(a.equals(e.getText())) {
				e.click();
			}
		}
	}

}
