/**   
* @Title: Contants.java 
* @Package com.vincent.keyword.utility 
* @Description: TODO
* @author Vincent  
* @date 2017年11月28日 下午9:41:06 
* @version V1.0   
*/ 
package com.vincent.keyword.utility;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月28日下午9:41:06
 */
public class Contants {
	//定义访问地址
	public static String url = "http://www.oschina.net/";
	//定义基本路径
	public static String baseUrl = "D:\\test-workspace\\testSelenium";
	//定义浏览器驱动路径
	public static String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
	
	//Excel的路径和名称
	public static String excelFile = baseUrl+"\\src\\com\\vincent\\keyword";
	public static String excelName = "TestData1.xlsx";
	public static String excelName2 = "TestData2.xlsx";
	
	//对象仓库文件路径
	public static String ObjectReUrl = baseUrl+"\\src\\com\\vincent\\keyword\\ObjectReposity";
	
	//用例sheet页
	public static String excelSheet = "Test Steps";
	public static String caseSheet = "Test Steps";
	
	//用例场景的sheet页
	public static String suiteSheet = "Suite";
	
	//Suite页的设置
	public static int suiteTestSuiteId = 0;
	public static int suiteRunmode = 2;
	public static int suiteResult = 3;
	
	//用例步骤页的设置
	public static int stepTestSuiteId = 0;
	public static int excelPOColNum = 4;
	public static int excelKWColNum = 5;
	public static int caseResult = 6;
	
	//成功和失败
	public static String fail = "FAIL";
	public static String pass = "PASS";
	
	//登录的用户名和密码
	public static String userName="ssssssss";
	public static String userPassword = "ccccccccccc";
}
