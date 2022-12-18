package week5ObjectOrientedProgramming;

public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {

//Dot Notation shows inherited methods from Employee and Object - All classes inherit implicitly from the top most class of Object.
		// After we did all the stuff with the Super class and the 3 subclasses, we had to redo the implementation to match the constructor for each class
			// All 3 subclasses took firstName, lastName, and pay. HourlyEmployee also needed hoursWorked. Manager also needed bonusPercentage.
		Employee salary = new SalariedEmployee("Tom", "Sawyer", 2500.00);
		Employee hourly = new HourlyEmployee("Tim", "Smith", 15.00, 75.5);
		Employee manager = new Manager("Rob", "Lincoln", 4500.00, 15.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
		
		
		/*
		 * This example used Abstraction by taking out the common elements (names, pay) and moving them to a higher level.
		 * 
		 * This example used Inheritance by having the subclasses inherit from the superclass.
		 * 
		 * This example used Polymorphism by making calculatePay act differently on each of the subclasses.
		 * 
		 * All this makes the code cleaner, easier to manage, and reusable. That is the purpose of Object Oriented Programming.
		 * 
		 * 
		 */

		
		
	} // end MAIN

} // end CLASS
