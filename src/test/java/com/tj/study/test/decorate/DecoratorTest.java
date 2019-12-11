package com.tj.study.test.decorate;

import org.junit.Test;

import com.tj.study.decorate.Component;
import com.tj.study.decorate.ConcreteComponent;
import com.tj.study.decorate.ConcreteDecorator;

public class DecoratorTest {

	@Test
	public void testDecorate() {
		Component p=new ConcreteComponent();
		p.operation();
		System.out.println("---------------------------------");
		Component d=new ConcreteDecorator(p);
		d.operation();
	}

}
