import java.util.Scanner;

/**   
* @Title: T017LeftMove.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����11:20:34 
* @version V1.0   
*/

/**
 * @Function: ��������������ó˷������ʵ��2*16��
 * @author: Vincent
 * @date: 2018��4��9������11:20:34
 */
public class T017LeftMove {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		long number = scan.nextLong();
		System.out.println("������������ǣ�" + number);
		System.out.println("�����ֳ���2������ͽ��Ϊ��" + (number<<1));
		System.out.println("�����ֳ���4������ͽ��Ϊ��" + (number<<2));
		System.out.println("�����ֳ���8������ͽ��Ϊ��" + (number<<3));
		System.out.println("�����ֳ���16������ͽ��Ϊ��" + (number<<4));
	}
}
