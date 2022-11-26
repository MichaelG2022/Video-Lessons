package week3ArraysAndMethods;

public class Methods {

	public static void main(String[] args) {

		// METHODS allow for modularization to be able to reuse some lines of code
		String firstName = "Bob";
		String lastName = "Ross";
		// this line builds the full name using one-time use code
		//String fullName = firstName + " " + lastName;
		// This line is the call to the method with arguments. Arguments are the data being sent to the method being called
			// The arguments are like cars being sent to the parking spots (parameters) in the method
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);		// shows how we can reuse the method
	
		System.out.println(fullName);
		System.out.println(fullName2);
		
	} // end MAIN
	
	// METHODS go outside MAIN but inside CLASS
		// Method signature for this example:
			// access modifiers (public static) return type (String) method name (createFullName) parameters/arguments (String x, String y) 
			// Access Modifiers (in this case public and static) - more about this later - for now, just use public static
			// Return type (in this case String) means the method will return a variable of type String - can be any variable including objects
			// Method name (in this case createFullName) - should be verb and make sense
			// Parameters (in the called method), Arguments (sent by the call in Main) can be any variables or objects
				// The arguments and the parameters must be the same type, per variable. i.e. can send String and int
				// Arguments/Parameters can be blank
				// The parameter being sent to the method must match the variable type being sent by the call
					//	The name(s) don't have to match
					// In this example, x captures the firstName variable sent by the call in Main, and y captures the lastName variable
			// The comma is called the delimiter
	public static String createFullName(String x, String y) {
		//String fullName = x + " " + y;
		//return fullName;
		// shortcut method to return
		return x + " " + y;
	} // end METHOD createFullName

} // end CLASS METHODS