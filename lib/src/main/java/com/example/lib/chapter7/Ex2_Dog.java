package com.example.lib.chapter7;

public class Ex2_Dog extends Ex2_Animal {
    private boolean isGuideDog;

    public Ex2_Dog(float weight, String sex, boolean isGuideDog) {
        super(weight, sex);
        this.isGuideDog = isGuideDog;
    }

    public boolean isGuideDog() {
        return isGuideDog;
    }

    public void setGuideDog(boolean guideDog) {
        isGuideDog = guideDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isGuideDog=" + isGuideDog +
                '}';
    }
}
