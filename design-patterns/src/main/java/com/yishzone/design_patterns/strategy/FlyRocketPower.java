package com.yishzone.design_patterns.strategy;

public class FlyRocketPower implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly with rocket power");
	}

}
