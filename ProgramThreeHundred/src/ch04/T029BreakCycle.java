/**   
* @Title: T029BreakCycle.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月10日 下午10:07:23 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: 终止循环体
 * @author: Vincent
 * @date: 2018年4月10日下午10:07:23
 */
public class T029BreakCycle {
	public static void main(String[] args) {
		System.out.println("\n---------中断单层循环的例子--------");
		String[] array = new String[] {"白鹭", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "斑鸠", "老鹰","百灵鸟"};
		System.out.println("在你发现第一只老鹰之前，告诉我都有什么鸟。");
		for(String string:array) {
			if(string.equals("老鹰"))
				break;
			System.out.print("有：" + string + "\t");
		}
		
		System.out.println("\n\n--------中断双层循环的例子--------");
		int[][] myScores = new int[][]{{67,78,63,22,66}, {55,68,78,95,44}, {95,97,92,93,81}};
		System.out.println("宝宝这次考试成绩：\n数学\t语文\t英语\t美术\t历史");
		No1:for(int[] is:myScores) {
			for(int i:is) {
				System.out.print(i + "\t");
				if(i<60) {
					System.out.println("\n等， " + i + "分的是什么？这个为什么不及格？");
					break No1;
				}
			}
			System.out.println();
		}
	}
}
