/**   
* @Title: T024ErgodicArray.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月10日 下午9:14:00 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: 使用while循环语句与自增运算符循环遍历数组
 * @author: Vincent
 * @date: 2018年4月10日下午9:14:00
 */
public class T024ErgodicArray {
	public static void main(String[] args) {
		String[] aves = new String[] {"白鹭", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "布谷鸟", "斑鸠", "百灵鸟"};
		int index = 0;
		System.out.println("我的花园里有很多鸟，大约包括：");
		while(index < aves.length) {
			System.out.println(aves[index++]);
		}
	}
}
