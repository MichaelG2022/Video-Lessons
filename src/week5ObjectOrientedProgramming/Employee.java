package week5ObjectOrientedProgramming;


// This is the Super Class for SaleriedEmployee, HourlyEmployee, and Manager
// Abstract classes cannot be instantiated - this is an abstraction of Employee, so we are going to have to implement a lot of the methods
	// in the classes that inherit from this class
public abstract class Employee {

	// FIELDS
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	
	// CONSTRUCTORS
	public Employee(String firstName, String lastName, double pay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
	}
	
	// METHODS
	// POLYMORPHISM
	// This method cannot be implemented - it will have to be implemented and overridden by each of the classes inheriting Employee class.
	// This method does not have a body, only semicolon right after the name.
	// This is an example of polymorphism - each class that inherits it can implement it in it's own way.	
	public abstract double calculatePay(); 
	
	public String getInformation() {
		return "Name: " + firstName + " " + lastName
				+ "\nReports to: " + reportsTo
				+ "\nAddress: " + address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	
	
	
	
	
} // end CLASS
