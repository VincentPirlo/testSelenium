/**   
* @Title: EightSort.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年9月5日 下午10:40:36 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.util.Arrays;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年9月5日下午10:40:36
 */
public class EightSort {
	public static void main(String[] args) {
//		insertSort();
//		shellSort();
//		selectSort();
		bubbleSort();
		
	}
	
	//插入排序
	public static void insertSort(){
	    int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	    int temp=0;
	    for(int i=1;i<a.length;i++){
	       int j=i-1;
	       temp=a[i];
	       for(;j>=0&&temp<a[j];j--){
	    	   a[j+1]=a[j];                       //将大于temp的值整体后移一个单位
	       }
	       a[j+1]=temp;
	    }
	    for(int i=0;i<a.length;i++)
	       System.out.println(a[i]);
	}
	
	//shell排序（希尔排序）
	public static void shellSort(){
		int a[]={1,54,6,3,78,34,12,45,56,100};
		double d1=a.length;
		int temp=0;
		while(true){
			d1= Math.ceil(d1/2);
			int d=(int) d1;
			for(int x=0;x<d;x++){
				for(int i=x+d;i<a.length;i+=d){
					int j=i-d;
					temp=a[i];
					for(;j>=0&&temp<a[j];j-=d){
						a[j+d]=a[j];
					}
					a[j+d]=temp;
				}
			}
			if(d==1)
				break;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	//简单选择排序
	public static void selectSort(){
		int a[]={1,54,6,3,78,34,12,45};
		int position=0;
		for(int i=0;i<a.length;i++){
			
			int j=i+1;
			position=i;
			int temp=a[i];
			for(;j<a.length;j++){
			if(a[j]<temp){
				temp=a[j];
				position=j;
			}
			}
			a[position]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	//冒泡排序
	public static	void bubbleSort(){
		 int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int temp=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);	
	}
	
	
}
