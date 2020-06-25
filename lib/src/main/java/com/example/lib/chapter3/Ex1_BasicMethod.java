package com.example.lib.chapter3;

// This is a program that prints out your basic info
public class Ex1_BasicMethod {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Call the printBasicInfo method from the main method here
		// Call the printBasicInfo method from the main method with different name and email
		printBasicInfo("badar","abc@gmail.com");

		printBasicInfo("badar1","abcd@gmail.com");
	}
	


	// Define a public static method called printBasicInfo which accepts a name and email.
    //
	public static void printBasicInfo(String name , String email)
	{

		System.out.println("name = " + name + "\n" + "email = " + email );


	}



	// printBasicInfo is a method that prints out a name and email.

}

/*
 * SAMPLE OUTPUT:
 *  
 *   Name: Ken Thompson | Email: ken@thompson.com
 *   Name: James Dean | Email: deanish@jim.com
 *   
 */
