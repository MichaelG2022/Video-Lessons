package week2BooleanConditionsLoops;

import java.util.Scanner;

public class UserInputBeta {

	public static void main(String[] args) {
		  
		boolean loggedIn = false;
		int logInCount = 0;
		Scanner sc= new Scanner(System.in);
		// System.in is a standard input stream
		
		while (!loggedIn && logInCount < 3) {
			System.out.print("Enter username: ");   
				String username = sc.nextLine();   
			System.out.print("Enter password: ");  
				String password = sc.nextLine();			
			if (username.equals("samy123") && password.equals("12345")) {
				System.out.println("Welcome back " + username);
				loggedIn = true;
		    } else { 
		    	System.out.println("Inaccurate credentials!");
		    	logInCount++;
		    	if (logInCount >= 3) {
		    		System.out.println("You have exceeded the number of login attempts and are now locked out.");
		    	}
		    }			
		} // end of while	
		
	}   // end of main() 
}  // end of UserInputBeta class