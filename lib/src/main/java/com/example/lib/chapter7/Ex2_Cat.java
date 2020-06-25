package com.example.lib.chapter7;

public class Ex2_Cat extends Ex2_Animal {
    private boolean loveCatnip;

    public Ex2_Cat(float weight, String sex, boolean loveCatnip) {
        super(weight, sex);
        this.loveCatnip = loveCatnip;
    }

    public boolean isLoveCatnip() {
        return loveCatnip;
    }

    public void setLoveCatnip(boolean loveCatnip) {
        this.loveCatnip = loveCatnip;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "loveCatnip=" + loveCatnip +
                '}';
    }
}
