package com.example.lib.chapter2;

// This is a simple version of Siri, the iPhone assistant.
// Practice declaring variables of various types and printing them.
public class Ex3_Siri {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Step 1: Declarations
		//   Declare a string for your name (name)
		String name;
		//   Declare an integer for the temperature (temp)
		int temp;
		//   Declare a double for the percent chance of rain (chanceOfRain)
		double chanceOfRain;
		// Step 2: Assignments
		//   Set name to your name
		name = "Muhammad Badar";
		//   Set the temperature to 65
		temp = 65;
		//   Set the percent chance of rain to 0.45 (45% chance of rain)
		chanceOfRain = 0.45;
		// Step 3: Output
		//   Using a single println statement, output the following:
		//   Hello, Mike, today's high is 65 degrees, with a 45% chance of rain.
		System.out.println("Hello, " + name + ", today's high is " + temp + " degrees, with a " + (int) (chanceOfRain * 100) + "% chance of rain.");
		
		// Tip: For the percent chance of rain, use the multiplication operator
		//      in the output line to change the decimal to a percentage.
		
		// Hint: You can "cast" a decimal to a integer to truncate the extra decimal places
		//      (int) (someDecimalVal * 100)
		
	}

}

/*
 * 
 * SAMPLE OUTPUT:
 *  
 *   Hello, Mike, today's high is 65 degrees, with a 45% chance of rain.
 *    
 */
