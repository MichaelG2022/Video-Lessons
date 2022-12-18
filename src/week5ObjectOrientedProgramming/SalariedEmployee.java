package week5ObjectOrientedProgramming;

// extends Employee means this Class inherits properties and methods from Employee
	// When we added the extend, SaleriedEmployee was underlined in red because we had to add implementation
		// for the abstract method calculatePay and gave us the option to do so.
// When we added a constructor in Employee with firstName, lastName, and pay, it broke the default constructor for the 3 subclasses of Employee
	// Hovering over it with the mouse gave us the option to add the constructor for this class to match the one we created in Employee.
		// Exact message was Implicit super constructor Employee() is undefined for default constructor. Must define an explicit constructor
		// The keyword super refers to the superclass Employee
public class SalariedEmployee extends Employee {

	// FIELDS - PROPERTIES
	
	
	
	// CONSTRUCTORS
		// This is the constructor suggested by Java after we made the constructor in Employee. Hourly and Manager we changed up a little bit.
	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
	}
	
	
	// METHODS
	// Override can be removed but it tells us that this is coming from a Superclass
	@Override
	public double calculatePay() {
		return getPay() * 80;
	} // end calculatePay


	
	
	

} // end CLASS
