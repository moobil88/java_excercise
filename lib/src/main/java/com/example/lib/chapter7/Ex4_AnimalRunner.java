package com.example.lib.chapter7;

public class Ex4_AnimalRunner {
    public static void main(String[] args){
        Ex4_Animal animal = new Ex4_Animal(50, "M");
        Ex4_Dog dog = new Ex4_Dog(50, "M", true);
        Ex4_Cat cat = new Ex4_Cat(40, "F", false);

        Ex4_Dog dog1 = new Ex4_Dog(50, "M");
        Ex4_Cat cat1 = new Ex4_Cat(40, "F");

        System.out.println(animal);
        System.out.println(cat);
        System.out.println(dog);

        System.out.println(cat1);
        System.out.println(dog1);

        animal.speak();
        cat.speak();
        dog.speak();
        dog.speak(3);

        Ex4_Animal.speak(dog);
        Ex4_Animal.speak(cat);

    }
}
