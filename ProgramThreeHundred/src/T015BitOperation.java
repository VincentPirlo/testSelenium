import java.util.Scanner;

/**   
* @Title: T015BitOperation.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����11:11:28 
* @version V1.0   
*/

/**
 * @Function: λ���㣨���ܿ��������򵥣�
 * @author: Vincent
 * @date: 2018��4��9������11:11:28
 */
public class T015BitOperation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��Ӣ���ַ���������ַ���");
		String password = scan.nextLine();
		char[] array = password.toCharArray();
		for(int i=0; i<array.length; i++) {
			array[i] = (char)(array[i]^20000);
		}
		System.out.println("���ܻ���ܽ�����£�");
		System.err.println(new String(array));
	}
}
