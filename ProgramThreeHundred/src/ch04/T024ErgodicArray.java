/**   
* @Title: T024ErgodicArray.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��10�� ����9:14:00 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: ʹ��whileѭ����������������ѭ����������
 * @author: Vincent
 * @date: 2018��4��10������9:14:00
 */
public class T024ErgodicArray {
	public static void main(String[] args) {
		String[] aves = new String[] {"����", "���", "����", "��ѻ", "ϲȵ", "������", "���", "������"};
		int index = 0;
		System.out.println("�ҵĻ�԰���кܶ��񣬴�Լ������");
		while(index < aves.length) {
			System.out.println(aves[index++]);
		}
	}
}
