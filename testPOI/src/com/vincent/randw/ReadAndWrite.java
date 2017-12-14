/**   
* @Title: ReadAndWrite.java 
* @Package com.vincent.randw 
* @Description: TODO
* @author Vincent  
* @date 2017��12��13�� ����10:02:13 
* @version V1.0   
*/ 
package com.vincent.randw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��12��13������10:02:13
 */
public class ReadAndWrite {
	public static void main(String[] args) {
		
	}
	
	/**
	 * @Function: ��ָ��Excel�ļ���ָ����ָ�����еĵ�Ԫ������
	 * @param fileName	Excel�ļ���
	 * @param sheetName	sheet����
	 * @param rowNum	�к�
	 * @param cloNum	�к�
	 * @usage readExcel(fineName, sheetName, rowNum, columnNum)
	 * @return unitValue	��Ԫ���ֵ
	 */
	public String readExcel(String fileName, String sheetName, Integer rowNum, Integer columnNum) {
		//��ʼ����Ԫ��ֵΪ��
		String unitValue = null;
		try {
			//����������
			InputStream input = new FileInputStream(new File(fileName));
			Workbook wb = null;
			//�����ļ���ʽ��2003��2010������ʼ��
			wb = new XSSFWorkbook(input);
			Sheet sheet = wb.getSheet(sheetName);	//��ñ�
			//logger.info("��ʼ��ȡExcel�ļ���" + fileName + "��sheet��" + sheetName);
			//Sheet sheet = wb.getSheetAt(0);		//��õ�һ����
			int rowCount = sheet.getPhysicalNumberOfRows();	//��ȡ������
			
			//����ÿһ��
			for(int i=0; i<rowCount; i++) {
				Row row = sheet.getRow(i);
				int cellCount = row.getPhysicalNumberOfCells();	//��ȡ������
				//����ÿһ��
				for(int j=0; j<cellCount; j++) {
					Cell cell = row.getCell(j);
					if(i==rowNum && j==columnNum) {
						cell.setCellType(1);
						unitValue = cell.getStringCellValue();
						//logger.info("��ȡExcel�ļ�:"+fileName+"��sheet��:"+sheetName+"�е�"+rowNum+"��"+"��"+columnNum+"��,��ȡ����ֵΪ:"+unitValue); ?
					} else {
						continue;	//������������
					}
				}
			}
			if(unitValue.equals("")) {
				//logger.info("��ȡExcel�ļ�:"+fileName+"��sheet��"+sheetName+"�е�"+rowNum+"��"+"��"+columnNum+"��,��ȡ����ֵΪ��,������\"\"");  
                unitValue="";  
			}
		} catch (IOException e) {
			e.printStackTrace();
			//logger.error("��ȡExcel�ļ�:"+fileName+"��sheet��:"+sheet
		}
		return unitValue;
	}
	
	
	/**
	 * @Function: ���ַ���д��ָ���ļ���ָ��������
	 * @param fileName		��д���Excel·���ļ���
	 * @param sheetName		sheet����
	 * @param unitValue		��д����ַ���
	 * @param rowNum		��д����к�
	 * @param columnNum		��д����к�
	 * @usage writeExcel(fileName, sheetName, unitValue, rowNum, columnNum)
	 */
	public void writeExcel(String fileName, String sheetName, String unitValue, int rowNum, int columnNum) {
		try {
			InputStream input = new FileInputStream(new File(fileName));	//����������
			Workbook wb = null;
			//�����ļ����ᣨ2003��2010������ʼ��
			wb = new XSSFWorkbook(input);
			Sheet sheet = wb.getSheet(sheetName);	//��ñ�
			//Sheet sheet = wb.getSheetAt(0);			//��õ�һ����
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(columnNum);
			cell.setCellType(1);
			cell.setCellValue(unitValue);
			//logger.info("��Excel�ļ�:"+fileName+"��sheet��:"+sheetName+"�е�"+rowNum+"�е�"+column+"��д������:"+unitValue+"�ɹ�!");
			
			//д��󱣴浽Excel
			OutputStream os = null;
			try {
				os = new FileOutputStream(new File(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				wb.write(os);
				//logger.info("��Excel�ļ�:"+fileName+"��sheet��:"+sheetName+"д���������!");  
			} catch (IOException e) {
				e.printStackTrace();
				//logger.error("��Excel�ļ�:"+fileName+"��sheet��:"+sheetName+"д������ʧ��!"); 
			}
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: ���ַ���д��ָ���ļ���ָ������
	 * @param fileName		��д���Excel·���ļ���
	 * @param sheetName		sheet����
	 * @param unitValue		��д����ַ�������
	 * @param rowNum		����һ�п�ʼ
	 * @param columnNum		��д����к�
	 * @usage writeExcelCol(fileName, sheetName, unitValue, rowNum, columnNum)
	 */
	public void writeExcelCol(String fileName, String sheetName, List unitValue, int rowNum, int columnNum) {
		try {
			InputStream input = new FileInputStream(new File(fileName));	//����������
			Workbook wb = null;
			//�����ļ���ʽ��2003��2010������ʼ��
			Sheet sheet = wb.getSheet(sheetName);		//��ñ�
			//Sheet sheet = wb.getSheetAt(0);			//��õ�һ����
			//���ݶ�ȡ��columnNum������д����һ��
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Function: TODO
	 * @param fileName
	 * @param sheetName
	 * @param unitValue
	 * @param rowNum
	 * @param columnNum
	 */
	public void writeExcelRow(String fileName, String sheetName, List unitValue, int rowNum, int columnNum) {
		 try {  
	            InputStream input = new FileInputStream(new File(fileName));    //����������  
	            Workbook wb  = null;  
	            //�����ļ���ʽ(2003����2010)����ʼ��  
	            wb = new XSSFWorkbook(input);  
	            Sheet sheet = wb.getSheet(sheetName);        //��ñ�  
	            //Sheet sheet = wb.getSheetAt(0);    //��õ�һ����  
	            //���ݶ�ȡ��rowNum������д����һ��  
	            Row row = sheet.createRow(rowNum);  
	            for (int c = 0; c < unitValue.size(); c++){  
	                Cell cell = row.createCell(c+columnNum);  
	                cell.setCellType(1);  
	                cell.setCellValue((String)unitValue.get(c));  
	                //logger.info("��Excel�ļ�:"+fileName+"��sheet��:"+sheetName+"�е�"+rowNum+"�е�"+(c+colNum)+"��д������:"+unitValue.get(c)+"�ɹ�!");  
	            }  
	          
	        //д��󱣴浽Excel  
	        OutputStream os = null;  
	        try {  
	            os = new FileOutputStream(new File(fileName));  
	        } catch (FileNotFoundException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	        try {  
	            wb.write(os);  
	            //logger.info("��Excel�ļ�:"+fileName+"��sheet��:"+sheetName+"д���������!");  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	            //logger.error("��Excel�ļ�:"+fileName+"��sheet��:"+sheetName+"д������ʧ��!");  
	        }  
	        try {  
	            os.close();  
	        } catch (IOException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	        } catch (IOException ex) {  
	            ex.printStackTrace();  
	        }  
	    }  
	}

