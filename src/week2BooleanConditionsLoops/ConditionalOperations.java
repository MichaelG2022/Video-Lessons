package week2BooleanConditionsLoops;

public class ConditionalOperations {

	public static void main(String[] args) {
		

		/*IF STATEMENTS 	Can be nested inside another IF
				if (condition is true) {
					run this code
				}
				otherwise do nothing	*/
				
		/*IF - ELSE STATEMENTS		
				if (condition is true) {
					run this code
				} else { run this code
				} 						*/
					
				String name = "Harry";
				
				if (name == "Harry") {
					System.out.println("Hello Harry!");		// this logic is performed if condition is true
				}

				if (name == "Tom") {
					System.out.println("Hello Tom");
				} else { System.out.println("You're not Tom, " + name);		// this logic is performed if condition is false	
				}
				
				System.out.println();			// blank line
				
				int age = 15;
				
				if (age >= 16) {
					System.out.println("You can get your license!");
				} else {
					System.out.println("Please wait until you are 16 years old.");
				}
				
				System.out.println();			// blank line
				
				int age2 = 16;
				
				if (age2 >= 16) {
					System.out.println("You can get your license!");
				} else {
					System.out.println("Please wait until you are 16 years old.");
				}
				
				System.out.println();			// blank line
				
				int age3 = 13;
				
				if (age3 >= 16) {
					System.out.println("You can get your license!");
				} else {
					System.out.println("Please wait " + (16 - age3) + " year(s) to apply for your license.");
				}
				
				System.out.println();			// blank line
				
		/*IF - ELSE-IF STATEMENTS	
		 		Can add many else-if statements with a single else test as the last one 
				if (condition is true) {
					run this code then break out of the if statements
					can run more than 1 line of code
				} else if (condition is true) {
					run this code then break out of the if statements
				} else {
		 			run this code
		 		}				*/		
				
				double costOfMilk = 4;
				System.out.println(costOfMilk);
				
				if (costOfMilk <= 2) {							// must check for lowest value first or lowest value might not be checked
					System.out.println("Buying 2");
				} else if (costOfMilk <= 3 ) {
					System.out.println("Buying 1");
				} else {
					System.out.println("Not buying any milk");
				}
				
				System.out.println();			// blank line
				
				double costOfMilk2 = 2;
				System.out.println(costOfMilk2);
				
				if (costOfMilk2 <= 2) {
					System.out.println("Buying 2");
				} else if (costOfMilk2 <= 3 ) {
					System.out.println("Buying 1");
				} else {
					System.out.println("Not buying any milk");
				}
				
				System.out.println();			// blank line
				
				double costOfMilk3 = 3;
				System.out.println(costOfMilk3);
				
				if (costOfMilk3 <= 2) {
					System.out.println("Buying 2");
				} else if (costOfMilk3 <= 3 ) {
					System.out.println("Buying 1");
				} else {
					System.out.println("Not buying any milk");
				}
				
		/*SWITCH STATEMENTS					More efficient for primitive data types
		  		switch (switchExpression) {
		  			case 1:
		  				statement;				ex. productDescription = "Hammer"; or print something
		  				break;					break means get out of the switch
		  			case 2:
		  				statement;
		  				break;
		  			case 3:
		  				statement;
		  				break;
		  			default:
		  				statement;
		  				break;
		  		}
		 
		 	Can omit the break; to have code execution all through to the next label.
		 	Case labels can be coded in any sequence
		 
		 */
				
				System.out.println();			// blank line

				char grade = 'A';
				
				switch (grade) {
					case 'A':
						System.out.println("90%");
						break;
					case 'B':
						System.out.println("80%");
						break;
					case 'C':
						System.out.println("70%");
						break;
					default:
						System.out.println("0%");
				}
				
				char grade2 = 'B';
				
				switch (grade2) {
					case 'A':
						System.out.println("90%");
						break;
					case 'B':
						System.out.println("80%");
						break;
					case 'C':
						System.out.println("70%");
						break;
					default:
						System.out.println("0%");
				}
				
				char grade3 = 'C';
				
				switch (grade3) {
					case 'A':
						System.out.println("90%");
						break;
					case 'B':
						System.out.println("80%");
						break;
					case 'C':
						System.out.println("70%");
						break;
					default:
						System.out.println("0%");
				}

				char grade4 = 'D';
				
				switch (grade4) {
					case 'A':
						System.out.println("90%");
						break;
					case 'B':
						System.out.println("80%");
						break;
					case 'C':
						System.out.println("70%");
						break;
					default:
						System.out.println("0%");
				}
				
				System.out.println();			// blank line
				
		/*  MULTIPLE CONDITIONS - NESTED IF STATEMENTS	*/
				
				if (5 == 5) {
					if (4 == 4) {
						System.out.println("Yes, 5 is 5 and 4 is 4, nested");
					}
				}
				
				// if you see nested if statements, it might be a sign that you need to "flatten" the if statements
				// you should always flatten if statements if possible
				
				if (5 == 5 && 4==4) {
					System.out.println("Yes, 5 is 5 and 4 is 4, flattened");
				}
				
				// if there is a diverging path inside the nest if, then you can't flatten the if statements
				
				if (5 == 5) {
					if (4 == 3) {
						System.out.println("5 is 5 and 4 is 4");
					} else {
						System.out.println("5 is 5 but the 4 expression is not true");
					}
				}
				
				
			}

		}