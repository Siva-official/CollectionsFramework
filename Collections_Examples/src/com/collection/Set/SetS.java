package com.collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetS {
	public static void main(String[] args) {
		/**
		 * Set is child interface of Collection Interface
		 * When we have to use Set?
		 * Set will not maintain insertion order and also duplicates are not allowed.
		 * Implemented classes of Set: HashSet , LinkedHashSet 
		 * 
		 */
		Set<Integer> set1 = new HashSet<>();
		Set<String>  set2 = new LinkedHashSet<>();
		Set<Integer> set3 = new TreeSet<>();
	}

}
