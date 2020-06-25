package com.example.lib.chapter5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex2_RomanNumerals {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args)
	{
		testRomanConversion(10);

		// Call the method and verify it prints the correct roman numeral
	}
	
	// Create a method that takes a number between 1-10
	// and prints the equivalent roman numeral.
	//
	// You should check to make sure the number passed
	// in isn't greater than 10.  If it is, print an
	// error.
	//



	public static void testRomanConversion(int num)
	{
			if( num > 1 && num <11 )
			{
				for (int i = 1; i <= num; i++) {
					System.out.println(i + "\t =\t " + RomanNumerals(i));
				}

			}

	}


	public static String RomanNumerals(int Int) {
		LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
		roman_numerals.put("M", 1000);
		roman_numerals.put("CM", 900);
		roman_numerals.put("D", 500);
		roman_numerals.put("CD", 400);
		roman_numerals.put("C", 100);
		roman_numerals.put("XC", 90);
		roman_numerals.put("L", 50);
		roman_numerals.put("XL", 40);
		roman_numerals.put("X", 10);
		roman_numerals.put("IX", 9);
		roman_numerals.put("V", 5);
		roman_numerals.put("IV", 4);
		roman_numerals.put("I", 1);
		String res = "";
		for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
			int matches = Int/entry.getValue();
			res += repeat(entry.getKey(), matches);
			Int = Int % entry.getValue();
		}
		return res;
	}
	public static String repeat(String s, int n) {
		if(s == null) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}





}

/*
 * SAMPLE OUTPUT:
 * 
 * II
 * IV
 * X
 * 
 */