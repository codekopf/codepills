package com.codepills.learning.java.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortPrimitives {
	
	public static void main(String[] args) {
		ArrayList<Integer> myArrList = new ArrayList<Integer>();
		myArrList.add(50);
		myArrList.add(10);
		myArrList.add(40);
		myArrList.add(20);
		myArrList.add(30);
		
		Collections.sort(myArrList);
		System.out.println(myArrList);
		Collections.reverse(myArrList);
		System.out.println(myArrList);
	}
}
