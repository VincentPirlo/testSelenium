/**   
* @Title: GetFilePathTest.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年1月6日 下午7:20:51 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.io.IOException;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年1月6日下午7:20:51
 */
public class GetFilePathTest {
	public static void main(String[] args) throws IOException {
		GetFilePath getfilepath = new GetFilePath();
		System.out.println("================one================");
		getfilepath.getPathOne();
		System.out.println();
		System.out.println("================one2================");
		getfilepath.getPathOne2();
		System.out.println();
		System.out.println("================two================");
		getfilepath.getPathTwo();
		System.out.println();
		System.out.println("================three================");
		getfilepath.getPathThree();
		System.out.println();
		System.out.println("================four================");
		getfilepath.getPathFour();
		System.out.println();
		System.out.println("================five================");
		getfilepath.getPathFive();
	}
}
