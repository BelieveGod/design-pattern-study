package com.tj.study.strategy;

public class Context {

	private Strategy strategy;
	public void excuteStrategy(){
		if(strategy!=null){
			strategy.strategyMethod();
		}
	}
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}
