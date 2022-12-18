package week6DebuggingAndUnitTests;

public class Math {
	
	// Unit tests are an industry standard to ensure that code changes don't break something somewhere else.
		// Unit tests are code we write to run the application code to make sure the output is what we expected.
		// This is an expensive practice because it might take longer to write the unit test than to write the application, but it still
			// a very valuable function. Most places in the industry require you to write unit tests for your code.
	// Usually you create a new package, then create a JUnit Test Case with the name of the class you are going to test.
		// Do add the J Framework.
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	
	public boolean isPositiveNumber(int a) {
		return a > 0;
	}
	
	

} // end CLASS
