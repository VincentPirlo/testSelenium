import java.io.FileNotFoundException;
import java.io.PrintStream;

/**   
* @Title: T013RedirectOutputStream.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018��4��9�� ����10:47:34 
* @version V1.0   
*/

/**
 * @Function: �ض��������ʵ�ֳ�����־
 * @author: Vincent
 * @date: 2018��4��9������10:47:34
 */
public class T013RedirectOutputStream {
	public static void main(String[] args) {
		try {
			PrintStream out = System.out;					//����ԭ�����
			PrintStream ps = new PrintStream("./log.txt");	//�����ļ������
			System.setOut(ps);
			int age = 18;
			System.out.println("��������ɹ����壬��ʼֵΪ18");
			String sex = "Ů";
			System.out.println("�Ա�����ɹ����壬��ʼֵΪŮ");
			//������������
			String info = "���Ǹ�" + sex + "���ӣ�Ӧ����" + age + "���ˡ�";
			System.out.println("������������Ϊinfo�ַ��������������ǣ�" + info);
			System.setOut(out);
			System.out.println("����������ϣ���鿴��־�ļ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
