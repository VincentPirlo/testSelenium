/**   
* @Title: BasePage.java 
* @Package com.vincent.pandeobject 
* @Description: TODO
* @author Vincent  
* @date 2017年12月10日 下午7:19:11 
* @version V1.0   
*/ 
package com.vincent.pandeobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * http://www.cnblogs.com/tobecrazy/p/4553444.html
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月10日下午7:19:11
 */
public class BasePage {
	
	protected WebDriver driver;
	protected String[][] locatorMap;
	
	protected BasePage(WebDriver driver) throws IOException {
		this.driver = driver;
		locatorMap = ReadExcelUtil.getLocatorMap();
	}
	
	protected void type(Locator locator, String values) throws Exception {
		WebElement e = findElement(driver, locator);
		e.sendKeys(values);
	}
	
	protected void click(Locator locator) throws Exception {
		WebElement e = findElement(driver, locator);
		e.click();
	}
	
	protected void clickAndHold(Locator locator) throws IOException {
		WebElement e = findElement(driver, locator);
		Actions actions = new Actions(driver);
		actions.clickAndHold(e).perform();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(Locator locator) throws IOException {
		return getElement(this.getDriver(), locator);
	}
	
	/**
	 * @Function: TODO
	 * @param driver
	 * @param locator
	 * @return
	 * @throws IOException
	 */
	public WebElement getElement(WebDriver driver, Locator locator) throws IOException {
		locator = getLocator(locator.getElement());
		WebElement e;
		switch(locator.getBy()) {
		case xpath:
			e = driver.findElement(By.xpath(locator.getElement()));
			break;
		case id:
			e = driver.findElement(By.id(locator.getElement()));
			break;
		case name:
			e = driver.findElement(By.name(locator.getElement()));
			break;
		case cssSelector:
			e = driver.findElement(By.cssSelector(locator.getElement()));
			break;
		case className:
			e = driver.findElement(By.className(locator.getElement()));
			break;
		case tagName:
			e = driver.findElement(By.tagName(locator.getElement()));
			break;
		case linkText:
			e = driver.findElement(By.linkText(locator.getElement()));
			break;
		case partialLinkText:
			e = driver.findElement(By.partialLinkText(locator.getElement()));
			break;
		default:
			e = driver.findElement(By.id(locator.getElement()));
		}
		return e;
	}
	
	
	public boolean isElementPresent(WebDriver driver, Locator myLocator, int timeOut) throws IOException {
		final Locator locator = getLocator(myLocator.getElement());
		boolean isPresent = false;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		isPresent = wait.until(new ExceptedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver d) {
				return findElement(d, locator);
			}
		}).isDisplayed();
		return isPresent;
	}
	
	/**
	 * @Function: TODO
	 * @param locator
	 * @param timeOut
	 * @return
	 * @throws IOException
	 */
	public boolean isElementPresent(Locator locator, int timeOut) throws IOException {
		return isElementPresent(driver, locator, timeOut);
	}
	
	public WebElement findElement(WebDriver driver, final Locator locator) {
		WebElement element = (new WebDriverWait(driver, locator.getWaitSec())).until(new ExpectedCondition<WebElement>() {
			
			@Override
			public WebElement apply(WebDriver driver) {
				try {
					return getElement(driver, locator);
				} catch (IOException e) {
					return null;
				}
			}
		});
		return element;
	}
	
	public Locator getLocator(String locatorName) throws IOException {
		Locator locator;
		for(int i=0; i<locatorMap.length; i++) {
			if(locatorMap[i][0].endsWith(locatorName)) {
				return locator = new Locator(locatorMap[i][1]);
			}
		}
		return locator = new Locator(locatorName);
	}
}
