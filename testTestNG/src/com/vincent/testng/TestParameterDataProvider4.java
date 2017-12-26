/**   
* @Title: TestParameterDataProvider4.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017年12月26日 下午11:14:57 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Function:  参数化测试之四@DataProvider + ITestContext
 * 使用org.testng.ITestContext来确定调用当前测试方法的运行时参数。 在最后一个例子中，我们将演示如何根据包含的分组名称传递参数。
 * @author: Vincent
 * @date: 2017年12月26日下午11:14:57
 */
public class TestParameterDataProvider4 {
	@Test(dataProvider = "dataProvider", groups = {"groupA"})
    public void test1(int number) {
        Assert.assertEquals(number, 1);
    }

    @Test(dataProvider = "dataProvider", groups = "groupB")
    public void test2(int number) {
        Assert.assertEquals(number, 2);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData(ITestContext context) {

        Object[][] result = null;

        //get test name
        //System.out.println(context.getName());

        for (String group : context.getIncludedGroups()) {

            System.out.println("group : " + group);

            if ("groupA".equals(group)) {
                result = new Object[][] { { 1 } };
                break;
            }

        }

        if (result == null) {
            result = new Object[][] { { 2 } };
        }
        return result;

    }
}
