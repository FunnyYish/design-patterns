package com.yishzone.design_patterns.strategy;

public class FlyWithWing implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly with wing!");
	}

}
