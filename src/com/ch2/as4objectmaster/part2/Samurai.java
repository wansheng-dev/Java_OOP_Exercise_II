package com.ch2.as4objectmaster.part2;

public class Samurai extends Human2 {
	
	static int numberOfObjects = 0;
	
	{ numberOfObjects += 1; }
	
	public Samurai() {
		setHealth(200);
	};
	
	public void deathBlow (Human2 person) {
		person.setHealth(0);
		int currentHealth = getHealth();
		setHealth(currentHealth/2);
	};
	
	public void meditate () {
		int currentHealth = getHealth();
		double heal = currentHealth * 0.5;
		setHealth(currentHealth + (int)heal);
	};
	
	public int howMany () {
		return numberOfObjects;
	};
	
}
