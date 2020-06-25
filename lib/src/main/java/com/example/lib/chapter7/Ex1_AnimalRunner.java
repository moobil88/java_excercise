package com.example.lib.chapter7;

public class Ex1_AnimalRunner {
    public static void main(String[] args){
        Ex1_Animal animal = new Ex1_Animal();
        Ex1_Dog dog = new Ex1_Dog();
        Ex1_Cat cat = new Ex1_Cat();

        animal.setSex("M");
        animal.setWeight(50);

        dog.setSex("M");
        dog.setWeight(70);
        dog.setGuideDog(false);

        cat.setSex("M");
        cat.setWeight(70);
        cat.setLoveCatnip(false);

        System.out.println(animal);
        System.out.println(cat);
        System.out.println(dog);

    }
}
