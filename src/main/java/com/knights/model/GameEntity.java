package com.knights.model;

import com.knights.model.interfaces.Eat;
import com.knights.model.interfaces.Fight;


public abstract class GameEntity implements Fight, Eat, Comparable<GameEntity>
{
	protected short attackDamage;
	protected short health;
	protected String name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public short getAtttackDamage()
	{
		return attackDamage;
	}

	public void setAttackDamage(short attackDamage)
	{
		this.attackDamage = attackDamage;
	}

	public short getHealth()
	{
		return health;
	}

	public void setHealth(short health)
	{
		this.health = health;
	}

	
	@Override
	public int compareTo(GameEntity o)
	{
		int result = 0;
		
		// return -1 if o.health < this.health
		if (o.health < this.health)
		{
			result = -1;
		}
		// return +1 if o.health > this.health 
		else if (o.health > this.health)
		{
			result = 1;
		}
		
		return result;
		
	}


	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameEntity other = (GameEntity) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "GameEntity [atttackDamage=" + attackDamage + ", health="
				+ health + ", name=" + name + "]";
	}
	
	
	
	
}
