package com.tj.study.factoryPattern;

public class KeyboardFactory implements AbstractFactory {

	@Override
	public Product produce() {
		return new Keyboard();
	}

}
