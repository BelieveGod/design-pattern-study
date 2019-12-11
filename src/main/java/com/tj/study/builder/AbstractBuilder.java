package com.tj.study.builder;

public abstract class AbstractBuilder {

	protected Computer computer=new Computer();
	protected abstract void buildCpu();
	protected abstract void buildMoniter();
	protected abstract void buildKeyboard();
	protected abstract void buildMouse();
	public Computer getResult(){
		return computer;
	};
}
