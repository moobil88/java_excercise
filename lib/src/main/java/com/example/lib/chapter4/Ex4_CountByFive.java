package com.example.lib.chapter4;

import javax.sound.midi.SysexMessage;

// This is a program that counts by five.
public class Ex4_CountByFive {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {

		// Print out the numbers to 100, counting by 5.

		int x = 5;
		int tillNumber = 100 / x;
		int temp = 0;

		for (int i = 0; i < tillNumber; i++) {
			temp = temp + x;
			System.out.println(temp);
		}

	}

}
/*
 * SAMPLE OUTPUT:
 *  
 *  5
 *  10
 *  15
 *  20
 *  25
 *  30
 *  35
 *  40
 *  ...
 *  85
 *  90
 *  95
 *  100
 *  
 */