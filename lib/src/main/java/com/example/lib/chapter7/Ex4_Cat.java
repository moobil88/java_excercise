package com.example.lib.chapter7;

public class Ex4_Cat extends Ex4_Animal {
    private boolean loveCatnip;

    public Ex4_Cat(float weight, String sex, boolean loveCatnip) {
        super(weight, sex);
        this.loveCatnip = loveCatnip;
    }

    public Ex4_Cat(float weight, String sex) {
        super(weight, sex);
        this.loveCatnip = true;
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
