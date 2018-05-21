/**   
* @Title: ExcelData.java 
* @Package com.vincent.datadriveno 
* @Description: TODO
* @author Vincent  
* @date 2018��1��6�� ����9:57:39 
* @version V1.0   
*/ 
package com.vincent.datadriveno;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018��1��6������9:57:39
 */
public class ExcelData implements Iterator<Object[]> {
	private Workbook book = null;
	private Sheet sheet = null;
	private int rowNum = 0;//����
	private int curRowNo = 0;//��ǰ����
	private int columnNum = 0;//����
	private String[] columnName;//����
	
	/*��TestNG�У���@DataProvider��dataProvider="name"�����εķ�����ȡExelʱ�����ô���Ĺ��췽�����˷�����õ�����������ǰ���Ƶ���һ�У�ִ����� 
	*ת��TestNG�Լ��ķ�����ȥ��Ȼ�������ǵ��ô���ʵ�ֵ�hasNext()��next() ������ 
	*�õ�һ�����ݣ�Ȼ�󷵻ظ���@Test��dataProvider="name"�����εķ�������˷��������ݶ���Ϊֹ�� 
	* @param fileName Excel�ļ��� 
	* @param casename������ 
	 */
	public ExcelData(String fileName, String sheetName) {
		try {
			File directory = new File(".");
			String ss = "";
			book = Workbook.getWorkbook(new File(directory.getCanonicalFile() 
					+ "\\src\\com\\vincent\\datadriveno\\" + fileName));//(new File(this.getClass().getResource("/").getPath() + fileName));
			this.sheet = book.getSheet(sheetName);
			this.rowNum = sheet.getRows();
			Cell[] cell = sheet.getRow(0);
			this.columnNum = cell.length;
			columnName = new String[cell.length];
			for(int i=0; i<cell.length; i++) {
				columnName[i] = cell[i].getContents().toString();
			}
			this.curRowNo++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean hasNext() {
	/** 
	*�������ܣ��Ƿ�����һ������ 
	*�������Ϊ0����sheet���� ��ǰ�������������� 
	*�͹رն�excel�Ĳ�������false�����򷵻�true 
	*/  	
		if(this.rowNum == 0 || this.curRowNo >= this.rowNum) {
			try {
				book.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public Object[] next() {
	/* �������ܣ��õ���������һ������ 
	* ʹ��for��һ�е����ݷ���TreeMap�У�TreeMapĬ�ϰ���Keyֵ�������У�HashMapû������ 
	*Ȼ��Mapװ��Object[]�����أ��ҽ�curRowNo��ǰ������ 
	*/ 
		Cell[] cell = sheet.getRow(this.curRowNo);
		Map<String, String> s = new TreeMap<String, String>();
		for(int i=0; i<this.columnNum; i++) {
			String temp = "";
			try {
				temp = cell[i].getContents().toString();
			} catch (ArrayIndexOutOfBoundsException e) {
				temp = "";
			}
			s.put(this.columnName[i], temp);
		}
		
		Object r[] = new Object[1];
		r[0] = s;
		this.curRowNo++;
		return r;
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove unsupported.");
	}	
}
