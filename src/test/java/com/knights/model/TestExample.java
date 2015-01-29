package com.knights.model;


import org.junit.Assert;
import org.junit.Test;

import com.knights.model.interfaces.ManEater;

public class TestExample {

	@Test
	public void test() {

		Creature balrog = new Creature ();
		Assert.assertTrue(balrog instanceof GameEntity);
		

	}
	
	
	@Test
	public void test2() {

		ManEatingCreature azorg = new ManEatingCreature ();
		Assert.assertTrue(azorg instanceof ManEater);
		
		
		
	}
	
	@Test
	public void test3() {

		ManEatingMonster coogle = new ManEatingMonster ();
		Assert.assertTrue("must be of type game entitiy", coogle instanceof GameEntity);
		
		
		
	}
	
	@Test
	public void test4() {

		GameEntity olaf = new Monster();
		if(olaf instanceof ManEatingMonster){
			
			// do something specific for man eaters...
		}
		Assert.assertFalse(olaf instanceof ManEatingMonster);
		
		
		
	}
	

	
	
}
