/**   
* @Title: T020CheckLogin.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����11:36:18 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: 
 * @author: Vincent
 * @date: 2018��4��9������11:36:18
 */
public class T020CheckLogin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������¼�û�����");
		String username = scan.nextLine();
		System.out.println("�������¼���룺");
		String password = scan.nextLine();
		if(!username.equals("root")) {
			System.out.println("�û����Ƿ���");
		} else if (!password.equals("kedacom")) {
			System.out.println("�������");
		} else {
			System.out.println("��ϲ������¼��Ϣͨ����֤��");
		}
	}
}
