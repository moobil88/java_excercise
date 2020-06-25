package com.example.lib.chapter3;

// This is a program that's really good at saying names.
public class Ex2_SayMyName {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		String name1 = "Billy";
		String name2 = "Jake";
		String name3 = "Michael";
		
		// Call SayMyName three times in the main function
		// for the three names.
		SayMyName(name1);
		SayMyName(name2);
		SayMyName(name3);
		// Example output:
		//  Hello Billy, it's good to meet you!
	}
	
	// Create a public static method called SayMyName
	// that takes a single String parameter. SayMyName
	// should print a customized message based on the
	// parameter.
	public static void SayMyName(String name)
	{
		System.out.println("Hello " + name + " , it's good to meet you!");


	}


}

/*
 * SAMPLE OUTPUT:
 *  
 *   Hello Billy, it's good to meet you!
 *   Hello Jake, it's good to meet you!
 *   Hello Michael, it's good to meet you!
 *   
 */