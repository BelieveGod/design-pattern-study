package com.tj.study.facade;

public class Computer {

	private Cpu cpu;
	private Disk disk;
	private Memory memory;
	
	public void startUp(){
		cpu.on();
		disk.on();
		memory.on();
	}
	
	public void shutDodn(){
		memory.off();
		disk.off();
		cpu.off();
	}

	public Computer() {
		this.cpu=new Cpu();
		this.disk=new Disk();
		this.memory=new Memory();
	}
	
}
