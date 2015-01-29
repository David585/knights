package com.knights.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.knights.model.Creature;

public class TestInstanceOfCreature
{

	/*@Test
	public void testConsume()
	{
//		fail("Not yet implemented"); // TODO
	}*/

	@Test
	public void testObject()
	{
		Creature creature1 = new Creature();
		assertTrue(creature1 instanceof Creature);

	}

}
