package com.ch2.as4objectmaster.part2;

public class Wizard extends Human2 {

	public Wizard() {
		setIntelligence(8);
		setHealth(50);
	};
	
	public void heal (Human2 person) {
		int currentHealth = person.getHealth();
		int newHealth = currentHealth + getIntelligence();
		person.setHealth(newHealth);
	};
	
	public void fireball (Human2 person) {
		int currentHealth = person.getHealth();
		int newHealth = currentHealth - getIntelligence()*3;
		person.setHealth(newHealth);
	};
	
}
