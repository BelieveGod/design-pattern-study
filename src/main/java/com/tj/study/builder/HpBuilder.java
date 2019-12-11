package com.tj.study.builder;

public class HpBuilder extends AbstractBuilder {

	
	@Override
	protected void buildCpu() {
		computer.setCpu("i7");

	}

	@Override
	protected void buildMoniter() {
		computer.setMoniter("aoc");
	}

	@Override
	protected void buildKeyboard() {
		computer.setKeyboard("hp");

	}

	@Override
	protected void buildMouse() {
		computer.setMouse("雷蛇");

	}

}
