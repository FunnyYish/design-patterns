package com.yishzone.design_patterns.strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyRocketPower());
		mallard.performFly();
	}
}
