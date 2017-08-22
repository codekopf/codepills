package com.codepills.learning.java.ArrayList;
import java.util.ArrayList;

public class ArrayListContains {
   public static void main(String[] args) {
	      
	   // Create an empty array list with an initial capacity
	   ArrayList<Integer> myArrList = new ArrayList<Integer>(8);
	
	   // Add elements (prime numbers) in the list
	   myArrList.add(1);
	   myArrList.add(3);
	   myArrList.add(5);
	   myArrList.add(7);
	   myArrList.add(11);
	       
	   // Print all the elements in the ArrayList
	   for (Integer number : myArrList) {
		   System.out.println("Number = " + number);
	   }
	
	   // Does list contains element (integer, prime number 7)?
	   // (using additional variable)
	   boolean flagMyArrListContains = myArrList.contains(7); 
		  
	   if (flagMyArrListContains == true) {
		   System.out.println("Prime number 7 is in the list");
	   } else {
		   System.out.println("Prime number 7 is not in the list");
	   }
			
	   // Does list contains element (integer, prime number 13)?
	   // (no additional variable used)
	   if (myArrList.contains(13)) {
		   System.out.println("Prime number 13 is in the list");
	   } else {
		   System.out.println("Prime number 13 is not in the list");    
	   }
   }
}