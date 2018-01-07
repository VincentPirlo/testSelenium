/**   
* @Title: ExcelHandle.java 
* @Package com.vincent.jxl 
* @Description: TODO
* @author Vincent  
* @date 2018��1��6�� ����11:41:28 
* @version V1.0   
*/ 
package com.vincent.jxl;

import java.io.File;

import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018��1��6������11:41:28
 */
public class ExcelHandle {

    /**
     * @param args
*/
    public static void main(String[] args) {
        ExcelHandle excelHandle = new ExcelHandle();
        excelHandle.writeExcel();

    }

    /**
     * д��Excel
     * 
*/
    public void writeExcel() {
        try {
            //д�뵽�Ǹ�Excel�ļ� �磺c:\\hello.xls,����hello.xls(���������Ŀ�ĸ�Ŀ¼��)
            WritableWorkbook wwb = Workbook
                    .createWorkbook(new File("hello.xls"));
            // ����Excel������ ָ�����ƺ�λ��
            WritableSheet ws = wwb.createSheet("Test Sheet 1", 0);
            // ���ñ����п��
            ws.setColumnView(0, 14);//��һ�п�14
            ws.setColumnView(1, 12);
            ws.setColumnView(2, 25);
            ws.setColumnView(3, 20);
            ws.setColumnView(4, 12);
            ws.setColumnView(5, 9);
            ws.setColumnView(6, 12);//��7�п�12

// **************�����������������*****************

//���������ʽ������Ϊ��΢���źڣ�24���ӣ��Ӵ�
            WritableFont titleFont = new WritableFont(WritableFont
                    .createFont("΢���ź�"), 24, WritableFont.NO_BOLD);
            WritableFont contentFont = new WritableFont(WritableFont
                    .createFont("���� _GB2312"), 12, WritableFont.NO_BOLD);
            
            WritableCellFormat titleFormat = new WritableCellFormat(titleFont);
            WritableCellFormat contentFormat = new WritableCellFormat(
                    contentFont);
            WritableCellFormat contentFormat2 = new WritableCellFormat(
                    contentFont);

            contentFormat.setBorder(Border.ALL, BorderLineStyle.THIN,
                    Colour.BLACK);
            //���ø�ʽ���ж���
            titleFormat.setAlignment(jxl.format.Alignment.CENTRE);
            contentFormat2.setAlignment(jxl.format.Alignment.CENTRE);

            // ***************������õĵ�Ԫ����ӵ���������*****************
            ws.mergeCells(0, 0, 6, 0);// �ϲ���Ԫ��A-G��7��
            ws.addCell(new Label(0, 0, "����XXX��ѧ2009���о����γ̿��Գɼ���", titleFormat));
            ws.addCell(new Label(0, 1, "�γ�����", contentFormat2));
            ws.mergeCells(1, 1, 6, 1);// �ϲ���Ԫ��B-G��6��
            ws.addCell(new Label(1, 1, "��ѧ��ѧ", contentFormat2));
            ws.addCell(new Label(0, 2, "Ժ��������", contentFormat2));
            ws.mergeCells(1, 2, 6, 2);// �ϲ���Ԫ��B-G��6��
            ws.addCell(new Label(0, 3, "�����", contentFormat2));
            ws.addCell(new Label(2, 3, "�����Ҹ�����", contentFormat2));

            String th[] = { "ѧ��", "����", "ѧԺ", "ƽʱ�ɼ�", "��ĩ�ɼ�", "�ܳɼ�", "�����ɼ�" };
            for (int i = 0; i < 7; i++) {
                ws.addCell(new Label(i, 4, th[i], contentFormat2));
            }
            //�������ǿ��Դ����ݿ������ѯ���ݣ�Ȼ���������ȡ����
            int xh = 200901;
            String xm = "���Ѽ�";
            String xy = "XXX��Ϣ����ѧԺ";
            String space = " ";
            int cj = 50;
            String bk = "�� 80";
            //��Excel�в�������
            for (int j = 5; j < 10; j++) {
                ws.addCell(new Label(0, j, "" + xh + j + "", contentFormat));
                ws.addCell(new Label(1, j, xm+j , contentFormat));
                ws.addCell(new Label(2, j,  xy , contentFormat));
                ws.addCell(new Label(3, j, space , contentFormat));
                ws.addCell(new Label(4, j, space, contentFormat));
                ws.addCell(new Label(5, j, "" + cj + j + "", contentFormat));
                ws.addCell(new Label(6, j, "" + bk + "", contentFormat));
            }
            // д�빤������ϣ��ر���
            wwb.write();
            wwb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
