/**   
* @Title: TestJava.java 
* @Package com.vincent.justtest 
* @Description: TODO
* @author Vincent  
* @date 2018年8月27日 下午9:02:58 
* @version V1.0   
*/ 
package com.vincent.justtest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018年8月27日下午9:02:58
 */
public class TestJava {
    
	public static void main(String[] args) {
		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
		
		System.out.println(f1 == f2);
		System.out.println(f3 == f4);
		
		int[] a = {1,2,3,4,5};
		System.out.println(a.length);
		String str = "cast a cold eye.";
		System.out.println(str.length());
		
		String str2 = "helloworld";
		for (int x = 0; x < str2.length(); x++) {
			System.out.println(str2.charAt(x));
		}
		
		test();
	}
	
	
    public static void test(){
        String s = "yekmaakkccekymbvb";
        Map<Character,Integer> result = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(result.get(ch) != null){
                result.put(ch,result.get(ch)+1);
            }else{
                result.put(ch,1);
            }
        }
        for(Map.Entry entry: result.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
 
    }
}