import java.util.Scanner;

/**   
* @Title: T012InputString.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018年4月8日 下午9:34:17 
* @version V1.0   
*/

/**
 * @Function: 从控制台接收输入的字符
 * @author: Vincent
 * @date: 2018年4月8日下午9:34:17
 */
public class T012InputString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的身份证号： ");
		String line = scanner.nextLine();
		//打印对输入文本的描述
		System.out.println("So, 你的身份证号码是：" + line.length() + "位数字的啊！");
	}
}
