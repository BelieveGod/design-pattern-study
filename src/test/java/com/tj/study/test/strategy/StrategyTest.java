package com.tj.study.test.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.tj.study.strategy.Context;
import com.tj.study.strategy.Strategy;
import com.tj.study.strategy.StrategyA;
import com.tj.study.strategy.StrategyB;

@RunWith(JUnit4.class)
public class StrategyTest {

	@Test
	public void testExcuteStrategy(){
		Strategy strategy=new StrategyA();
		Strategy strategy2=new StrategyB();
		Context context=new Context();
		context.setStrategy(strategy);
		context.excuteStrategy();
		context.setStrategy(strategy2);
		context.excuteStrategy();
	}
}
