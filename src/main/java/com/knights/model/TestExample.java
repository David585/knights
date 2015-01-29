package com.knights.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.knights.model.interfaces.Eat;
import com.knights.model.interfaces.Fight;
import com.knights.model.interfaces.Flatten;
import com.knights.model.interfaces.ManEater;

public class TestExample {

	@Test
	public void test() {
		Creature dog = new Creature();
		
		assertTrue(dog instanceof GameEntity);
		
		
		
	}
	@Test
	public void test2(){
		ManEatingMonster bob = new ManEatingMonster();
		
		assertTrue(bob instanceof GameEntity);
	}
	
	@Test
	public void test3(){
		ManEatingCreature karl = new ManEatingCreature();
		
		assertTrue(karl instanceof GameEntity);
		assertTrue(karl instanceof ManEater);
		
	}
	
	@Test
	public void test4(){
		Monster fred = new Monster();
		if(fred instanceof ManEatingMonster){
			System.out.println("Hello");
		}
		assertFalse(fred instanceof ManEatingMonster);
		
		
	}
	
	@Test
	public void test5(){
		ManEatingMonster jeff = new ManEatingMonster();
		assertTrue(jeff instanceof Monster);
		assertTrue(jeff instanceof GameEntity);
		assertTrue(jeff instanceof ManEatingMonster);
		assertTrue(jeff instanceof Object);
		assertTrue(jeff instanceof Flatten);
		assertTrue(jeff instanceof Comparable);
		assertTrue(jeff instanceof Fight);
		assertTrue(jeff instanceof Eat);
		assertTrue(jeff instanceof ManEater);
		
		
		
		
	}

}
