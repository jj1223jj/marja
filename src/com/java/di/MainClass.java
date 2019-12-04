package com.java.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// su�� main�� ���յ��� ����. -> �������̽��� �̰��� ������
		// Ŭ������ ������ �������� �������� �������� �ڵ带 �����ؾ� �ϴ� ������ �о�����.
		// Ŭ�������� ���յ��� ���ϰ��ϰ�, �������� ���������� �ڵ��� �ؾ��Ѵ�.
		
		Su su = new Su();
		su.disp();
		
		// DI(Dependency Injection): �������� ���� ���� ���� / �ܺ�(xml)�κ��� ���޹޴´�.
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		Su appSu = (Su)ctx.getBean("su");
		appSu.disp();
		
		ctx.close();
	}

}
