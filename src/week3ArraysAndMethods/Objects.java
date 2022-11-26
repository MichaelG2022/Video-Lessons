package week3ArraysAndMethods;

import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {

		int age = 34;
		
	// JAVA DOCS is a useful reference for looking up properties and methods of objects. Look up Java Docs with search engines
		
		
		// Primitive data types don't have properties or methods.
		// Object name starts with a capital letter. String, Scanner, etc.
		// Arrays are objects. Strings are objects. Objects have properties and methods.

		// Properties and methods are accessed by Dot Notation.
		// Methods have parentheses after the method name; Properties do not.
		
		String name = "Sally Mae";
		System.out.println(name.length());
		System.out.println(name.charAt(6));			// Counting starts at 0, not 1
		
		// "new" keyword creates a new instance of an object. Called constructor.
			// The only exception is String, but you can construct a String like any other object. Don't do that though.
		String phoneNumber = new String("1234567891");		// do not ever do this, it is not memory efficient.		
		Scanner s = new Scanner(System.in);		
		int[] numbers = new int[3];
		System.out.println(numbers.length);		// Length is a property of an array so it doesn't need parentheses.
		
		
		
		
		
	} // end MAIN

} // end CLASS Objects