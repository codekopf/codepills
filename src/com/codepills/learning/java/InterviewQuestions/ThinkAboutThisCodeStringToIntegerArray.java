package com.codepills.learning.java.InterviewQuestions;

import java.util.Arrays;

/**Questions:
 * 1) What does this code?
 * 2) a) What to place into method parameters to fail in for loop?
 * 2) b) What is the failure there?
 * 3) a) What to place into method parameters to fail in first line?
 * 3) b) What is failure there?
 * 
 */
public class ThinkAboutThisCodeStringToIntegerArray {

	public static int[] transferStringToArray(final String searchedString, final char divider)
	{
		String[] tempStringArray = searchedString.split(String.valueOf(divider));
		int[] tempIntArray = new int[3];  
		for(int i = 0; i < tempStringArray.length; i++) {
				tempIntArray[i] = Integer.parseInt(tempStringArray[i], 10);
		}
		return tempIntArray;
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is result: " + Arrays.toString(transferStringToArray("1,2,3", ',')));
	}

}
