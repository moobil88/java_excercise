package com.example.lib.chapter7;

public class Ex2_Animal {
    private float weight;
    private String sex;

    public Ex2_Animal(float weight, String sex) {
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

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
