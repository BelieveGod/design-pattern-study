package com.tj.study.proxy;

public class RealSubject implements Subject {

	@Override
	public void connect() {
		System.out.println("建立htttp连接...");

	}

}
