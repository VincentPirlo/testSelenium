/**   
* @Title: Contants.java 
* @Package com.vincent.keyword.utility 
* @Description: TODO
* @author Vincent  
* @date 2017��11��28�� ����9:41:06 
* @version V1.0   
*/ 
package com.vincent.keyword.utility;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��11��28������9:41:06
 */
public class Contants {
	//������ʵ�ַ
	public static String url = "http://www.oschina.net/";
	//�������·��
	public static String baseUrl = "D:\\test-workspace\\testSelenium";
	//�������������·��
	public static String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
	
	//Excel��·��������
	public static String excelFile = baseUrl+"\\src\\com\\vincent\\keyword";
	public static String excelName = "TestData1.xlsx";
	public static String excelName2 = "TestData2.xlsx";
	
	//����ֿ��ļ�·��
	public static String ObjectReUrl = baseUrl+"\\src\\com\\vincent\\keyword\\ObjectReposity";
	
	//����sheetҳ
	public static String excelSheet = "Test Steps";
	public static String caseSheet = "Test Steps";
	
	//����������sheetҳ
	public static String suiteSheet = "Suite";
	
	//Suiteҳ������
	public static int suiteTestSuiteId = 0;
	public static int suiteRunmode = 2;
	public static int suiteResult = 3;
	
	//��������ҳ������
	public static int stepTestSuiteId = 0;
	public static int excelPOColNum = 4;
	public static int excelKWColNum = 5;
	public static int caseResult = 6;
	
	//�ɹ���ʧ��
	public static String fail = "FAIL";
	public static String pass = "PASS";
	
	//��¼���û���������

	public static String userName = "sxtqlcs78@163.com";//"ssssssss";
	public static String userPassword = "cc19871209@";//"cccccc";
}
