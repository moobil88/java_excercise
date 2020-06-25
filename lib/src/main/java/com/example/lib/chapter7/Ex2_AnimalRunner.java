package com.example.lib.chapter7;

public class Ex2_AnimalRunner {
    public static void main(String[] args){
        Ex2_Animal animal = new Ex2_Animal(50, "M");
        Ex2_Dog dog = new Ex2_Dog(50, "M", false);
        Ex2_Cat cat = new Ex2_Cat(40, "F", true);

        System.out.println(animal);
        System.out.println(cat);
        System.out.println(dog);

    }
}
