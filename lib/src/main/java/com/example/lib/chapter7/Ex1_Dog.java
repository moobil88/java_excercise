package com.example.lib.chapter7;

public class Ex1_Dog extends Ex1_Animal {
    private boolean isGuideDog;

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
