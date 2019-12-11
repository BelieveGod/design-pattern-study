package com.tj.study.test.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tj.study.singleton.LazySingleton;

@RunWith(SpringRunner.class)
public class LazySingletonTest {

	@Test
	public void testGetInstance(){
		 LazySingleton instance=LazySingleton.getInstance();
		 LazySingleton instance2=LazySingleton.getInstance();
		 if(instance==instance2){
			 
		 }
		 else{
			 Assert.fail();
		 }
	}
}
