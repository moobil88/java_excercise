package com.example.lib.chapter5;

public class Ex3_Blackjack {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		
		// Given 2 int values greater than 0, return whichever 
		// value is nearest to 21 without going over. 
		// Return 0 if they both go over. 
		//
		
		// Call the method a few times and print the results

	System.out.println(blackjack(15, 22));
	System.out.println(blackjack(17, 21));
	System.out.println(blackjack(10, 8));
	}
	
	// Create a method like:
	//   public int blackjack(int a, int b)
	//

	public static int blackjack(int a, int b)
	{
		if (a>21 && b>21)
		{
			return 0;
		}
		if (a<21 && b>21)
		{
			return a;
		}
		if (b<21 && a>21)
		{
			return b;
		}
		if (21-a < 21-b)
		{
			return a;
		}
		return b;
	}

}

/*
 * SAMPLE OUTPUT:
 * 
 * 6
 * 8
 * 0
 * 
 */