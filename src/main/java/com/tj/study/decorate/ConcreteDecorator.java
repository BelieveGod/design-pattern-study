package com.tj.study.decorate;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		this.addFunction();
	}
	
	private void addFunction(){
		System.out.println("额外的功能");
	}
	

}
