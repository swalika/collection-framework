//Write a program to sort array list in descending order
package com.practiseExample;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescending {
	
    public static void main(String[] args) {
// Create an ArrayList of numbers
	    ArrayList<Integer> numbers = new ArrayList<>();
	    numbers.add(4);
	    numbers.add(1);
	    numbers.add(8);
	    numbers.add(2);

 // Sort the ArrayList in descending order using Collections.reverseOrder()
	   Collections.sort(numbers, Collections.reverseOrder());

 // Print the sorted ArrayList
	      System.out.println("Sorting ArrayList in descending order: " + numbers);
	    
	}

}
