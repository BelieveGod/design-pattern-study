package com.tj.study.test.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.tj.study.builder.AbstractBuilder;
import com.tj.study.builder.Computer;
import com.tj.study.builder.DellBuilder;
import com.tj.study.builder.Director;
import com.tj.study.builder.HpBuilder;

@RunWith(JUnit4.class)
public class BuilderTest {

	@Test
	public void testBuild(){
		AbstractBuilder builder=new DellBuilder();
		Director director=new Director(builder);
		Computer computer = director.contruct();
		System.out.println(computer.toString());
	}
}
