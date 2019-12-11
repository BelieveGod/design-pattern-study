package com.tj.study.proxy;

public class RealSubjectProxy implements Subject {

	private RealSubject realSubject;
	
	
	private void validSecurity(){
		System.out.println("正在检查连接安全.....");
	}
	@Override
	public void connect() {
		validSecurity();
		realSubject.connect();

	}
	public RealSubject getRealSubject() {
		return realSubject;
	}
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	
}
