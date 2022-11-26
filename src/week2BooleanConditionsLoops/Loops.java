package week2BooleanConditionsLoops;

public class Loops {

	public static void main(String[] args) {
		
		//FOR loops - also called ITERATIONS			CTRL + / will comment all lines you have highlighted
				
//				for (int i = 0;  i < 10; i++) {						// int i = 1 only happens the first time through the loop, then the i < 10 is checked
//					System.out.println("Scoop cup of flour");		// i++ gets "skipped" until the code in the body of the loop is executed (the iteration)
//				}													// once the iteration is done, then the post iteration is done (i++)
//																	// once i < 10 becomes false, the loop ends and moves to the first line after the closing curly brace
//				for (int i = 0;  i < 10; i++) {
//					System.out.println(i);
//				}
				
//				for (int i = 1;  i <= 10; i++) {
//					System.out.println(i);
//				}
				
//		 		Printing only even numbers by iterating by 2			NOTE: iteration happens 50 times
//				for (int i = 0;  i < 100; i += 2 ) {
//					System.out.println(i);
//				}
				
//		 		Printing only even numbers using logic				NOTE: iteration happens 100 times
				
//				for (int i = 0;  i < 100; i++) {
//					if (i % 2 == 0) {							// checks for remainder of i/2 aka modulus symbol == %
//						System.out.println(i);
//					}			
//				}
				
		//WHILE loops - conditional loops - do something until some condition is met - may not ever run if the condition is met at the start
				//WHILE loop checks the condition at the beginning so it might never execute
				
				// This logic will cause an infinite loop since we are not modifying x - the condition is ALWAYS met
//				int x = 0;
//				while (x < 10) {
//					System.out.println(x);
//				}
				
		// This is a proper WHILE loop
//				int x = 0;
//				while (x <= 10) {
//					System.out.println(x);
//					x++;
//				}
				
				// This is a proper WHILE loop that will never execute because the condition is met at the beginning
//				int x = 10;
//				while (x < 10) {
//					System.out.println(x);
//					x++;
//				}
				
		//DO WHILE loop - Will always run at least once because the condition expression is at the end
				int x = 0;
				do {
					System.out.println(x);
					x++;
				} while (x < 10);
				
		//ENHANCED FOR loop - performs an operation for each item in a collection/list/array
				//Each time you use the word each in explaining the logic, it calls for an ENHANCED FOR loop
				
				
				
				
				
			}

		}
