/**   
* @Title: T028Diamond.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018��4��10�� ����9:49:12 
* @version V1.0   
*/ 
package ch04;

import java.util.Scanner;

/**
 * @Function: forѭ��������ĵ�����
 * @author: Vincent
 * @date: 2018��4��10������9:49:12
 */
public class T028Diamond {
	public static void main(String[] args) {
		System.out.print("������һ����������");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printHollowRhombus(n);
	}
	
	public static void printHollowRhombus(int size) {
		if(size%2 == 0) {
			size++;
		}
		for (int i=0; i<size/2+1; i++) {
			for(int j=size/2+1; j>i+1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				if(j==0 || j==2*i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=size/2+1; i<size; i++) {
			for(int j=0; j<i-size/2; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*size-1-2*i; j++) {
				if(j==0 || j==2*(size-i-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
