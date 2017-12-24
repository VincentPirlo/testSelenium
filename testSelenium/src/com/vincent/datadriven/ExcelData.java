/**   
* @Title: ExcelData.java 
* @Package com.vincent.datadriven 
* @Description: TODO
* @author Vincent  
* @date 2017��12��3�� ����3:16:03 
* @version V1.0   
*/ 
package com.vincent.datadriven;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @Function: TODO
 * ����������������ͬ�Ĳ��Խű�ʹ�ò�ͬ�Ĳ�������ִ�У��������ݺͲ�����Ϊ��ȫ���롣
 * @author: Vincent
 * @date: 2017��12��3������3:16:03
 */

public class ExcelData implements Iterator<Object[]> {
	private Workbook workbook = null;
	private Sheet sheet = null;
	private int rowNum = 0;
	private int curRowNo = 0;
	private int columnNum = 0;
	private String[] columnName;
	
	/**
	 * ��TestNG�У���@DataProvider(dataProvider="name")���εķ�����ȡExcelʱ�����ô���Ĺ��췽��
	 * ���˷�����õ�����������ǰ���Ƶ���һ�У�ִ�����ת��TestNG�Լ��ķ������Ǹ�ȥ��Ȼ�������ǵ��ô���ʵ�ֵ�hasNext()��
	 * next()�������õ�һ�����ݣ�Ȼ�󷵻ظ���@Test(dataProvider="name")���εķ�������˷���ֱ�����ݶ���Ϊֹ
	 * @param filepath
	 * @param casename
	 */
	public ExcelData(String filepath, String casename) {
		try {
			File directory = new File(".");
			workbook = Workbook.getWorkbook(new File(directory.getCanonicalFile()
					+ "\\src\\com\\vincent\\datadriven\\"
					+ filepath + ".xls"));
			this.sheet = workbook.getSheet(casename);
			this.rowNum = sheet.getRows();
			
			Cell[] c = sheet.getRow(0);
			this.columnNum = c.length;
			columnName = new String[c.length];
			for(int i=0; i<c.length; i++) {
				columnName[i] = c[i].getContents().toString();
			}
			
			this.curRowNo++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: �ж��Ƿ�����һ�����ݣ��������Ϊ0����sheet���ߵ�ǰ�����������������͹رն�excel�Ĳ�������
	 * false�����򷵻�true
	 * @return
	 */
	@Override
	public boolean hasNext() {
		if(this.rowNum == 0 || this.curRowNo >= this.rowNum) {
			try {
				workbook.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return false;
		} else
			return true;
	}
	
	/**
	 * @Function: �õ���������һ������
	 * ʹ��for��һ�е����ݷ���TreeMap��(TreeMapĬ�ϰ���Keyֵ�������У�HashMapû������)
	 * Ȼ��Mapװ��Object[]�����أ��ҽ�curRowNo��ǰ������
	 * @return
	 */
	@Override
	public Object[] next() {
		Cell[] c = sheet.getRow(this.curRowNo);
		Map<String, String> s = new TreeMap<String, String>();
		for(int i=0; i<this.columnNum; i++) {
			String temp = "";
			try {
				temp = c[i].getContents().toString();
			} catch (ArrayIndexOutOfBoundsException ex) {
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
