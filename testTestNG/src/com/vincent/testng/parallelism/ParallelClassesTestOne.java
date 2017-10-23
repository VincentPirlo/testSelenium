/**   
* @Title: ParallelClassesTestOne.java 
* @Package com.vincent.testng.parallelism 
* @Description: TODO如何并行地执行测试类1
* @author Vincent  
* @date 2017年10月23日 下午10:11:04 
* @version V1.0   
*/ 
package com.vincent.testng.parallelism;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
/**
 * @author Vincent
 *
 */
public class ParallelClassesTestOne
{
    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class. Thread id is: " + id);
    }
 
    @Test
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method One. Thread id is: " + id);
    }
 
    @Test
    public void testMethodTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method Two. Thread id is: " + id);
    }
 
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
    }
}
