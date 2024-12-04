package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClassEx {
	/**
	 * Map in java it is a part of Collection framework,thought it is not technically a part of Collection interface . Map it self Separate Interface.
	 * 
	 * Map is a object that maps key to values . It can not contain duplicate keys but we can store duplicate values .One contains at most one value ;
	 * Common implementation of Map interface 
	 *      `HashMap`, `LinkedHashMap`, `TreeMap` , `Hashtable`, `ConcurrentHashMap`
	 *      
	 */
/**
 * Key features:
 * 
 *  1. Key-Value pair:  Each entry in map consists of a key - value.The key is unique with in the map and value can be duplicate.
 *  
 *  2. Performance   :   
 *                     HashMap : Provides average constant time complexity o(1) to get and put operations
 *                     TreeMap : Guarantees O(log n) time complexity for get, put, and remove operations due to its underlying red-black tree structure.
 *                     LinkedHashMap: Maintains insertion order, providing predictable iteration order
 *                     
 *  3. NullValues: Most Map implementations allow for one null key and multiple null values
 *                 TreeMap and Hashtable do not allow null keys, while Hashtable also does not permit null values.
                   ConcurrentHashMap forbids both null keys and null values, ensuring thread safety and preventing potential issues in concurrent environments.
                   
 *  4. No Ordering Guarantee: The order of the elements in a Map is not guaranteed unless you use a specific implementation like LinkedHashMap or TreeMap.
 */
	
	public static void main(String[] args) {
/**
 * HashMap =============================================================================================
 */
		System.out.println(" =============================================HashMap================================================");
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);
        hashMap.put(null, 40); // One null key allowed
        hashMap.put("Dave", null); // Multiple null values allowed

        // Retrieving values
        System.out.println("Alice's age: " + hashMap.get("Alice")); // 30
        System.out.println("Bob's age: " + hashMap.get("Bob")); // 25
        System.out.println("Null key's value: " + hashMap.get(null)); // 40
        System.out.println("Dave's age: " + hashMap.get("Dave")); // null

        // Checking for keys and values
        System.out.println("Contains key 'Charlie'? " + hashMap.containsKey("Charlie")); // true
        System.out.println("Contains value 25? " + hashMap.containsValue(25)); // true

        // Removing a key-value pair
        hashMap.remove("Bob");

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Output size
        System.out.println("Map size: " + hashMap.size()); // 3
		System.out.println(" =============================================================================================");
        
/**
 * LinkedHashMap ========================================================
 */
		System.out.println(" =============================================LinkedHashMap================================================");

	     Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

	        // Adding key-value pairs
	        linkedHashMap.put("One", 1);
	        linkedHashMap.put("Two", 2);
	        linkedHashMap.put("Three", 3);
	        linkedHashMap.put(null, 4); // One null key allowed
	        linkedHashMap.put("Four", null); // Multiple null values allowed

	        // Iterating over the map (maintains insertion order)
	        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Accessing a specific key
	        System.out.println("Value for 'Two': " + linkedHashMap.get("Two")); // 2

	        // Removing an entry
	        linkedHashMap.remove("Three");

	        // Output size
	        System.out.println("Map size: " + linkedHashMap.size()); // 3
		System.out.println(" =============================================================================================");
	
		
		
		
		System.out.println(" =============================================TreeMap================================================");

		
		  Map<String, Integer> treeMap = new TreeMap<>();

	        // Adding key-value pairs
	        treeMap.put("Banana", 3);
	        treeMap.put("Apple", 2);
	        treeMap.put("Cherry", 5);
	        // treeMap.put(null, 1); // Throws NullPointerException
	        treeMap.put("Date", null); // Multiple null values allowed

	        // Iterating over the map (sorted by keys)
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Accessing a specific key
	        System.out.println("Value for 'Apple': " + treeMap.get("Apple")); // 2

	        // Removing an entry
	        treeMap.remove("Banana");

	        // Output size
	        System.out.println("Map size: " + treeMap.size()); // 3
			System.out.println(" =============================================================================================");
			
			
	System.out.println(" =============================================Hashtable================================================");

			 Map<String, Integer> hashtable = new Hashtable<>();

		        // Adding key-value pairs
		        hashtable.put("Alice", 30);
		        hashtable.put("Bob", 25);
		        // hashtable.put(null, 40); // Throws NullPointerException
		        // hashtable.put("Charlie", null); // Throws NullPointerException

		        // Retrieving values
		        System.out.println("Alice's age: " + hashtable.get("Alice")); // 30
		        System.out.println("Bob's age: " + hashtable.get("Bob")); // 25

		        // Checking for keys and values
		        System.out.println("Contains key 'Alice'? " + hashtable.containsKey("Alice")); // true
		        System.out.println("Contains value 25? " + hashtable.containsValue(25)); // true

		        // Removing a key-value pair
		        hashtable.remove("Bob");

		        // Iterating over the map
		        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }

		        // Output size
		        System.out.println("Map size: " + hashtable.size()); // 1
		
	System.out.println(" =============================================================================================");
	
		
        /**
    	 * HashMap       : Allows one null key and multiple null values. It does not maintain any order.
           LinkedHashMap : Maintains the order of insertion while allowing one null key and multiple null values.
           TreeMap       : Sorts the keys in natural order and does not allow null keys but allows multiple null values.
           Hashtable     : Does not allow null keys or null values and is synchronised.
    	 */

	}
	
}
