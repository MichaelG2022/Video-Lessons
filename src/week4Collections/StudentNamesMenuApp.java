package week4Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentNamesMenuApp {
	
	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();

	public static void main(String[] args) {

		
		int choice = 0;
		
		while(choice != 4) {
			
			showMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Please select a valid option!");
			}
			
		} // end WHILE	
		
		
		
	} // end MAIN
	
	public static void showMenu() {
		System.out.println("-----------------------------");
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit");
		System.out.println("-----------------------------");
	} // end showMenu
	
	public static int getUserChoice() {
		return scanner.nextInt();
	} // end getUserChoice
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		} // end FOR
		System.out.println();		// print an extra line for formatting
	} // end printStudentNames
	
	public static void addNewStudent() {
		System.out.print("Enter the student you would like to add: ");
		String name = scanner.next();
		students.add(name);
		System.out.println();		// print an extra line for formatting
		System.out.println("Student added: " + name);
		System.out.println();		// print an extra line for formatting
	} // end addNewStudent
	
	public static void deleteStudent() {
		System.out.print("Enter the index of the student you would like to delete: ");
		int index = getUserChoice();
		if (index < students.size()) {
			System.out.println();		// print an extra line for formatting
			System.out.println("You have removed: " + students.get(index));
			System.out.println();		// print an extra line for formatting
			students.remove(index);			
		} else {
			System.out.println();		// print an extra line for formatting
			System.out.println("Invalid index");
			System.out.println();		// print an extra line for formatting			
		}
		
	} // end deleteStudent
	
	
	
	
	

} // end CLASS
