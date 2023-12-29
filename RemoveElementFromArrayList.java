package com.practiseExample;
import java.util.ArrayList;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		
    // Create an ArrayList of strings
     ArrayList<String> colors = new ArrayList<>();
     colors.add("Red");
     colors.add("Green");
	  colors.add("Blue");
	 colors.add("Yellow");
 // Specify the index of the element to remove
	int indexToRemove = 2;

// Print the original ArrayList
	   System.out.println("Original ArrayList: " + colors);

	   // Remove the element using the remove(index) method
	   colors.remove(indexToRemove); // Removes "Blue" at index 2
  // Print the modified ArrayList
	   System.out.println("ArrayList after removing element: " + colors);
		    
		
	}

}
