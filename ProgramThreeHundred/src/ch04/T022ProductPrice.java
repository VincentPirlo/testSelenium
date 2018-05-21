/**   
* @Title: T022ProductPrice.java 
* @Package ch04 
* @Description: TODO
* @author Vincent  
* @date 2018年4月10日 下午8:59:52 
* @version V1.0   
*/ 
package ch04;

/**
 * @Function: switch练习
 * @author: Vincent
 * @date: 2018年4月10日下午8:59:52
 */
public class T022ProductPrice {
	public static void main(String[] args) {
		float money = 1170;
		String rebate = "";
		if(money > 200) {
			int grade = (int)money / 200;
			switch(grade) {
			case 1:
				rebate = "0.95";
				break;
			case 2:
				rebate = "0.9";
				break;
			case 3:
				rebate = "0.85";
				break;
			case 4:
				rebate = "0.83";
				break;
			case 5:
				rebate = "0.8";
				break;
			case 6:
				rebate = "0.78";
				break;
			case 7:
				rebate = "0.75";
				break;
			case 8:
				rebate = "0.73";
				break;
			case 9:
				rebate = "0.7";
				break;
			case 10:
				rebate = "0.65";
				break;
			default:
				rebate = "0.6";
			}
		}
		
		System.out.println("你的累计消费金额为：" + money);
		System.out.println("你将享受" + rebate + "折优惠！");
	}
}
