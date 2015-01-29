package com.knights.model;
import java.lang.Comparable;

import com.knights.model.interfaces.Eat;
public abstract class GameEntity implements Eat, Comparable<GameEntity>  {
	
	 protected short health;
	 protected short attack;
	 protected String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack;
		result = prime * result + health;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameEntity other = (GameEntity) obj;
		if (attack != other.attack)
			return false;
		if (health != other.health)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(GameEntity gameEntity) {
		
		// Default to being greater than
		int result = 1;
		
		// If we have less health, then we are less 
		if(this.health < gameEntity.health) {
			result = -1;
		}else if(this.health == gameEntity.health)
		{
			// we are the same
			result = 0;
		}
		return result;
	}
	
	public short getHealth() {
		return health;
	}
	public void setHealth(short health) {
		this.health = health;
	}
	public short getAttack() {
		return attack;
	}
	public void setAttack(short attack) {
		this.attack = attack;
	}
	
	@Override
	public void consume(Food food) {
		System.out.println("Base class impl");
	}

	@Override
	public String toString() {
		return "GameEntity [health=" + health + ", attack=" + attack
				+ ", name=" + name + "]";
	}

	
	
	
	
	
}