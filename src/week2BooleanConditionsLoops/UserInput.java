package week2BooleanConditionsLoops;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		//How to get user input from the console
				
				Scanner sc = new Scanner (System.in);
				
				//small demonstration of printing without the ln - useful to get user to give us information on the same line as the request
//				System.out.print("Hello");
//				System.out.println("World");
				
//				Simple demonstration of getting user input and using that data
//				System.out.print("Enter your name: " );
//				String name = sc.nextLine();					// captures the name "returned" by the user 
//				
//				System.out.println("Welcome, " + name + "!");
				
				
				//Creating a user driven menu
				
				int selection = 0;
				double total = 0;
				
				while (selection != 4) {
				
					System.out.println("Select an option: ");
					System.out.println("1) Add candybar to shopping cart: 1.99");
					System.out.println("2) Add soda to shopping cart: 2.09");
					System.out.println("3) Add aluminum foil to shopping cart: 7.29");
					System.out.println("4) Check out");
					
					selection = sc.nextInt();			//Scans the next token of the input as an int. 
				
					switch (selection) {
						case 1:
							total += 1.99;
							break;
						case 2:
							total += 2.09;
							break;
						case 3:
							total += 7.29;
							break;
						case 4:
							break;
						default:
							System.out.println("Please pick a valid option.");
					}
				}
				
				System.out.println("Your current total is $" + String.format("%.2f",total));
				System.out.println("(current total is $" + total);
						
			}

		}
