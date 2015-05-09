package com.yishzone.design_patterns.strategy;

public class ModelDuck extends Duck {

	@Override
	void display() {
		System.out.println("a model duck");
	}

	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}
	
}
