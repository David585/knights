package com.knights.ui;

public final class Player extends GameEntity {
	
	@Override
	public void consume(Food food) {
		System.out.println("Player class impl");
	}
}
