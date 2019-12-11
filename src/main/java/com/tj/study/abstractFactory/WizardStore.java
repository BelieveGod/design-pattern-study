package com.tj.study.abstractFactory;

public class WizardStore implements AbstractStore {

	@Override
	public Weapon getWeapon() {
		return new WizardWeapon();
	}

	@Override
	public Clothes getClothes() {
		return new WizardClothes();
	}

}
