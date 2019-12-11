package com.tj.study.bridge;

public abstract class Bag {

	protected Color color;
	public abstract void getBagType();
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
