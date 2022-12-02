package week4Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapApp {
	
	static Scanner scanner = new Scanner(System.in);
	static Map<String, String> phoneBook = new HashMap<String, String>();

	public static void main(String[] args) {

		int choice = 0;
		
		while (choice != 4) {
			
			printMenu();
			
			choice = getUserChoice();
			
			if (choice == 1) {
				displayPhoneBook();
			} else if (choice == 2) {
				addContact();
			} else if (choice == 3) {
				deleteContact();
			} else if (choice == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Please pick a valid option!");
			}
		} // end WHILE
		
		
		
	} // end MAIN

	public static void printMenu() {
		System.out.println("-----------------------------");
		System.out.println("1) Display Phone Book");
		System.out.println("2) Add New Contact");
		System.out.println("3) Delete Contact");
		System.out.println("4) Exit");
		System.out.println("-----------------------------");
	} // end printMenu
	
	public static int getUserChoice() {
		return scanner.nextInt();
	} // end getUserChoice
	
	public static void displayPhoneBook() {
		Set<String> phoneNumbers = phoneBook.keySet();
		for (String phoneNumber : phoneNumbers) {
			System.out.println(phoneNumber + ": " + phoneBook.get(phoneNumber));
		} // end FOR
	} // end displayPhoneBook
	
	public static void addContact() {
		System.out.print("Enter Phone Number: ");
		String phoneNumber = scanner.next();
		System.out.print("Enter Name: ");
		String name = scanner.next();
		phoneBook.put(phoneNumber, name);
		System.out.println("Added " + phoneNumber + ": " + name);	
	} // end addContact
	
	public static void deleteContact() {
		System.out.println("Enter Phone Number to Delete: ");
		String phoneNumber = scanner.next();
		if (phoneBook.containsKey(phoneNumber)) {
			System.out.println("Removed " + phoneNumber + ": " + phoneBook.remove(phoneNumber));
		} else {
			System.out.println("That Phone Number does not exist1");
		}
		
	}
	
} // end CLASS
