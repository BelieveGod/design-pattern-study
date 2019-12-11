package com.tj.study.decorate;

public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		 System.out.println("调用具体构件角色的方法operation()");

	}

}
