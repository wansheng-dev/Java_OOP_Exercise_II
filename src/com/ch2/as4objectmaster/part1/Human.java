package com.ch2.as4objectmaster.part1;

public class Human {
	
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public Human() {};
	
	public int getStrength() {
		return this.strength;
	};
	
	public int getHealth() {
		return this.health;
	};
	
	public void setHealth(int newHealth) {
		this.health = newHealth;
	}
	
	
	public void attack(Human porrGuy) {
		int currentHP = porrGuy.getHealth();
		int newHP = currentHP - getStrength();
		porrGuy.setHealth(newHP);
	};
}
