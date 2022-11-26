package week4Collections;

public class StringAndStringBuilder {

	public static void main(String[] args) {

	// Strings are immutable. Once the string is created in memory, that String will not change and it remains in memory.
	// StringBuilders are NOT immutable and are designed to be able to be changed without creating new Strings in memory each time.
	// Use StringBuilder when you want to be able to dynamically create a String. Use a String when you have a constant or a value that is not
		// going to change.
		
		String firstName = "Sally";
		String lastName = "Smith";		
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
	// Showing that concat() does not change the variable. The String is immutable. It cannot be changed.
		System.out.println(firstName.concat(lastName));			// Does not change the value in firstName.
		firstName.concat(lastName);								// Does change the value in firstName because of reassignment to the new value
		System.out.println(firstName);
		
	// To actually change the variable, it must be reassigned the new value.
	// String of firstName of "Sally" still exists in memory. It is not changed in memory. A new String is created in memory 
		// with the same name but a different value.
	// Reassigning the value creates a new String in memory.
	// Keeping all those Strings in memory is a memory leak. Takes up a lot of useless memory space.
	// Strings are very useful, but you should only use them when you have a value that is not going to change much.
		// Better to use a StringBuilder.
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		
	// StringBuilder allows you to change a String without creating a bunch of new Strings in memory.
		StringBuilder fullName = new StringBuilder("Sam");		// StringBuilder can constructed using an existing String.
		fullName.append(" Smith");
		System.out.println(fullName.toString());		// toString converts the StringBuilder into a real String after you finish building it.
		
	// StringBuilder other methods:
		// .append(str), .toString(), chatAt(index), deleteCharAt(index), delete(starting index, ending index), indexOf(str),
		// .length(), .replace(starting index, ending index, str), .reverse()
		
		System.out.println(fullName.charAt(5));				// should print "m" in Smith.
	// The following 2 lines were commented out to prevent alteration of the String so we could demonstrate other methods of StringBuilder
//		System.out.println(fullName.deleteCharAt(5));		// should delete the "m" in Smith. Notice the "m" is permanently gone.
//		System.out.println(fullName.delete(1, 3));			// Should delete the "a" in Sam and the space. It did not delete the space. It got
																// rid of the "m" in Sam. The 1 is inclusive, the 3 is exclusive.
		System.out.println(fullName.indexOf("it"));			// returns the index of the first character where the String is found. Returns 6.
		System.out.println(fullName.length());
		System.out.println(fullName.replace(4, 10, "Thompson"));	// Replaces from starting index to ending index with the String you give it.
																		// It does not seem to care if the ending index is out of bounds.
		System.out.println(fullName.reverse());				// Simple reverses the String.
		
		
			
		
		
	} // end MAIN
	
	// Each time we go through the loop, a new String is created in memory. Three times through the loop equals three new Strings in memory.
		// First loop, new string = "Hi"
		// Second loop, new string = "HiHi"
		// Third loop, new string = "HiHiHi"
//	public static String multiplyString (String str, int num) {
//		String result = "";
//		for (int i = 0; i < num; i++) {
//			result += str;
//		} // end FOR
//		return result;
//	} // end multiplyString
	
	// Restructuring the above method to use StringBuilder to save memory space.
	// This is the proper way to do it.
	public static String multiplyString (String str, int num) {		
		StringBuilder result = new StringBuilder();						// StringBuilder can be constructed with an empty StringBuilder
		for (int i = 0; i < num; i++) {
			result.append(str);
		} // end FOR
		return result.toString();
	}

} // end CLASS
