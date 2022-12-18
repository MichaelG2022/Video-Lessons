package week5ObjectOrientedProgramming;

public class Classes {

	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder();			// StringBuilder is a Class. new StringBuilder() creates an instance of the
																// StringBuilder class aka an Object. Creating the object from the class is
																// instantiation. The parentheses call the constructor of the class,
																// which is a special block of code that creates the object from the class and
																// initializes it. The constructor may or may not take arguments within the parentheses.
		
		StringBuilder name2 = new StringBuilder();			// Classes use PascalCase

				
		// Creating instances of our Student class
		// Instantiating Student Objects
		// This instantiation uses the Java given default constructor until we make our own default constructor.
			// After we make our own constructor, the Java given default constructor no longer works.
		Student student1 = new Student();
		
		// Typing student1. shows the properties we created for Student and also properties inherited from the Object Class. All classes
			// implicitly inherit from the Object Class. Called Dot Notation.
				
		// Once we set the properties of Student to private, this code became useless because firstName became no longer visible outside
			// the Student class - see private access modifier below
			// Error given in console was "The field Student.firstName is not visible"
		// To fix this, we must use Getters and Setters, also called accessors and mutators
//		student1.firstName = "Tom";								// firstName is underlined in red because it is not visible
//		student1.lastName = "Smith";							// lastName is underlined in red because it is not visible
//		student1.gradeLevel = 12;								// gradeLevel is underlined in red because it is not visible
//		student1.gradeLevel = "480-123-4567";					// gradeLevel is underlined in red because it is not visible
		
		student1.introduce();
		
		// Creating object for student2 using the 2 parameter constructor we set up in the Student class
			// int gradeLevel will be 0 and String phoneNumber will be null because we didn't pass in anything for them. 
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Maynard", "Ferguson", "402-555-6666", 11);
		student3.introduce();
		

	} // end MAIN

} // end CLASS
