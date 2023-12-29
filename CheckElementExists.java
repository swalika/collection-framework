package com.practiseExample;
import java.util.ArrayList;

public class CheckElementExists {

	public static void main(String[] args) {
	
	 // Create an ArrayList of strings
	  ArrayList<String> colors = new ArrayList<>();
	  colors.add("Red");
	  colors.add("Green");
	  colors.add("Blue");
	  colors.add("pink");

 // Define the element to search for
	  String searchElement = "Yellow";

	// Check if the element exists using the contains() method
		boolean elementExists = colors.contains(searchElement);

	 // Print the result
	 if (elementExists) {
		 System.out.println(searchElement + " found in the ArrayList.");
	  } 
	 else {
		  System.out.println(searchElement + " not found in the ArrayList.");
	   }
		   
	}

}
