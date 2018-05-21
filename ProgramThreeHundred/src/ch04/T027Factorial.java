/**   
* @Title: T027Factorial.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月10日 下午9:36:17 
* @version V1.0   
*/ 
package ch04;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Function: while 阶乘
 * @author: Vincent
 * @date: 2018年4月10日下午9:36:17
 */
public class T027Factorial {
	public static void main(String[] args) {
		BigDecimal sum = new BigDecimal(0.0);
		BigDecimal factorial = new BigDecimal(1.0);
		int i = 1;
		System.out.println("请输入一个正整数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		while(i<=num) {
			sum = sum.add(factorial);
			++i;
			factorial = factorial.multiply(new BigDecimal(1.0/i));
		}
		System.out.println(num + "项的计算结果等于：" + sum);
	}
}
