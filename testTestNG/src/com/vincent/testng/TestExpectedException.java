/**   
* @Title: TestExpectedException.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年10月25日 下午9:21:37 
* @version V1.0   
*/ 
package com.vincent.testng;
import org.testng.annotations.Test;
/**
 * @author Vincent
 *
 */
public class TestExpectedException {

    @Test
    public void testcase1(){
        throw new ExceptionInInitializerError();
    }

    @Test(expectedExceptions = ExceptionInInitializerError.class)
    public void testcase2(){
        throw new ExceptionInInitializerError();
    }

    @Test(expectedExceptions = ExceptionInInitializerError.class)
    public void testcase3(){
        throw new ExceptionInInitializerError();
    }
}