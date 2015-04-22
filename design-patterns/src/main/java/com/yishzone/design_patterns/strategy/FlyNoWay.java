package com.yishzone.design_patterns.strategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can not fly!");
	}

}
