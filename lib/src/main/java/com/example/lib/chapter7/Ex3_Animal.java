package com.example.lib.chapter7;

public class Ex3_Animal {
    private float weight;
    private String sex;

    public Ex3_Animal(float weight, String sex) {
        this.weight = weight;
        this.sex = sex;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void speak() {
        System.out.println(" ");
    }

    public static void speak(Ex3_Animal animal) {
        animal.speak();
    }


    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
