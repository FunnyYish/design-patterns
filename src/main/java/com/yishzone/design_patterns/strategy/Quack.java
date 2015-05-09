package com.yishzone.design_patterns.strategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack!");
	}

}
