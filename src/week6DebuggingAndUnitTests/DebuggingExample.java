package week6DebuggingAndUnitTests;

import java.util.ArrayList;
import java.util.List;

public class DebuggingExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		addNames(names);
		int index = findIndexOfName(names, "Sam");
		System.out.println(index);		

	} // end MAIN
	
	private static void addNames (List<String> names) {
		names.add("Sam");
		names.add("Tommy");
		names.add("Hilary");
		names.add("Joan");
	} // end addNames
	
	private static int findIndexOfName(List<String> names, String name) {
		int index = -1;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals(name)) {
				index = i;
				break;
			} // end IF
		} // end FOR
		return index;
	} // end findIndexOfName

} // end CLASS
