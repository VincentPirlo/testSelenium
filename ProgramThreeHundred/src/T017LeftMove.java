import java.util.Scanner;

/**   
* @Title: T017LeftMove.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018年4月9日 下午11:20:34 
* @version V1.0   
*/

/**
 * @Function: 左移运算符（不用乘法运算符实现2*16）
 * @author: Vincent
 * @date: 2018年4月9日下午11:20:34
 */
public class T017LeftMove {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		long number = scan.nextLong();
		System.out.println("你输入的数字是：" + number);
		System.out.println("该数字乘以2的运算就结果为：" + (number<<1));
		System.out.println("该数字乘以4的运算就结果为：" + (number<<2));
		System.out.println("该数字乘以8的运算就结果为：" + (number<<3));
		System.out.println("该数字乘以16的运算就结果为：" + (number<<4));
	}
}
