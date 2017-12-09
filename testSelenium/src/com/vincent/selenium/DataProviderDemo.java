package com.vincent.selenium;

import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.Assert;  
import org.testng.annotations.AfterMethod;  
import org.testng.annotations.BeforeMethod;  
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;  
//����2���ؼ��ʣ���֤�������ҳ���Ƿ���������Ĺؼ���  
public class DataProviderDemo {  
    private static WebDriver driver;  
    @DataProvider(name="searchData")  
    public static Object[][] data()  
    {  
        return new Object[][] {{"�Ͼ���","��Ա","����ӱ"},{"Xվ������","����","������������"},{"��������־","���","���"}};  
    }  
  @Test(dataProvider="searchData")  
  public void testSearch(String searchdata1,String searchdata2,String searchResult) {  
	 
      //��sogou��ҳ  
      driver.get("https://www.sogou.com/");  
      //������������  
      driver.findElement(By.id("query")).sendKeys(searchdata1+" "+searchdata2);  
      //����������ť  
      driver.findElement(By.id("stb")).click();  
      //����������ť�󣬵ȴ�3����ʾ�������  
      try{  
          Thread.sleep(3000);  
      }catch(InterruptedException e){  
          e.printStackTrace();  
      }  
      //�ж������Ľ���Ƿ���������Ĺؼ���  
      Assert.assertTrue(driver.getPageSource().contains(searchResult));  
  }  
  @BeforeMethod  
  public void beforeMethod() {  
      //���޷���Chrome����������趨Chrome������İ�װ·��  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
      //��Chrome�����  
      driver=new ChromeDriver();  
      //�趨�ȴ�ʱ��Ϊ5��  
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
  }  
  
  @AfterMethod  
  public void afterMethod() {  
      //�رմ򿪵������  
      driver.quit();  
  }  
}