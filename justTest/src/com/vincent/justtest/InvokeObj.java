/**   
* @Title: InvokeObj.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2017��11��29�� ����9:56:37 
* @version V1.0   
*/ 
package com.vincent.justtest;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017��11��29������9:56:37
 */
public class InvokeObj {  
	  
    public void show() {  
        System.out.println("�޲�show()������");  
    }  
    public void show (String name) {  
        System.out.println("show������" + name);  
    }  
    public String[] arrayShow (String[] arr) {  
        return arr;  
    }  
    public String StringShow (String str) {  
        return str;  
    }  
    public int intShow (int num) {  
        return num;  
    }  
}  