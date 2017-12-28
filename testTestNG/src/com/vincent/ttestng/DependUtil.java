/**   
* @Title: DependUtil.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月28日 下午10:48:46 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: 依赖测试实用类
 * DependUtil.java & DependTest.java & dependtest-testng.xml & dependtest1-testng.xml
 * @author: Vincent
 * @date: 2017年12月28日下午10:48:46
 */
public class DependUtil {
	private String message;

    public DependUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
	return message;
    }

    public String salutationMessage() {
	message = "Hi!" + message;
	System.out.println(message);
	return message;
    }
}
