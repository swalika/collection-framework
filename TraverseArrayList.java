
//1) write a program to traverse arraylist
package com.practiseExample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class TraverseArrayList {

	 public static void main(String[] args) {
	// Create an ArrayList of strings
	     ArrayList<String> colors = new ArrayList<>();
	    colors.add("Red");
		colors.add("Green");
	    colors.add("Blue");

	   // **1. Enhanced for loop 
	    System.out.println("Traversing using enhanced for loop:");
		 for (String color : colors) {
	     System.out.println(color);
		        }

		 // **2. For loop with index
		 System.out.println("\nTraversing using for loop with index:");
	      for (int i = 0; i < colors.size(); i++) {
		    System.out.println(colors.get(i));
		  }

	 // **3. Iterator
		  System.out.println("\nTraversing using Iterator:");
		  Iterator<String> iterator = colors.iterator();
		  while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		    }

		 // **4. ListIterator (for bidirectional traversal)
		   System.out.println("\nTraversing forward using ListIterator:");
		 ListIterator<String> listIterator = colors.listIterator();
		    while (listIterator.hasNext()) {
		     System.out.println(listIterator.next());
		     }

		 System.out.println("\nTraversing backward using ListIterator:");
		  while (listIterator.hasPrevious()) {
		       System.out.println(listIterator.previous());
		  }
	  }
		

}


