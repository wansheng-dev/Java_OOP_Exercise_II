package com.ch2.as4objectmaster.part2;

import com.ch2.as4objectmaster.part1.Human;

public class Human2 {
	
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public Human2() {};
	
	public int getStrength() {
		return this.strength;
	};
	
	public int getStealth() {
		return this.stealth;
	};
	
	public int getIntelligence() {
		return this.intelligence;
	};
	
	public int getHealth() {
		return this.health;
	};
	
	public void setStrength(int newStrength) {
		this.strength = newStrength;
	};
	
	public void setStealth(int newStealth) {
		this.stealth = newStealth;
	};
	
	public void setIntelligence(int newIntelligence) {
		this.intelligence = newIntelligence;
	};
	
	public void setHealth(int newHealth) {
		this.health = newHealth;
	};

}
