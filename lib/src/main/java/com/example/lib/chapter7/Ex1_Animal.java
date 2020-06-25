package com.example.lib.chapter7;

public class Ex1_Animal {
    private float weight;
    private String sex;

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
