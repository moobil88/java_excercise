package com.example.lib.chapter7;

public class Ex3_Dog extends Ex3_Animal {
    private boolean isGuideDog;

    public Ex3_Dog(float weight, String sex, boolean isGuideDog) {
        super(weight, sex);
        this.isGuideDog = isGuideDog;
    }

    public boolean isGuideDog() {
        return isGuideDog;
    }

    public void setGuideDog(boolean guideDog) {
        isGuideDog = guideDog;
    }

    public void speak(){
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isGuideDog=" + isGuideDog +
                '}';
    }
}
