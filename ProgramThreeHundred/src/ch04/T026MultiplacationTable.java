/**   
* @Title: T026MultiplacationTable.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月10日 下午9:26:33 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: for 九九乘法表
 * @author: Vincent
 * @date: 2018年4月10日下午9:26:33
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
