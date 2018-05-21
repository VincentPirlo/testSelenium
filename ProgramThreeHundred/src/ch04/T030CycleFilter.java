/**   
* @Title: T030CycleFilter.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月10日 下午10:18:27 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: continue 循环过滤器
 * @author: Vincent
 * @date: 2018年4月10日下午10:18:27
 */
public class T030CycleFilter {
	public static void main(String[] args) {
		String[] array = new String[] {"白鹭", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "斑鸠", "老鹰","百灵鸟"};
		System.out.println("在我的花园里有很多鸟类，但是最近来了几只老鹰，请帮忙抓走。");
		int eagleCount = 0;
		for(String string:array) {
			if(string.equals("老鹰" )) {
				System.out.println("发现一只老鹰，已经抓到笼子里。");
				eagleCount++;
				continue;
			}
			System.out.println("搜索鸟类，发现了：" + string);
		}
		System.out.println("一共抓到了：" + eagleCount + "只老鹰。");
	}
}
