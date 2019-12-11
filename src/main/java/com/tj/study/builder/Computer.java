package com.tj.study.builder;

public class Computer {
	private String cpu;
	private String moniter;
	private String keyboard;
	private String mouse;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMoniter() {
		return moniter;
	}
	public void setMoniter(String moniter) {
		this.moniter = moniter;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", moniter=" + moniter + ", keyboard=" + keyboard + ", mouse=" + mouse + "]";
	}

	
}
