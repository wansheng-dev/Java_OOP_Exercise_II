# Java_OOP_Exercise_II
Java/Spring Boot - OOP Exercise II - Object Master - 20200206

Objectives:

● Implement packages to namespace your project.

● Implement inheritance.

Tasks:

● Create a Human class

● Add the strength, stealth, and intelligence attributes with a default of 3

● Add the health attribute with a default of 100

● Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.

● Test these methods work using a HumanTest class

● Create Ninja, Wizard, and Samurai classes that all extend from the Human class.

● Wizard: Set default health to 50

● Wizard: Set default intelligence to 8

● Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence

● Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3

● Ninja: Set default stealth to 10

● Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's

● Ninja: Add a method runAway() that decreases their health by 10

● Samurai: Set a default health of 200

● Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half

● Samurai: Add a method meditate() that heals the Samurai for half of their current health.

● Samurai: Add a method howMany() that returns the total current number of Samurai.
