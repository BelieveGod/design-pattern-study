package com.tj.study.abstractFactory;

public class WarriorStore implements AbstractStore {

	@Override
	public Weapon getWeapon() {
		return new WarriorWeapon();
	}

	@Override
	public Clothes getClothes() {
		return new WarriorClothes();
	}

}
