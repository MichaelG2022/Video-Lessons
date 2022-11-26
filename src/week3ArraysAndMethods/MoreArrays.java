package week3ArraysAndMethods;

public class MoreArrays {

	public static void main(String[] args) {
		
		// Showing power of enhanced for loop
			String[] products = new String[5];
			
			products[0] = "Carrots";
			products[1] = "Pineapples";
			products[2] = "Tomatoes";
			products[3] = "Potatoes";
			products[4] = "Celery";
			
			for (String product : products) {
				System.out.println("Product: " + product);
			}
			
		// Showing shortcut method of loading an array
			int[] multiplesOf3 = new int[10];
			
			for (int i = 1; i <=multiplesOf3.length; i++) {
				multiplesOf3[i - 1] = i * 3;
				System.out.println("number: " + multiplesOf3[i - 1]);
			} // end FOR
		
			
			// Showing another way of doing the shortcut that makes more sense
				// Have to be aware that index i is starting at 0, not 1
			int[] multiplesOf5 = new int[10];
					
			for (int i = 0; i < multiplesOf3.length; i++) {
				multiplesOf5[i] = (i + 1) * 5;						// Must follow PEMDAS
				System.out.println("number: " + multiplesOf5[i]);
			}
			
			
			

		} // end MAIN

	} // end CLASS MoreArrays