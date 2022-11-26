package week3ArraysAndMethods;

public class Equality {

	public static void main(String[] args) {
		
		// Showing differences between objects and primitive data types.
			// Only using the NEW construct for demonstration purposes.
			
			String a = new String("Hello");
			String b = new String("Hello");
			System.out.println(a);
			System.out.println(b);
			System.out.println(a == b);
			
			int x = 5;
			int y = 5;
			System.out.println(x);
			System.out.println(y);
			System.out.println(x == y);
			
		// Explanation of equality operator (==)
			// For primitive data types, it checks to see if the 2 values are pointing to the same literal/value in memory.
			// Primitive data types point to the same literal in memory if the value is the same.
			
			// For objects, creating a new object creates its own instance in memory.
			// That means that even though the values may look the same, the instantiated objects are not the same.
			
			
		// How to compare objects
			// Setting d equal to c means d is pointing to the same object constructed on line 32. Same object in memory.
			String c = new String("Hello");		// Using NEW constructor for demonstration purposes.
			String d = c;
			
			
			System.out.println(c);
			System.out.println(d);
			System.out.println(c == d);
			
			// Comparing 2 different objects = use methods.
			System.out.println(a.equals(b));
			
			
			
		} // end MAIN

	} // end CLASS Equality