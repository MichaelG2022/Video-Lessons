package week4Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		// Example of Array for comparison to lists - in Array, you must use the index to keep track of where you are in the Array.
			// Array size has to be set at the beginning.
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		// cars[whatever index is next] = "This doesn't work!";
		
		// Lists are like Arrays, but they overcomes a lot of the limitations of Arrays.
			// Lists are an Interface. More about this later during OOP. ********* Cannot an create/instantiate an object from a List *****
				// Instead we have to create an object from a Class that implements List, a sub-category of List.
			// We will use ArrayList.	***************
			// List makes use of a Java construct called Generics. List can be any generic type.
			// Lists use the diamond operator <>
		// Import List from Java Util. Import ArrayList from Java Util.
		
		// List signature
			// List<E> - List of E where E is the generic that will be replaced with the type
		// List<>[String] - List of type String - called List of String.
		// List<String> sports = new List<String>();			// This does not work because we cannot instantiate a List.
		
		// List methods, partial list - .add(data type), , .size(), .remove(int index), .remove(Object o), .removeAll(Collection<?> c)
			// .isEmpty()
		
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");			// Don't have to specify which index to use, nor have to specify length of the List.
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		
		// Using traditional for loop - notice use of GET instead of square brackets
		for(int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		// Using enhanced for loop
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		// Lists cannot use primitive data types - must use the wrapper class - Integer - Boolean, etc.
			// Java does the autoboxing or autounboxing from primitive to wrapper class. Wraps int to Integer and unwraps to int.
		// List<int> numbers = new ArrayList<int>();			// This does not work
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println(numbers.isEmpty());
	
	} // end MAIN
	
} // end CLASS
