package com.tj.study.builder;

public class DellBuilder extends AbstractBuilder {

	@Override
	protected void buildCpu() {
		computer.setCpu("i5");

	}

	@Override
	protected void buildMoniter() {
		computer.setMoniter("三星");

	}

	@Override
	protected void buildKeyboard() {
		computer.setKeyboard("樱桃");

	}

	@Override
	protected void buildMouse() {
		computer.setMouse("罗技");

	}

	

}
