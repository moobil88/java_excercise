package com.example.lib.chapter5;

public class Ex4_GreatestCommonFactor {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call the greatestCommonFactor method a few times and print the results
		System.out.println(greatestCommonFactor(5, 7));
		System.out.println(greatestCommonFactor(8, 6));
		System.out.println(greatestCommonFactor(3, 4));

	}


	public static int greatestCommonFactor(int a, int b)
	{


			while (a != 0 && b != 0)
			{
				if (a >= b)
				{
					a = a - b;
				}
				else
					b = b - a;
			}
			if (a == 0)
				return b;
			else
				return a;





	}

}



//Read more: https://javarevisited.blogspot.com/2016/07/how-to-calculate-gcf-and-lcm-of-two-numbers-in-java-example.html#ixzz6QHz1QqB5
	// Create a method called greatestCommonFactor
	// It should return the greatest common factor
	// between two numbers.  
	//
	// Examples of greatestCommonFactor:
	//   greatestCommonFactor(6, 4)   // returns 2
	//   greatestCommonFactor(7, 9)   // returns 1
	//   greatestCommonFactor(20, 30) // returns 10
	//
	// Hint: start a counter from 1 and try to divide both
	// numbers by the counter. If the remainder of both divisions
	// is 0, then the counter is a common factor. Continue incrementing
	// the counter to find the greatest common factor. Use a while loop
	// to increment the counter.



/*
 * SAMPLE OUTPUT:
 * 
 * 2
 * 1
 * 0
 * 
 */