package com.tj.study.adapter;

public class ElectricAdapter implements Motor {

	private ElectricMotor electricMotor=new ElectricMotor();
	
	@Override
	public void drive() {
		electricMotor.electricdirve();

	}

	public ElectricMotor getElectricMotor() {
		return electricMotor;
	}

	public void setElectricMotor(ElectricMotor electricMotor) {
		this.electricMotor = electricMotor;
	}

}
