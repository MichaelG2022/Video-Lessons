package week4Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DifferentCollections {

	public static void main(String[] args) {
		
		// A List is a Collection, just like a dog is an animal.
		// Collections cannot be instantiated by themselves.
		// List, Set, and Map are what we are going to be discussing.
		
/* List
		 * 
		 * Allows duplicates
		 * Allows for null values - can have more than 1 null
		 * Keeps elements ordered by index
		 * Common implementations: ArrayList, LinkedList, Vector
		 */
		
		List<String> students = new ArrayList<String>();
		students.add("Rob");									// index 0
		students.add("Rob");									// index 1 - duplicate allowed
		students.add("Sam");									// index 2
		students.add(null);										// index 3
		
		// Lists keep everything ordered by Index. The order in which you add elements to a List is kept just like an Array.
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2));		// Sam
		System.out.println(students.get(0));		// Rob
		
/* Set
 		*
 		* No duplicates	 		
 		* Allows only a single null value - no duplicates 
 		* Unordered - does not keep track of the order - no index
 		* Common Implementation: HashSet, LinkedHashSet, TreeSet
 		* 	
 		*/
		
		Set<String> states = new HashSet<String>();
		
		states.add("Alabama");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add(null);
		states.add(null);
		
		// Shows size as only 6 because duplicates are ignored.
		System.out.println(states.size());
		
		// More Set methods
		System.out.println(states.contains("Delaware"));
		System.out.println(states.contains("Alabama"));			// Capitalization matters - still shows as true because we haven't 
																	// removed Alabama yet.
		//states.remove("Alabama");
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		
		// Only prints Alabama and null once each - no duplicates
		for (String state : states) {
			System.out.println(state);
		}
		
/* Map
 		* 
 		* Map<K,V>, K is the Key, V is the Value
 		* 
 		* Key value pairs (Dictionary) - search word, then definition
 		* Like a dictionary or phonebook
 		* Values can be duplicate, but not Keys
 		* Keys cannot be duplicated
 		* Values can be duplicated
 		* Order is determined by the implementation of the Map
 		* Map is a part of Dictionary
 		* Common implementation: HashMap, LinkedHashMap, TreeMap, Hashtable (no capital T)
 		* 		
 		*/
		
		// Get does not work the same as with arrays.
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		System.out.println(racerPlacements.isEmpty());
		
		// More Map methods
		racerPlacements.remove(1);
		racerPlacements.size();
		
		// keySet method - returns a set of the Keys
		// Can also get the value associated with each Key
		// Very useful because you might not know what the Key values are
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key);
			System.out.println(key +  " : " + racerPlacements.get(key));
		}
		
		// Getting the values associated with each Key
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make (something) greater by adding to it; increase.");
		dictionary.put("Diminish", "make or become less.");
		dictionary.put("Ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice.");
		

		

		
		
		
		
		

	} // end MAIN

} // end CLASS
