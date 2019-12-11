package com.tj.study.test.facade;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tj.study.facade.Computer;



public class ComputerTest {

	@Test
	public void test() {
		Computer computer=new Computer();
		computer.startUp();
		computer.shutDodn();
	}

}
