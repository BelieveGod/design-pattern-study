package com.tj.study.test.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.tj.study.adapter.ElectricAdapter;
import com.tj.study.adapter.Motor;

@RunWith(JUnit4.class)
public class AdapterTest {

	@Test
	public void testDrive() {
		Motor motor=new ElectricAdapter();
		motor.drive();
	}

}
