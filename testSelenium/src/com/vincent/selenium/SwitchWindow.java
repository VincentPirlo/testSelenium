/**   
* @Title: SwitchWindow.java 
* @Package com.vincent.selenium 
* @Description: TODO
* @author Vincent  
* @date 2018��1��7�� ����11:22:03 
* @version V1.0   
*/ 
package com.vincent.selenium;

import java.util.Set;  

import org.junit.AfterClass;  
import org.junit.BeforeClass;  
import org.junit.Test;  
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.interactions.Actions;  
/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018��1��7������11:22:03
 */
public class SwitchWindow {

    private static WebDriver driver;  
      
    @BeforeClass  
    public static void before(){  
        driver=new FirefoxDriver();  
        driver.get("https://www.baidu.com");  
        driver.manage().window().maximize();  
        System.out.println("there are " + driver.getWindowHandles().size() + " window");  
    }  
    @AfterClass  
    public static void after(){  
        driver.quit();  
    }  
      
    @Test  
    public void getWindowMethod1(){  
        Actions action = new Actions(driver);  
        action.sendKeys(Keys.CONTROL + "n").perform();  
        switchToWindow("�±�ǩҳ", driver);  
        driver.get("http://www.sina.com.cn");  
        System.out.println("there are " + driver.getWindowHandles().size() + " windows");  
    }  
      
    @Test  
    public void getWindowMethod2(){  
        JavascriptExecutor oJavaScriptExecutor = (JavascriptExecutor)driver;  
        oJavaScriptExecutor.executeScript("window.open();");  
        System.out.println("there are " + driver.getWindowHandles().size() + " windows");  
    }  
      
    @Test  
    public void getWindowMethod3(){  
        String href = driver.findElement(By.partialLinkText("����")).getAttribute("href");  
        JavascriptExecutor oJavaScriptExecutor = (JavascriptExecutor)driver;  
        oJavaScriptExecutor.executeScript("window.open('" + href + "')");  
        System.out.println("there are " + driver.getWindowHandles().size() + " windows");  
    }  
      
    public static boolean switchToWindow(String windowTitle,WebDriver dr){    
        boolean flag = false;    
        try {   
            //��ҳ�������е�windowshandle������set���ϵ���  
            String currentHandle = dr.getWindowHandle();    
            Set<String> handles = dr.getWindowHandles();    
            for (String s : handles) {    
                if (s.equals(currentHandle))    
                    continue;    
                else {    
                    dr.switchTo().window(s);  
            //�͵�ǰ�Ĵ��ڽ��бȽ������ͬ���л���windowhandle  
            //�ж�title�Ƿ��handles��ǰ�Ĵ�����ͬ  
                    if (dr.getTitle().contains(windowTitle)) {    
                        flag = true;    
                        System.out.println("Switch to window: "    
                                + windowTitle + " successfully!");    
                        break;    
                    } else    
                        continue;    
                }    
            }    
        } catch (Exception e) {    
            System.out.printf("Window: " + windowTitle    
                    + " cound not found!", e.fillInStackTrace());    
            flag = false;    
        }    
        return flag;    
    }   
}  