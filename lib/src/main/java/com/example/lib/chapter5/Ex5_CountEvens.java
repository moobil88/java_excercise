package com.example.lib.chapter5;

public class Ex5_CountEvens {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args)
	{

		int[] array = new int[]{2,1,2,3,4};

		System.out.println(countEvens(array));
		// Call countEvens a few times with different arrays and print the result


	}

	// Create a method called countEvens
	// Return the number of even ints in the given array. 
	// Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1. 

	// int a = {2, 1, 2, 3, 4};
	// countEvens(a); // -> 3
	// int b = {2, 2, 0};
	// countEvens(b); // -> 3
	// int c = { 1, 3, 5};
	// countEvens(c); // -> 0

	public static int countEvens(int[] array)
	{
		int evenCount = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 == 0)
			{
				evenCount++;
			}
		}
			return evenCount;




	}

}
/*
 * SAMPLE OUTPUT:
 *  
 * 3
 * 0
 * 2
 *  
 */