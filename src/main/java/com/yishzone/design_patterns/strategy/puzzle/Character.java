package com.yishzone.design_patterns.strategy.puzzle;

public abstract class Character {
	WeaponBehavior weapon;
	void fight(){
		weapon.useWeapon();
	}
}
