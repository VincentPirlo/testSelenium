/**   
* @Title: T023JudgeMonth.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��10�� ����9:06:22 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: switch��ϰ
 * @author: Vincent
 * @date: 2018��4��10������9:06:22
 */
public class T023JudgeMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ���·ݣ����ܸ������������ĸ����ȡ�");
		int month = scan.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("��������·����ڶ�����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��������·����ڴ�����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("��������·������ļ���");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("��������·������＾��");
			break;
		default:
			System.out.println("������" + month + "�·���");
			
		}
	}
}
