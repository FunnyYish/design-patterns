package com.yishzone.design_patterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		
		setFlyBehavior(new FlyWithWing());
		setQuackBehavior(new Quack());
	}

	@Override
	void display() {
		System.out.println("a mallar duck");
	}
	
}
