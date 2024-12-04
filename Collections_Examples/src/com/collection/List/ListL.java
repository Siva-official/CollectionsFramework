package com.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

import javax.swing.AbstractSpinnerModel;

public class ListL{
	public static void main(String[] args) {
		/**
		 * List is child interface of Collection interface
		 * It will maintain the insertion order and it will allow duplicate values also.
		 * Implemented classes of List:  ArrayList , LinkedList , Vector , Stack (Stack extended Vector and also these two are legacy classes)
		 */
		List<Integer> dem = new ArrayList<>();
		List<String>  dem1= new LinkedList<>();
		List<Double>  dem2 = new Vector<>();
		List<Float>   dem3 = new Stack<>();
		
/**
 * ArrayList =========================================== 
 */
		/**
		 * ArrayList<E>
		 * ArrayList Examples 
		 * ArrayList is a Dynamic Sizing (default size is 10)
		 * Ordered collection which means it will maintain insertion order of elements 
		 * Allows duplicate values
		 * It is non-synchronized means its not thread-safe 
		 */
System.out.println("===================================ArrayList =========================================== ");
		//  Dynamic sizing
		ArrayList<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Krishna");
		names.add("james"); //Like this we more names it will accept because ArrayList Dynamic sizing
		//Insertion order  
		System.out.println(names);//Output:[Ram, Krishna, james] because ArrayList maintains insertion order
	   //Allows duplicate 
		names.add("Ram"); 
		names.add("John");
		System.out.println(names); //Output: [Ram, Krishna, james, Ram] Arraylist allows duplicate values
		
		//WE can add elements first last and index base also
		names.addFirst("Add First ");
		names.addLast("Add Last");
		names.add(2, "Add at particular index position");
		
		
		
		ArrayList<String> names2 = new ArrayList<>();
		names2.add("List2Name1");
		names2.add("List2Name2");
	//addAll()
		names.addAll(names);
		
		//we can Add one list to another list directly
		names.addAll(1, names2);
		
	     //Methods available in ArrayaList 
	//get(), getFirst(), getLast()
		System.out.println("Accessing element by index: "   + names.get(1) 
		                   +"\nAccessing Last elemement : " +names.getFirst()
		                   +"\nAccessing first element : "  + names.getLast());
	//forEach()
		names.forEach(a -> System.out.print("")); // ForEach method will be used to iterate list
	//isEmpty()
		System.out.println("Before clear() method : "+names.isEmpty() + "Size :  "+ names.size());
	//clear()
        //names.clear(); //This method will clear the list
		System.out.println("After clear() method  : "+names.isEmpty() + "Size :  "+ names.size());
	//contains()
		System.out.println(names.contains("Ram"));// Contains will check weather element presents or not in the list
	//ensureCapacity()	
		names.ensureCapacity(100);// Basically ArrayList default capacity is 10 . We can ensure the capacity by using this method
	//indexOf()
	  System.out.println(names.indexOf("List2Name1")); // By using  this method we can find the index of particular element
	//lastIndexOf() 
	  System.out.println(names.lastIndexOf("List2Name1"));//This method will give you the last occurrence of the element index
	//listIterator()
	  ListIterator<String> listIterator = names.listIterator();
	  while(listIterator.hasNext()) {
		  System.out.print("value is :"+ listIterator.next()+"\n"); // it will iterate from first to last
	  }
	  System.out.println("\n\n");
	  while(listIterator.hasPrevious()) {
		  System.out.print("value is :"+ listIterator.previous()+"\n"); // it will iterate from last to first
	  }
    //subList()
	 System.out.println(names.subList(1, 5)); //It will give sub list of the ArrayList
		
	// Arraylist to array conversion
	  //way 1
	    Object [] arrayNames = names.toArray();
	  //way 2
	    String [] arrNames = new String[names.size()];
	    arrNames=names.toArray(arrNames);
	    
	    for (Object obj : arrayNames)
            System.out.print(obj + ", "); 
	    
	//trimToSize()
	    ArrayList<Integer> numList = new ArrayList<>(7);
	    numList.add(10);
	    numList.add(15);
	    numList.trimToSize(); // While creating ArrayList object we given 7 default capacity but after that i have utilised  only 2 so this method will trim the size to how much it is occupied
 	
 System.out.println("\n===============================================================================Done");
 
 System.out.println("\n==================================LinkedList===========================================");
 
 /**
  * LinkedList<E> ==========================
  */
    /**
	  * LinkedList<E>
	  * LinkedList Examples 
	  * LinkedList is a Dynamic Sizing 
	  * Allows duplicate values
	  * LinkedList internally store data in the form of doubly linked list 
	  */
      LinkedList<Integer> numbers = new LinkedList<>();
      
      //add()
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       System.out.println("Numbers: "+ numbers);
      
      //add(index,value)
       numbers.add(2,12);  //this method  will add element at particular index position
       System.out.println(numbers);
       
      //set(index,value)
       numbers.set(0, 10);
       System.out.println("After set() method :"+numbers); //this method will set the value at particular index position
       
      //remove() 
       numbers.remove();//this method will remove beginning  or head of the linked list
       System.out.println("After remove() method :"+ numbers);
       
       numbers.remove(1);//this method will remove particular index element 	
       System.out.println("After remove() method :"+ numbers);
      //get()
        System.out.println(numbers.get(1));
        
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(15);
        nums.add(25);
      // addAll()
        numbers.addAll(nums); // This method is used to add all elements at a time (list to list)
        
      //addFirst() ,addLast() WE can add elements first last 
         numbers.addFirst(23);
         numbers.addLast(85);
     //clear()
         //numbers.clear(); //This method will clear the list
     //contains()
 		System.out.println(numbers.contains(1));// Contains will check weather element presents or not in the list

	//descendingIterator()
 		
 		Iterator x = numbers.descendingIterator();
 		while(x.hasNext()) {
 			System.out.println("Value is : "+ x.next()); 
 		}
	}

}
