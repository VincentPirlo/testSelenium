/**   
* @Title: T029BreakCycle.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��10�� ����10:07:23 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: ��ֹѭ����
 * @author: Vincent
 * @date: 2018��4��10������10:07:23
 */
public class T029BreakCycle {
	public static void main(String[] args) {
		System.out.println("\n---------�жϵ���ѭ��������--------");
		String[] array = new String[] {"����", "���", "����", "��ѻ", "ϲȵ", "��ӥ", "������", "��ӥ", "���", "��ӥ","������"};
		System.out.println("���㷢�ֵ�һֻ��ӥ֮ǰ�������Ҷ���ʲô��");
		for(String string:array) {
			if(string.equals("��ӥ"))
				break;
			System.out.print("�У�" + string + "\t");
		}
		
		System.out.println("\n\n--------�ж�˫��ѭ��������--------");
		int[][] myScores = new int[][]{{67,78,63,22,66}, {55,68,78,95,44}, {95,97,92,93,81}};
		System.out.println("������ο��Գɼ���\n��ѧ\t����\tӢ��\t����\t��ʷ");
		No1:for(int[] is:myScores) {
			for(int i:is) {
				System.out.print(i + "\t");
				if(i<60) {
					System.out.println("\n�ȣ� " + i + "�ֵ���ʲô�����Ϊʲô������");
					break No1;
				}
			}
			System.out.println();
		}
	}
}
