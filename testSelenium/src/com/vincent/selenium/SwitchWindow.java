/**   
* @Title: SwitchWindow.java 
* @Package com.vincent.selenium 
* @Description: TODO
* @author Vincent  
* @date 2018年1月7日 下午11:22:03 
* @version V1.0   
*/ 
package com.vincent.selenium;

import java.util.Set;  

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;  
/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月7日下午11:22:03
 */
public class SwitchWindow {

    private static WebDriver driver;  
      
    @BeforeClass
    public static void before(){  
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver=new ChromeDriver();  
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
       /* Actions action = new Actions(driver);  
        action.sendKeys(Keys.CONTROL + "n").perform();  
        switchToWindow("新标签页", driver);  
        driver.get("http://www.sina.com.cn/");*/
        String js = "window.open('http://www.sina.com.cn/')";
        ((JavascriptExecutor) driver).executeScript(js);
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
        String href = driver.findElement(By.partialLinkText("新闻")).getAttribute("href");  
        JavascriptExecutor oJavaScriptExecutor = (JavascriptExecutor)driver;  
        oJavaScriptExecutor.executeScript("window.open('" + href + "')");  
        System.out.println("there are " + driver.getWindowHandles().size() + " windows");  
    }  
      
    public static boolean switchToWindow(String windowTitle,WebDriver dr){    
        boolean flag = false;    
        try {   
            //将页面上所有的windowshandle放在入set集合当中  
            String currentHandle = dr.getWindowHandle();    
            Set<String> handles = dr.getWindowHandles();    
            for (String s : handles) {    
                if (s.equals(currentHandle))    
                    continue;    
                else {    
                    dr.switchTo().window(s);  
            //和当前的窗口进行比较如果相同就切换到windowhandle  
            //判断title是否和handles当前的窗口相同  
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