import java.util.Scanner;

/**   
* @Title: T018ExchangeTwoNumber.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018年4月9日 下午11:24:36 
* @version V1.0   
*/

/**
 * @Function: 不借助第三个变量，实现两个变量的互换
 * @author: Vincent
 * @date: 2018年4月9日下午11:24:36
 */
public class T018ExchangeTwoNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入变量A的值：");
		long A = scan.nextLong();
		System.out.println("请输入变量B的值：");
		long B = scan.nextLong();
		System.out.println("A=" + A + "\tB=" +B);
		System.out.println("执行变量互换...");
		A = A^B;
		B = B^A;
		A = A^B;
		System.out.println("A=" + A + "\tB=" +B);
	}
}
