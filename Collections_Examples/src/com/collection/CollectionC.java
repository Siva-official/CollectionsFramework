package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionC {
	public static void main(String[] args) {
		
		/**
		 * `Collection` is an interface and also root interface for all interfaces and classes present in collections framework .
		 *  Collection provides some common methods which we can use in all classes present in collections framework
		 * -----Like this we can create AryyaList ,LinkedList,HashSet,LinkedHashSet,SortedSet ...etc
		 * 
		 * Note: Collections is predefined class which contains utility methods by using these methods we can perform some operation on collection objects .Like sort,---etc
		 */
		java.util.Collection<String> name = new ArrayList<>(); 
		name.add("Ram");
		name.add("Krishna");
		
		
		java.util.Collection<Integer> numbers = new LinkedList<>();
		numbers.add(8);
		numbers.add(5);
		
		
		java.util.Collection<Double> salaries = new HashSet<>();
		salaries.add(10000.0);
		salaries.add(52500.03);
		
		
	/**
	 * 
	 * Collection is a root interface which contains Child interfaces also
	 * Child interfaces of Collection =>List,Set,Queue
	 * 
	 */
		
		
	}

}
