package com.tj.study.factoryPattern;

public class MouseFactory implements AbstractFactory {

	@Override
	public Product produce() {
		return new Mouse();
	}

}
