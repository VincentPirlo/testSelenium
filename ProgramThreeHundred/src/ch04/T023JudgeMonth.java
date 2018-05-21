/**   
* @Title: T023JudgeMonth.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月10日 下午9:06:22 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: switch练习
 * @author: Vincent
 * @date: 2018年4月10日下午9:06:22
 */
public class T023JudgeMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个月份，我能告诉你它属于哪个季度。");
		int month = scan.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("你输入的月份属于冬季。");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("你输入的月份属于春季。");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("你输入的月份属于夏季。");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("你输入的月份属于秋季。");
			break;
		default:
			System.out.println("你那有" + month + "月份吗？");
			
		}
	}
}
