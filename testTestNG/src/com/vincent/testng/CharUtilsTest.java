/**   
* @Title: CharUtilsTest.java 
* @Package com.vincent.testng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��26�� ����11:29:10 
* @version V1.0   
*/ 
package com.vincent.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Function: ����һ��������������(�ַ���Ԥ��ASCII)��@Test���������Ҳ������ݴ������ṩ�ߴ��ݡ�
 * CharUtil.java & CharUtilsTest.java
 * @author: Vincent
 * @date: 2017��12��26������11:29:10
 */
public class CharUtilsTest {
	@DataProvider
    public Object[][] ValidDataProvider() {
        return new Object[][]{
            { 'A', 65 },{ 'a', 97 },
            { 'B', 66 },{ 'b', 98 },
            { 'C', 67 },{ 'c', 99 },
            { 'D', 68 },{ 'd', 100 },
            { 'Z', 90 },{ 'z', 122 },
            { '1', 49 },{ '9', 57 }
        };
    }

    @Test(dataProvider = "ValidDataProvider")
    public void CharToASCIITest(final char character, final int ascii) {

           int result = CharUtil.CharToASCII(character);
           Assert.assertEquals(result, ascii);

    }

    @Test(dataProvider = "ValidDataProvider")
    public void ASCIIToCharTest(final char character, final int ascii) {

           char result = CharUtil.ASCIIToChar(ascii);
           Assert.assertEquals(result, character);

    }
}
