import java.io.FileNotFoundException;
import java.io.PrintStream;

/**   
* @Title: T013RedirectOutputStream.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018年4月9日 下午10:47:34 
* @version V1.0   
*/

/**
 * @Function: 重定向输出流实现程序日志
 * @author: Vincent
 * @date: 2018年4月9日下午10:47:34
 */
public class T013RedirectOutputStream {
	public static void main(String[] args) {
		try {
			PrintStream out = System.out;					//保存原输出流
			PrintStream ps = new PrintStream("./log.txt");	//创建文件输出流
			System.setOut(ps);
			int age = 18;
			System.out.println("年龄变量成功定义，初始值为18");
			String sex = "女";
			System.out.println("性别变量成功定义，初始值为女");
			//整合两个变量
			String info = "这是个" + sex + "孩子，应该有" + age + "岁了。";
			System.out.println("整合两个半两为info字符串变量，其结果是：" + info);
			System.setOut(out);
			System.out.println("程序运行完毕，请查看日志文件。");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
