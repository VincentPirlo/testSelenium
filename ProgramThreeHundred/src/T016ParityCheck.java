import java.util.Scanner;

/**   
* @Title: T016ParityCheck.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����11:16:23 
* @version V1.0   
*/

/**
 * @Function: ����Ԫ������ж�������ż��
 * @author: Vincent
 * @date: 2018��4��9������11:16:23
 */
public class T016ParityCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		long number = scan.nextLong();
		String check = (number%2==0)?"��������ǣ�ż��":"��������ǣ�����";
		System.out.println(check);
	}
}
