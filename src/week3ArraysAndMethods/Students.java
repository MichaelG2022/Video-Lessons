package week3ArraysAndMethods;

public class Students {

	public static void main(String[] args) {

		// Showing how hard it is to use 1 variable per student name
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
// ARRAYS
		// Arrays can hold multiple values - they have a type, in this case a String. Does not have to be String.
			// The [] , called the index, denotes that it is an array. The number inside denotes how many elements inside the Array.
				// Arrays are zero-based, meaning the first element is position 0.
			// Arrays are Objects. Arrays are not dynamic, they are not going to grow or shrink.
		String[] students = new String[3];		// new declares and creates a new array
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		// More efficient to loop through the Array
		for (int i = 0; i <students.length; i++) {
			System.out.println(students[i]);
		} // end FOR
		
// ENHANCED FOR LOOP FOR USING ARRAYS
		// Eliminates the need to create a normal for loop to iterate through the array
		System.out.println("Enhanced for loop follows.");
		for (String student : students) {			// For element : array = for each student in students
			System.out.println(student);
		} // end FOR		
		
	} // end MAIN

} // end Students CLASS