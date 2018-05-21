/**   
* @Title: T011ErrorInfo.java 
* @Package  
* @Description: TODO
* @author Vincent  
* @date 2018年4月8日 下午9:16:16 
* @version V1.0   
*/

/**
 * @Function: 输出错误信息与调试信息
 * @author: Vincent
 * @date: 2018年4月8日下午9:16:16
 */
public class T011ErrorInfo {
	public static void main(String[] args) {
		System.out.println("main() is begin to run.");
		//输出错误信息
		System.err.println("在运行期间手动输出一个错误信息： ");
		System.err.println("\t 该软件么有买保险， 请注意安全");
		System.out.println("PrintErrorAndDebug.main()");
		System.out.println("main()方法运行结束。");
	}
}
