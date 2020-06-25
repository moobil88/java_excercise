package com.example.lib.chapter7;

public class Ex4_Dog extends Ex4_Animal {
    private boolean isGuideDog;

    public Ex4_Dog(float weight, String sex, boolean isGuideDog) {
        super(weight, sex);
        this.isGuideDog = isGuideDog;
    }

    public Ex4_Dog(float weight, String sex) {
        super(weight, sex);
        this.isGuideDog = false;
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

    public void speak(int numOfTimes){
        for (int i=0; i<numOfTimes; i++) {
            System.out.println("Woof\t");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isGuideDog=" + isGuideDog +
                '}';
    }
}
