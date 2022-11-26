package week2BooleanConditionsLoops;

import java.util.Scanner;

public class CombiningSkills {

public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int selection = 0;
		int totalCupsAdded = 0;
		
		System.out.print("How many cups of sugar would you like to add? ");

		selection = sc.nextInt();
		
		for (int i = 1;  i <= selection; i++) { 
			System.out.println("Adding sugar . . .");
			totalCupsAdded ++;			
		}
		
		if (selection <1) {
			System.out.println("You have request no sugar or entered an invalid response.");
		} else if (selection == 1) {
			System.out.println("I have now added " + totalCupsAdded + " cup of sugar.");
		} else {
			System.out.println("I have now added " + totalCupsAdded + " cups of sugar.");
		}
		
		System.out.println("Thank you for your time and attention.");
	}
		
}