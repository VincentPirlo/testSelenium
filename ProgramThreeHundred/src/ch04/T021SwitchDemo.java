/**   
* @Title: T021SwitchDemo.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����11:42:49 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: Switch��ϰ
 * @author: Vincent
 * @date: 2018��4��9������11:42:49
 */
public class T021SwitchDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ա����������");
		String name = scan.nextLine();
		System.out.println("��������Ա��ӦƸ�ı�����ԣ�");
		String language = scan.nextLine();
		switch(language.hashCode()) {
		case 3254818:
		case 2301506:
		case 2269730:
			System.out.println("Ա��" + name + "�����䵽Java���򿪷����š�");
			break;
		case 3104:
		case 2112:
			System.out.println("Ա��" + name + "�����䵽C#���򿪷����š�");
			break;
		case -709190099:
		case 955463181:
			System.out.println("Ա��" + name + "�����䵽ASP.net���򿪷����š�");
			break;
		default:
			System.out.println("����˾����Ҫ" + language + "���Եĳ��򿪷���Ա��");
		}
	}
}
