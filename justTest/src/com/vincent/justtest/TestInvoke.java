/**   
* @Title: TestInvoke.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2017��11��29�� ����9:57:07 
* @version V1.0   
*/ 
package com.vincent.justtest;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;  
/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��11��29������9:57:07
 */

 
public class TestInvoke {  
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {  
        Class<InvokeObj> clazz = InvokeObj.class;  
        Method[] methods = clazz.getMethods();  
        System.out.println("�������InvokeObj��ķ�����");
        for (Method method : methods) {  
            System.out.println(method);  
        }  
        System.out.println("InvokeObj����޲�show()������");  
        Method method1 = clazz.getMethod("show", null);  
        //��ִ���޲�show()����  
        Object obj = method1.invoke(new InvokeObj(),null);  
        System.out.println("����޲�show()�����ķ���ֵ��"+obj);  
        System.out.println("InvokeObj���show()������ ");  
        Method method2 = clazz.getMethod("show", String.class);  
        Object obj1 = method2.invoke(new InvokeObj(), "hello,world");  
        System.out.println("����в�show()������ ");  
        System.out.println("InvokeObj���arrayShow()������ ");  
        Method method3 = clazz.getMethod("arrayShow", String[].class);  
        String[] strs = new String[]{"hello", "world", "!"};  
        //�������͵Ĳ������������new Object[]{}�У�����ᱨIllegalArgumentException  
        String[] strings = (String[]) method3.invoke(new InvokeObj(), new Object[]{strs});  
        for (String str : strings) {  
            System.out.println("arrayShow������Ԫ�أ�" + str);  
        }  
        System.out.println("InvokeObj���StringShow()������ ");  
        Method method4 = clazz.getMethod("StringShow", String.class);  
        String string = (String) method4.invoke(new InvokeObj(), "Thinking in java");  
        System.out.println("StringShow()�����ķ���ֵ�� " + string);  
        System.out.println("InvokeObj���intShow()������ ");  
        Method method5 = clazz.getMethod("intShow", int.class);  
        int num = (int) method5.invoke(new InvokeObj(), 89);  
        System.out.println("intShow()�����ķ���ֵ�� " + num);  
    }  
}  