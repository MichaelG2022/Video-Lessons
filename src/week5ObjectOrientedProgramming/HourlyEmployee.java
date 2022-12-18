package week5ObjectOrientedProgramming;

// See notes in SaleriedEmployee
public class HourlyEmployee extends Employee {
	
	// FIELDS - PROPERTIES
	private double hoursWorked;
	
	
	// CONSTRUCTORS
		// We added hoursWorked to the HourlyEmployee constructor and the this. hoursWorked line.
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
	}

	
	// METHODS
	// See notes in SaleriedEmployee
	@Override
	public double calculatePay() {
		return getPay() * hoursWorked;
	}
	
	
	
	
	
	
	
	
	

} // end CLASS
