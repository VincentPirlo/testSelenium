/**   
* @Title: StartEngine.java 
* @Package com.vincent.keyword.utility 
* @Description: TODO
* @author Vincent  
* @date 2017��12��8�� ����8:59:35 
* @version V1.0   
*/ 
package com.vincent.keyword.utility;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��12��8������8:59:35
 */
public class StartEngine {
	public static String Keywords = null;
	public static String r;
	public static boolean bResult;
	
	public static void Start(Object actionKeywords) {
		ExcelUtils2.setExcelFile(Contants.excelFile+ "\\" +Contants.excelName2);
		bResult = true;
		
		for(int j=1; j<=ExcelUtils2.getLastRowNums(Contants.suiteSheet); j++) {
			String Runmode = ExcelUtils2.getCellData(j, Contants.suiteRunmode, Contants.suiteSheet);
//			System.out.println(Runmode);
			String suiteTestSuiteId = ExcelUtils2.getCellData(j, Contants.suiteTestSuiteId,Contants.suiteSheet);
//			System.out.println(suiteTestSuiteId);
			int sRowNum;
			
			if(Runmode.equals("YES")) {
				System.out.println("����" + suiteTestSuiteId + "��ʼִ��...");
//				System.out.println(ExcelUtils2.getLastRowNums(Contants.caseSheet));
				for(sRowNum=1; sRowNum<=ExcelUtils2.getLastRowNums(Contants.caseSheet); sRowNum++) {
					String stepTestSuiteId = ExcelUtils2.getCellData(sRowNum, Contants.suiteTestSuiteId, Contants.caseSheet);
//					System.out.println(ExcelUtils2.getCellData(sRowNum, Contants.excelKWColNum, Contants.caseSheet));
					if(stepTestSuiteId.trim().equals(suiteTestSuiteId)) {
						Keywords = ExcelUtils2.getCellData(sRowNum, Contants.excelKWColNum, Contants.caseSheet);
						r = ExcelUtils2.getCellData(sRowNum, Contants.excelPOColNum, Contants.caseSheet);
						CommonEngine.action(Keywords, actionKeywords, r, sRowNum, bResult);
						if(bResult == false) {
							ExcelUtils2.setCellData(Contants.fail, j, Contants.suiteResult, Contants.excelFile+ "\\" +Contants.excelName2, Contants.caseSheet);
						}
					}
				}
				if(bResult == true) {
					ExcelUtils2.setCellData(Contants.pass, j, Contants.suiteResult, Contants.excelFile+ "\\" +Contants.excelName2, Contants.caseSheet);
				}
				System.out.println("����" + suiteTestSuiteId + "ִ�����!");
			}
			else {
				System.out.println("û�и����������Ҫִ��");
				break;
			}
			
		}
	}
}
