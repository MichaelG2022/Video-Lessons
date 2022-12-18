package week5ObjectOrientedProgramming;

public class Student {										// Classes use PascalCaseLikeThis
															// Variable names use camelClassLikeThis
															// Classes do not usually have Main because they are not an entry point for the program
	// Properties that all Student objects will use
	// Shared properties - must be static - not accessed in the Class, but on the Class 
	static int numberOfStudents;
	
	// Properties, unique to each Student object (Student instance)
		// Student property variables do not get set to a value because that is done when the Student object is created
		// Private properties
		// We came back during the Encapsulation video and set these to private
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	

// CONSTRUCTORS
	// Empty constructor - copying the Java given default constructor given to us upon instantiation of an object
		// We should always create an empty constructor
	public Student() {};
	

	// Creating some overload constructors
	// Any constructor other than the one above replaces the constructor Java gave us when we created the Student object
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;					// "this" keyword refers to the instance of the Class - the assigned variable is the parameter
		this.lastName = lastName;						// input when calling the constructor
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}
	
// METHODS
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	// Private methods - only accessed internal to the Class
		// first one was for length check
		// Validation method
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}

// GETTERS and SETTERS
	// This isn't much different than what we had before, but this allows us to do logic on the inputs, such as validation.
		// For example, if someone used the first method to set the length of a side of a rectangle, the area would not update.
			// When we use Getter and Setter and someone updates the length of a side, we can automatically recalculate the area.
				//right click on Class name in Package Explorer, select Source, select Generate Getters and Setters, click Select All, click Generate
	// Added validation method above for some protection
	
	public void setFirstName(String firstName) {
		if (checkLength(firstName,  1)) {
			this.firstName = firstName;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		if (checkLength(lastName,  1)) {
			this.lastName = lastName;
		}		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (checkLength(phoneNumber, 9)) {
			this.phoneNumber = phoneNumber;
		}		
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13) {
		this.gradeLevel = gradeLevel;
		}
	}

	public int getGradeLevel() {
		return gradeLevel;
	}



	
	
} // end CLASS
