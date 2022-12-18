package week5ObjectOrientedProgramming;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		
		// A program might compile correctly, but there still might be problems. Those are called Exceptions.		
		
		int[] numbers = new int[3];
		System.out.println("Hi");				// This line prints because we haven't hit the exception yet
		//System.out.println(numbers[3]);			// This causes an exception because the index is out of bounds for length 3
		
		// This is how to check for the oob error
		if (numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		System.out.println("Bye");
		
		/*
		 * Two types of exceptions: checked and unchecked
		 * 
		 * 	Exception is a Class
		 * 
		 * Checked Exception - something we want to explicitly check for in our code - things that are out of our control
		 * 		- Things that are out of our control, such I/O errors, such as a database shutting down.
		 * 		- We can't stop this type of exception, but we can add code to check for and deal with.
		 * 		- Try - Catch block is how we handle checked exceptions
		 * 
		 * Unchecked Exception - something we have control over and only occurs if we make mistakes in coding
		 * 		- something we do not check for in our code - only thrown because of a programmer's mistakes
		 * 		- index out of bounds - this is our fault - we need to check for and catch it
		 * 		- null pointer error 
		 */
		
		// This example uses an Unchecked Exception, something we will never try to catch in normal coding. This is just an example.
//		try {
//			System.out.println(numbers[3]);
//			System.out.println("In the try");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//		}
		
		// This is a more valid example of Checked Exception
		//FileReader fileReader = new FileReader("something.txt");		// This generates Unhandled exception type FileNotFoundException
																			//  because there is no file and gives us the option to surround with try catch block
		
		// This catches the error but does not stop the program. The line after the try catch proves the program didn't stop.
			// Can have multiple catches but they MUST be ordered from lowest subclass up to most general subclass.
			// If we switched FileNotFoundException e and Exception e, the FileNotFound code would never be reached (unreachable code) because Exception would handle it.
		try {
			FileReader fileReader = new FileReader("something.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();					// this is what Java gave us for adding the try catch for us
			System.out.println(e.toString());		// this is what the instructor changed the catch part to.
		} catch (Exception e) {						// can have multiple catches - Exception is the top level for Exceptions
			
		} finally {									// the finally block will ALWAYS run
			System.out.println("Finally!");	 		// this is where you could rollback a database if there was a problem
		}
		System.out.println("After the try catch");
		
		
		// This will throw FileNotFoundException same as in the method called, but this will finally handle it with try catch block.
		try {
			openFile("AnotherFile.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		

	} // end MAIN
	
	// Sometimes you want to handle the exception later, not that instant.
	// Add throws declaration to handle the exception later. Eventually a try catch will have to handle the exception.
		// This is called bubbling up the exception.
			public static FileReader openFile(String fileName) throws FileNotFoundException {
				return new FileReader(fileName);								// Gives Unhandled exception type FileNotFoundException
																				// Can add try catch or Throws declaration
			}

} // end CLASS
