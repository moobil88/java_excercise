package com.example.lib.chapter6;

public class Ex5_CalculatorRunner {
    public static void main(String[] args)
    {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        Ex5_ArrayCalculator calculator = new Ex5_ArrayCalculator();
        System.out.println(calculator.sum(array));
        System.out.println(calculator.avg(array));
    }


}
