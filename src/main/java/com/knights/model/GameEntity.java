package com.knights.model;

import com.knights.model.interfaces.Eat;
import com.knights.model.interfaces.Fight;


public abstract class GameEntity implements Fight, Eat, Comparable<GameEntity>
{
	protected short atttackDamage;
	protected short health;
	protected String name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = "Gandalf";
	}

	public short getAtttackDamage()
	{
		return atttackDamage;
	}

	public void setAtttackDamage(short atttackDamage)
	{
		this.atttackDamage = 20;
	}

	public short getHealth()
	{
		return health;
	}

	public void setHealth(short health)
	{
		this.health = 50;
	}

	
	@Override
	public int compareTo(GameEntity o)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* Implement game objects
	Player player = new Player();
	Monster monster = new Monster();
	Creature creature = new Creature();
	Character character = new Character();
	*/
	
	@Override
	public void consume(int food)
	{
		// TODO Auto-generated method stub
		
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
		return "GameEntity [atttackDamage=" + atttackDamage + ", health="
				+ health + ", name=" + name + "]";
	}
	
	
	
	
}
