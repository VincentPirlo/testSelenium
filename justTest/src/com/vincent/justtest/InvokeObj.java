/**   
* @Title: InvokeObj.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2017年11月29日 下午9:56:37 
* @version V1.0   
*/ 
package com.vincent.justtest;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2017年11月29日下午9:56:37
 */
public class InvokeObj {  
	  
    public void show() {  
        System.out.println("无参show()方法。");  
    }  
    public void show (String name) {  
        System.out.println("show方法：" + name);  
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