package com.tj.study.builder;

public class Director {
	private AbstractBuilder builder;
	public Director(AbstractBuilder builder){
		this.builder=builder;
	}
	public Computer contruct(){
		if(builder==null){
			return null;
		}
		else{
			builder.buildCpu();
			builder.buildKeyboard();
			builder.buildMoniter();
			builder.buildMouse();
			return builder.getResult();
		}
	}

}
