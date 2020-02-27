package com.ch2.as4objectmaster.part2;

public class Ninja extends Human2 {

	public Ninja() {
		setStealth(10);
	};
	
	public void steal (Human2 person) {
		int currentStealth = getStealth();
		int currentHealth = person.getHealth();
		int newHealth = currentHealth - currentStealth;
		person.setHealth(newHealth);
		
		setHealth(getHealth() + currentStealth);
	};
	
	public void runAway () {
		int currentStealth = getStealth();
		int currentHealth = getHealth();
		setHealth(currentHealth - currentStealth);
	};
	
}
