/**   
* @Title: TestInvoke1.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2017年11月29日 下午11:05:24 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.lang.reflect.InvocationTargetException;  
import java.lang.reflect.Method; 

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月29日下午11:05:24
 */
public class TestInvoke1 {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Class<InvokeObj> clazz = InvokeObj.class;
		Method[] methods = clazz.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
		System.out.println("InvokeObj类的无参show()方法： ");
		Method method1 = clazz.getMethod("show", null);
		Object obj = method1.invoke(new InvokeObj(),null);
		System.out.println("输出无参show()方法的返回值："+obj);  
		
		 System.out.println("InvokeObj类的StringShow()方法： ");  
	        Method method4 = clazz.getMethod("StringShow", String.class);  
	        String string = (String) method4.invoke(new InvokeObj(), "Thinking in java");  
	        System.out.println("StringShow()方法的返回值： " + string); 
	}
}
