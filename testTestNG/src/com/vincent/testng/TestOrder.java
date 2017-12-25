/**   
* @Title: TestOrder.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��25�� ����9:16:58 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.annotations.Test;

/**
 * @Function: ���һ�����ж��TestNG��������(��)��Ҳ��Ϊ�׼����ԡ�
 * TestConfig.java��TestDataBase.java��TestOrder.java��suitetest1-testng.xml��suitetest2-testn.xml
 * @author: Vincent
 * @date: 2017��12��25������9:16:58
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
