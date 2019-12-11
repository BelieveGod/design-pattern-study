package com.tj.study.test.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.tj.study.proxy.RealSubject;
import com.tj.study.proxy.RealSubjectProxy;

@RunWith(JUnit4.class)
public class ProxyTest {

	@Test
	public void testConnect(){
		RealSubject subect=new RealSubject();
		RealSubjectProxy proxy=new RealSubjectProxy();
		proxy.setRealSubject(subect);
		proxy.connect();
	}
}
