package com.knights.ui;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Player implements Serializable {

	private static final long serialVersionUID = 6666839705272565405L;
	
	static int test = 1;
  
	
	protected String name;
	protected int health = 100;
	protected int damage = 60;
	
	

	public int getHealth() {
		test = 9;
		return health;
		
	}

	public void setHealth(int health, int damage) {
		this.health = health;
	}

	public int getDamage(int x) {
		
		int xy = Integer.parseInt("1");
		
		int test;
		if(true){
		test = 0;
		System.out.println(test);
		}
		
		//new Player().set
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
