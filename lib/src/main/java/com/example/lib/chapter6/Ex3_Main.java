package com.example.lib.chapter6;

public class Ex3_Main {

   public static void main(String[] args)
   {
       Ex3_User author1 = new Ex3_User();
         author1.setAge(40);
         author1.setLocation("london");
         author1.setName("muhammad badar");

       Ex3_User author2 = new Ex3_User();
       author2.setAge(50);
       author2.setLocation("dubai");
       author2.setName("muhammad ali");


       Ex3_Book object1 = new Ex3_Book("Book Of Legends", author1, "12_24_36", 150);
       Ex3_Book object2 = new Ex3_Book("Book Of Culture", author2, "15_24_58", 350);

       System.out.println(object1);
       System.out.println(object2);

        author1.readBook(object1);
   }


}
