package week6UnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// We manually imported our Math class from week6DebuggingAndUnitTests.
// Make sure classes you are trying to import are not in Default Package; the Package must have a name.
	// You cannot import default packages. It is bad practice to use default packages.
import week6DebuggingAndUnitTests.Math;

// *** TEST DRIVEN DEVELOPMENT ***
// The industry seeks to use Test Driven Development aka TDD. This means write the unit test first, then go back
	// and write the code to pass the tests.
	// This isn't always easy to do because sometimes a programmer doesn't know how to implement the story they
		// are writing code for.
	// Define the functionality/logic you want to exist first then write the code to match it.

class MathTest {
	
	// placed here to be global
	Math math = new Math();
	
	// We changed the name from test to testMultiplyReturnsCorrectValues. 
	// We removed fail("Not yet implemented"); from inside the curly braces.
	// Be descriptive in test method names.
	
	@Test
	void testMultiplyReturnsCorrectValues() {
		int product = math.multiply(2,  5);
		assertEquals(10, product);					// expected answer, result from unit being tested
		
	}
	
//	@Test
//	void testDivideReturnsCorrectValues() {
//		double result = math.divide(5, 2);
//		assertEquals(2.5, result);
//	}
	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
	
	// This is to test edge conditions, not just the happy cases.
	// This only worked when we changed math.divide to int and commented out testDivideReturnsCorrectValues
	// Then we looked up J Unit 5 docs to find the correct test. Still must be int to work.
	@Test
	void testDivideIsPositiveThrowsExceptionWhenDividingBy0() {
		// We changed this line after looking in J Unit 5 docs
//		assertEquals(0,  math.divide(5,  0));
		// New line after looking in J Unit 5 docs
		assertThrows(ArithmeticException.class, () -> math.divide(5,  0));
	}

}
