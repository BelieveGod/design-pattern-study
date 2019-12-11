package com.tj.study.test.abstractFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.tj.study.abstractFactory.AbstractStore;
import com.tj.study.abstractFactory.Clothes;
import com.tj.study.abstractFactory.WarriorStore;
import com.tj.study.abstractFactory.Weapon;
import com.tj.study.abstractFactory.WizardStore;

@RunWith(JUnit4.class)
public class AbstractFactoryTest {
	@Test
	public void testProduce(){
//		AbstractStore store=new WizardStore();
		AbstractStore store=new WarriorStore();
		Clothes clothes=store.getClothes();
		Weapon weapon=store.getWeapon();
		
		clothes.show();
		weapon.show();
		while(true){}
	}

}
