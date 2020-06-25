package com.example.lib.chapter6;

public class Ex1_BookRunner {
	public static void main(String[] args) {

		Ex1_Book object1 = new Ex1_Book();
		Ex1_Book object2 = new Ex1_Book();

		object1.setAuthor("John Smith");
		object1.setIsbn("12_24_36");
		object1.setNumPages(150);
		object1.setTitle("Book Of Legends");


		object2.setAuthor("stweard");
		object2.setIsbn("15_24_58");
		object2.setNumPages(200);
		object2.setTitle("Book Of Culture");




		System.out.println(object1);
		System.out.println(object2);
	}
}