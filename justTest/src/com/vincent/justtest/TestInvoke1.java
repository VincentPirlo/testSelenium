/**   
* @Title: TestInvoke1.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2017��11��29�� ����11:05:24 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.lang.reflect.InvocationTargetException;  
import java.lang.reflect.Method; 

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��11��29������11:05:24
 */
public class TestInvoke1 {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Class<InvokeObj> clazz = InvokeObj.class;
		Method[] methods = clazz.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
		System.out.println("InvokeObj����޲�show()������ ");
		Method method1 = clazz.getMethod("show", null);
		Object obj = method1.invoke(new InvokeObj(),null);
		System.out.println("����޲�show()�����ķ���ֵ��"+obj);  
		
		 System.out.println("InvokeObj���StringShow()������ ");  
	        Method method4 = clazz.getMethod("StringShow", String.class);  
	        String string = (String) method4.invoke(new InvokeObj(), "Thinking in java");  
	        System.out.println("StringShow()�����ķ���ֵ�� " + string); 
	}
}
