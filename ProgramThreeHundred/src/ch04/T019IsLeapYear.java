/**   
* @Title: T019IsLeapYear.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����11:30:13 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: �ж�ĳһ���Ƿ�Ϊ����
 * @author: Vincent
 * @date: 2018��4��9������11:30:13
 */
public class T019IsLeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		long year;
		try {
			year = scan.nextLong();
			if(year%4 == 0 && year%100 != 0 || year %400 ==0) {
				System.out.println(year + "�����꣡");
			} else {
				System.out.println(year + "�������꣡");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
