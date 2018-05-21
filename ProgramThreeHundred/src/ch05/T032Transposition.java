/**   
* @Title: T032Transposition.java 
* @Package ch05 
* @Description: TODO
* @author Vincent  
* @date 2018��4��10�� ����10:47:27 
* @version V1.0   
*/ 
package ch05;

/**
 * @Function: ����ά�����е����л���
 * @author: Vincent
 * @date: 2018��4��10������10:47:27
 */
public class T032Transposition {
	public static void main(String[] args) {
		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println("���л������֮ǰ��");
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		printArray(arr);
		
		int arr2[][] = new int[arr[0].length][arr.length];
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		System.out.println("���л������֮��");
		printArray(arr2);
	}
	
	
	private static void printArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
