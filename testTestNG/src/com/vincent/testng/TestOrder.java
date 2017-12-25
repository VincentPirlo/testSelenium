/**   
* @Title: TestOrder.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月25日 下午9:16:58 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: 如何一起运行多个TestNG测试用例(类)，也称为套件测试。
 * TestConfig.java、TestDataBase.java、TestOrder.java、suitetest1-testng.xml、suitetest2-testn.xml
 * @author: Vincent
 * @date: 2017年12月25日下午9:16:58
 */
public class TestOrder {
	@Test(groups={"orderBo", "save"})
    public void testMakeOrder() {
      System.out.println("testMakeOrder");
    }

    @Test(groups={"orderBo", "save"})
    public void testMakeEmptyOrder() {
      System.out.println("testMakeEmptyOrder");
    }

    @Test(groups="orderBo")
    public void testUpdateOrder() {
        System.out.println("testUpdateOrder");
    }

    @Test(groups="orderBo")
    public void testFindOrder() {
        System.out.println("testFindOrder");
    }
}
