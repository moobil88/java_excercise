package com.example.lib.chapter4;

public class Ex5_ShiftLeft {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args)
	{
	  // Call shiftLeft and print out the result with a few different arrays.
	int[] shift = new int[]{1, 2, 3, 4};

		ShiftLeft(shift);


	}


	
	// Create a method called shiftLeft
    // Return an array that is "left shifted" by one -- 
	// so {6, 2, 5, 3} returns {2, 5, 3, 6}. Y
	// You may modify and return the given array, or return a new array. 
	
	// int a = {6, 2, 5, 3};
	// shiftLeft(a); // => {2, 5, 3, 6}
	// int b = {1, 2};
	// shiftLeft(b); // => {2, 1}
	// int c = {1};
	// shiftLeft(c); // => {1}

	public static void ShiftLeft(int[] shift)
	{
		int temp = 0;
		temp = shift[0];
		for(int i=0; i<shift.length-1; i++)
		{
			shift[i]=shift[i+1];
		}
		shift[shift.length-1]=temp;

		System.out.println("\nNew array after rotating by one postion in the left direction");
		for(int i=0; i< shift.length; i++)
		{
			System.out.print(shift[i]+" ");
		}


	}



}

/*
 * SAMPLE OUTPUT:
 *  
 * {2, 5, 3, 6}
 * {2, 1}
 * {1}
 *  
 */