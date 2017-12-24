/**   
* @Title: TestTimeout.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月24日 下午11:35:34 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: 超时测试
 *  “超时”表示如果单元测试花费的时间超过指定的毫秒数，那么TestNG将会中止它并将其标记为失败。
 *  “超时”也可用于性能测试，以确保方法在合理的时间内返回。
 * @author: Vincent
 * @date: 2017年12月24日下午11:35:34
 */
public class TestTimeout {
	
	@Test(timeOut = 5000)				//time in miliseconds
	public void testThisShouldPass() throws InterruptedException {
		Thread.sleep(4000);
	}
	
	@Test(timeOut = 1000)
	public void testThisShouldFail() {
		while(true) {
			//do nothing
		}
	}
}
