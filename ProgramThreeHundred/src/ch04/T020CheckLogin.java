/**   
* @Title: T020CheckLogin.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月9日 下午11:36:18 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: 
 * @author: Vincent
 * @date: 2018年4月9日下午11:36:18
 */
public class T020CheckLogin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入登录用户名：");
		String username = scan.nextLine();
		System.out.println("请输入登录密码：");
		String password = scan.nextLine();
		if(!username.equals("root")) {
			System.out.println("用户名非法！");
		} else if (!password.equals("kedacom")) {
			System.out.println("密码错误！");
		} else {
			System.out.println("恭喜您，登录信息通过验证。");
		}
	}
}
