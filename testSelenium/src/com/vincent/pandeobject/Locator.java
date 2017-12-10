/**   
* @Title: Locator.java 
* @Package com.vincent.pandeobject 
* @Description: TODO
* @author Vincent  
* @date 2017年12月10日 下午9:00:05 
* @version V1.0   
*/ 
package com.vincent.pandeobject;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年12月10日下午9:00:05
 */
public class Locator {
	private String element;
	private int waitSec;
	
	/**
	 * @Function: create an enum variable for By
	 * @author: Vincent
	 * @date: 2017年12月10日下午9:01:44
	 */
	public enum ByType {
		xpath, id, linkText, name, className, cssSelector, partialLink, tagName
	}
	
	private ByType byType;
	public Locator() {
		
	}
	
	
	/**
	 * default Locator, use xpath
	 * @param element
	 */
	public Locator(String element) {
		this.element = element;
		this.waitSec = 3;
		this.byType = ByType.xpath;
	}
	
	public String getElement() {
		return element;
	}
	
	public int getWaitSec() {
		return waitSec;
	}
	
	public ByType getBy() {
		return byType;
	}
	
	public void setBy(ByType byType) {
		this.byType = byType;
	}
}
