package com.bt2.managers;

import java.awt.Graphics2D;

public class HealthManager {

	public HealthManager() {
		
	}

	public void init() {
		
	}
	
	public void tick(double deltaTime) {
		
	}
	
	public void render(Graphics2D g) {
		
	}
	
	public static int health(int hp, int damage) {
		int currHP;
		currHP = hp - damage;
		hp = currHP;
		
		return currHP;
	}
	
}
