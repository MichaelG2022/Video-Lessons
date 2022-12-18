package week5ObjectOrientedProgramming;

public class Encapsulation {

	public static void main(String[] args) {
		
		// ENCAPSULATION is preventing changes to a Class or object that we don't want changed.
		
		// The code below works but is considered very poor coding. Instead, we will use Access Modifiers.
		
		// Once we set the properties of Student to private, this code became useless because firstName became no longer visible outside
				// the Student class - see private access modifier below
				// Error given in console was "The field Student.firstName is not visible"
		// To fix this, we must use Getters and Setters, also called accessors and mutators
		Student student = new Student();		
//		student.firstName = "Sally";					// firstName is underlined in red because it is not visible
//		System.out.println(student.firstName);			// firstName is underlined in red because it is not visible
		
		
// To fix after making properties private and getters and setters
		// after we added validation for length, this prints out Sally null, grade 0, and null phone number because
			// we only set 3 digits for the phone number. Once we set phone number to 10 digits, the phone number printed properly
		student.setFirstName("Sally");
		student.setPhoneNumber("1234561230");
		student.introduce();
		
		Rectangle rec = new Rectangle (10.0, 15.0);
		System.out.println(rec.getArea());
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		
		/*
		 * Access Modifiers - 3 main types - public and private are the most common
		 * 		- public 		- accessible everywhere
		 * 		- private		- only accessible within the class itself
		 * 		- protected		- accessible within the class, other classes in the same package, and all subclasses
		 * 		- No Modifier	- same as Protected except not accessible in a subclass in different packages
		 */
		

	} // end MAIN

} // end CLASS
