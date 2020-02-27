package com.ch2.as4objectmaster.part1;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a = new Human();
		Human b = new Human();
		
		a.attack(b);
		
		System.out.println(b.getHealth());
	}
}
