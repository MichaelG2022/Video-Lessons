package week3ArraysAndMethods;

import java.util.Scanner;

public class TeamMenuApp {

	// Scanner s has to be set to static
		static Scanner s = new Scanner(System.in);		// Scanner is outside MAIN so it is accessible throughout the CLASS
		static int addingIndex = 0; 					// Keeps track of which array index we are adding - used in addTeamMember
		
		// F3 button in Eclipse IDE will take you to the method being called, or the instantiation of the variable/object
		
		public static void main(String[] args) {

			/*
			 * Add team member
			 * View team member
			 * View all team members
			 * Delete team member by position
			 * Delete all team members
			 */
			
			String[] team = new String[5];
			
			int decision = 0;
			
			// We wrote the  calls to the methods first, called Top Down approach.
				// Call will be underlined in red because the method being called does not exist yet.
			while(decision != -1) {
				showMenu();
				decision = s.nextInt();			// Scanner s has to be set to static
				if (decision < -1 || decision > 5 || decision == 0) {			// I added decision != 0 to prevent that option
					System.out.println();
					System.out.println("*****Please pick a valid option***");
					System.out.println();
				} else if (decision == 1) {
					showTeam(team);
				} else if (decision == 2) {
					showTeamMember(team);
				} else if (decision == 3) {
					addTeamMember(team);
				} else if (decision == 4) {
					deleteTeamMember(team);
				} else {
					deleteAllTeamMembers(team);
				}			
			} //end WHILE
			
			
			
		} // end MAIN
		
		public static void showMenu() {
			System.out.println("Please pick an option or enter -1 to exit");
			System.out.println("1) Show Team");
			System.out.println("2) Show Team Member");
			System.out.println("3) Add Team Member");
			System.out.println("4) Delete Team Member");
			System.out.println("5) Delete All Team Members");	
		} // end showMenu
		
		public static void showTeam(String[] team) {
			for (int i = 0; i < team.length; i++) {
				System.out.println(i + ": " + team[i]);
			} // end FOR
			System.out.println();
		}  // end showTeam
		
		public static void showTeamMember(String[] team) {
			System.out.print("Which team member would you like to see? ");
			int teamNumber = s.nextInt();
			if (isValid(teamNumber)) {
				System.out.println(teamNumber + ": " + team[teamNumber]);
			} // end IF
			System.out.println();
		} //end showTeamMember
		
		public static void addTeamMember(String[] team) {
			System.out.print("Enter new team member name: ");
			String newMember = s.next();
			if (isValid(addingIndex)) {					// addingIndex is assigned at the top to make it universal in the class
				team[addingIndex++] = newMember;		// Increments the index to prevent adding to the same index every time
			} // end IF						
		} // end addTeamMember

		public static void deleteTeamMember(String[] team) {
			System.out.print("Which team member would you like to delete? ");
			int memberToDelete = s.nextInt();
			if (isValid(memberToDelete)) {
				team[memberToDelete] =  null;
			}
		} // end deleteTeamMember
		
		public static void deleteAllTeamMembers(String[] team) {
			// Enhanced for loop does not work for this - use regular for loop
				// It has to do with Strings being immutable - A new member is created for each team which is a different object in memory
			//for (String member : team) {
				//member = null;
			//} // end FOR
			for (int i = 0; i < team.length; i++) {
				team[i] = null;
			} // end FOR
			addingIndex = 0;					// I added this so the team could be rebuilt after deleting all of them
		} // end deleteAllTeamMembers
		
		
		public static boolean isValid(int input) {
			if(input >= 0 && input < 5) {
				return true;
			} else {
				System.out.println();
				System.out.println("***** Invalid entry *****");
				System.out.println();
				return false;
			} // end IF-ELSE
		} // end isValid
		

	} // end CLASS TeamMenuApp