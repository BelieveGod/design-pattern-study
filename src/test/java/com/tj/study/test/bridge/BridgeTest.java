package com.tj.study.test.bridge;

import org.junit.Test;

import com.tj.study.bridge.Bag;
import com.tj.study.bridge.Color;
import com.tj.study.bridge.Wallet;
import com.tj.study.bridge.Yellow;

public class BridgeTest {

	@Test
	public void testBridge() {
		Color color=new Yellow();
		Bag bag=new Wallet();
		bag.setColor(color);
		bag.getBagType();
	}

}
