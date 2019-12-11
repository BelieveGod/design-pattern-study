package com.tj.study.adapter;

public class OpticalAdapter implements Motor {

	private OpticalMotor opticalMotor=new OpticalMotor();
	@Override
	public void drive() {
		opticalMotor.opticalDrive();

	}

}
