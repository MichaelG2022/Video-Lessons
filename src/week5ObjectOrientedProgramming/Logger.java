package week5ObjectOrientedProgramming;

public interface Logger {
	// Logger is like sysout print line, but the implementing classes will do the logging for us.

/*
 * Abstract Class - has abstract methods - methods only have signature, not body - but there can be non-abstract complete methods in the abstract class.
 * 		- The abstract methods are there because you know you need something done, but you're not sure how you're going to implement them.
 * 			You leave the implementation to the inheriting class.
 * 		- We want to use an abstract class when we know what we want some functionality to be, but want to leave some of the
 * 			implementation up to the subclass/
 * 		- Abstract classes and methods cannot be instantiated - they can only be implemented as an override in another class. Again, not all methods
 * 			in an abstract class have to be abstract.
 * 		- If a class has an abstract method, the class MUST be abstract also
 * 
 * Limitations of Inheritance - you can only inherit from one class - Houseboat class cannot inherit from House class and Boat class.
 * 
 * Interfaces solves the multiple inheritance problem - Classes can inherit multiple interfaces
 * 		- Interfaces cannot be instantiated, just like abstract
 * 		- Interfaces only define method signatures - they do not define full methods - no body
 * 		- Use an interface when you know what the class implementing the interface will do, but you leave the implementation 100% up to that class.
 * 		- You know what you want to happen, but you don't know how you want it to happen.
 * 
 * INTERFACE IS A CONTRACT - the implementing class MUST to create a concrete implementation of each of the methods defined in the interface.
 * 		- Interfaces only have abstract methods.
 * 
 * COMMON RULE IN THE INDUSTRY - Code to an Interface, with the methods that class will need. Then create the implementing classes.
 * 		That way, if you need to change something later, instead of changing your class, which could break things, you can create a new class
 * 			that implements that interface and switch that new class in anywhere without breaking code downstream.
 * 			See note in Application at the bottom.
 * 
// * Some common Interfaces we are already familiar with:	Collection, Map, Set, List
 */
	
	// METHODS - signatures only, no body
		// There could be instructions on  how to use the methods, but Logger name makes sense in how they should be implemented.
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();
	
	
	
	
} // end INTERFACE
