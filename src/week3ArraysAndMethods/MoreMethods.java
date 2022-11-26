package week3ArraysAndMethods;

public class MoreMethods {

	public static void main(String[] args) {
		
		// PART 1
				int[] myArray = new int[3];
				myArray[0] = 7;
				myArray[1] = 10;
				myArray[2] = 8;
						
				System.out.println(sumArray(myArray));
				
				// This call won't work because sumArray is looking for int, not String. Called Type Safety
				//String[] strings = new String[1];
				//strings[0] = "test";
				
				//sumArray(strings);
				
		// PART 2
				double[] grades = new double[5];
				grades[0] = 88.7;
				grades[1] = 92.5;
				grades[2] = 100;
				grades[3] = 67.3;
				grades[4] = 78.9;
				
				System.out.println(calculateAverage(grades));
				
		// PART 3
				System.out.println(multiplyString("Hello",3));
				
				
				
				
			} // end MAIN

		/* PART 1
			 * Takes an array of ints and returns the sum of all the ints	
			 */
			public static int sumArray(int[] numbers) {
				int sum = 0;
				for (int number : numbers) {
					sum += number;			
				}// end FOR
				return sum;		
			} // end sumArray
				
				
		/* PART 2
			 * Takes an array of double and returns the average of all elements in the array
			 */
			public static double calculateAverage(double[] numbers) {
				double sum = 0;
				for (double number : numbers) {
					sum += number;
				} // end FOR
				return sum / numbers.length;		
			} // end calculateAverage
			
		/* PART 3
			 * Takes a String and an int and returns the String concatenated with itself int number of times
			 */
			
			public static String multiplyString(String str, int num) {
				String result = "";
				for (int i = 0; i < num; i++) {
					result += str;
				} // end FOR
				return result;			
			} // end multiplyString
				
				
				
				
				
			

		} // end CLASS MoreMethods