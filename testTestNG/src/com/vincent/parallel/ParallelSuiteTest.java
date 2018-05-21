/**   
* @Title: ParallelSuiteTest.java 
* @Package com.vincent.parallel 
* @Description: TODO
* @author Vincent  
* @date 2018��1��16�� ����11:04:11 
* @version V1.0   
*/ 
package com.vincent.parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Function: TODO
 * @author: Vincent
 * @date: 2018��1��16������11:04:11
 */
public class ParallelSuiteTest
{
    String testName = "";

    @BeforeTest
    @Parameters({ "test-name" })
    public void beforeTest(String testName) {
        this.testName = testName;
        long id = Thread.currentThread().getId();
        System.out.println("Before test " + testName + ". Thread id is: " + id);
    }
 
    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class " + testName + ". Thread id is: "
                + id);
    }
 
    @Test
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method " + testName
                + ". Thread id is: " + id);
    }
 
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method  " + testName
                + ". Thread id is: " + id);
    }
 
    @AfterTest
    public void afterTest() {
        long id = Thread.currentThread().getId();
        System.out.println("After test  " + testName + ". Thread is: " + id);
    }
}
