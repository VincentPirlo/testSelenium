import java.util.Scanner;

/**   
* @Title: T016ParityCheck.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018年4月9日 下午11:16:23 
* @version V1.0   
*/

/**
 * @Function: 用三元运算符判断奇数和偶数
 * @author: Vincent
 * @date: 2018年4月9日下午11:16:23
 */
public class T016ParityCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		long number = scan.nextLong();
		String check = (number%2==0)?"这个数字是：偶数":"这个数字是：奇数";
		System.out.println(check);
	}
}
