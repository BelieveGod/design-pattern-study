package com.tj.study.bridge;

public class HandBag extends Bag {

	@Override
	public void getBagType() {
		color.getColor();
		System.out.println("手提包");

	}

}
