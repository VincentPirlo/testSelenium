import java.util.Scanner;

/**   
* @Title: T018ExchangeTwoNumber.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����11:24:36 
* @version V1.0   
*/

/**
 * @Function: ������������������ʵ�����������Ļ���
 * @author: Vincent
 * @date: 2018��4��9������11:24:36
 */
public class T018ExchangeTwoNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������A��ֵ��");
		long A = scan.nextLong();
		System.out.println("���������B��ֵ��");
		long B = scan.nextLong();
		System.out.println("A=" + A + "\tB=" +B);
		System.out.println("ִ�б�������...");
		A = A^B;
		B = B^A;
		A = A^B;
		System.out.println("A=" + A + "\tB=" +B);
	}
}
