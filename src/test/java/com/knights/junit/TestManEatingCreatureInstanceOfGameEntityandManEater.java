package com.knights.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.knights.model.Creature;
import com.knights.model.GameEntity;
import com.knights.model.ManEatingCreature;
import com.knights.model.ManEatingMonster;
import com.knights.model.Monster;
import com.knights.model.interfaces.Eat;
import com.knights.model.interfaces.Fight;
import com.knights.model.interfaces.Flatten;
import com.knights.model.interfaces.ManEater;

public class TestManEatingCreatureInstanceOfGameEntityandManEater
{

/*	@Test
	public void testConsumePlayer()
	{
		fail("Not yet implemented"); // TODO
	}*/

	@Test
	public void testMonster()
	{
		
		GameEntity genericType = new Monster();
		// tests for 5 more types...
		assertFalse(genericType instanceof ManEatingMonster);
		
		if(genericType instanceof ManEatingMonster) {
			// do something specific..
		}
		
		
	}
	@Test
	public void testManEatingMonster()
	{
		ManEatingMonster maneatingmonster = new ManEatingMonster();
		ManEatingMonster monster = new ManEatingMonster();
	
		assertTrue(maneatingmonster instanceof GameEntity);
		assertTrue(maneatingmonster instanceof Object);
		
		// tests for 9 more types...
		assertTrue(maneatingmonster instanceof Monster);
		assertTrue(monster instanceof GameEntity);
		assertTrue(monster instanceof Object);
		assertTrue(monster instanceof ManEater);
		assertTrue(monster instanceof ManEatingMonster);
		assertTrue(monster instanceof Flatten);
		assertTrue(monster instanceof Comparable);
		assertTrue(monster instanceof Eat);
		assertTrue(monster instanceof Fight);
		
	}
	
	
	@Test
	public void testCreature()
	{
		ManEatingCreature maneatingcreature = new ManEatingCreature();
		ManEatingCreature maneatingcreature1 = new ManEatingCreature();
		
		assertTrue(maneatingcreature instanceof ManEatingCreature);
		assertTrue(maneatingcreature instanceof GameEntity);

		// tests for 6 more types...
		assertTrue(maneatingcreature1 instanceof ManEater);
		assertTrue(maneatingcreature1 instanceof GameEntity);
		assertTrue(maneatingcreature1 instanceof Object);
		assertTrue(maneatingcreature1 instanceof Creature);
		assertTrue(maneatingcreature1 instanceof Eat);
		assertTrue(maneatingcreature1 instanceof Fight);
		assertTrue(maneatingcreature1 instanceof Comparable);
		
		
	}
}
