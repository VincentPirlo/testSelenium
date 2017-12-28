/**   
* @Title: MessageUtils.java 
* @Package com.vincent.ttestng 
* @Description: TODO
* @author Vincent  
* @date 2017��12��28�� ����9:10:59 
* @version V1.0   
*/ 
package com.vincent.ttestng;

/**
 * @Function: �׼�����
 * MessageUtils.java & TestMessage1.java & TestMessages2.java & messagestest-testng.xml
 * �׼��Ĳ�����Ϊ�˲�������������Ϊ��һϵ����Ϊ������£���һ�����ϡ���TestNG�����ǲ��ܶ���һ�ײ���Դ���룬����������׼���һ��XML�ļ�ִ��������
 * ��Ҳ������������Ҫ���еĲ��ԡ��׼����԰���һ���������Ժͱ�������<suite>��ǩ��testng.xml����<suite>����ǩ����������һ�������׼���
 * �ⷴ���������ɶ��<test>������ɡ�
 * @author: Vincent
 * @date: 2017��12��28������9:10:59
 */
public class MessageUtils {
	
	private String message;
	
	public MessageUtils(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}
}
