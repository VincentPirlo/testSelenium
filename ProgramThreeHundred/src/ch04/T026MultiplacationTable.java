/**   
* @Title: T026MultiplacationTable.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��10�� ����9:26:33 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: for �žų˷���
 * @author: Vincent
 * @date: 2018��4��10������9:26:33
 */
public class T026MultiplacationTable {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
