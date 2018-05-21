import java.util.Scanner;

/**   
* @Title: T015BitOperation.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018年4月9日 下午11:11:28 
* @version V1.0   
*/

/**
 * @Function: 位运算（加密可以这样简单）
 * @author: Vincent
 * @date: 2018年4月9日下午11:11:28
 */
public class T015BitOperation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个英文字符串或解密字符串");
		String password = scan.nextLine();
		char[] array = password.toCharArray();
		for(int i=0; i<array.length; i++) {
			array[i] = (char)(array[i]^20000);
		}
		System.out.println("加密或解密结果如下：");
		System.err.println(new String(array));
	}
}
