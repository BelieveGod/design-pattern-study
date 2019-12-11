package com.tj.study.bridge;

public class Wallet extends Bag {

	@Override
	public void getBagType() {
		color.getColor();
		System.out.println("钱包");

	}

}
