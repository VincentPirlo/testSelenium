/**   
* @Title: VariableNumber.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年4月19日 下午10:26:31 
* @version V1.0   
*/ 
package com.vincent.justtest;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年4月19日下午10:26:31
 */
public class VariableNumber {
	public static void main(String[] args) {
		System.out.println(variableNumber(2.1, 4, 2.4, 100.2, -45));
	}
	
	public static double variableNumber(double... ds) {
		double largest = Double.MIN_VALUE;
		for (double v : ds) if (v > largest) largest = v;
		return largest;
	}
}
