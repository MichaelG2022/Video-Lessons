package week5ObjectOrientedProgramming;

//See notes in SalariedEmployee
public class Manager extends Employee {
	
	// FIELDS - PROPERTIES
	private double bonusPercentage;
	
	
	// CONSTRUCTORS
		// We added bonusPercentage to the constructor for Manager and the this.bonusPercentage line
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}

		
	// METHODS
	// See notes in SaleriedEmployee
	@Override
	public double calculatePay() {
		return getPay() * 80 *bonusPercentage;
	}
	
	
	
	
	

} // end CLASS
