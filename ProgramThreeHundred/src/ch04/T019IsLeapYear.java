/**   
* @Title: T019IsLeapYear.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月9日 下午11:30:13 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: 判断某一年是否为闰年
 * @author: Vincent
 * @date: 2018年4月9日下午11:30:13
 */
public class T019IsLeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		long year;
		try {
			year = scan.nextLong();
			if(year%4 == 0 && year%100 != 0 || year %400 ==0) {
				System.out.println(year + "是闰年！");
			} else {
				System.out.println(year + "不是闰年！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
