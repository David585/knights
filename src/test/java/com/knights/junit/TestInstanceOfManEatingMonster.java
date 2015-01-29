package com.knights.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.knights.model.Creature;
import com.knights.model.ManEatingMonster;

public class TestInstanceOfManEatingMonster
{

/*	@Test
	public void testConsumePlayer()
	{
		fail("Not yet implemented"); // TODO
	}*/

	@Test
	public void testObject()
	{
		ManEatingMonster maneatingmonster = new ManEatingMonster();
		assertTrue(maneatingmonster instanceof ManEatingMonster);
	}

}
