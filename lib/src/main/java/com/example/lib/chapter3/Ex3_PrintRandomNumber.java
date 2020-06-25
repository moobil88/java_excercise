package com.example.lib.chapter3;

import java.util.Random;

// The program that can print random numbers
public class Ex3_PrintRandomNumber {

  // This is the main method that is executed as
  // soon as the program starts.
  public static void main(String[] args) {

    // Create a method that returns a random number
    // between min and max.
    //
    // PrintRandomNumber(int min, int max)
    //
    // Save the return value in a variable and print
    // the random number.
    //
    // HINT: To generate a random number from 0 to 40:
    //
    //    Random rand = new Random();
    //    rand.nextInt(40);
    int min = 0, max = 40;

    System.out.println(PrintRandomNumber(min, max));


  }

  public static int PrintRandomNumber(int min, int max)
  {

    int randomNumber;
    Random rand = new Random();
    randomNumber = rand.nextInt(max);
    return randomNumber;

  }

}

/*
 * SAMPLE OUTPUT:
 *  
 *   My random number is 13
 *   My random number is 78
 *   
 */