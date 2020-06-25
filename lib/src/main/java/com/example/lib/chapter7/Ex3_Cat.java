package com.example.lib.chapter7;

public class Ex3_Cat extends Ex3_Animal {
    private boolean loveCatnip;

    public Ex3_Cat(float weight, String sex, boolean loveCatnip) {
        super(weight, sex);
        this.loveCatnip = loveCatnip;
    }

    public boolean isLoveCatnip() {
        return loveCatnip;
    }

    public void setLoveCatnip(boolean loveCatnip) {
        this.loveCatnip = loveCatnip;
    }
    public void speak(){
        System.out.println("Meow");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "loveCatnip=" + loveCatnip +
                '}';
    }
}
