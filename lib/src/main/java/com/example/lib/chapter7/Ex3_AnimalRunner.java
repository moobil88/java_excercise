package com.example.lib.chapter7;

public class Ex3_AnimalRunner {
    public static void main(String[] args){
        Ex3_Animal animal = new Ex3_Animal(50, "M");
        Ex3_Dog dog = new Ex3_Dog(50, "M", false);
        Ex3_Cat cat = new Ex3_Cat(40, "F", true);

        System.out.println(animal);
        System.out.println(cat);
        System.out.println(dog);


        animal.speak();
        cat.speak();
        dog.speak();

        Ex3_Animal.speak(dog);
        Ex3_Animal.speak(cat);

    }
}
