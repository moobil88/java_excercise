package com.example.lib.chapter7;

public class Ex1_Cat extends Ex1_Animal {
    private boolean loveCatnip;

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
