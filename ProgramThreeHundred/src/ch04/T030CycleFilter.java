/**   
* @Title: T030CycleFilter.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��10�� ����10:18:27 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: continue ѭ��������
 * @author: Vincent
 * @date: 2018��4��10������10:18:27
 */
public class T030CycleFilter {
	public static void main(String[] args) {
		String[] array = new String[] {"����", "���", "����", "��ѻ", "ϲȵ", "��ӥ", "������", "��ӥ", "���", "��ӥ","������"};
		System.out.println("���ҵĻ�԰���кܶ����࣬����������˼�ֻ��ӥ�����æץ�ߡ�");
		int eagleCount = 0;
		for(String string:array) {
			if(string.equals("��ӥ" )) {
				System.out.println("����һֻ��ӥ���Ѿ�ץ�������");
				eagleCount++;
				continue;
			}
			System.out.println("�������࣬�����ˣ�" + string);
		}
		System.out.println("һ��ץ���ˣ�" + eagleCount + "ֻ��ӥ��");
	}
}
